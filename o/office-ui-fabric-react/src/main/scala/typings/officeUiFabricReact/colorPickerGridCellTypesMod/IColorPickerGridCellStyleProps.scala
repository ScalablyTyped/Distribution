package typings.officeUiFabricReact.colorPickerGridCellTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IColorPickerGridCellStyleProps extends js.Object {
  
  /**
    * The width of the border indicating a hovered or selected cell, in pixels.
    */
  var borderWidth: js.UndefOr[Double] = js.native
  
  /**
    * Whether the svg color element should be rendered as a circle or not.
    */
  var circle: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the component is disabled or not.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The height of this cell, in pixels.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * Whether the color being rendered is white or not. If it is white we show a border around it.
    */
  var isWhite: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the cell is currently selected or not.
    */
  var selected: js.UndefOr[Boolean] = js.native
  
  /**
    * Theme to apply to the cell.
    */
  var theme: ITheme = js.native
  
  /**
    * The width of this cell, in pixels.
    */
  var width: js.UndefOr[Double] = js.native
}
object IColorPickerGridCellStyleProps {
  
  @scala.inline
  def apply(theme: ITheme): IColorPickerGridCellStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorPickerGridCellStyleProps]
  }
  
  @scala.inline
  implicit class IColorPickerGridCellStylePropsOps[Self <: IColorPickerGridCellStyleProps] (val x: Self) extends AnyVal {
    
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
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    
    @scala.inline
    def setCircle(value: Boolean): Self = this.set("circle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCircle: Self = this.set("circle", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIsWhite(value: Boolean): Self = this.set("isWhite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsWhite: Self = this.set("isWhite", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
