package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDailyTrigger extends js.Object {
  var DaysInterval: Double
}

object IDailyTrigger {
  @scala.inline
  def apply(DaysInterval: Double): IDailyTrigger = {
    val __obj = js.Dynamic.literal(DaysInterval = DaysInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDailyTrigger]
  }
}

