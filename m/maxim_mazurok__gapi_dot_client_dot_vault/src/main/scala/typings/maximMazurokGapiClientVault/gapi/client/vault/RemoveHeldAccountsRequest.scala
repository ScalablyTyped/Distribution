package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveHeldAccountsRequest extends StObject {
  
  /** Account IDs to identify HeldAccounts to remove. */
  var accountIds: js.UndefOr[js.Array[String]] = js.undefined
}
object RemoveHeldAccountsRequest {
  
  inline def apply(): RemoveHeldAccountsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveHeldAccountsRequest]
  }
  
  extension [Self <: RemoveHeldAccountsRequest](x: Self) {
    
    inline def setAccountIds(value: js.Array[String]): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "accountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: String*): Self = StObject.set(x, "accountIds", js.Array(value :_*))
  }
}
