package typings.maximMazurokGapiClientDriveactivity

import typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity.ActivityResource
import typings.maximMazurokGapiClientDriveactivity.maximMazurokGapiClientDriveactivityStrings.driveactivity
import typings.maximMazurokGapiClientDriveactivity.maximMazurokGapiClientDriveactivityStrings.v2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object driveactivity {
        
        @JSGlobal("gapi.client.driveactivity.activity")
        @js.native
        val activity: ActivityResource = js.native
      }
      
      /** Load Drive Activity API v2 */
      @scala.inline
      def load(name: driveactivity, version: v2): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: driveactivity, version: v2, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
