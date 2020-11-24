package typings.maximMazurokGapiClientNotebooks

import typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks.ProjectsResource
import typings.maximMazurokGapiClientNotebooks.maximMazurokGapiClientNotebooksStrings.notebooks
import typings.maximMazurokGapiClientNotebooks.maximMazurokGapiClientNotebooksStrings.v1
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
      
      /** Load Notebooks API v1 */
      def load(name: notebooks, version: v1): js.Thenable[Unit] = js.native
      def load(name: notebooks, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object notebooks extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
