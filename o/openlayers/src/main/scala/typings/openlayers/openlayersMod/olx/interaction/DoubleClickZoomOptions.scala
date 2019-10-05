package typings.openlayers.openlayersMod.olx.interaction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoubleClickZoomOptions extends js.Object {
  var delta: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
}

object DoubleClickZoomOptions {
  @scala.inline
  def apply(delta: Int | Double = null, duration: Int | Double = null): DoubleClickZoomOptions = {
    val __obj = js.Dynamic.literal()
    if (delta != null) __obj.updateDynamic("delta")(delta.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoubleClickZoomOptions]
  }
}

