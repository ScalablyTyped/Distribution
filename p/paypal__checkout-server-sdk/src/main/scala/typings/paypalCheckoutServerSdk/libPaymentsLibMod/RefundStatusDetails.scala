package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefundStatusDetails extends StObject {
  
  var reason: Reason
}
object RefundStatusDetails {
  
  inline def apply(reason: Reason): RefundStatusDetails = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefundStatusDetails]
  }
  
  extension [Self <: RefundStatusDetails](x: Self) {
    
    inline def setReason(value: Reason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
