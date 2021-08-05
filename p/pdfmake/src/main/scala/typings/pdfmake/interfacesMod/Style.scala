package typings.pdfmake.interfacesMod

import typings.pdfkit.PDFKit.Mixins.OpenTypeFeatures
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Style extends StObject {
  
  /** the alignment of the text */
  var alignment: js.UndefOr[Alignment] = js.undefined
  
  /** the background color of the text */
  var background: js.UndefOr[String] = js.undefined
  
  /** whether to use bold text (default: false) */
  var bold: js.UndefOr[Boolean] = js.undefined
  
  var characterSpacing: js.UndefOr[Double] = js.undefined
  
  /** the color of the text (color name e.g., ‘blue’ or hexadecimal color e.g., ‘#ff5500’) */
  var color: js.UndefOr[String] = js.undefined
  
  /** optional space between columns */
  var columnGap: js.UndefOr[Size] = js.undefined
  
  /** the text decoration to applu (‘underline’ or ‘lineThrough’ or ‘overline’) */
  var decoration: js.UndefOr[Decoration] = js.undefined
  
  /** the color of the text decoration, see color */
  var decorationColor: js.UndefOr[String] = js.undefined
  
  /** (‘dashed’ or ‘dotted’ or ‘double’ or ‘wavy’) */
  var decorationStyle: js.UndefOr[DecorationStyle] = js.undefined
  
  /** the background color of a table cell */
  var fillColor: js.UndefOr[String] = js.undefined
  
  /** the background opacity of a table cell */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  
  /** name of the font */
  var font: js.UndefOr[String] = js.undefined
  
  var fontFeatures: js.UndefOr[js.Array[OpenTypeFeatures]] = js.undefined
  
  /** size of the font in pt */
  var fontSize: js.UndefOr[Double] = js.undefined
  
  /** whether to use italic text (default: false) */
  var italics: js.UndefOr[Boolean] = js.undefined
  
  var leadingIndent: js.UndefOr[Double] = js.undefined
  
  /** the line height (default: 1) */
  var lineHeight: js.UndefOr[Double] = js.undefined
  
  var margin: js.UndefOr[Margins] = js.undefined
  
  /** the color of the bullets in a buletted list */
  var markerColor: js.UndefOr[String] = js.undefined
  
  // Table-cell properties:
  var noWrap: js.UndefOr[Boolean] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var preserveLeadingSpaces: js.UndefOr[Boolean] = js.undefined
}
object Style {
  
  inline def apply(): Style = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Style]
  }
  
  extension [Self <: Style](x: Self) {
    
    inline def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    inline def setCharacterSpacing(value: Double): Self = StObject.set(x, "characterSpacing", value.asInstanceOf[js.Any])
    
    inline def setCharacterSpacingUndefined: Self = StObject.set(x, "characterSpacing", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColumnGap(value: Size): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
    
    inline def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
    
    inline def setDecoration(value: Decoration): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
    
    inline def setDecorationColor(value: String): Self = StObject.set(x, "decorationColor", value.asInstanceOf[js.Any])
    
    inline def setDecorationColorUndefined: Self = StObject.set(x, "decorationColor", js.undefined)
    
    inline def setDecorationStyle(value: DecorationStyle): Self = StObject.set(x, "decorationStyle", value.asInstanceOf[js.Any])
    
    inline def setDecorationStyleUndefined: Self = StObject.set(x, "decorationStyle", js.undefined)
    
    inline def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
    
    inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontFeatures(value: js.Array[OpenTypeFeatures]): Self = StObject.set(x, "fontFeatures", value.asInstanceOf[js.Any])
    
    inline def setFontFeaturesUndefined: Self = StObject.set(x, "fontFeatures", js.undefined)
    
    inline def setFontFeaturesVarargs(value: OpenTypeFeatures*): Self = StObject.set(x, "fontFeatures", js.Array(value :_*))
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
    
    inline def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
    
    inline def setLeadingIndent(value: Double): Self = StObject.set(x, "leadingIndent", value.asInstanceOf[js.Any])
    
    inline def setLeadingIndentUndefined: Self = StObject.set(x, "leadingIndent", js.undefined)
    
    inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    inline def setMargin(value: Margins): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMarkerColor(value: String): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
    
    inline def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
    
    inline def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
    
    inline def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPreserveLeadingSpaces(value: Boolean): Self = StObject.set(x, "preserveLeadingSpaces", value.asInstanceOf[js.Any])
    
    inline def setPreserveLeadingSpacesUndefined: Self = StObject.set(x, "preserveLeadingSpaces", js.undefined)
  }
}
