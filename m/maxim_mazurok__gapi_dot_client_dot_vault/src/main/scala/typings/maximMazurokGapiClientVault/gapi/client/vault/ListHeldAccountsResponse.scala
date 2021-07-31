package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListHeldAccountsResponse extends StObject {
  
  /** The held accounts on a hold. */
  var accounts: js.UndefOr[js.Array[HeldAccount]] = js.undefined
}
object ListHeldAccountsResponse {
  
  @scala.inline
  def apply(): ListHeldAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHeldAccountsResponse]
  }
  
  @scala.inline
  implicit class ListHeldAccountsResponseMutableBuilder[Self <: ListHeldAccountsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccounts(value: js.Array[HeldAccount]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountsUndefined: Self = StObject.set(x, "accounts", js.undefined)
    
    @scala.inline
    def setAccountsVarargs(value: HeldAccount*): Self = StObject.set(x, "accounts", js.Array(value :_*))
  }
}
