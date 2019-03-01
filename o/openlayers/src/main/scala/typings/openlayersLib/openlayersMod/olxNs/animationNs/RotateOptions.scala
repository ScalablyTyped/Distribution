package typings
package openlayersLib.openlayersMod.olxNs.animationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotateOptions extends js.Object {
  var anchor: js.UndefOr[openlayersLib.openlayersMod.Coordinate] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[js.Function1[/* t */ scala.Double, scala.Double]] = js.undefined
  var rotation: js.UndefOr[scala.Double] = js.undefined
  var start: js.UndefOr[scala.Double] = js.undefined
}

object RotateOptions {
  @scala.inline
  def apply(
    anchor: openlayersLib.openlayersMod.Coordinate = null,
    duration: scala.Int | scala.Double = null,
    easing: js.Function1[/* t */ scala.Double, scala.Double] = null,
    rotation: scala.Int | scala.Double = null,
    start: scala.Int | scala.Double = null
  ): RotateOptions = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotateOptions]
  }
}

