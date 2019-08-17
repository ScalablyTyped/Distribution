package typings.officeDashUiDashFabricDashReact.libComponentsColorPickerColorSliderColorSliderDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
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
  def apply(root: IStyle = null, sliderOverlay: IStyle = null, sliderThumb: IStyle = null): IColorSliderStyles = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (sliderOverlay != null) __obj.updateDynamic("sliderOverlay")(sliderOverlay.asInstanceOf[js.Any])
    if (sliderThumb != null) __obj.updateDynamic("sliderThumb")(sliderThumb.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorSliderStyles]
  }
}

