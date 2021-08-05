package typings.maximMazurokGapiClientWebmasters

import typings.maximMazurokGapiClientWebmasters.gapi.client.webmasters.SearchanalyticsResource
import typings.maximMazurokGapiClientWebmasters.gapi.client.webmasters.SitemapsResource
import typings.maximMazurokGapiClientWebmasters.gapi.client.webmasters.SitesResource
import typings.maximMazurokGapiClientWebmasters.maximMazurokGapiClientWebmastersStrings.v3
import typings.maximMazurokGapiClientWebmasters.maximMazurokGapiClientWebmastersStrings.webmasters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Search Console API v3 */
      inline def load(name: webmasters, version: v3): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: webmasters, version: v3, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
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
