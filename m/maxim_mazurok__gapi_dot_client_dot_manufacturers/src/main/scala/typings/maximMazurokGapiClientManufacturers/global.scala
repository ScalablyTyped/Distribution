package typings.maximMazurokGapiClientManufacturers

import typings.maximMazurokGapiClientManufacturers.gapi.client.manufacturers.AccountsResource
import typings.maximMazurokGapiClientManufacturers.maximMazurokGapiClientManufacturersStrings.manufacturers
import typings.maximMazurokGapiClientManufacturers.maximMazurokGapiClientManufacturersStrings.v1
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
      
      /** Load Manufacturer Center API v1 */
      def load(name: manufacturers, version: v1): js.Thenable[Unit] = js.native
      def load(name: manufacturers, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object manufacturers extends js.Object {
        
        val accounts: AccountsResource = js.native
      }
    }
  }
}
