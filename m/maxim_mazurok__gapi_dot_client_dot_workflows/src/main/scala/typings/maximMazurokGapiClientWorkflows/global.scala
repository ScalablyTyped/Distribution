package typings.maximMazurokGapiClientWorkflows

import typings.maximMazurokGapiClientWorkflows.gapi.client.workflows.ProjectsResource
import typings.maximMazurokGapiClientWorkflows.maximMazurokGapiClientWorkflowsStrings.v1beta
import typings.maximMazurokGapiClientWorkflows.maximMazurokGapiClientWorkflowsStrings.workflows
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Workflows API v1beta */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: workflows, version: v1beta): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: workflows, version: v1beta, callback: js.Function0[_]): Unit = js.native
      
      object workflows {
        
        @JSGlobal("gapi.client.workflows.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
