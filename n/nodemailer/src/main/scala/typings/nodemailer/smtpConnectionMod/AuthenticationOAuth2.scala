package typings.nodemailer.smtpConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticationOAuth2 extends js.Object {
  
  /**  if set then forces smtp-connection to use XOAuth2 for authentication */
  var oauth2: OAuth2 = js.native
}
object AuthenticationOAuth2 {
  
  @scala.inline
  def apply(oauth2: OAuth2): AuthenticationOAuth2 = {
    val __obj = js.Dynamic.literal(oauth2 = oauth2.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationOAuth2]
  }
  
  @scala.inline
  implicit class AuthenticationOAuth2Ops[Self <: AuthenticationOAuth2] (val x: Self) extends AnyVal {
    
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
    def setOauth2(value: OAuth2): Self = this.set("oauth2", value.asInstanceOf[js.Any])
  }
}
