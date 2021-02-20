package typings.meteor.Meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Settings **/
/** User **/
@js.native
trait UserEmail extends StObject {
  
  var address: String = js.native
  
  var verified: Boolean = js.native
}
object UserEmail {
  
  @scala.inline
  def apply(address: String, verified: Boolean): UserEmail = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserEmail]
  }
  
  @scala.inline
  implicit class UserEmailMutableBuilder[Self <: UserEmail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
  }
}
