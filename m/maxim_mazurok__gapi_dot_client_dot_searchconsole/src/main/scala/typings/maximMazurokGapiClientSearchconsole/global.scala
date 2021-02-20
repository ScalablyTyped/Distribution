package typings.maximMazurokGapiClientSearchconsole

import typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole.SearchanalyticsResource
import typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole.SitemapsResource
import typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole.SitesResource
import typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole.UrlTestingToolsResource
import typings.maximMazurokGapiClientSearchconsole.maximMazurokGapiClientSearchconsoleStrings.searchconsole
import typings.maximMazurokGapiClientSearchconsole.maximMazurokGapiClientSearchconsoleStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Google Search Console API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: searchconsole, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: searchconsole, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object searchconsole {
        
        @JSGlobal("gapi.client.searchconsole.searchanalytics")
        @js.native
        val searchanalytics: SearchanalyticsResource = js.native
        
        @JSGlobal("gapi.client.searchconsole.sitemaps")
        @js.native
        val sitemaps: SitemapsResource = js.native
        
        @JSGlobal("gapi.client.searchconsole.sites")
        @js.native
        val sites: SitesResource = js.native
        
        @JSGlobal("gapi.client.searchconsole.urlTestingTools")
        @js.native
        val urlTestingTools: UrlTestingToolsResource = js.native
      }
    }
  }
}
