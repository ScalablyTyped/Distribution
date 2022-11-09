package typings.pdfmake.interfacesMod

import typings.pdfkit.PDFKit.Mixins.OpenTypeFeatures
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent pdfmake.pdfmake/interfaces.ContentBase */
/* Inlined parent pdfmake.pdfmake/interfaces.ForbidOtherElementProperties<'ol'> */
trait ContentOrderedList
  extends StObject
     with _Content {
  
  /**
    * Absolute position of the element from the top-left corner of the current page.
    *
    * If set, the element does not occupy any space in the normal content layout.
    *
    * In this case, the element is rendered above elements defined earlier in the
    * document content, but below elements defined later.
    */
  var absolutePosition: js.UndefOr[Position] = js.undefined
  
  /**
    * Text alignment.
    *
    * Defaults to `left`.
    */
  var alignment: js.UndefOr[Alignment] = js.undefined
  
  /**
    * Background color of the text.
    *
    * Supports well-known color names like `blue` or hexadecimal color strings like `#ccffcc`,
    * as well as a reference to a pattern.
    *
    * To set the background of table cells, use {@link fillColor} instead.
    */
  var background: js.UndefOr[String | PatternFill] = js.undefined
  
  /**
    * Controls whether the text is bold.
    *
    * Defaults to `false`.
    */
  var bold: js.UndefOr[Boolean] = js.undefined
  
  var canvas: js.UndefOr[scala.Nothing] = js.undefined
  
  /**
    * Spacing between characters in `pt`.
    *
    * Defaults to `0`.
    */
  var characterSpacing: js.UndefOr[Double] = js.undefined
  
  /**
    * Text color.
    *
    * Supports well-known color names like `blue` or hexadecimal color strings like `#ccffcc`.
    *
    * Defaults to `black`.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Space between columns in `pt`.
    *
    * Only applies to {@link ContentColumns} elements.
    *
    * Defaults to `0`.
    */
  var columnGap: js.UndefOr[Double] = js.undefined
  
  var columns: js.UndefOr[scala.Nothing] = js.undefined
  
  /**
    * Text decoration to apply.
    */
  var decoration: js.UndefOr[Decoration] = js.undefined
  
  /**
    * Color to apply to the given {@link decoration}.
    *
    * Supports well-known color names like `blue` or hexadecimal color strings like `#ccffcc`.
    *
    * Defaults to the text's {@link color}.
    */
  var decorationColor: js.UndefOr[String] = js.undefined
  
  /**
    * Style to apply to the given {@link decoration}.
    *
    * Defaults to `solid`.
    */
  var decorationStyle: js.UndefOr[DecorationStyle] = js.undefined
  
  /**
    * Background fill color for table cells.
    *
    * Supports well-known color names like `blue` or hexadecimal color strings like `#ccffcc`,
    * as well as a reference to a pattern.
    *
    * Only applies to {@link TableCell} elements.
    * For the background color of text, use {@link background} instead.
    */
  var fillColor: js.UndefOr[String | PatternFill] = js.undefined
  
  /**
    * Opacity of the given {@link fillColor}.
    * Must be between 0 (fully transparent) and 1 (fully opaque).
    *
    * Only applies to {@link TableCell} elements.
    *
    * Defaults to `1`.
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Name of the font.
    *
    * Only built-in and globally declared fonts are available, regardless of the fonts
    * installed on the system.
    *
    * Defaults to `Roboto`.
    */
  var font: js.UndefOr[String] = js.undefined
  
  /**
    * OpenType font features to apply.
    */
  var fontFeatures: js.UndefOr[js.Array[OpenTypeFeatures]] = js.undefined
  
  /**
    * Font size in `pt`.
    *
    * Defaults to `12`.
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the headline level for the current element.
    *
    * This value is not currently used by pdfmake itself.
    * It is, however, passed to the {@link TDocumentDefinitions.pageBreakBefore} callback, where you
    * can use it to automatically insert page breaks before elements with certain headline levels.
    */
  var headlineLevel: js.UndefOr[Double] = js.undefined
  
  var image: js.UndefOr[scala.Nothing] = js.undefined
  
  /**
    * Controls whether the text is italic.
    *
    * Defaults to `false`.
    */
  var italics: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indent at the beginning of a paragraph in `pt`.
    *
    * Defaults to `0`.
    */
  var leadingIndent: js.UndefOr[Double] = js.undefined
  
  /**
    * Line height as a factor of the {@link fontSize}.
    *
    * Defaults to `1`.
    */
  var lineHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Margins to apply.
    *
    * Overrides the single-side `marginXXX` properties, unless this value is inherited
    * from a style and they are set directly on the content object.
    *
    * Ignored for content within an inline text array
    * (`{ text: [{ ... }] }`).
    */
  var margin: js.UndefOr[Margins] = js.undefined
  
  /**
    * Margin in `pt` to apply below the content.
    *
    * If {@link margin} is set, this value is ignored, unless the margin was inherited
    * from a style and the value is set directly on the content object.
    */
  var marginBottom: js.UndefOr[Double] = js.undefined
  
  /**
    * Margin in `pt` to apply to the left of the content.
    *
    * If {@link margin} is set, this value is ignored, unless the margin was inherited
    * from a style and the value is set directly on the content object.
    */
  var marginLeft: js.UndefOr[Double] = js.undefined
  
  /**
    * Margin in `pt` to apply to the right of the content.
    *
    * If {@link margin} is set, this value is ignored, unless the margin was inherited
    * from a style and the value is set directly on the content object.
    */
  var marginRight: js.UndefOr[Double] = js.undefined
  
  /**
    * Margin in `pt` to apply above the content.
    *
    * If {@link margin} is set, this value is ignored, unless the margin was inherited
    * from a style and the value is set directly on the content object.
    */
  var marginTop: js.UndefOr[Double] = js.undefined
  
  /**
    * Color of list markers (i.e. bullet points or numbers).
    *
    * Supports well-known color names like `blue` or hexadecimal color strings like `#ccffcc`.
    *
    * Defaults to the text's {@link color}.
    */
  var markerColor: js.UndefOr[String] = js.undefined
  
  /**
    * Controls whether text paragraphs inside table cells should be rendered as
    * a single line.
    * If the column has a fixed width, long text lines will overflow the column;
    * otherwise, the column will grow in width.
    *
    * Only applies to {@link TableCell} elements.
    *
    * defaults to `false`.
    */
  var noWrap: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Renders the given elements as an ordered / numbered list.
    */
  var ol: js.Array[OrderedListElement]
  
  /**
    * Opacity of the content.
    * Must be between 0 (fully transparent) and 1 (fully opaque).
    *
    * Defaults to `1`.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Controls whether to insert a page break before or after the element.
    *
    * For more complex page break logic, use {@link TDocumentDefinitions.pageBreakBefore}.
    */
  var pageBreak: js.UndefOr[PageBreak] = js.undefined
  
  /**
    * Sets the page orientation.
    *
    * Only relevant when used in combination with {@link pageBreak}.
    */
  var pageOrientation: js.UndefOr[PageOrientation] = js.undefined
  
  var pageReference: js.UndefOr[scala.Nothing] = js.undefined
  
  /**
    * Controls whether to preserve spaces at the beginning of a paragraph.
    *
    * Defaults to `false`.
    */
  var preserveLeadingSpaces: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls whether to preserve spaces at the end of a paragraph.
    *
    * Defaults to `false`.
    */
  var preserveTrailingSpaces: js.UndefOr[Boolean] = js.undefined
  
  var qr: js.UndefOr[scala.Nothing] = js.undefined
  
  /**
    * Relative position of the element from the position it would normally be rendered in.
    *
    * If set, the element does not occupy any space in the normal content layout.
    *
    * In this case, the element is rendered above elements defined earlier in the
    * document content, but below elements defined later.
    */
  var relativePosition: js.UndefOr[Position] = js.undefined
  
  /**
    * Controls whether the markers should be rendered in descending order.
    *
    * Defaults to `false`.
    */
  var reversed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Separator between the list markers and the list item content.
    *
    * - A string is inserted after the marker
    * - A tuple of two strings is inserted before and after the marker
    *
    * Defaults to `.`
    */
  var separator: js.UndefOr[String | (js.Tuple2[String, String])] = js.undefined
  
  var stack: js.UndefOr[scala.Nothing] = js.undefined
  
  /**
    * Number of the first marker.
    *
    * For a non-decimal {@link type}, the number is mapped to the corresponding
    * marker string (e.g. `1` => `A` for `upper-alpha`).
    *
    * Defaults to `1`, or the number of items if {@link reversed} is set.
    */
  var start: js.UndefOr[Double] = js.undefined
  
  /**
    * Style or style reference to apply.
    */
  var style: js.UndefOr[StyleReference] = js.undefined
  
  /**
    * Controls whether the text is rendered as subscript.
    *
    * Defaults to `false`.
    */
  var sub: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls whether the text is rendered as superscript.
    *
    * Defaults to `false`.
    */
  var sup: js.UndefOr[Boolean] = js.undefined
  
  var svg: js.UndefOr[scala.Nothing] = js.undefined
  
  var table: js.UndefOr[scala.Nothing] = js.undefined
  
  var text: js.UndefOr[scala.Nothing] = js.undefined
  
  var textReference: js.UndefOr[scala.Nothing] = js.undefined
  
  var toc: js.UndefOr[scala.Nothing] = js.undefined
  
  /**
    * List marker type determining the numbering scheme, such as decimal, alphabetic, or Roman.
    *
    * Defaults to `decimal`.
    */
  var `type`: js.UndefOr[OrderedListType] = js.undefined
  
  var ul: js.UndefOr[scala.Nothing] = js.undefined
  
  /**
    * Controls whether the element should be kept together on the same page.
    *
    * Defaults to `false`.
    */
  var unbreakable: js.UndefOr[Boolean] = js.undefined
}
object ContentOrderedList {
  
