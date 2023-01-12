package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationRateLimit extends StObject {
  
  /** Not more than one notification per period. */
  var period: js.UndefOr[String] = js.undefined
}
object NotificationRateLimit {
  
  inline def apply(): NotificationRateLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationRateLimit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotificationRateLimit] (val x: Self) extends AnyVal {
    
    inline def setPeriod(value: String): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
