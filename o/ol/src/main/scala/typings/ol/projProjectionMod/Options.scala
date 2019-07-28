package typings.ol.projProjectionMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.projUnitsMod.Units
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var axisOrientation: js.UndefOr[String] = js.undefined
  var code: String
  var extent: js.UndefOr[Extent] = js.undefined
  var getPointResolution: js.UndefOr[js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double]] = js.undefined
  var global: js.UndefOr[Boolean] = js.undefined
  var metersPerUnit: js.UndefOr[Double] = js.undefined
  var units: js.UndefOr[Units | String] = js.undefined
  var worldExtent: js.UndefOr[Extent] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    code: String,
    axisOrientation: String = null,
    extent: Extent = null,
    getPointResolution: (/* p0 */ Double, /* p1 */ Coordinate) => Double = null,
    global: js.UndefOr[Boolean] = js.undefined,
    metersPerUnit: Int | Double = null,
    units: Units | String = null,
    worldExtent: Extent = null
  ): Options = {
    val __obj = js.Dynamic.literal(code = code)
    if (axisOrientation != null) __obj.updateDynamic("axisOrientation")(axisOrientation)
    if (extent != null) __obj.updateDynamic("extent")(extent)
    if (getPointResolution != null) __obj.updateDynamic("getPointResolution")(js.Any.fromFunction2(getPointResolution))
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    if (metersPerUnit != null) __obj.updateDynamic("metersPerUnit")(metersPerUnit.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    if (worldExtent != null) __obj.updateDynamic("worldExtent")(worldExtent)
    __obj.asInstanceOf[Options]
  }
}

