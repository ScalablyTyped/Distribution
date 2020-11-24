package typings.nodemailer.smtpTransportMod

import typings.nodemailer.nodemailerBooleans.`false`
import typings.nodemailer.nodemailerStrings.LOGIN
import typings.nodemailer.smtpConnectionMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticationTypeLogin extends AuthenticationType {
  
  var credentials: Credentials = js.native
  
  var method: String | `false` = js.native
  
  var `type`: LOGIN = js.native
  
  var user: String = js.native
}
object AuthenticationTypeLogin {
  
  @scala.inline
  def apply(credentials: Credentials, method: String | `false`, `type`: LOGIN, user: String): AuthenticationTypeLogin = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationTypeLogin]
  }
  
  @scala.inline
  implicit class AuthenticationTypeLoginOps[Self <: AuthenticationTypeLogin] (val x: Self) extends AnyVal {
    
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
    def setCredentials(value: Credentials): Self = this.set("credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String | `false`): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: LOGIN): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
