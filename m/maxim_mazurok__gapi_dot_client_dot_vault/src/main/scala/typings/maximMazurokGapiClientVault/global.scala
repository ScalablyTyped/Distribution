package typings.maximMazurokGapiClientVault

import typings.maximMazurokGapiClientVault.gapi.client.vault.MattersResource
import typings.maximMazurokGapiClientVault.gapi.client.vault.OperationsResource
import typings.maximMazurokGapiClientVault.maximMazurokGapiClientVaultStrings.v1
import typings.maximMazurokGapiClientVault.maximMazurokGapiClientVaultStrings.vault
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
      
      /** Load G Suite Vault API v1 */
      def load(name: vault, version: v1): js.Thenable[Unit] = js.native
      def load(name: vault, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object vault extends js.Object {
        
        val matters: MattersResource = js.native
        
        val operations: OperationsResource = js.native
      }
    }
  }
}
