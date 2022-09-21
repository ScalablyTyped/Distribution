package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListHeldAccountsResponse extends StObject {
  
  /** The held accounts on a hold. */
  var accounts: js.UndefOr[js.Array[HeldAccount]] = js.undefined
}
object ListHeldAccountsResponse {
  
  inline def apply(): ListHeldAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHeldAccountsResponse]
  }
  
  extension [Self <: ListHeldAccountsResponse](x: Self) {
    
    inline def setAccounts(value: js.Array[HeldAccount]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsUndefined: Self = StObject.set(x, "accounts", js.undefined)
    
    inline def setAccountsVarargs(value: HeldAccount*): Self = StObject.set(x, "accounts", js.Array(value*))
  }
}
