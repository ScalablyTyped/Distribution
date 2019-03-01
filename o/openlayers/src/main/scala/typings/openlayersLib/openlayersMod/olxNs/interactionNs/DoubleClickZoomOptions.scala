package typings
package openlayersLib.openlayersMod.olxNs.interactionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoubleClickZoomOptions extends js.Object {
  var delta: js.UndefOr[scala.Double] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
}

object DoubleClickZoomOptions {
  @scala.inline
  def apply(delta: scala.Int | scala.Double = null, duration: scala.Int | scala.Double = null): DoubleClickZoomOptions = {
    val __obj = js.Dynamic.literal()
    if (delta != null) __obj.updateDynamic("delta")(delta.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoubleClickZoomOptions]
  }
}

