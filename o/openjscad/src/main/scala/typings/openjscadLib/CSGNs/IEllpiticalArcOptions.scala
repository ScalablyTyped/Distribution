package typings
package openjscadLib.CSGNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEllpiticalArcOptions extends IRadiusOptions {
  var clockwise: js.UndefOr[scala.Boolean] = js.undefined
  var large: js.UndefOr[scala.Boolean] = js.undefined
  var xaxisrotation: js.UndefOr[scala.Double] = js.undefined
  var xradius: js.UndefOr[scala.Double] = js.undefined
  var yradius: js.UndefOr[scala.Double] = js.undefined
}

object IEllpiticalArcOptions {
  @scala.inline
  def apply(
    clockwise: js.UndefOr[scala.Boolean] = js.undefined,
    large: js.UndefOr[scala.Boolean] = js.undefined,
    radius: scala.Int | scala.Double = null,
    resolution: scala.Int | scala.Double = null,
    xaxisrotation: scala.Int | scala.Double = null,
    xradius: scala.Int | scala.Double = null,
    yradius: scala.Int | scala.Double = null
  ): IEllpiticalArcOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clockwise)) __obj.updateDynamic("clockwise")(clockwise)
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (xaxisrotation != null) __obj.updateDynamic("xaxisrotation")(xaxisrotation.asInstanceOf[js.Any])
    if (xradius != null) __obj.updateDynamic("xradius")(xradius.asInstanceOf[js.Any])
    if (yradius != null) __obj.updateDynamic("yradius")(yradius.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEllpiticalArcOptions]
  }
}

