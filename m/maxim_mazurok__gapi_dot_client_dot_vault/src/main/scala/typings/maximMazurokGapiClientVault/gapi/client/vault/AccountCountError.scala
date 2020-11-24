package typings.maximMazurokGapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountCountError extends js.Object {
  
  /** Account owner. */
  var account: js.UndefOr[UserInfo] = js.native
  
  /** Account query error. */
  var errorType: js.UndefOr[String] = js.native
}
object AccountCountError {
  
  @scala.inline
  def apply(): AccountCountError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountCountError]
  }
  
  @scala.inline
  implicit class AccountCountErrorOps[Self <: AccountCountError] (val x: Self) extends AnyVal {
    
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
    def setAccount(value: UserInfo): Self = this.set("account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccount: Self = this.set("account", js.undefined)
    
    @scala.inline
    def setErrorType(value: String): Self = this.set("errorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorType: Self = this.set("errorType", js.undefined)
  }
}
