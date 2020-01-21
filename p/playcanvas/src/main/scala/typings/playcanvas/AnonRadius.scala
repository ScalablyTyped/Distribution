package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRadius extends js.Object {
  var radius: js.UndefOr[Double] = js.undefined
  var segments: js.UndefOr[Double] = js.undefined
}

object AnonRadius {
  @scala.inline
  def apply(radius: Int | Double = null, segments: Int | Double = null): AnonRadius = {
    val __obj = js.Dynamic.literal()
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRadius]
  }
}

