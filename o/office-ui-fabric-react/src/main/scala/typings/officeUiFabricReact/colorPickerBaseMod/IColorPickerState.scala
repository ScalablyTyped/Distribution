package typings.officeUiFabricReact.colorPickerBaseMod

import typings.officeUiFabricReact.AnonComponent
import typings.officeUiFabricReact.interfacesMod.IColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorPickerState extends js.Object {
  /** Most recently selected color */
  var color: IColor
  /** Color component currently being edited via a text field (if intermediate value is invalid) */
  var editingColor: js.UndefOr[AnonComponent] = js.undefined
}

object IColorPickerState {
  @scala.inline
  def apply(color: IColor, editingColor: AnonComponent = null): IColorPickerState = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    if (editingColor != null) __obj.updateDynamic("editingColor")(editingColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorPickerState]
  }
}

