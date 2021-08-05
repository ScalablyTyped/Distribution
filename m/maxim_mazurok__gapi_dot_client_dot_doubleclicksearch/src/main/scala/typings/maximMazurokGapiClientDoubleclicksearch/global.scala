package typings.maximMazurokGapiClientDoubleclicksearch

import typings.maximMazurokGapiClientDoubleclicksearch.gapi.client.doubleclicksearch.ConversionResource
import typings.maximMazurokGapiClientDoubleclicksearch.gapi.client.doubleclicksearch.ReportsResource
import typings.maximMazurokGapiClientDoubleclicksearch.gapi.client.doubleclicksearch.SavedColumnsResource
import typings.maximMazurokGapiClientDoubleclicksearch.maximMazurokGapiClientDoubleclicksearchStrings.doubleclicksearch
import typings.maximMazurokGapiClientDoubleclicksearch.maximMazurokGapiClientDoubleclicksearchStrings.v2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object doubleclicksearch {
        
        @JSGlobal("gapi.client.doubleclicksearch.conversion")
        @js.native
        val conversion: ConversionResource = js.native
        
        @JSGlobal("gapi.client.doubleclicksearch.reports")
        @js.native
        val reports: ReportsResource = js.native
        
        @JSGlobal("gapi.client.doubleclicksearch.savedColumns")
        @js.native
        val savedColumns: SavedColumnsResource = js.native
      }
      
      /** Load Search Ads 360 API v2 */
      inline def load(name: doubleclicksearch, version: v2): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: doubleclicksearch, version: v2, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
