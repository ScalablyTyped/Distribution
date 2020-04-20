package typings.nanotimer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeoutResults extends js.Object {
  var waitTime: Double
}

object TimeoutResults {
  @scala.inline
  def apply(waitTime: Double): TimeoutResults = {
    val __obj = js.Dynamic.literal(waitTime = waitTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeoutResults]
  }
}

