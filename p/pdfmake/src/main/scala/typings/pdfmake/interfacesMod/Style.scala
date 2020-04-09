package typings.pdfmake.interfacesMod

import typings.pdfkit.PDFKit.Mixins.OpenTypeFeatures
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Style extends js.Object {
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
  @scala.inline
  def apply(
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
    italics: js.UndefOr[Boolean] = js.undefined,
    leadingIndent: Int | Double = null,
    lineHeight: Int | Double = null,
    margin: Margins = null,
    markerColor: String = null,
    noWrap: js.UndefOr[Boolean] = js.undefined,
    opacity: Int | Double = null,
    preserveLeadingSpaces: js.UndefOr[Boolean] = js.undefined
  ): Style = {
    val __obj = js.Dynamic.literal()
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
    if (!js.isUndefined(italics)) __obj.updateDynamic("italics")(italics.asInstanceOf[js.Any])
    if (leadingIndent != null) __obj.updateDynamic("leadingIndent")(leadingIndent.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (markerColor != null) __obj.updateDynamic("markerColor")(markerColor.asInstanceOf[js.Any])
    if (!js.isUndefined(noWrap)) __obj.updateDynamic("noWrap")(noWrap.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveLeadingSpaces)) __obj.updateDynamic("preserveLeadingSpaces")(preserveLeadingSpaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
}

