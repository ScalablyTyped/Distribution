package typings.maximMazurokGapiClientVault

import typings.maximMazurokGapiClientVault.gapi.client.vault.MattersResource
import typings.maximMazurokGapiClientVault.gapi.client.vault.OperationsResource
import typings.maximMazurokGapiClientVault.maximMazurokGapiClientVaultStrings.v1
import typings.maximMazurokGapiClientVault.maximMazurokGapiClientVaultStrings.vault
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Google Vault API v1 */
      inline def load(name: vault, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: vault, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object vault {
        
        @JSGlobal("gapi.client.vault.matters")
        @js.native
        val matters: MattersResource = js.native
        
        @JSGlobal("gapi.client.vault.operations")
        @js.native
        val operations: OperationsResource = js.native
      }
    }
  }
}
