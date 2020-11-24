package typings.pickadate.Pickadate

import typings.std.Date
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
  implicit class DateItemOps[Self <: DateItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDate(value: Double): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDay(value: Double): Self = this.set("day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonth(value: Double): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObj(value: Date): Self = this.set("obj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYear(value: Double): Self = this.set("year", value.asInstanceOf[js.Any])
  }
}
