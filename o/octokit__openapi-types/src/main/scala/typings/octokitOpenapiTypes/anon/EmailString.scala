package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailString extends StObject {
  
  /**
    * Format: email
    * @description Git email address of the commit's committer
    * @example monalisa.octocat@example.com
    */
  var email: String
  
  /**
    * @description Name of the commit's committer
    * @example Monalisa Octocat
    */
  var name: String
}
object EmailString {
  
  inline def apply(email: String, name: String): EmailString = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmailString] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
