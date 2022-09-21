package typings.maximMazurokGapiClientWorkflows

import typings.maximMazurokGapiClientWorkflows.gapi.client.workflows.ProjectsResource
import typings.maximMazurokGapiClientWorkflows.maximMazurokGapiClientWorkflowsStrings.v1
import typings.maximMazurokGapiClientWorkflows.maximMazurokGapiClientWorkflowsStrings.workflows
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Workflows API v1 */
      inline def load(name: workflows, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: workflows, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object workflows {
        
        @JSGlobal("gapi.client.workflows.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
