package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellFormat extends js.Object {
  
  /** The background color of the cell. */
  var backgroundColor: js.UndefOr[Color] = js.native
  
  /** The background color of the cell. If background_color is also set, this field takes precedence. */
  var backgroundColorStyle: js.UndefOr[ColorStyle] = js.native
  
  /** The borders of the cell. */
  var borders: js.UndefOr[Borders] = js.native
  
  /** The horizontal alignment of the value in the cell. */
  var horizontalAlignment: js.UndefOr[String] = js.native
  
  /** How a hyperlink, if it exists, should be displayed in the cell. */
  var hyperlinkDisplayType: js.UndefOr[String] = js.native
  
  /** A format describing how number values should be represented to the user. */
  var numberFormat: js.UndefOr[NumberFormat] = js.native
  
  /** The padding of the cell. */
  var padding: js.UndefOr[Padding] = js.native
  
  /** The direction of the text in the cell. */
  var textDirection: js.UndefOr[String] = js.native
  
  /** The format of the text in the cell (unless overridden by a format run). */
  var textFormat: js.UndefOr[TextFormat] = js.native
  
  /** The rotation applied to text in a cell */
  var textRotation: js.UndefOr[TextRotation] = js.native
  
  /** The vertical alignment of the value in the cell. */
  var verticalAlignment: js.UndefOr[String] = js.native
  
  /** The wrap strategy for the value in the cell. */
  var wrapStrategy: js.UndefOr[String] = js.native
}
object CellFormat {
  
  @scala.inline
  def apply(): CellFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellFormat]
  }
  
  @scala.inline
  implicit class CellFormatOps[Self <: CellFormat] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: Color): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundColorStyle(value: ColorStyle): Self = this.set("backgroundColorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColorStyle: Self = this.set("backgroundColorStyle", js.undefined)
    
    @scala.inline
    def setBorders(value: Borders): Self = this.set("borders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorders: Self = this.set("borders", js.undefined)
    
    @scala.inline
    def setHorizontalAlignment(value: String): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
    
    @scala.inline
    def setHyperlinkDisplayType(value: String): Self = this.set("hyperlinkDisplayType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHyperlinkDisplayType: Self = this.set("hyperlinkDisplayType", js.undefined)
    
    @scala.inline
    def setNumberFormat(value: NumberFormat): Self = this.set("numberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberFormat: Self = this.set("numberFormat", js.undefined)
    
    @scala.inline
    def setPadding(value: Padding): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setTextDirection(value: String): Self = this.set("textDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDirection: Self = this.set("textDirection", js.undefined)
    
    @scala.inline
    def setTextFormat(value: TextFormat): Self = this.set("textFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextFormat: Self = this.set("textFormat", js.undefined)
    
    @scala.inline
    def setTextRotation(value: TextRotation): Self = this.set("textRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextRotation: Self = this.set("textRotation", js.undefined)
    
    @scala.inline
    def setVerticalAlignment(value: String): Self = this.set("verticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalAlignment: Self = this.set("verticalAlignment", js.undefined)
    
    @scala.inline
    def setWrapStrategy(value: String): Self = this.set("wrapStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapStrategy: Self = this.set("wrapStrategy", js.undefined)
  }
}
