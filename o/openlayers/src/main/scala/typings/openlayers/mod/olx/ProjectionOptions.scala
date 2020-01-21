package typings.openlayers.mod.olx

import typings.openlayers.mod.Coordinate_
import typings.openlayers.mod.Extent_
import typings.openlayers.mod.proj.Units
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object literal with config options for the projection.
  */
trait ProjectionOptions extends js.Object {
  var axisOrientation: js.UndefOr[String] = js.undefined
  var code: String
  var extent: js.UndefOr[Extent_] = js.undefined
  var getPointResolution: js.UndefOr[js.Function2[/* resolution */ Double, /* coords */ Coordinate_, Double]] = js.undefined
  var global: js.UndefOr[Boolean] = js.undefined
  var metersPerUnit: js.UndefOr[Double] = js.undefined
  var units: js.UndefOr[Units | String] = js.undefined
  var worldExtent: js.UndefOr[Extent_] = js.undefined
}

object ProjectionOptions {
  @scala.inline
  def apply(
    code: String,
    axisOrientation: String = null,
    extent: Extent_ = null,
    getPointResolution: (/* resolution */ Double, /* coords */ Coordinate_) => Double = null,
    global: js.UndefOr[Boolean] = js.undefined,
    metersPerUnit: Int | Double = null,
    units: Units | String = null,
    worldExtent: Extent_ = null
  ): ProjectionOptions = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    if (axisOrientation != null) __obj.updateDynamic("axisOrientation")(axisOrientation.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (getPointResolution != null) __obj.updateDynamic("getPointResolution")(js.Any.fromFunction2(getPointResolution))
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    if (metersPerUnit != null) __obj.updateDynamic("metersPerUnit")(metersPerUnit.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    if (worldExtent != null) __obj.updateDynamic("worldExtent")(worldExtent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectionOptions]
  }
}

