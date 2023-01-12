package typings.maximMazurokGapiClientMemcache.gapi.client.memcache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeeklyCycle extends StObject {
  
  /** User can specify multiple windows in a week. Minimum of 1 window. */
  var schedule: js.UndefOr[js.Array[Schedule]] = js.undefined
}
object WeeklyCycle {
  
  inline def apply(): WeeklyCycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeeklyCycle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WeeklyCycle] (val x: Self) extends AnyVal {
    
    inline def setSchedule(value: js.Array[Schedule]): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    inline def setScheduleVarargs(value: Schedule*): Self = StObject.set(x, "schedule", js.Array(value*))
  }
}
