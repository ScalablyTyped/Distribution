package typings.maximMazurokGapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeldAccount extends js.Object {
  
  /** The account's ID as provided by the Admin SDK. */
  var accountId: js.UndefOr[String] = js.native
  
  /** The primary email address of the account. If used as an input, this takes precedence over account ID. */
  var email: js.UndefOr[String] = js.native
  
  /** Output only. The first name of the account holder. */
  var firstName: js.UndefOr[String] = js.native
  
  /** Output only. When the account was put on hold. */
  var holdTime: js.UndefOr[String] = js.native
  
  /** Output only. The last name of the account holder. */
  var lastName: js.UndefOr[String] = js.native
}
object HeldAccount {
  
  @scala.inline
  def apply(): HeldAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeldAccount]
  }
  
  @scala.inline
  implicit class HeldAccountOps[Self <: HeldAccount] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setFirstName(value: String): Self = this.set("firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstName: Self = this.set("firstName", js.undefined)
    
    @scala.inline
    def setHoldTime(value: String): Self = this.set("holdTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoldTime: Self = this.set("holdTime", js.undefined)
    
    @scala.inline
    def setLastName(value: String): Self = this.set("lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastName: Self = this.set("lastName", js.undefined)
  }
}
