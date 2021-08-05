package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeRange extends StObject {
  
  // End time for the time range.
  var endTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Start time for the time range.
  var startTime: js.UndefOr[NullableOption[String]] = js.undefined
}
object TimeRange {
  
  inline def apply(): TimeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeRange]
  }
  
  extension [Self <: TimeRange](x: Self) {
    
    inline def setEndTime(value: NullableOption[String]): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: NullableOption[String]): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
