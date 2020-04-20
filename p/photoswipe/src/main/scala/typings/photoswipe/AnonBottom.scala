package typings.photoswipe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBottom extends js.Object {
  var bottom: Double | String
  var top: Double
}

object AnonBottom {
  @scala.inline
  def apply(bottom: Double | String, top: Double): AnonBottom = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBottom]
  }
}

