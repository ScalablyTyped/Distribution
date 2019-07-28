package typings.pickadate.PickadateNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateItem extends Item {
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
  var obj: Date
  /**
    * The full year.
    */
  var year: Double
}

object DateItem {
  @scala.inline
  def apply(date: Double, day: Double, month: Double, obj: Date, pick: Double, year: Double): DateItem = {
    val __obj = js.Dynamic.literal(date = date, day = day, month = month, obj = obj, pick = pick, year = year)
  
    __obj.asInstanceOf[DateItem]
  }
}

