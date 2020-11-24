package typings.nodeWindows.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User extends js.Object {
  
  var account: String = js.native
  
  var domain: String = js.native
  
  var mungeCredentialsAfterInstall: js.UndefOr[Boolean] = js.native
  
  var password: String = js.native
}
object User {
  
  @scala.inline
  def apply(account: String, domain: String, password: String): User = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
    
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
    def setAccount(value: String): Self = this.set("account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMungeCredentialsAfterInstall(value: Boolean): Self = this.set("mungeCredentialsAfterInstall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMungeCredentialsAfterInstall: Self = this.set("mungeCredentialsAfterInstall", js.undefined)
  }
}
