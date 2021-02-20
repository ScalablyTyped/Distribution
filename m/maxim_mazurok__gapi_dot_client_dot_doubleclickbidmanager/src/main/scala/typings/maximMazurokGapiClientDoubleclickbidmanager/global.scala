package typings.maximMazurokGapiClientDoubleclickbidmanager

import typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager.LineitemsResource
import typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager.QueriesResource
import typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager.ReportsResource
import typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager.SdfResource
import typings.maximMazurokGapiClientDoubleclickbidmanager.maximMazurokGapiClientDoubleclickbidmanagerStrings.doubleclickbidmanager
import typings.maximMazurokGapiClientDoubleclickbidmanager.maximMazurokGapiClientDoubleclickbidmanagerStrings.v1Dot1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
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
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: doubleclickbidmanager, version: v1Dot1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: doubleclickbidmanager, version: v1Dot1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
