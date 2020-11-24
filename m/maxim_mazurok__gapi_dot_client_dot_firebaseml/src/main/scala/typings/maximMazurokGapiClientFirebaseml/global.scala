package typings.maximMazurokGapiClientFirebaseml

import typings.maximMazurokGapiClientFirebaseml.gapi.client.firebaseml.OperationsResource
import typings.maximMazurokGapiClientFirebaseml.maximMazurokGapiClientFirebasemlStrings.firebaseml
import typings.maximMazurokGapiClientFirebaseml.maximMazurokGapiClientFirebasemlStrings.v1
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
      
      /** Load Firebase ML API v1 */
      def load(name: firebaseml, version: v1): js.Thenable[Unit] = js.native
      def load(name: firebaseml, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object firebaseml extends js.Object {
        
        val operations: OperationsResource = js.native
      }
    }
  }
}
