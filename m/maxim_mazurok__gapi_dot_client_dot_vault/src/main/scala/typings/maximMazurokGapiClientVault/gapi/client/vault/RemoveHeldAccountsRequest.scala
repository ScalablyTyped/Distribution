package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveHeldAccountsRequest extends StObject {
  
  /** Account IDs to identify HeldAccounts to remove. */
  var accountIds: js.UndefOr[js.Array[String]] = js.native
}
object RemoveHeldAccountsRequest {
  
  @scala.inline
  def apply(): RemoveHeldAccountsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveHeldAccountsRequest]
  }
  
  @scala.inline
  implicit class RemoveHeldAccountsRequestMutableBuilder[Self <: RemoveHeldAccountsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountIds(value: js.Array[String]): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdsUndefined: Self = StObject.set(x, "accountIds", js.undefined)
    
    @scala.inline
    def setAccountIdsVarargs(value: String*): Self = StObject.set(x, "accountIds", js.Array(value :_*))
  }
}
