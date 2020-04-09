package typings.pdfmake.interfacesMod

import typings.pdfkit.PDFKit.Mixins.OpenTypeFeatures
import typings.pdfmake.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentOrderedList
  extends ContentBase
     with _Content {
  var ol: js.Array[OrderedListElement]
  var reversed: js.UndefOr[Boolean] = js.undefined
  var separator: js.UndefOr[String | (js.Tuple2[String, String])] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[OrderedListType] = js.undefined
}

object ContentOrderedList {
  @scala.inline
  def apply(
    ol: js.Array[OrderedListElement],
    absolutePosition: AnonX = null,
    alignment: Alignment = null,
    background: String = null,
    bold: js.UndefOr[Boolean] = js.undefined,
    characterSpacing: Int | Double = null,
    color: String = null,
    columnGap: Size = null,
    decoration: Decoration = null,
    decorationColor: String = null,
    decorationStyle: DecorationStyle = null,
    fillColor: String = null,
    fillOpacity: Int | Double = null,
    font: String = null,
    fontFeatures: js.Array[OpenTypeFeatures] = null,
    fontSize: Int | Double = null,
    headlineLevel: Int | Double = null,
    italics: js.UndefOr[Boolean] = js.undefined,
    leadingIndent: Int | Double = null,
    lineHeight: Int | Double = null,
    margin: Margins = null,
    markerColor: String = null,
    noWrap: js.UndefOr[Boolean] = js.undefined,
    opacity: Int | Double = null,
    pageBreak: PageBreak = null,
    pageOrientation: PageOrientation = null,
    preserveLeadingSpaces: js.UndefOr[Boolean] = js.undefined,
    relativePosition: AnonX = null,
    reversed: js.UndefOr[Boolean] = js.undefined,
    separator: String | (js.Tuple2[String, String]) = null,
    start: Int | Double = null,
    style: String | js.Array[String] | Style = null,
    `type`: OrderedListType = null
  ): ContentOrderedList = {
    val __obj = js.Dynamic.literal(ol = ol.asInstanceOf[js.Any])
    if (absolutePosition != null) __obj.updateDynamic("absolutePosition")(absolutePosition.asInstanceOf[js.Any])
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (characterSpacing != null) __obj.updateDynamic("characterSpacing")(characterSpacing.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (columnGap != null) __obj.updateDynamic("columnGap")(columnGap.asInstanceOf[js.Any])
    if (decoration != null) __obj.updateDynamic("decoration")(decoration.asInstanceOf[js.Any])
    if (decorationColor != null) __obj.updateDynamic("decorationColor")(decorationColor.asInstanceOf[js.Any])
    if (decorationStyle != null) __obj.updateDynamic("decorationStyle")(decorationStyle.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontFeatures != null) __obj.updateDynamic("fontFeatures")(fontFeatures.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (headlineLevel != null) __obj.updateDynamic("headlineLevel")(headlineLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(italics)) __obj.updateDynamic("italics")(italics.asInstanceOf[js.Any])
    if (leadingIndent != null) __obj.updateDynamic("leadingIndent")(leadingIndent.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (markerColor != null) __obj.updateDynamic("markerColor")(markerColor.asInstanceOf[js.Any])
    if (!js.isUndefined(noWrap)) __obj.updateDynamic("noWrap")(noWrap.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pageBreak != null) __obj.updateDynamic("pageBreak")(pageBreak.asInstanceOf[js.Any])
    if (pageOrientation != null) __obj.updateDynamic("pageOrientation")(pageOrientation.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveLeadingSpaces)) __obj.updateDynamic("preserveLeadingSpaces")(preserveLeadingSpaces.asInstanceOf[js.Any])
    if (relativePosition != null) __obj.updateDynamic("relativePosition")(relativePosition.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentOrderedList]
  }
}

