package typings
package pickadateLib.PickadateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeItem extends Item {
  /**
    * Hour of the day from 0 to 23.
    */
  var hour: scala.Double
  /**
    * The minutes of the hour from 0 to 59 (based on the interval).
    */
  var mins: scala.Double
}

object TimeItem {
  @scala.inline
  def apply(hour: scala.Double, mins: scala.Double, pick: scala.Double): TimeItem = {
    val __obj = js.Dynamic.literal(hour = hour, mins = mins, pick = pick)
  
    __obj.asInstanceOf[TimeItem]
  }
}

