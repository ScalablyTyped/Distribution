package typings.nodemailer.smtpTransportMod

import typings.nodemailer.nodemailerStrings.OAUTH2
import typings.nodemailer.nodemailerStrings.XOAUTH2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticationTypeOAuth2 extends AuthenticationType {
  
  var method: XOAUTH2 = js.native
  
  var oauth2: typings.nodemailer.xoauth2Mod.^ = js.native
  
  var `type`: OAUTH2 = js.native
  
  var user: String = js.native
}
object AuthenticationTypeOAuth2 {
  
  @scala.inline
  def apply(method: XOAUTH2, oauth2: typings.nodemailer.xoauth2Mod.^, `type`: OAUTH2, user: String): AuthenticationTypeOAuth2 = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], oauth2 = oauth2.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationTypeOAuth2]
  }
  
  @scala.inline
  implicit class AuthenticationTypeOAuth2Ops[Self <: AuthenticationTypeOAuth2] (val x: Self) extends AnyVal {
    
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
    def setMethod(value: XOAUTH2): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth2(value: typings.nodemailer.xoauth2Mod.^): Self = this.set("oauth2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: OAUTH2): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
