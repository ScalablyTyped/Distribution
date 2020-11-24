package typings.officeUiFabricReact.colorPickerTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IColorPickerStyles extends js.Object {
  
  /**
    * Style set for the panel element that contains the color rectangle
    */
  var colorRectangle: js.UndefOr[IStyle] = js.native
  
  /**
    * Color Square
    */
  var colorSquare: js.UndefOr[IStyle] = js.native
  
  /**
    * flexContainer
    */
  var flexContainer: js.UndefOr[IStyle] = js.native
  
  /**
    * flexPreviewBox
    */
  var flexPreviewBox: js.UndefOr[IStyle] = js.native
  
  /**
    * flexSlider
    */
  var flexSlider: js.UndefOr[IStyle] = js.native
  
  /**
    * Style set for each text field input.
    */
  var input: js.UndefOr[IStyle] = js.native
  
  /**
    * Style set for the panel element that contains the color rectangle, color sliders and inputs .
    */
  var panel: js.UndefOr[IStyle] = js.native
  
  /**
    * Style set for the root element.
    */
  var root: js.UndefOr[IStyle] = js.native
  
  /**
    * Style set for the table element that contains the color sliders and inputs.
    */
  var table: js.UndefOr[IStyle] = js.native
  
  /**
    * Style set for the table cell that contains the alpha or transparency label.
    */
  var tableAlphaCell: js.UndefOr[IStyle] = js.native
  
  /**
    * Style set for the table header that contains the labels.
    */
  var tableHeader: js.UndefOr[IStyle] = js.native
  
  /**
    * Style set for the table cell that contains the hex label.
    */
  var tableHexCell: js.UndefOr[IStyle] = js.native
}
object IColorPickerStyles {
  
  @scala.inline
  def apply(): IColorPickerStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColorPickerStyles]
  }
  
  @scala.inline
  implicit class IColorPickerStylesOps[Self <: IColorPickerStyles] (val x: Self) extends AnyVal {
    
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
    def setColorRectangle(value: IStyle): Self = this.set("colorRectangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorRectangle: Self = this.set("colorRectangle", js.undefined)
    
    @scala.inline
    def setColorRectangleNull: Self = this.set("colorRectangle", null)
    
    @scala.inline
    def setColorSquare(value: IStyle): Self = this.set("colorSquare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorSquare: Self = this.set("colorSquare", js.undefined)
    
    @scala.inline
    def setColorSquareNull: Self = this.set("colorSquare", null)
    
    @scala.inline
    def setFlexContainer(value: IStyle): Self = this.set("flexContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexContainer: Self = this.set("flexContainer", js.undefined)
    
    @scala.inline
    def setFlexContainerNull: Self = this.set("flexContainer", null)
    
    @scala.inline
    def setFlexPreviewBox(value: IStyle): Self = this.set("flexPreviewBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexPreviewBox: Self = this.set("flexPreviewBox", js.undefined)
    
    @scala.inline
    def setFlexPreviewBoxNull: Self = this.set("flexPreviewBox", null)
    
    @scala.inline
    def setFlexSlider(value: IStyle): Self = this.set("flexSlider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexSlider: Self = this.set("flexSlider", js.undefined)
    
    @scala.inline
    def setFlexSliderNull: Self = this.set("flexSlider", null)
    
    @scala.inline
    def setInput(value: IStyle): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setInputNull: Self = this.set("input", null)
    
    @scala.inline
    def setPanel(value: IStyle): Self = this.set("panel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanel: Self = this.set("panel", js.undefined)
    
    @scala.inline
    def setPanelNull: Self = this.set("panel", null)
    
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    
    @scala.inline
    def setTable(value: IStyle): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    
    @scala.inline
    def setTableNull: Self = this.set("table", null)
    
    @scala.inline
    def setTableAlphaCell(value: IStyle): Self = this.set("tableAlphaCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableAlphaCell: Self = this.set("tableAlphaCell", js.undefined)
    
    @scala.inline
    def setTableAlphaCellNull: Self = this.set("tableAlphaCell", null)
    
    @scala.inline
    def setTableHeader(value: IStyle): Self = this.set("tableHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableHeader: Self = this.set("tableHeader", js.undefined)
    
    @scala.inline
    def setTableHeaderNull: Self = this.set("tableHeader", null)
    
    @scala.inline
    def setTableHexCell(value: IStyle): Self = this.set("tableHexCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableHexCell: Self = this.set("tableHexCell", js.undefined)
    
    @scala.inline
    def setTableHexCellNull: Self = this.set("tableHexCell", null)
  }
}
