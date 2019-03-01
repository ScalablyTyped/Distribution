package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDailyTrigger extends js.Object {
  var DaysInterval: scala.Double
}

object IDailyTrigger {
  @scala.inline
  def apply(DaysInterval: scala.Double): IDailyTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DaysInterval")(DaysInterval)
    __obj.asInstanceOf[IDailyTrigger]
  }
}

