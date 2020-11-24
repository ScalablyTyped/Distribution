package typings.officeUiFabricReact.colorPickerGridCellTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IColorPickerGridCellStyles extends js.Object {
  
  /**
    * Style to apply to a colorCell in the color picker.
    */
  var colorCell: IStyle = js.native
  
  /**
    * Style to apply to the svg element that renders the color.
    */
  var svg: IStyle = js.native
}
object IColorPickerGridCellStyles {
  
  @scala.inline
  def apply(): IColorPickerGridCellStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColorPickerGridCellStyles]
  }
  
  @scala.inline
  implicit class IColorPickerGridCellStylesOps[Self <: IColorPickerGridCellStyles] (val x: Self) extends AnyVal {
    
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
    def setColorCell(value: IStyle): Self = this.set("colorCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorCell: Self = this.set("colorCell", js.undefined)
    
    @scala.inline
    def setColorCellNull: Self = this.set("colorCell", null)
    
    @scala.inline
    def setSvg(value: IStyle): Self = this.set("svg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSvg: Self = this.set("svg", js.undefined)
    
    @scala.inline
    def setSvgNull: Self = this.set("svg", null)
  }
}
