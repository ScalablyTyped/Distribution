package typings
package openlayersLib.openlayersMod.olxNs.interactionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PinchRotateOptions extends js.Object {
  var duration: js.UndefOr[scala.Double] = js.undefined
  var threshold: js.UndefOr[scala.Double] = js.undefined
}

object PinchRotateOptions {
  @scala.inline
  def apply(duration: scala.Int | scala.Double = null, threshold: scala.Int | scala.Double = null): PinchRotateOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinchRotateOptions]
  }
}

