package typings.nodemailer.smtpConnectionMod

import typings.nodemailer.nodemailerStrings.CUSTOM
import typings.nodemailer.nodemailerStrings.Custom_
import typings.nodemailer.nodemailerStrings.custom__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.nodemailer.smtpConnectionMod.AuthenticationTypeCustom
  - typings.nodemailer.smtpConnectionMod.AuthenticationTypeLogin
  - typings.nodemailer.smtpConnectionMod.AuthenticationTypeOAuth2
*/
trait AuthenticationType extends StObject
object AuthenticationType {
  
  @scala.inline
  def AuthenticationTypeCustom(method: String, pass: String, `type`: custom__ | Custom_ | CUSTOM, user: String): typings.nodemailer.smtpConnectionMod.AuthenticationTypeCustom = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nodemailer.smtpConnectionMod.AuthenticationTypeCustom]
  }
  
  @scala.inline
  def AuthenticationTypeLogin(pass: String, user: String): typings.nodemailer.smtpConnectionMod.AuthenticationTypeLogin = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nodemailer.smtpConnectionMod.AuthenticationTypeLogin]
  }
  
  @scala.inline
  def AuthenticationTypeOAuth2(): typings.nodemailer.smtpConnectionMod.AuthenticationTypeOAuth2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.nodemailer.smtpConnectionMod.AuthenticationTypeOAuth2]
  }
}
