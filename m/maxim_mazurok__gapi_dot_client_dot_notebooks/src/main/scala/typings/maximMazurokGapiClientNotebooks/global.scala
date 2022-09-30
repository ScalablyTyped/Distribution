package typings.maximMazurokGapiClientNotebooks

import typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks.ProjectsResource
import typings.maximMazurokGapiClientNotebooks.maximMazurokGapiClientNotebooksStrings.notebooks
import typings.maximMazurokGapiClientNotebooks.maximMazurokGapiClientNotebooksStrings.v1
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Notebooks API v1 */
      inline def load(name: notebooks, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: notebooks, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object notebooks {
        
        @JSGlobal("gapi.client.notebooks.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
