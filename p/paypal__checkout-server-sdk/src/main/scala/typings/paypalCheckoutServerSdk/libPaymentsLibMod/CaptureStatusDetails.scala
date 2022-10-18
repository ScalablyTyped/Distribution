package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptureStatusDetails extends StObject {
  
  var reason: Reason
}
object CaptureStatusDetails {
  
  inline def apply(reason: Reason): CaptureStatusDetails = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureStatusDetails]
  }
  
  extension [Self <: CaptureStatusDetails](x: Self) {
    
    inline def setReason(value: Reason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
