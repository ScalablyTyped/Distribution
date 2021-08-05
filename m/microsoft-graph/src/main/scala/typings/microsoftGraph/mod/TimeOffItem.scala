package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeOffItem
  extends StObject
     with ScheduleEntity {
  
  // ID of the timeOffReason for this timeOffItem. Required.
  var timeOffReasonId: js.UndefOr[NullableOption[String]] = js.undefined
}
object TimeOffItem {
  
  inline def apply(): TimeOffItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeOffItem]
  }
  
  extension [Self <: TimeOffItem](x: Self) {
    
    inline def setTimeOffReasonId(value: NullableOption[String]): Self = StObject.set(x, "timeOffReasonId", value.asInstanceOf[js.Any])
    
    inline def setTimeOffReasonIdNull: Self = StObject.set(x, "timeOffReasonId", null)
    
    inline def setTimeOffReasonIdUndefined: Self = StObject.set(x, "timeOffReasonId", js.undefined)
  }
}
