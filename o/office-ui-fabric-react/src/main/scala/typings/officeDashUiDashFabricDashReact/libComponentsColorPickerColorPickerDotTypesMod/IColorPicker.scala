package typings.officeDashUiDashFabricDashReact.libComponentsColorPickerColorPickerDotTypesMod

import typings.officeDashUiDashFabricDashReact.libUtilitiesColorInterfacesMod.IColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorPicker extends js.Object {
  /** The currently selected color. */
  var color: IColor
}

object IColorPicker {
  @scala.inline
  def apply(color: IColor): IColorPicker = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IColorPicker]
  }
}

