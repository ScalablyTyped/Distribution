package typings.postmark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTracked extends js.Object {
  var Date: String
  var Tracked: Double
}

object AnonTracked {
  @scala.inline
  def apply(Date: String, Tracked: Double): AnonTracked = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], Tracked = Tracked.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTracked]
  }
}

