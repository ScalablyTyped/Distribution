package typings.maximMazurokGapiClientFirebaseml

import typings.maximMazurokGapiClientFirebaseml.gapi.client.firebaseml.OperationsResource
import typings.maximMazurokGapiClientFirebaseml.maximMazurokGapiClientFirebasemlStrings.firebaseml
import typings.maximMazurokGapiClientFirebaseml.maximMazurokGapiClientFirebasemlStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object firebaseml {
        
        @JSGlobal("gapi.client.firebaseml.operations")
        @js.native
        val operations: OperationsResource = js.native
      }
      
      /** Load Firebase ML API v1 */
      @scala.inline
      def load(name: firebaseml, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: firebaseml, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
