package typings.openlayers.mod.olx.interaction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoubleClickZoomOptions extends js.Object {
  var delta: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
}

object DoubleClickZoomOptions {
  @scala.inline
  def apply(delta: js.UndefOr[Double] = js.undefined, duration: js.UndefOr[Double] = js.undefined): DoubleClickZoomOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delta)) __obj.updateDynamic("delta")(delta.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoubleClickZoomOptions]
  }
}

