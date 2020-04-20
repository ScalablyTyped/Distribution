package typings.naverWhale.whale.history

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  /** Items added to history before this date, represented in milliseconds since the epoch. */
  var endTime: Double
  /** Items added to history after this date, represented in milliseconds since the epoch. */
  var startTime: Double
}

object Range {
  @scala.inline
  def apply(endTime: Double, startTime: Double): Range = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
}

