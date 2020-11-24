package typings.maximMazurokGapiClientDoubleclickbidmanager

import typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager.LineitemsResource
import typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager.QueriesResource
import typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager.ReportsResource
import typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager.SdfResource
import typings.maximMazurokGapiClientDoubleclickbidmanager.maximMazurokGapiClientDoubleclickbidmanagerStrings.doubleclickbidmanager
import typings.maximMazurokGapiClientDoubleclickbidmanager.maximMazurokGapiClientDoubleclickbidmanagerStrings.v1Dot1
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
      
      /** Load DoubleClick Bid Manager API v1.1 */
      def load(name: doubleclickbidmanager, version: v1Dot1): js.Thenable[Unit] = js.native
      def load(name: doubleclickbidmanager, version: v1Dot1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object doubleclickbidmanager extends js.Object {
        
        val lineitems: LineitemsResource = js.native
        
        val queries: QueriesResource = js.native
        
        val reports: ReportsResource = js.native
        
        val sdf: SdfResource = js.native
      }
    }
  }
}
