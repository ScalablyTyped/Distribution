package typings.maximMazurokGapiClientFcm

import typings.maximMazurokGapiClientFcm.gapi.client.fcm.ProjectsResource
import typings.maximMazurokGapiClientFcm.maximMazurokGapiClientFcmStrings.fcm
import typings.maximMazurokGapiClientFcm.maximMazurokGapiClientFcmStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object fcm {
        
        @JSGlobal("gapi.client.fcm.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Firebase Cloud Messaging API v1 */
      inline def load(name: fcm, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: fcm, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
