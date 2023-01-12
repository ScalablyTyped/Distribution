package typings.paypalCheckoutServerSdk.libOrdersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreeDSecureAuthenticationResponse extends StObject {
  
  var authentication_status: AuthenticationStatus
  
  var enrollment_status: EnrollmentStatus
}
object ThreeDSecureAuthenticationResponse {
  
  inline def apply(authentication_status: AuthenticationStatus, enrollment_status: EnrollmentStatus): ThreeDSecureAuthenticationResponse = {
    val __obj = js.Dynamic.literal(authentication_status = authentication_status.asInstanceOf[js.Any], enrollment_status = enrollment_status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeDSecureAuthenticationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThreeDSecureAuthenticationResponse] (val x: Self) extends AnyVal {
    
    inline def setAuthentication_status(value: AuthenticationStatus): Self = StObject.set(x, "authentication_status", value.asInstanceOf[js.Any])
    
    inline def setEnrollment_status(value: EnrollmentStatus): Self = StObject.set(x, "enrollment_status", value.asInstanceOf[js.Any])
  }
}
