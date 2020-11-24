package typings.maximMazurokGapiClientFirebasehosting

import typings.maximMazurokGapiClientFirebasehosting.gapi.client.firebasehosting.OperationsResource
import typings.maximMazurokGapiClientFirebasehosting.maximMazurokGapiClientFirebasehostingStrings.firebasehosting
import typings.maximMazurokGapiClientFirebasehosting.maximMazurokGapiClientFirebasehostingStrings.v1
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
      
      /** Load Firebase Hosting API v1 */
      def load(name: firebasehosting, version: v1): js.Thenable[Unit] = js.native
      def load(name: firebasehosting, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object firebasehosting extends js.Object {
        
        val operations: OperationsResource = js.native
      }
    }
  }
}
