package typings
package pickadateLib.PickadateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateItem extends Item {
  /**
    * The date of the month.
    */
  var date: scala.Double
  /**
    * The day of the week with zero-as-index.
    */
  var day: scala.Double
  /**
    * The month with zero-as-index.
    */
  var month: scala.Double
  /**
    * The underlying JavaScript Date object.
    */
  var obj: stdLib.Date
  /**
    * The full year.
    */
  var year: scala.Double
}

object DateItem {
  @scala.inline
  def apply(
    date: scala.Double,
    day: scala.Double,
    month: scala.Double,
    obj: stdLib.Date,
    pick: scala.Double,
    year: scala.Double
  ): DateItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("day")(day)
    __obj.updateDynamic("month")(month)
    __obj.updateDynamic("obj")(obj)
    __obj.updateDynamic("pick")(pick)
    __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[DateItem]
  }
}

