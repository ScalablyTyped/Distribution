package typings.maximMazurokGapiClientRun

import typings.maximMazurokGapiClientRun.gapi.client.run.NamespacesResource
import typings.maximMazurokGapiClientRun.gapi.client.run.ProjectsResource
import typings.maximMazurokGapiClientRun.maximMazurokGapiClientRunStrings.run
import typings.maximMazurokGapiClientRun.maximMazurokGapiClientRunStrings.v1
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
      
      /** Load Cloud Run Admin API v1 */
      def load(name: run, version: v1): js.Thenable[Unit] = js.native
      def load(name: run, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object run extends js.Object {
        
        val namespaces: NamespacesResource = js.native
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
