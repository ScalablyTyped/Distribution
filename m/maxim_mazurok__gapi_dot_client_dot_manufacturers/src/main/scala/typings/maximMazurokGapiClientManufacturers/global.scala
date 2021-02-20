package typings.maximMazurokGapiClientManufacturers

import typings.maximMazurokGapiClientManufacturers.gapi.client.manufacturers.AccountsResource
import typings.maximMazurokGapiClientManufacturers.maximMazurokGapiClientManufacturersStrings.manufacturers
import typings.maximMazurokGapiClientManufacturers.maximMazurokGapiClientManufacturersStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Manufacturer Center API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: manufacturers, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: manufacturers, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object manufacturers {
        
        @JSGlobal("gapi.client.manufacturers.accounts")
        @js.native
        val accounts: AccountsResource = js.native
      }
    }
  }
}
