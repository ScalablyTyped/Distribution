package typings.maximMazurokGapiClientWebsecurityscanner

import typings.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner.ProjectsResource
import typings.maximMazurokGapiClientWebsecurityscanner.maximMazurokGapiClientWebsecurityscannerStrings.v1
import typings.maximMazurokGapiClientWebsecurityscanner.maximMazurokGapiClientWebsecurityscannerStrings.websecurityscanner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Web Security Scanner API v1 */
      inline def load(name: websecurityscanner, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: websecurityscanner, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object websecurityscanner {
        
        @JSGlobal("gapi.client.websecurityscanner.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
