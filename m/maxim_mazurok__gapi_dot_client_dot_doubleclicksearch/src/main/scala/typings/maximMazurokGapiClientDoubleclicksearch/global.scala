package typings.maximMazurokGapiClientDoubleclicksearch

import typings.maximMazurokGapiClientDoubleclicksearch.gapi.client.doubleclicksearch.ConversionResource
import typings.maximMazurokGapiClientDoubleclicksearch.gapi.client.doubleclicksearch.ReportsResource
import typings.maximMazurokGapiClientDoubleclicksearch.gapi.client.doubleclicksearch.SavedColumnsResource
import typings.maximMazurokGapiClientDoubleclicksearch.maximMazurokGapiClientDoubleclicksearchStrings.doubleclicksearch
import typings.maximMazurokGapiClientDoubleclicksearch.maximMazurokGapiClientDoubleclicksearchStrings.v2
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
      
      /** Load Search Ads 360 API v2 */
      def load(name: doubleclicksearch, version: v2): js.Thenable[Unit] = js.native
      def load(name: doubleclicksearch, version: v2, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object doubleclicksearch extends js.Object {
        
        val conversion: ConversionResource = js.native
        
        val reports: ReportsResource = js.native
        
        val savedColumns: SavedColumnsResource = js.native
      }
    }
  }
}
