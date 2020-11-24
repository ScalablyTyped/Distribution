package typings.maximMazurokGapiClientDriveactivity

import typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity.ActivityResource
import typings.maximMazurokGapiClientDriveactivity.maximMazurokGapiClientDriveactivityStrings.driveactivity
import typings.maximMazurokGapiClientDriveactivity.maximMazurokGapiClientDriveactivityStrings.v2
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
      
      /** Load Drive Activity API v2 */
      def load(name: driveactivity, version: v2): js.Thenable[Unit] = js.native
      def load(name: driveactivity, version: v2, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object driveactivity extends js.Object {
        
        val activity: ActivityResource = js.native
      }
    }
  }
}
