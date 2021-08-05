package typings.meteor.Meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Settings **/
/** User **/
trait UserEmail extends StObject {
  
  var address: String
  
  var verified: Boolean
}
object UserEmail {
  
  inline def apply(address: String, verified: Boolean): UserEmail = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserEmail]
  }
  
  extension [Self <: UserEmail](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
  }
}
