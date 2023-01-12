package typings.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DailyCycle extends StObject {
  
  /** Output only. Duration of the time window, set by service producer. */
  var duration: js.UndefOr[String] = js.undefined
  
  /** Time within the day to start the operations. */
  var startTime: js.UndefOr[TimeOfDay] = js.undefined
}
object DailyCycle {
  
  inline def apply(): DailyCycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DailyCycle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DailyCycle] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setStartTime(value: TimeOfDay): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
