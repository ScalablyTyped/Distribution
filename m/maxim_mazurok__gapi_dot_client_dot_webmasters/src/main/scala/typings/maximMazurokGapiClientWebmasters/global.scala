package typings.maximMazurokGapiClientWebmasters

import typings.maximMazurokGapiClientWebmasters.gapi.client.webmasters.SearchanalyticsResource
import typings.maximMazurokGapiClientWebmasters.gapi.client.webmasters.SitemapsResource
import typings.maximMazurokGapiClientWebmasters.gapi.client.webmasters.SitesResource
import typings.maximMazurokGapiClientWebmasters.maximMazurokGapiClientWebmastersStrings.v3
import typings.maximMazurokGapiClientWebmasters.maximMazurokGapiClientWebmastersStrings.webmasters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Search Console API v3 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: webmasters, version: v3): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: webmasters, version: v3, callback: js.Function0[_]): Unit = js.native
      
      object webmasters {
        
        @JSGlobal("gapi.client.webmasters.searchanalytics")
        @js.native
        val searchanalytics: SearchanalyticsResource = js.native
        
        @JSGlobal("gapi.client.webmasters.sitemaps")
        @js.native
        val sitemaps: SitemapsResource = js.native
        
        @JSGlobal("gapi.client.webmasters.sites")
        @js.native
        val sites: SitesResource = js.native
      }
    }
  }
}
