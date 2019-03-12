package typings
package openlayersLib.openlayersMod.olxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object literal with config options for the projection.
  */
trait ProjectionOptions extends js.Object {
  var axisOrientation: js.UndefOr[java.lang.String] = js.undefined
  var code: java.lang.String
  var extent: js.UndefOr[openlayersLib.openlayersMod.Extent] = js.undefined
  var getPointResolution: js.UndefOr[
    js.Function2[
      /* resolution */ scala.Double, 
      /* coords */ openlayersLib.openlayersMod.Coordinate, 
      scala.Double
    ]
  ] = js.undefined
  var global: js.UndefOr[scala.Boolean] = js.undefined
  var metersPerUnit: js.UndefOr[scala.Double] = js.undefined
  var units: js.UndefOr[openlayersLib.openlayersMod.projNs.Units | java.lang.String] = js.undefined
  var worldExtent: js.UndefOr[openlayersLib.openlayersMod.Extent] = js.undefined
}

object ProjectionOptions {
  @scala.inline
  def apply(
    code: java.lang.String,
    axisOrientation: java.lang.String = null,
    extent: openlayersLib.openlayersMod.Extent = null,
    getPointResolution: (/* resolution */ scala.Double, /* coords */ openlayersLib.openlayersMod.Coordinate) => scala.Double = null,
    global: js.UndefOr[scala.Boolean] = js.undefined,
    metersPerUnit: scala.Int | scala.Double = null,
    units: openlayersLib.openlayersMod.projNs.Units | java.lang.String = null,
    worldExtent: openlayersLib.openlayersMod.Extent = null
  ): ProjectionOptions = {
    val __obj = js.Dynamic.literal(code = code)
    if (axisOrientation != null) __obj.updateDynamic("axisOrientation")(axisOrientation)
    if (extent != null) __obj.updateDynamic("extent")(extent)
    if (getPointResolution != null) __obj.updateDynamic("getPointResolution")(js.Any.fromFunction2(getPointResolution))
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    if (metersPerUnit != null) __obj.updateDynamic("metersPerUnit")(metersPerUnit.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    if (worldExtent != null) __obj.updateDynamic("worldExtent")(worldExtent)
    __obj.asInstanceOf[ProjectionOptions]
  }
}

