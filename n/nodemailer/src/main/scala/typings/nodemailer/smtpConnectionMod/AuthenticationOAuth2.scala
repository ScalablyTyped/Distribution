package typings.nodemailer.smtpConnectionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationOAuth2 extends StObject {
  
  /**  if set then forces smtp-connection to use XOAuth2 for authentication */
  var oauth2: OAuth2
}
object AuthenticationOAuth2 {
  
  inline def apply(oauth2: OAuth2): AuthenticationOAuth2 = {
    val __obj = js.Dynamic.literal(oauth2 = oauth2.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationOAuth2]
  }
  
  extension [Self <: AuthenticationOAuth2](x: Self) {
    
    inline def setOauth2(value: OAuth2): Self = StObject.set(x, "oauth2", value.asInstanceOf[js.Any])
  }
}
