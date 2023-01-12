package typings.paypalCheckoutServerSdk.libOrdersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationResponse extends StObject {
  
  var liability_shift: LiabilityShift
  
  var three_d_secure: ThreeDSecureAuthenticationResponse
}
object AuthenticationResponse {
  
  inline def apply(liability_shift: LiabilityShift, three_d_secure: ThreeDSecureAuthenticationResponse): AuthenticationResponse = {
    val __obj = js.Dynamic.literal(liability_shift = liability_shift.asInstanceOf[js.Any], three_d_secure = three_d_secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthenticationResponse] (val x: Self) extends AnyVal {
    
    inline def setLiability_shift(value: LiabilityShift): Self = StObject.set(x, "liability_shift", value.asInstanceOf[js.Any])
    
    inline def setThree_d_secure(value: ThreeDSecureAuthenticationResponse): Self = StObject.set(x, "three_d_secure", value.asInstanceOf[js.Any])
  }
}
