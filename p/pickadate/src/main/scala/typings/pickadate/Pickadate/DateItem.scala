package typings.pickadate.Pickadate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateItem
  extends StObject
     with Item {
  
  /**
    * The date of the month.
    */
  var date: Double
  
  /**
    * The day of the week with zero-as-index.
    */
  var day: Double
  
  /**
    * The month with zero-as-index.
    */
  var month: Double
  
  /**
    * The underlying JavaScript Date object.
    */
  var obj: js.Date
  
  /**
    * The full year.
    */
  var year: Double
}
object DateItem {
  
  inline def apply(date: Double, day: Double, month: Double, obj: js.Date, pick: Double, year: Double): DateItem = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any], pick = pick.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateItem] (val x: Self) extends AnyVal {
    
    inline def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setObj(value: js.Date): Self = StObject.set(x, "obj", value.asInstanceOf[js.Any])
    
    inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
