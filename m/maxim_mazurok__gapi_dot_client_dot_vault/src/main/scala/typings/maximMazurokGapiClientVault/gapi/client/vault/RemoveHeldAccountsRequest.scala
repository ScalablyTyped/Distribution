package typings.maximMazurokGapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveHeldAccountsRequest extends js.Object {
  
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
  implicit class RemoveHeldAccountsRequestOps[Self <: RemoveHeldAccountsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountIdsVarargs(value: String*): Self = this.set("accountIds", js.Array(value :_*))
    
    @scala.inline
    def setAccountIds(value: js.Array[String]): Self = this.set("accountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountIds: Self = this.set("accountIds", js.undefined)
  }
}
