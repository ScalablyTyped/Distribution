package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Verified extends StObject {
  
  var email: String
  
  var primary: Boolean
  
  var verified: Boolean
  
  var visibility: String
}
object Verified {
  
  @scala.inline
  def apply(email: String, primary: Boolean, verified: Boolean, visibility: String): Verified = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[Verified]
  }
  
  @scala.inline
  implicit class VerifiedMutableBuilder[Self <: Verified] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
