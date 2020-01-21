package typings.officeUiFabricReact.swatchColorPickerBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISwatchColorPickerState extends js.Object {
  var selectedIndex: js.UndefOr[Double] = js.undefined
}

object ISwatchColorPickerState {
  @scala.inline
  def apply(selectedIndex: Int | Double = null): ISwatchColorPickerState = {
    val __obj = js.Dynamic.literal()
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISwatchColorPickerState]
  }
}

