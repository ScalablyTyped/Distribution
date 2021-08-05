package typings.maximMazurokGapiClientDoubleclickbidmanager

import typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager.LineitemsResource
import typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager.QueriesResource
import typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager.ReportsResource
import typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager.SdfResource
import typings.maximMazurokGapiClientDoubleclickbidmanager.maximMazurokGapiClientDoubleclickbidmanagerStrings.doubleclickbidmanager
import typings.maximMazurokGapiClientDoubleclickbidmanager.maximMazurokGapiClientDoubleclickbidmanagerStrings.v1Dot1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object doubleclickbidmanager {
        
        @JSGlobal("gapi.client.doubleclickbidmanager.lineitems")
        @js.native
        val lineitems: LineitemsResource = js.native
        
        @JSGlobal("gapi.client.doubleclickbidmanager.queries")
        @js.native
        val queries: QueriesResource = js.native
        
        @JSGlobal("gapi.client.doubleclickbidmanager.reports")
        @js.native
        val reports: ReportsResource = js.native
        
        @JSGlobal("gapi.client.doubleclickbidmanager.sdf")
        @js.native
        val sdf: SdfResource = js.native
      }
      
      /** Load DoubleClick Bid Manager API v1.1 */
      inline def load(name: doubleclickbidmanager, version: v1Dot1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: doubleclickbidmanager, version: v1Dot1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
