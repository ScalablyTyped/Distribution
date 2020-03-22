package typings.officeUiFabricReact

import typings.officeUiFabricReact.interfacesMod.IColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorPicker.base.IColorPickerState> */
trait ReadonlyIColorPickerState extends js.Object {
  val color: IColor
  val editingColor: js.UndefOr[AnonComponent] = js.undefined
}

object ReadonlyIColorPickerState {
  @scala.inline
  def apply(color: IColor, editingColor: AnonComponent = null): ReadonlyIColorPickerState = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    if (editingColor != null) __obj.updateDynamic("editingColor")(editingColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIColorPickerState]
  }
}

