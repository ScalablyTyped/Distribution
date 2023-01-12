package typings.meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailTemplates extends StObject {
  
  var enrollAccount: EmailFields
  
  var from: String
  
  var headers: js.UndefOr[Header] = js.undefined
  
  var resetPassword: EmailFields
  
  var siteName: String
  
  var verifyEmail: EmailFields
}
object EmailTemplates {
  
  inline def apply(
    enrollAccount: EmailFields,
    from: String,
    resetPassword: EmailFields,
    siteName: String,
    verifyEmail: EmailFields
  ): EmailTemplates = {
    val __obj = js.Dynamic.literal(enrollAccount = enrollAccount.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], resetPassword = resetPassword.asInstanceOf[js.Any], siteName = siteName.asInstanceOf[js.Any], verifyEmail = verifyEmail.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailTemplates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmailTemplates] (val x: Self) extends AnyVal {
    
    inline def setEnrollAccount(value: EmailFields): Self = StObject.set(x, "enrollAccount", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Header): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setResetPassword(value: EmailFields): Self = StObject.set(x, "resetPassword", value.asInstanceOf[js.Any])
    
    inline def setSiteName(value: String): Self = StObject.set(x, "siteName", value.asInstanceOf[js.Any])
    
    inline def setVerifyEmail(value: EmailFields): Self = StObject.set(x, "verifyEmail", value.asInstanceOf[js.Any])
  }
}
