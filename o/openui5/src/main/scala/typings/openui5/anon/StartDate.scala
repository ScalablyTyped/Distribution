package typings.openui5.anon

import typings.openui5.sapMPlanningCalendarRowMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDate extends StObject {
  
  /**
    * Interval end date as a JavaScript date object.
    */
  var endDate: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Row of the selected interval.
    */
  var row: js.UndefOr[default] = js.undefined
  
  /**
    * Start date of the selected interval, as a JavaScript date object.
    */
  var startDate: js.UndefOr[js.Object] = js.undefined
  
  /**
    * If set, the selected interval is a subinterval.
    */
  var subInterval: js.UndefOr[Boolean] = js.undefined
}
object StartDate {
  
  inline def apply(): StartDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartDate]
  }
  
  extension [Self <: StartDate](x: Self) {
    
    inline def setEndDate(value: js.Object): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setRow(value: default): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    
    inline def setStartDate(value: js.Object): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setSubInterval(value: Boolean): Self = StObject.set(x, "subInterval", value.asInstanceOf[js.Any])
    
    inline def setSubIntervalUndefined: Self = StObject.set(x, "subInterval", js.undefined)
  }
}
