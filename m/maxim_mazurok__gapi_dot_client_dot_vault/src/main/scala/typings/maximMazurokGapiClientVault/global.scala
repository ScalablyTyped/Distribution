package typings.maximMazurokGapiClientVault

import typings.maximMazurokGapiClientVault.gapi.client.vault.MattersResource
import typings.maximMazurokGapiClientVault.gapi.client.vault.OperationsResource
import typings.maximMazurokGapiClientVault.maximMazurokGapiClientVaultStrings.v1
import typings.maximMazurokGapiClientVault.maximMazurokGapiClientVaultStrings.vault
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load G Suite Vault API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: vault, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: vault, version: v1, callback: js.Function0[_]): Unit = js.native
      
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
