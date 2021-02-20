package typings.pdfmake.interfacesMod

import typings.pdfkit.PDFKit.Mixins.OpenTypeFeatures
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Style extends StObject {
  
  /** the alignment of the text */
  var alignment: js.UndefOr[Alignment] = js.native
  
  /** the background color of the text */
  var background: js.UndefOr[String] = js.native
  
  /** whether to use bold text (default: false) */
  var bold: js.UndefOr[Boolean] = js.native
  
  var characterSpacing: js.UndefOr[Double] = js.native
  
  /** the color of the text (color name e.g., ‘blue’ or hexadecimal color e.g., ‘#ff5500’) */
  var color: js.UndefOr[String] = js.native
  
  /** optional space between columns */
  var columnGap: js.UndefOr[Size] = js.native
  
  /** the text decoration to applu (‘underline’ or ‘lineThrough’ or ‘overline’) */
  var decoration: js.UndefOr[Decoration] = js.native
  
  /** the color of the text decoration, see color */
  var decorationColor: js.UndefOr[String] = js.native
  
  /** (‘dashed’ or ‘dotted’ or ‘double’ or ‘wavy’) */
  var decorationStyle: js.UndefOr[DecorationStyle] = js.native
  
  /** the background color of a table cell */
  var fillColor: js.UndefOr[String] = js.native
  
  /** the background opacity of a table cell */
  var fillOpacity: js.UndefOr[Double] = js.native
  
  /** name of the font */
  var font: js.UndefOr[String] = js.native
  
  var fontFeatures: js.UndefOr[js.Array[OpenTypeFeatures]] = js.native
  
  /** size of the font in pt */
  var fontSize: js.UndefOr[Double] = js.native
  
  /** whether to use italic text (default: false) */
  var italics: js.UndefOr[Boolean] = js.native
  
  var leadingIndent: js.UndefOr[Double] = js.native
  
  /** the line height (default: 1) */
  var lineHeight: js.UndefOr[Double] = js.native
  
  var margin: js.UndefOr[Margins] = js.native
  
  /** the color of the bullets in a buletted list */
  var markerColor: js.UndefOr[String] = js.native
  
  // Table-cell properties:
  var noWrap: js.UndefOr[Boolean] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var preserveLeadingSpaces: js.UndefOr[Boolean] = js.native
}
object Style {
  
  @scala.inline
  def apply(): Style = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Style]
  }
  
  @scala.inline
  implicit class StyleMutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    @scala.inline
    def setCharacterSpacing(value: Double): Self = StObject.set(x, "characterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacterSpacingUndefined: Self = StObject.set(x, "characterSpacing", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColumnGap(value: Size): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
    
    @scala.inline
    def setDecoration(value: Decoration): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecorationColor(value: String): Self = StObject.set(x, "decorationColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecorationColorUndefined: Self = StObject.set(x, "decorationColor", js.undefined)
    
    @scala.inline
    def setDecorationStyle(value: DecorationStyle): Self = StObject.set(x, "decorationStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecorationStyleUndefined: Self = StObject.set(x, "decorationStyle", js.undefined)
    
    @scala.inline
    def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
    
    @scala.inline
    def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    @scala.inline
    def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFeatures(value: js.Array[OpenTypeFeatures]): Self = StObject.set(x, "fontFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFeaturesUndefined: Self = StObject.set(x, "fontFeatures", js.undefined)
    
    @scala.inline
    def setFontFeaturesVarargs(value: OpenTypeFeatures*): Self = StObject.set(x, "fontFeatures", js.Array(value :_*))
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
    
    @scala.inline
    def setLeadingIndent(value: Double): Self = StObject.set(x, "leadingIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeadingIndentUndefined: Self = StObject.set(x, "leadingIndent", js.undefined)
    
    @scala.inline
    def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    @scala.inline
    def setMargin(value: Margins): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setMarkerColor(value: String): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
    
    @scala.inline
    def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setPreserveLeadingSpaces(value: Boolean): Self = StObject.set(x, "preserveLeadingSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveLeadingSpacesUndefined: Self = StObject.set(x, "preserveLeadingSpaces", js.undefined)
  }
}
