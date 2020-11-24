package typings.maximMazurokGapiClientSearchconsole

import typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole.SearchanalyticsResource
import typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole.SitemapsResource
import typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole.SitesResource
import typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole.UrlTestingToolsResource
import typings.maximMazurokGapiClientSearchconsole.maximMazurokGapiClientSearchconsoleStrings.searchconsole
import typings.maximMazurokGapiClientSearchconsole.maximMazurokGapiClientSearchconsoleStrings.v1
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
      
      /** Load Google Search Console API v1 */
      def load(name: searchconsole, version: v1): js.Thenable[Unit] = js.native
      def load(name: searchconsole, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object searchconsole extends js.Object {
        
        val searchanalytics: SearchanalyticsResource = js.native
        
        val sitemaps: SitemapsResource = js.native
        
        val sites: SitesResource = js.native
        
        val urlTestingTools: UrlTestingToolsResource = js.native
      }
    }
  }
}
