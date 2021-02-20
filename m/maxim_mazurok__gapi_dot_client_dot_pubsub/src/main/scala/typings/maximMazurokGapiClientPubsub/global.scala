package typings.maximMazurokGapiClientPubsub

import typings.maximMazurokGapiClientPubsub.gapi.client.pubsub.ProjectsResource
import typings.maximMazurokGapiClientPubsub.maximMazurokGapiClientPubsubStrings.pubsub
import typings.maximMazurokGapiClientPubsub.maximMazurokGapiClientPubsubStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Cloud Pub/Sub API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: pubsub, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: pubsub, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object pubsub {
        
        @JSGlobal("gapi.client.pubsub.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
