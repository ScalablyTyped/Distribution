package typings.officeUiFabricReact.colorPickerBaseMod

import typings.officeUiFabricReact.anon.Component
import typings.officeUiFabricReact.interfacesMod.IColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IColorPickerState extends js.Object {
  
  /** Most recently selected color */
  var color: IColor = js.native
  
  /** Color component currently being edited via a text field (if intermediate value is invalid) */
  var editingColor: js.UndefOr[Component] = js.native
}
object IColorPickerState {
  
  @scala.inline
  def apply(color: IColor): IColorPickerState = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorPickerState]
  }
  
  @scala.inline
  implicit class IColorPickerStateOps[Self <: IColorPickerState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColor(value: IColor): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditingColor(value: Component): Self = this.set("editingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditingColor: Self = this.set("editingColor", js.undefined)
  }
}
