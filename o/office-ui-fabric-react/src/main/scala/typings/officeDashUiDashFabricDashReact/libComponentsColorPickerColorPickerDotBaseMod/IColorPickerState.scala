package typings.officeDashUiDashFabricDashReact.libComponentsColorPickerColorPickerDotBaseMod

import typings.officeDashUiDashFabricDashReact.Anon_Component
import typings.officeDashUiDashFabricDashReact.libUtilitiesColorInterfacesMod.IColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorPickerState extends js.Object {
  var color: IColor
  var editingColor: js.UndefOr[Anon_Component] = js.undefined
}

object IColorPickerState {
  @scala.inline
  def apply(color: IColor, editingColor: Anon_Component = null): IColorPickerState = {
    val __obj = js.Dynamic.literal(color = color)
    if (editingColor != null) __obj.updateDynamic("editingColor")(editingColor)
    __obj.asInstanceOf[IColorPickerState]
  }
}

