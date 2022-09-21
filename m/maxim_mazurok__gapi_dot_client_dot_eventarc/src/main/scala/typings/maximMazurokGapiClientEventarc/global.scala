package typings.maximMazurokGapiClientEventarc

import typings.maximMazurokGapiClientEventarc.gapi.client.eventarc.ProjectsResource
import typings.maximMazurokGapiClientEventarc.maximMazurokGapiClientEventarcStrings.eventarc
import typings.maximMazurokGapiClientEventarc.maximMazurokGapiClientEventarcStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object eventarc {
        
        @JSGlobal("gapi.client.eventarc.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Eventarc API v1 */
      inline def load(name: eventarc, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: eventarc, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
