package typings.pdfmake.interfacesMod

import typings.pdfkit.PDFKit.Mixins.OpenTypeFeatures
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Style extends js.Object {
  
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
  implicit class StyleOps[Self <: Style] (val x: Self) extends AnyVal {
    
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
    def setAlignment(value: Alignment): Self = this.set("alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    
    @scala.inline
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBold(value: Boolean): Self = this.set("bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBold: Self = this.set("bold", js.undefined)
    
    @scala.inline
    def setCharacterSpacing(value: Double): Self = this.set("characterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharacterSpacing: Self = this.set("characterSpacing", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setColumnGap(value: Size): Self = this.set("columnGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnGap: Self = this.set("columnGap", js.undefined)
    
    @scala.inline
    def setDecoration(value: Decoration): Self = this.set("decoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecoration: Self = this.set("decoration", js.undefined)
    
    @scala.inline
    def setDecorationColor(value: String): Self = this.set("decorationColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecorationColor: Self = this.set("decorationColor", js.undefined)
    
    @scala.inline
    def setDecorationStyle(value: DecorationStyle): Self = this.set("decorationStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecorationStyle: Self = this.set("decorationStyle", js.undefined)
    
    @scala.inline
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    
    @scala.inline
    def setFillOpacity(value: Double): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setFontFeaturesVarargs(value: OpenTypeFeatures*): Self = this.set("fontFeatures", js.Array(value :_*))
    
    @scala.inline
    def setFontFeatures(value: js.Array[OpenTypeFeatures]): Self = this.set("fontFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFeatures: Self = this.set("fontFeatures", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setItalics(value: Boolean): Self = this.set("italics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItalics: Self = this.set("italics", js.undefined)
    
    @scala.inline
    def setLeadingIndent(value: Double): Self = this.set("leadingIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeadingIndent: Self = this.set("leadingIndent", js.undefined)
    
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    
    @scala.inline
    def setMargin(value: Margins): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setMarkerColor(value: String): Self = this.set("markerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerColor: Self = this.set("markerColor", js.undefined)
    
    @scala.inline
    def setNoWrap(value: Boolean): Self = this.set("noWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoWrap: Self = this.set("noWrap", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPreserveLeadingSpaces(value: Boolean): Self = this.set("preserveLeadingSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveLeadingSpaces: Self = this.set("preserveLeadingSpaces", js.undefined)
  }
}
