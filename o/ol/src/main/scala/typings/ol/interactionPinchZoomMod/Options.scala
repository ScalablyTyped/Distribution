package typings.ol.interactionPinchZoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(duration: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

