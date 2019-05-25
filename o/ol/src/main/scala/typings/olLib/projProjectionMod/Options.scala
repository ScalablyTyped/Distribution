package typings
package olLib.projProjectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var axisOrientation: js.UndefOr[java.lang.String] = js.undefined
  var code: java.lang.String
  var extent: js.UndefOr[olLib.extentMod.Extent] = js.undefined
  var getPointResolution: js.UndefOr[
    js.Function2[/* param0 */ scala.Double, /* param1 */ olLib.coordinateMod.Coordinate, scala.Double]
  ] = js.undefined
  var global: js.UndefOr[scala.Boolean] = js.undefined
  var metersPerUnit: js.UndefOr[scala.Double] = js.undefined
  var units: js.UndefOr[olLib.projUnitsMod.Units | java.lang.String] = js.undefined
  var worldExtent: js.UndefOr[olLib.extentMod.Extent] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    code: java.lang.String,
    axisOrientation: java.lang.String = null,
    extent: olLib.extentMod.Extent = null,
    getPointResolution: (/* param0 */ scala.Double, /* param1 */ olLib.coordinateMod.Coordinate) => scala.Double = null,
    global: js.UndefOr[scala.Boolean] = js.undefined,
    metersPerUnit: scala.Int | scala.Double = null,
    units: olLib.projUnitsMod.Units | java.lang.String = null,
    worldExtent: olLib.extentMod.Extent = null
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

