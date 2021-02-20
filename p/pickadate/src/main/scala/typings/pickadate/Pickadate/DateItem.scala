package typings.pickadate.Pickadate

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateItem extends Item {
  
  /**
    * The date of the month.
    */
  var date: Double = js.native
  
  /**
    * The day of the week with zero-as-index.
    */
  var day: Double = js.native
  
  /**
    * The month with zero-as-index.
    */
  var month: Double = js.native
  
  /**
    * The underlying JavaScript Date object.
    */
  var obj: Date = js.native
  
  /**
    * The full year.
    */
  var year: Double = js.native
}
object DateItem {
  
  @scala.inline
  def apply(date: Double, day: Double, month: Double, obj: Date, pick: Double, year: Double): DateItem = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any], pick = pick.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateItem]
  }
  
  @scala.inline
  implicit class DateItemMutableBuilder[Self <: DateItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObj(value: Date): Self = StObject.set(x, "obj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
