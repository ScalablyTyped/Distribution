package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Primary extends StObject {
  
  /**
    * Format: email
    * @example octocat@github.com
    */
  var email: String
  
  /** @example true */
  var primary: Boolean
  
  /** @example true */
  var verified: Boolean
  
  /** @example public */
  var visibility: String | Null
}
object Primary {
  
  inline def apply(email: String, primary: Boolean, verified: Boolean): Primary = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any], visibility = null)
    __obj.asInstanceOf[Primary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Primary] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    
    inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityNull: Self = StObject.set(x, "visibility", null)
  }
}
