package typings.maximMazurokGapiClientManufacturers

import typings.maximMazurokGapiClientManufacturers.gapi.client.manufacturers.AccountsResource
import typings.maximMazurokGapiClientManufacturers.maximMazurokGapiClientManufacturersStrings.manufacturers
import typings.maximMazurokGapiClientManufacturers.maximMazurokGapiClientManufacturersStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Manufacturer Center API v1 */
      inline def load(name: manufacturers, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: manufacturers, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object manufacturers {
        
        @JSGlobal("gapi.client.manufacturers.accounts")
        @js.native
        val accounts: AccountsResource = js.native
      }
    }
  }
}
