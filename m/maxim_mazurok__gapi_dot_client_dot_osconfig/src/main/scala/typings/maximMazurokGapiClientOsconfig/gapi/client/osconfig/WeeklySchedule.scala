package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeeklySchedule extends StObject {
  
  /** Required. Day of the week. */
  var dayOfWeek: js.UndefOr[String] = js.undefined
}
object WeeklySchedule {
  
  inline def apply(): WeeklySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeeklySchedule]
  }
  
  extension [Self <: WeeklySchedule](x: Self) {
    
    inline def setDayOfWeek(value: String): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setDayOfWeekUndefined: Self = StObject.set(x, "dayOfWeek", js.undefined)
  }
}
