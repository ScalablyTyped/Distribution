package typings.maximMazurokGapiClientFirebaseml

import typings.maximMazurokGapiClientFirebaseml.gapi.client.firebaseml.OperationsResource
import typings.maximMazurokGapiClientFirebaseml.maximMazurokGapiClientFirebasemlStrings.firebaseml
import typings.maximMazurokGapiClientFirebaseml.maximMazurokGapiClientFirebasemlStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object firebaseml {
        
        @JSGlobal("gapi.client.firebaseml.operations")
        @js.native
        val operations: OperationsResource = js.native
      }
      
      /** Load Firebase ML API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: firebaseml, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: firebaseml, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
