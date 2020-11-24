package typings.maximMazurokGapiClientFirestore

import typings.maximMazurokGapiClientFirestore.gapi.client.firestore.ProjectsResource
import typings.maximMazurokGapiClientFirestore.maximMazurokGapiClientFirestoreStrings.firestore
import typings.maximMazurokGapiClientFirestore.maximMazurokGapiClientFirestoreStrings.v1
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
      
      /** Load Cloud Firestore API v1 */
      def load(name: firestore, version: v1): js.Thenable[Unit] = js.native
      def load(name: firestore, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object firestore extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
