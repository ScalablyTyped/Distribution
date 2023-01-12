package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefundStatus extends StObject {
  
  val status: Status
  
  val status_details: RefundStatusDetails
}
object RefundStatus {
  
  inline def apply(status: Status, status_details: RefundStatusDetails): RefundStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], status_details = status_details.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefundStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefundStatus] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatus_details(value: RefundStatusDetails): Self = StObject.set(x, "status_details", value.asInstanceOf[js.Any])
  }
}
