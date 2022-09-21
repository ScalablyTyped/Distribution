package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailsArray extends StObject {
  
  /** @description Email addresses associated with the GitHub user account. */
  var emails: js.Array[String]
}
object EmailsArray {
  
  inline def apply(emails: js.Array[String]): EmailsArray = {
    val __obj = js.Dynamic.literal(emails = emails.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailsArray]
  }
  
  extension [Self <: EmailsArray](x: Self) {
    
    inline def setEmails(value: js.Array[String]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    inline def setEmailsVarargs(value: String*): Self = StObject.set(x, "emails", js.Array(value*))
  }
}
