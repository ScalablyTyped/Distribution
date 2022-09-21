package typings.maximMazurokGapiClientSafebrowsing

import typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing.EncodedFullHashesResource
import typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing.EncodedUpdatesResource
import typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing.FullHashesResource
import typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing.ThreatHitsResource
import typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing.ThreatListUpdatesResource
import typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing.ThreatListsResource
import typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing.ThreatMatchesResource
import typings.maximMazurokGapiClientSafebrowsing.maximMazurokGapiClientSafebrowsingStrings.safebrowsing
import typings.maximMazurokGapiClientSafebrowsing.maximMazurokGapiClientSafebrowsingStrings.v4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Safe Browsing API v4 */
      inline def load(name: safebrowsing, version: v4): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: safebrowsing, version: v4, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object safebrowsing {
        
        @JSGlobal("gapi.client.safebrowsing.encodedFullHashes")
        @js.native
        val encodedFullHashes: EncodedFullHashesResource = js.native
        
        @JSGlobal("gapi.client.safebrowsing.encodedUpdates")
        @js.native
        val encodedUpdates: EncodedUpdatesResource = js.native
        
        @JSGlobal("gapi.client.safebrowsing.fullHashes")
        @js.native
        val fullHashes: FullHashesResource = js.native
        
        @JSGlobal("gapi.client.safebrowsing.threatHits")
        @js.native
        val threatHits: ThreatHitsResource = js.native
        
        @JSGlobal("gapi.client.safebrowsing.threatListUpdates")
        @js.native
        val threatListUpdates: ThreatListUpdatesResource = js.native
        
        @JSGlobal("gapi.client.safebrowsing.threatLists")
        @js.native
        val threatLists: ThreatListsResource = js.native
        
        @JSGlobal("gapi.client.safebrowsing.threatMatches")
        @js.native
        val threatMatches: ThreatMatchesResource = js.native
      }
    }
  }
}
