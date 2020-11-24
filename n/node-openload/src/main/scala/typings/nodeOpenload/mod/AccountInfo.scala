package typings.nodeOpenload.mod

import typings.nodeOpenload.anon.Left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The account info response
  */
@js.native
trait AccountInfo extends js.Object {
  
  var balance: Double = js.native
  
  var email: String = js.native
  
  var extid: String = js.native
  
  var signup_at: String = js.native
  
  var storage_left: Double = js.native
  
  var storage_used: String = js.native
  
  var traffic: Left = js.native
}
object AccountInfo {
  
  @scala.inline
  def apply(
    balance: Double,
    email: String,
    extid: String,
    signup_at: String,
    storage_left: Double,
    storage_used: String,
    traffic: Left
  ): AccountInfo = {
    val __obj = js.Dynamic.literal(balance = balance.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], extid = extid.asInstanceOf[js.Any], signup_at = signup_at.asInstanceOf[js.Any], storage_left = storage_left.asInstanceOf[js.Any], storage_used = storage_used.asInstanceOf[js.Any], traffic = traffic.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInfo]
  }
  
  @scala.inline
  implicit class AccountInfoOps[Self <: AccountInfo] (val x: Self) extends AnyVal {
    
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
    def setBalance(value: Double): Self = this.set("balance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtid(value: String): Self = this.set("extid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignup_at(value: String): Self = this.set("signup_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorage_left(value: Double): Self = this.set("storage_left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorage_used(value: String): Self = this.set("storage_used", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraffic(value: Left): Self = this.set("traffic", value.asInstanceOf[js.Any])
  }
}
