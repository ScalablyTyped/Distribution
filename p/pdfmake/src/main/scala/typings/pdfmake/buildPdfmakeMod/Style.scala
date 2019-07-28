package typings.pdfmake.buildPdfmakeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Style
  extends /* additionalProperty */ StringDictionary[js.Any] {
  var alignment: js.UndefOr[Alignment] = js.undefined
  var background: js.UndefOr[js.Any] = js.undefined
  var bold: js.UndefOr[Boolean] = js.undefined
  var characterSpacing: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var columnGap: js.UndefOr[js.Any] = js.undefined
  var decoration: js.UndefOr[js.Any] = js.undefined
  var decorationColor: js.UndefOr[String] = js.undefined
  var decorationany: js.UndefOr[js.Any] = js.undefined
  var fillColor: js.UndefOr[String] = js.undefined
  var font: js.UndefOr[js.Any] = js.undefined
  var fontFeatures: js.UndefOr[js.Any] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var italics: js.UndefOr[Boolean] = js.undefined
  var leadingIndent: js.UndefOr[js.Any] = js.undefined
  var lineHeight: js.UndefOr[Double] = js.undefined
  var markerColor: js.UndefOr[String] = js.undefined
  var noWrap: js.UndefOr[Boolean] = js.undefined
}

object Style {
  @scala.inline
  def apply(
    StringDictionary: /* additionalProperty */ StringDictionary[js.Any] = null,
    alignment: Alignment = null,
    background: js.Any = null,
    bold: js.UndefOr[Boolean] = js.undefined,
    characterSpacing: Int | Double = null,
    color: String = null,
    columnGap: js.Any = null,
    decoration: js.Any = null,
    decorationColor: String = null,
    decorationany: js.Any = null,
    fillColor: String = null,
    font: js.Any = null,
    fontFeatures: js.Any = null,
    fontSize: Int | Double = null,
    italics: js.UndefOr[Boolean] = js.undefined,
    leadingIndent: js.Any = null,
    lineHeight: Int | Double = null,
    markerColor: String = null,
    noWrap: js.UndefOr[Boolean] = js.undefined
  ): Style = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background)
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (characterSpacing != null) __obj.updateDynamic("characterSpacing")(characterSpacing.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (columnGap != null) __obj.updateDynamic("columnGap")(columnGap)
    if (decoration != null) __obj.updateDynamic("decoration")(decoration)
    if (decorationColor != null) __obj.updateDynamic("decorationColor")(decorationColor)
    if (decorationany != null) __obj.updateDynamic("decorationany")(decorationany)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (font != null) __obj.updateDynamic("font")(font)
    if (fontFeatures != null) __obj.updateDynamic("fontFeatures")(fontFeatures)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (!js.isUndefined(italics)) __obj.updateDynamic("italics")(italics)
    if (leadingIndent != null) __obj.updateDynamic("leadingIndent")(leadingIndent)
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (markerColor != null) __obj.updateDynamic("markerColor")(markerColor)
    if (!js.isUndefined(noWrap)) __obj.updateDynamic("noWrap")(noWrap)
    __obj.asInstanceOf[Style]
  }
}

