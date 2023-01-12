package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndDateStartDate extends StObject {
  
  /**
    * The end date as a JavaScript date object of the focused grid cell.
    */
  var endDate: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The start date as a JavaScript date object of the focused grid cell.
    */
  var startDate: js.UndefOr[js.Object] = js.undefined
}
object EndDateStartDate {
  
  inline def apply(): EndDateStartDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndDateStartDate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndDateStartDate] (val x: Self) extends AnyVal {
    
    inline def setEndDate(value: js.Object): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setStartDate(value: js.Object): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
