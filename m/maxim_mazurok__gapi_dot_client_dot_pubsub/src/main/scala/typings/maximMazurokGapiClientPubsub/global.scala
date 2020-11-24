package typings.maximMazurokGapiClientPubsub

import typings.maximMazurokGapiClientPubsub.gapi.client.pubsub.ProjectsResource
import typings.maximMazurokGapiClientPubsub.maximMazurokGapiClientPubsubStrings.pubsub
import typings.maximMazurokGapiClientPubsub.maximMazurokGapiClientPubsubStrings.v1
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
      
      /** Load Cloud Pub/Sub API v1 */
      def load(name: pubsub, version: v1): js.Thenable[Unit] = js.native
      def load(name: pubsub, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object pubsub extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
