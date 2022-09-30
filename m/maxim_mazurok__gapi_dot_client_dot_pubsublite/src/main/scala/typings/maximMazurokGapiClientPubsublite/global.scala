package typings.maximMazurokGapiClientPubsublite

import typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite.AdminResource
import typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite.CursorResource
import typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite.TopicStatsResource
import typings.maximMazurokGapiClientPubsublite.maximMazurokGapiClientPubsubliteStrings.pubsublite
import typings.maximMazurokGapiClientPubsublite.maximMazurokGapiClientPubsubliteStrings.v1
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Pub/Sub Lite API v1 */
      inline def load(name: pubsublite, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: pubsublite, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
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
