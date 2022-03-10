package com.github.xxxbyte.testtemplate.services

import com.intellij.openapi.project.Project
import com.github.xxxbyte.testtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
