package typings.maximMazurokGapiClientWorkflows

import typings.maximMazurokGapiClientWorkflows.gapi.client.workflows.ProjectsResource
import typings.maximMazurokGapiClientWorkflows.maximMazurokGapiClientWorkflowsStrings.v1beta
import typings.maximMazurokGapiClientWorkflows.maximMazurokGapiClientWorkflowsStrings.workflows
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load Workflows API v1beta */
      def load(name: workflows, version: v1beta): js.Thenable[Unit] = js.native
      def load(name: workflows, version: v1beta, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object workflows extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
