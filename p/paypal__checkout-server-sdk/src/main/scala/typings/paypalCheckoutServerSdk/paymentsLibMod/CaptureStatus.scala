package typings.paypalCheckoutServerSdk.paymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptureStatus extends StObject {
  
  val status: Status
  
  val status_details: CaptureStatusDetails
}
object CaptureStatus {
  
  inline def apply(status: Status, status_details: CaptureStatusDetails): CaptureStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], status_details = status_details.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureStatus]
  }
  
  extension [Self <: CaptureStatus](x: Self) {
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatus_details(value: CaptureStatusDetails): Self = StObject.set(x, "status_details", value.asInstanceOf[js.Any])
  }
}
