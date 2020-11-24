package typings.maximMazurokGapiClientFcm

import typings.maximMazurokGapiClientFcm.gapi.client.fcm.ProjectsResource
import typings.maximMazurokGapiClientFcm.maximMazurokGapiClientFcmStrings.fcm
import typings.maximMazurokGapiClientFcm.maximMazurokGapiClientFcmStrings.v1
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
      
      /** Load Firebase Cloud Messaging API v1 */
      def load(name: fcm, version: v1): js.Thenable[Unit] = js.native
      def load(name: fcm, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object fcm extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
