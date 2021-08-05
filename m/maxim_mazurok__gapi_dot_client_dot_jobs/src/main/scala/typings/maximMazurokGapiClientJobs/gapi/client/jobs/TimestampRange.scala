package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimestampRange extends StObject {
  
  /** End of the period. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** Begin of the period. */
  var startTime: js.UndefOr[String] = js.undefined
}
object TimestampRange {
  
  inline def apply(): TimestampRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimestampRange]
  }
  
  extension [Self <: TimestampRange](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
