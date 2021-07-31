package typings.nodemailer.smtpConnectionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationCredentials extends StObject {
  
  /** normal authentication object */
  var credentials: Credentials
}
object AuthenticationCredentials {
  
  @scala.inline
  def apply(credentials: Credentials): AuthenticationCredentials = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationCredentials]
  }
  
  @scala.inline
  implicit class AuthenticationCredentialsMutableBuilder[Self <: AuthenticationCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredentials(value: Credentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
  }
}
