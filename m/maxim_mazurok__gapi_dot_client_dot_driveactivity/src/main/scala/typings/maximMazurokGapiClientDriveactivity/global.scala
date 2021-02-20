package typings.maximMazurokGapiClientDriveactivity

import typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity.ActivityResource
import typings.maximMazurokGapiClientDriveactivity.maximMazurokGapiClientDriveactivityStrings.driveactivity
import typings.maximMazurokGapiClientDriveactivity.maximMazurokGapiClientDriveactivityStrings.v2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object driveactivity {
        
        @JSGlobal("gapi.client.driveactivity.activity")
        @js.native
        val activity: ActivityResource = js.native
      }
      
      /** Load Drive Activity API v2 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: driveactivity, version: v2): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: driveactivity, version: v2, callback: js.Function0[_]): Unit = js.native
    }
  }
}
