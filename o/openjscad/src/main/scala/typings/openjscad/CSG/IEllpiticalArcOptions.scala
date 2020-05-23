package typings.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEllpiticalArcOptions extends IRadiusOptions {
  var clockwise: js.UndefOr[Boolean] = js.undefined
  var large: js.UndefOr[Boolean] = js.undefined
  var xaxisrotation: js.UndefOr[Double] = js.undefined
  var xradius: js.UndefOr[Double] = js.undefined
  var yradius: js.UndefOr[Double] = js.undefined
}

object IEllpiticalArcOptions {
  @scala.inline
  def apply(
    clockwise: js.UndefOr[Boolean] = js.undefined,
    large: js.UndefOr[Boolean] = js.undefined,
    radius: js.UndefOr[Double] = js.undefined,
    resolution: js.UndefOr[Double] = js.undefined,
    xaxisrotation: js.UndefOr[Double] = js.undefined,
    xradius: js.UndefOr[Double] = js.undefined,
    yradius: js.UndefOr[Double] = js.undefined
  ): IEllpiticalArcOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clockwise)) __obj.updateDynamic("clockwise")(clockwise.get.asInstanceOf[js.Any])
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resolution)) __obj.updateDynamic("resolution")(resolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xaxisrotation)) __obj.updateDynamic("xaxisrotation")(xaxisrotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xradius)) __obj.updateDynamic("xradius")(xradius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yradius)) __obj.updateDynamic("yradius")(yradius.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEllpiticalArcOptions]
  }
}

