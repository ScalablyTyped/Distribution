package typings.maximMazurokGapiClientPubsublite

import typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite.AdminResource
import typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite.CursorResource
import typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite.TopicStatsResource
import typings.maximMazurokGapiClientPubsublite.maximMazurokGapiClientPubsubliteStrings.pubsublite
import typings.maximMazurokGapiClientPubsublite.maximMazurokGapiClientPubsubliteStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Pub/Sub Lite API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: pubsublite, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: pubsublite, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object pubsublite {
        
        @JSGlobal("gapi.client.pubsublite.admin")
        @js.native
        val admin: AdminResource = js.native
        
        @JSGlobal("gapi.client.pubsublite.cursor")
        @js.native
        val cursor: CursorResource = js.native
        
        @JSGlobal("gapi.client.pubsublite.topicStats")
        @js.native
        val topicStats: TopicStatsResource = js.native
      }
    }
  }
}
