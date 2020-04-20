package typings.pickadate.Pickadate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeItem extends Item {
  /**
    * Hour of the day from 0 to 23.
    */
  var hour: Double
  /**
    * The minutes of the hour from 0 to 59 (based on the interval).
    */
  var mins: Double
}

object TimeItem {
  @scala.inline
  def apply(hour: Double, mins: Double, pick: Double): TimeItem = {
    val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], mins = mins.asInstanceOf[js.Any], pick = pick.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeItem]
  }
}

