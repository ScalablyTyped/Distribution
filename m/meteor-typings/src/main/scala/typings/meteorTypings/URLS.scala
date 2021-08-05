package typings.meteorTypings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait URLS extends StObject {
  
  def enrollAccount(token: String): String
  
  def resetPassword(token: String): String
  
  def verifyEmail(token: String): String
}
object URLS {
  
  inline def apply(enrollAccount: String => String, resetPassword: String => String, verifyEmail: String => String): URLS = {
    val __obj = js.Dynamic.literal(enrollAccount = js.Any.fromFunction1(enrollAccount), resetPassword = js.Any.fromFunction1(resetPassword), verifyEmail = js.Any.fromFunction1(verifyEmail))
    __obj.asInstanceOf[URLS]
  }
  
  extension [Self <: URLS](x: Self) {
    
    inline def setEnrollAccount(value: String => String): Self = StObject.set(x, "enrollAccount", js.Any.fromFunction1(value))
    
    inline def setResetPassword(value: String => String): Self = StObject.set(x, "resetPassword", js.Any.fromFunction1(value))
    
    inline def setVerifyEmail(value: String => String): Self = StObject.set(x, "verifyEmail", js.Any.fromFunction1(value))
  }
}
