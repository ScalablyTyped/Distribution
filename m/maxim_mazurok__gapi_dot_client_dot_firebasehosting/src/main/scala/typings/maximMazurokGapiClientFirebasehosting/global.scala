package typings.maximMazurokGapiClientFirebasehosting

import typings.maximMazurokGapiClientFirebasehosting.gapi.client.firebasehosting.OperationsResource
import typings.maximMazurokGapiClientFirebasehosting.maximMazurokGapiClientFirebasehostingStrings.firebasehosting
import typings.maximMazurokGapiClientFirebasehosting.maximMazurokGapiClientFirebasehostingStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object firebasehosting {
        
        @JSGlobal("gapi.client.firebasehosting.operations")
        @js.native
        val operations: OperationsResource = js.native
      }
      
      /** Load Firebase Hosting API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: firebasehosting, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: firebasehosting, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
