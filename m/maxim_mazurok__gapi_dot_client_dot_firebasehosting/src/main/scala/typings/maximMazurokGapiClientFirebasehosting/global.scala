package typings.maximMazurokGapiClientFirebasehosting

import typings.maximMazurokGapiClientFirebasehosting.gapi.client.firebasehosting.OperationsResource
import typings.maximMazurokGapiClientFirebasehosting.maximMazurokGapiClientFirebasehostingStrings.firebasehosting
import typings.maximMazurokGapiClientFirebasehosting.maximMazurokGapiClientFirebasehostingStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object firebasehosting {
        
        @JSGlobal("gapi.client.firebasehosting.operations")
        @js.native
        val operations: OperationsResource = js.native
      }
      
      /** Load Firebase Hosting API v1 */
      inline def load(name: firebasehosting, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: firebasehosting, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
