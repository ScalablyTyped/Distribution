package typings.maximMazurokGapiClientNotebooks

import typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks.ProjectsResource
import typings.maximMazurokGapiClientNotebooks.maximMazurokGapiClientNotebooksStrings.notebooks
import typings.maximMazurokGapiClientNotebooks.maximMazurokGapiClientNotebooksStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Notebooks API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: notebooks, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: notebooks, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object notebooks {
        
        @JSGlobal("gapi.client.notebooks.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
