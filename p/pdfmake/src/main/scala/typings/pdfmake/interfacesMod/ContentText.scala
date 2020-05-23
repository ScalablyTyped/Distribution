package typings.pdfmake.interfacesMod

import typings.pdfkit.PDFKit.Mixins.OpenTypeFeatures
import typings.pdfmake.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentText
  extends ContentBase
     with ContentLink
     with _Content {
  var text: Content
}

object ContentText {
  @scala.inline
  def apply(
    text: Content,
    absolutePosition: X = null,
    alignment: Alignment = null,
    background: String = null,
    bold: js.UndefOr[Boolean] = js.undefined,
    characterSpacing: js.UndefOr[Double] = js.undefined,
    color: String = null,
    columnGap: Size = null,
    decoration: Decoration = null,
    decorationColor: String = null,
    decorationStyle: DecorationStyle = null,
    fillColor: String = null,
    fillOpacity: js.UndefOr[Double] = js.undefined,
    font: String = null,
    fontFeatures: js.Array[OpenTypeFeatures] = null,
    fontSize: js.UndefOr[Double] = js.undefined,
    headlineLevel: js.UndefOr[Double] = js.undefined,
    italics: js.UndefOr[Boolean] = js.undefined,
    leadingIndent: js.UndefOr[Double] = js.undefined,
    lineHeight: js.UndefOr[Double] = js.undefined,
    link: String = null,
    linkToDestination: String = null,
    linkToPage: js.UndefOr[Double] = js.undefined,
    margin: Margins = null,
    markerColor: String = null,
    noWrap: js.UndefOr[Boolean] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    pageBreak: PageBreak = null,
    pageOrientation: PageOrientation = null,
    preserveLeadingSpaces: js.UndefOr[Boolean] = js.undefined,
    relativePosition: X = null,
    style: String | js.Array[String] | Style = null
  ): ContentText = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (absolutePosition != null) __obj.updateDynamic("absolutePosition")(absolutePosition.asInstanceOf[js.Any])
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(characterSpacing)) __obj.updateDynamic("characterSpacing")(characterSpacing.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (columnGap != null) __obj.updateDynamic("columnGap")(columnGap.asInstanceOf[js.Any])
    if (decoration != null) __obj.updateDynamic("decoration")(decoration.asInstanceOf[js.Any])
    if (decorationColor != null) __obj.updateDynamic("decorationColor")(decorationColor.asInstanceOf[js.Any])
    if (decorationStyle != null) __obj.updateDynamic("decorationStyle")(decorationStyle.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (!js.isUndefined(fillOpacity)) __obj.updateDynamic("fillOpacity")(fillOpacity.get.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontFeatures != null) __obj.updateDynamic("fontFeatures")(fontFeatures.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(headlineLevel)) __obj.updateDynamic("headlineLevel")(headlineLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(italics)) __obj.updateDynamic("italics")(italics.get.asInstanceOf[js.Any])
    if (!js.isUndefined(leadingIndent)) __obj.updateDynamic("leadingIndent")(leadingIndent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineHeight)) __obj.updateDynamic("lineHeight")(lineHeight.get.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (linkToDestination != null) __obj.updateDynamic("linkToDestination")(linkToDestination.asInstanceOf[js.Any])
    if (!js.isUndefined(linkToPage)) __obj.updateDynamic("linkToPage")(linkToPage.get.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (markerColor != null) __obj.updateDynamic("markerColor")(markerColor.asInstanceOf[js.Any])
    if (!js.isUndefined(noWrap)) __obj.updateDynamic("noWrap")(noWrap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (pageBreak != null) __obj.updateDynamic("pageBreak")(pageBreak.asInstanceOf[js.Any])
    if (pageOrientation != null) __obj.updateDynamic("pageOrientation")(pageOrientation.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveLeadingSpaces)) __obj.updateDynamic("preserveLeadingSpaces")(preserveLeadingSpaces.get.asInstanceOf[js.Any])
    if (relativePosition != null) __obj.updateDynamic("relativePosition")(relativePosition.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentText]
  }
}

