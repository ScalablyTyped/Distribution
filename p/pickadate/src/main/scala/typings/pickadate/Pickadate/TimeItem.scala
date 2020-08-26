package typings.pickadate.Pickadate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeItem extends Item {
  /**
    * Hour of the day from 0 to 23.
    */
  var hour: Double = js.native
  /**
    * The minutes of the hour from 0 to 59 (based on the interval).
    */
  var mins: Double = js.native
}

object TimeItem {
  @scala.inline
  def apply(hour: Double, mins: Double, pick: Double): TimeItem = {
    val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], mins = mins.asInstanceOf[js.Any], pick = pick.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeItem]
  }
  @scala.inline
  implicit class TimeItemOps[Self <: TimeItem] (val x: Self) extends AnyVal {
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
    def setHour(value: Double): Self = this.set("hour", value.asInstanceOf[js.Any])
    @scala.inline
    def setMins(value: Double): Self = this.set("mins", value.asInstanceOf[js.Any])
  }
  
}

