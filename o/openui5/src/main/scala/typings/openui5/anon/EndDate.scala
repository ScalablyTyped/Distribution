package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndDate extends StObject {
  
  /**
    * Interval end date as JavaScript date object
    */
  var endDate: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Interval start date as JavaScript date object
    */
  var startDate: js.UndefOr[js.Object] = js.undefined
  
  /**
    * If set, the selected interval is a subinterval
    */
  var subInterval: js.UndefOr[Boolean] = js.undefined
}
object EndDate {
  
  inline def apply(): EndDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndDate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndDate] (val x: Self) extends AnyVal {
    
    inline def setEndDate(value: js.Object): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setStartDate(value: js.Object): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setSubInterval(value: Boolean): Self = StObject.set(x, "subInterval", value.asInstanceOf[js.Any])
    
    inline def setSubIntervalUndefined: Self = StObject.set(x, "subInterval", js.undefined)
  }
}
