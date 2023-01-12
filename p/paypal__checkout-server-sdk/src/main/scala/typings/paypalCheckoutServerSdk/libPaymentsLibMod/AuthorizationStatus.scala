package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizationStatus extends StObject {
  
  val status: Status
  
  val status_details: AuthorizationStatusDetails
}
object AuthorizationStatus {
  
  inline def apply(status: Status, status_details: AuthorizationStatusDetails): AuthorizationStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], status_details = status_details.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthorizationStatus] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatus_details(value: AuthorizationStatusDetails): Self = StObject.set(x, "status_details", value.asInstanceOf[js.Any])
  }
}
