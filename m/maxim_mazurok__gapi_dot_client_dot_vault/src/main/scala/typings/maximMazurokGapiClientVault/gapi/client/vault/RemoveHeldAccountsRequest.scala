package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveHeldAccountsRequest extends StObject {
  
  /** The account IDs of the accounts to remove from the hold. */
  var accountIds: js.UndefOr[js.Array[String]] = js.undefined
}
object RemoveHeldAccountsRequest {
  
  inline def apply(): RemoveHeldAccountsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveHeldAccountsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveHeldAccountsRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountIds(value: js.Array[String]): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "accountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: String*): Self = StObject.set(x, "accountIds", js.Array(value*))
  }
}
