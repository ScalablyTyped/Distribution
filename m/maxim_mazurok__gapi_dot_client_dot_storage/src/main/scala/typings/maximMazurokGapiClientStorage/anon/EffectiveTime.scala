package typings.maximMazurokGapiClientStorage.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EffectiveTime extends StObject {
  
  /** Server-determined value that indicates the time from which policy was enforced and effective. This value is in RFC 3339 format. */
  var effectiveTime: js.UndefOr[String] = js.undefined
  
  /** Once locked, an object retention policy cannot be modified. */
  var isLocked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The duration in seconds that objects need to be retained. Retention duration must be greater than zero and less than 100 years. Note that enforcement of retention periods less
    * than a day is not guaranteed. Such periods should only be used for testing purposes.
    */
  var retentionPeriod: js.UndefOr[String] = js.undefined
}
object EffectiveTime {
  
  inline def apply(): EffectiveTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EffectiveTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EffectiveTime] (val x: Self) extends AnyVal {
    
    inline def setEffectiveTime(value: String): Self = StObject.set(x, "effectiveTime", value.asInstanceOf[js.Any])
    
    inline def setEffectiveTimeUndefined: Self = StObject.set(x, "effectiveTime", js.undefined)
    
    inline def setIsLocked(value: Boolean): Self = StObject.set(x, "isLocked", value.asInstanceOf[js.Any])
    
    inline def setIsLockedUndefined: Self = StObject.set(x, "isLocked", js.undefined)
    
    inline def setRetentionPeriod(value: String): Self = StObject.set(x, "retentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriodUndefined: Self = StObject.set(x, "retentionPeriod", js.undefined)
  }
}
