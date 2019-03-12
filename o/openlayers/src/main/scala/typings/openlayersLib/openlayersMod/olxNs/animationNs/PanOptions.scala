package typings
package openlayersLib.openlayersMod.olxNs.animationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanOptions extends js.Object {
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[js.Function1[/* t */ scala.Double, scala.Double]] = js.undefined
  var source: openlayersLib.openlayersMod.Coordinate
  var start: js.UndefOr[scala.Double] = js.undefined
}

object PanOptions {
  @scala.inline
  def apply(
    source: openlayersLib.openlayersMod.Coordinate,
    duration: scala.Int | scala.Double = null,
    easing: /* t */ scala.Double => scala.Double = null,
    start: scala.Int | scala.Double = null
  ): PanOptions = {
    val __obj = js.Dynamic.literal(source = source)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1(easing))
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanOptions]
  }
}

