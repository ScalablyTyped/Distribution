package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizationStatusDetails extends StObject {
  
  var reason: Reason
}
object AuthorizationStatusDetails {
  
  inline def apply(reason: Reason): AuthorizationStatusDetails = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationStatusDetails]
  }
  
  extension [Self <: AuthorizationStatusDetails](x: Self) {
    
    inline def setReason(value: Reason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
