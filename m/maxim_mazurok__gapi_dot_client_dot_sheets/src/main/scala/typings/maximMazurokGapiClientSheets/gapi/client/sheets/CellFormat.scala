package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellFormat extends StObject {
  
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
  implicit class CellFormatMutableBuilder[Self <: CellFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorStyle(value: ColorStyle): Self = StObject.set(x, "backgroundColorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorStyleUndefined: Self = StObject.set(x, "backgroundColorStyle", js.undefined)
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBorders(value: Borders): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBordersUndefined: Self = StObject.set(x, "borders", js.undefined)
    
    @scala.inline
    def setHorizontalAlignment(value: String): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    @scala.inline
    def setHyperlinkDisplayType(value: String): Self = StObject.set(x, "hyperlinkDisplayType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperlinkDisplayTypeUndefined: Self = StObject.set(x, "hyperlinkDisplayType", js.undefined)
    
    @scala.inline
    def setNumberFormat(value: NumberFormat): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    @scala.inline
    def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setTextDirection(value: String): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDirectionUndefined: Self = StObject.set(x, "textDirection", js.undefined)
    
    @scala.inline
    def setTextFormat(value: TextFormat): Self = StObject.set(x, "textFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextFormatUndefined: Self = StObject.set(x, "textFormat", js.undefined)
    
    @scala.inline
    def setTextRotation(value: TextRotation): Self = StObject.set(x, "textRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextRotationUndefined: Self = StObject.set(x, "textRotation", js.undefined)
    
    @scala.inline
    def setVerticalAlignment(value: String): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
    
    @scala.inline
    def setWrapStrategy(value: String): Self = StObject.set(x, "wrapStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapStrategyUndefined: Self = StObject.set(x, "wrapStrategy", js.undefined)
  }
}
