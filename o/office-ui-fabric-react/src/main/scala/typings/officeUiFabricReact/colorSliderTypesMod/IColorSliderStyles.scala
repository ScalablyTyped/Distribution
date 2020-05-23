package typings.officeUiFabricReact.colorSliderTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorSliderStyles extends js.Object {
  /**
    * Style set for the root element.
    */
  var root: js.UndefOr[IStyle] = js.undefined
  /**
    * Style set for the overlay element.
    */
  var sliderOverlay: js.UndefOr[IStyle] = js.undefined
  /**
    * Style set for the draggable thumb element.
    */
  var sliderThumb: js.UndefOr[IStyle] = js.undefined
}

object IColorSliderStyles {
  @scala.inline
  def apply(
    root: js.UndefOr[Null | IStyle] = js.undefined,
    sliderOverlay: js.UndefOr[Null | IStyle] = js.undefined,
    sliderThumb: js.UndefOr[Null | IStyle] = js.undefined
  ): IColorSliderStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(sliderOverlay)) __obj.updateDynamic("sliderOverlay")(sliderOverlay.asInstanceOf[js.Any])
    if (!js.isUndefined(sliderThumb)) __obj.updateDynamic("sliderThumb")(sliderThumb.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorSliderStyles]
  }
}

