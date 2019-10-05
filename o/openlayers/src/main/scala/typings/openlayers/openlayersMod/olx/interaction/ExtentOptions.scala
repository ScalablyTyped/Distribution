package typings.openlayers.openlayersMod.olx.interaction

import typings.openlayers.openlayersMod.Extent
import typings.openlayers.openlayersMod.StyleFunction
import typings.openlayers.openlayersMod.style.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtentOptions extends js.Object {
  var boxStyle: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.undefined
  var extent: js.UndefOr[Extent] = js.undefined
  var pixelTolerance: js.UndefOr[Double] = js.undefined
  var pointerStyle: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.undefined
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object ExtentOptions {
  @scala.inline
  def apply(
    boxStyle: Style | js.Array[Style] | StyleFunction = null,
    extent: Extent = null,
    pixelTolerance: Int | Double = null,
    pointerStyle: Style | js.Array[Style] | StyleFunction = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
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

