package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeOffItem extends ScheduleEntity {
  
  // ID of the timeOffReason for this timeOffItem. Required.
  var timeOffReasonId: js.UndefOr[NullableOption[String]] = js.native
}
object TimeOffItem {
  
  @scala.inline
  def apply(): TimeOffItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeOffItem]
  }
  
  @scala.inline
  implicit class TimeOffItemMutableBuilder[Self <: TimeOffItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeOffReasonId(value: NullableOption[String]): Self = StObject.set(x, "timeOffReasonId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeOffReasonIdNull: Self = StObject.set(x, "timeOffReasonId", null)
    
    @scala.inline
    def setTimeOffReasonIdUndefined: Self = StObject.set(x, "timeOffReasonId", js.undefined)
  }
}
