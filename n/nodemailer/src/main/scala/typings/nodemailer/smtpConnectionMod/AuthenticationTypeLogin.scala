package typings.nodemailer.smtpConnectionMod

import typings.nodemailer.nodemailerStrings.LOGIN
import typings.nodemailer.nodemailerStrings.Login_
import typings.nodemailer.nodemailerStrings.login__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationTypeLogin
  extends StObject
     with Credentials
     with AuthenticationType {
  
  /** indicates the authetication type, defaults to ‘login’, other option is ‘oauth2’ or ‘custom’ */
  var `type`: js.UndefOr[login__ | Login_ | LOGIN] = js.undefined
}
object AuthenticationTypeLogin {
  
  inline def apply(pass: String, user: String): AuthenticationTypeLogin = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationTypeLogin]
  }
  
  extension [Self <: AuthenticationTypeLogin](x: Self) {
    
    inline def setType(value: login__ | Login_ | LOGIN): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