  inline def apply(ol: js.Array[OrderedListElement]): ContentOrderedList = {
    val __obj = js.Dynamic.literal(ol = ol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentOrderedList]
  }
  
  extension [Self <: ContentOrderedList](x: Self) {
    
    inline def setAbsolutePosition(value: Position): Self = StObject.set(x, "absolutePosition", value.asInstanceOf[js.Any])
    
    inline def setAbsolutePositionUndefined: Self = StObject.set(x, "absolutePosition", js.undefined)
    
    inline def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setBackground(value: String | PatternFill): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    inline def setCharacterSpacing(value: Double): Self = StObject.set(x, "characterSpacing", value.asInstanceOf[js.Any])
    
    inline def setCharacterSpacingUndefined: Self = StObject.set(x, "characterSpacing", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColumnGap(value: Double): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
    
    inline def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
    
    inline def setDecoration(value: Decoration): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
    
    inline def setDecorationColor(value: String): Self = StObject.set(x, "decorationColor", value.asInstanceOf[js.Any])
    
    inline def setDecorationColorUndefined: Self = StObject.set(x, "decorationColor", js.undefined)
    
    inline def setDecorationStyle(value: DecorationStyle): Self = StObject.set(x, "decorationStyle", value.asInstanceOf[js.Any])
    
    inline def setDecorationStyleUndefined: Self = StObject.set(x, "decorationStyle", js.undefined)
    
    inline def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
    
    inline def setFillColor(value: String | PatternFill): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontFeatures(value: js.Array[OpenTypeFeatures]): Self = StObject.set(x, "fontFeatures", value.asInstanceOf[js.Any])
    
    inline def setFontFeaturesUndefined: Self = StObject.set(x, "fontFeatures", js.undefined)
    
    inline def setFontFeaturesVarargs(value: OpenTypeFeatures*): Self = StObject.set(x, "fontFeatures", js.Array(value*))
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setHeadlineLevel(value: Double): Self = StObject.set(x, "headlineLevel", value.asInstanceOf[js.Any])
    
    inline def setHeadlineLevelUndefined: Self = StObject.set(x, "headlineLevel", js.undefined)
    
    inline def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
    
    inline def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
    
    inline def setLeadingIndent(value: Double): Self = StObject.set(x, "leadingIndent", value.asInstanceOf[js.Any])
    
    inline def setLeadingIndentUndefined: Self = StObject.set(x, "leadingIndent", js.undefined)
    
    inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    inline def setMargin(value: Margins): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginBottom(value: Double): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
    
    inline def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    inline def setMarginRight(value: Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
    
    inline def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMarkerColor(value: String): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
    
    inline def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
    
    inline def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
    
    inline def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
    
    inline def setOl(value: js.Array[OrderedListElement]): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
    
    inline def setOlVarargs(value: OrderedListElement*): Self = StObject.set(x, "ol", js.Array(value*))
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPageBreak(value: PageBreak): Self = StObject.set(x, "pageBreak", value.asInstanceOf[js.Any])
    
    inline def setPageBreakUndefined: Self = StObject.set(x, "pageBreak", js.undefined)
    
    inline def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
    
    inline def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
    
    inline def setPreserveLeadingSpaces(value: Boolean): Self = StObject.set(x, "preserveLeadingSpaces", value.asInstanceOf[js.Any])
    
    inline def setPreserveLeadingSpacesUndefined: Self = StObject.set(x, "preserveLeadingSpaces", js.undefined)
    
    inline def setPreserveTrailingSpaces(value: Boolean): Self = StObject.set(x, "preserveTrailingSpaces", value.asInstanceOf[js.Any])
    
    inline def setPreserveTrailingSpacesUndefined: Self = StObject.set(x, "preserveTrailingSpaces", js.undefined)
    
    inline def setRelativePosition(value: Position): Self = StObject.set(x, "relativePosition", value.asInstanceOf[js.Any])
    
    inline def setRelativePositionUndefined: Self = StObject.set(x, "relativePosition", js.undefined)
    
    inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
    
    inline def setSeparator(value: String | (js.Tuple2[String, String])): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStyle(value: StyleReference): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyleVarargs(value: (String | Style)*): Self = StObject.set(x, "style", js.Array(value*))
    
    inline def setSub(value: Boolean): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    
    inline def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
    
    inline def setSup(value: Boolean): Self = StObject.set(x, "sup", value.asInstanceOf[js.Any])
    
    inline def setSupUndefined: Self = StObject.set(x, "sup", js.undefined)
    
    inline def setType(value: OrderedListType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnbreakable(value: Boolean): Self = StObject.set(x, "unbreakable", value.asInstanceOf[js.Any])
    
    inline def setUnbreakableUndefined: Self = StObject.set(x, "unbreakable", js.undefined)
  }
}
