package typings.maximMazurokGapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddHeldAccountResult extends js.Object {
  
  /** If present, this account was successfully created. */
  var account: js.UndefOr[HeldAccount] = js.native
  
  /** This represents the success status. If failed, check message. */
  var status: js.UndefOr[Status] = js.native
}
object AddHeldAccountResult {
  
  @scala.inline
  def apply(): AddHeldAccountResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddHeldAccountResult]
  }
  
  @scala.inline
  implicit class AddHeldAccountResultOps[Self <: AddHeldAccountResult] (val x: Self) extends AnyVal {
    
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
    def setAccount(value: HeldAccount): Self = this.set("account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccount: Self = this.set("account", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
