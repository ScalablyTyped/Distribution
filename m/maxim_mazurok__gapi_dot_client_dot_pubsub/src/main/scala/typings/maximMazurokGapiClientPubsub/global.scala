package typings.maximMazurokGapiClientPubsub

import typings.maximMazurokGapiClientPubsub.gapi.client.pubsub.ProjectsResource
import typings.maximMazurokGapiClientPubsub.maximMazurokGapiClientPubsubStrings.pubsub
import typings.maximMazurokGapiClientPubsub.maximMazurokGapiClientPubsubStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Cloud Pub/Sub API v1 */
      @scala.inline
      def load(name: pubsub, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: pubsub, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object pubsub {
        
        @JSGlobal("gapi.client.pubsub.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
