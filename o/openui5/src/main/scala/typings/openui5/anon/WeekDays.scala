package typings.openui5.anon

import typings.openui5.int
import typings.openui5.sapUiUnifiedDateRangeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeekDays extends StObject {
  
  /**
    * The days of the corresponding week that are selected or deselected.
    *
    * **Note:** Will be set to `null` if that week is being deselected.
    */
  var weekDays: js.UndefOr[default] = js.undefined
  
  /**
    * The selected week number.
    */
  var weekNumber: js.UndefOr[int] = js.undefined
}
object WeekDays {
  
  inline def apply(): WeekDays = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeekDays]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WeekDays] (val x: Self) extends AnyVal {
    
    inline def setWeekDays(value: default): Self = StObject.set(x, "weekDays", value.asInstanceOf[js.Any])
    
    inline def setWeekDaysUndefined: Self = StObject.set(x, "weekDays", js.undefined)
    
    inline def setWeekNumber(value: int): Self = StObject.set(x, "weekNumber", value.asInstanceOf[js.Any])
    
    inline def setWeekNumberUndefined: Self = StObject.set(x, "weekNumber", js.undefined)
  }
}
