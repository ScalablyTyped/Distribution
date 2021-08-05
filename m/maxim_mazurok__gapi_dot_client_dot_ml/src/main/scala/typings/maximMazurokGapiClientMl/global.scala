package typings.maximMazurokGapiClientMl

import typings.maximMazurokGapiClientMl.gapi.client.ml.ProjectsResource
import typings.maximMazurokGapiClientMl.maximMazurokGapiClientMlStrings.ml
import typings.maximMazurokGapiClientMl.maximMazurokGapiClientMlStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load AI Platform Training & Prediction API v1 */
      inline def load(name: ml, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: ml, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object ml {
        
        @JSGlobal("gapi.client.ml.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
