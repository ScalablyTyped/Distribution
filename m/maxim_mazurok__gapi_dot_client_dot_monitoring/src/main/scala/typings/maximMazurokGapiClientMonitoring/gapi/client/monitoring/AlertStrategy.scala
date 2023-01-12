package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlertStrategy extends StObject {
  
  /** If an alert policy that was active has no data for this long, any open incidents will close */
  var autoClose: js.UndefOr[String] = js.undefined
  
  /** Required for alert policies with a LogMatch condition.This limit is not implemented for alert policies that are not log-based. */
  var notificationRateLimit: js.UndefOr[NotificationRateLimit] = js.undefined
}
object AlertStrategy {
  
  inline def apply(): AlertStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertStrategy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlertStrategy] (val x: Self) extends AnyVal {
    
    inline def setAutoClose(value: String): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
    
    inline def setNotificationRateLimit(value: NotificationRateLimit): Self = StObject.set(x, "notificationRateLimit", value.asInstanceOf[js.Any])
    
    inline def setNotificationRateLimitUndefined: Self = StObject.set(x, "notificationRateLimit", js.undefined)
  }
}
