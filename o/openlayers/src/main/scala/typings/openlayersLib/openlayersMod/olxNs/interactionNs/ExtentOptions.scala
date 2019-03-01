package typings
package openlayersLib.openlayersMod.olxNs.interactionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtentOptions extends js.Object {
  var boxStyle: js.UndefOr[
    openlayersLib.openlayersMod.styleNs.Style | js.Array[openlayersLib.openlayersMod.styleNs.Style] | openlayersLib.openlayersMod.StyleFunction
  ] = js.undefined
  var extent: js.UndefOr[openlayersLib.openlayersMod.Extent] = js.undefined
  var pixelTolerance: js.UndefOr[scala.Double] = js.undefined
  var pointerStyle: js.UndefOr[
    openlayersLib.openlayersMod.styleNs.Style | js.Array[openlayersLib.openlayersMod.styleNs.Style] | openlayersLib.openlayersMod.StyleFunction
  ] = js.undefined
  var wrapX: js.UndefOr[scala.Boolean] = js.undefined
}

object ExtentOptions {
  @scala.inline
  def apply(
    boxStyle: openlayersLib.openlayersMod.styleNs.Style | js.Array[openlayersLib.openlayersMod.styleNs.Style] | openlayersLib.openlayersMod.StyleFunction = null,
    extent: openlayersLib.openlayersMod.Extent = null,
    pixelTolerance: scala.Int | scala.Double = null,
    pointerStyle: openlayersLib.openlayersMod.styleNs.Style | js.Array[openlayersLib.openlayersMod.styleNs.Style] | openlayersLib.openlayersMod.StyleFunction = null,
    wrapX: js.UndefOr[scala.Boolean] = js.undefined
  ): ExtentOptions = {
    val __obj = js.Dynamic.literal()
    if (boxStyle != null) __obj.updateDynamic("boxStyle")(boxStyle.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent)
    if (pixelTolerance != null) __obj.updateDynamic("pixelTolerance")(pixelTolerance.asInstanceOf[js.Any])
    if (pointerStyle != null) __obj.updateDynamic("pointerStyle")(pointerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX)
    __obj.asInstanceOf[ExtentOptions]
  }
}

