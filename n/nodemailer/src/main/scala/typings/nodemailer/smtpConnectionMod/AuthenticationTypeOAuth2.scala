package typings.nodemailer.smtpConnectionMod

import typings.nodemailer.nodemailerStrings.OAUTH2
import typings.nodemailer.nodemailerStrings.OAuth2_
import typings.nodemailer.nodemailerStrings.oauth2__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationTypeOAuth2
  extends StObject
     with typings.nodemailer.xoauth2Mod.Options
     with AuthenticationType {
  
  /** indicates the authetication type, defaults to ‘login’, other option is ‘oauth2’ or ‘custom’ */
  var `type`: js.UndefOr[oauth2__ | OAuth2_ | OAUTH2] = js.undefined
}
object AuthenticationTypeOAuth2 {
  
  @scala.inline
  def apply(): AuthenticationTypeOAuth2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationTypeOAuth2]
  }
  
  @scala.inline
  implicit class AuthenticationTypeOAuth2MutableBuilder[Self <: AuthenticationTypeOAuth2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: oauth2__ | OAuth2_ | OAUTH2): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
