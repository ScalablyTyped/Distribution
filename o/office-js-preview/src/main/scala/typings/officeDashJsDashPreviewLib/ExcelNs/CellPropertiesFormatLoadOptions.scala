package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents which properties to load on the format object. */
trait CellPropertiesFormatLoadOptions extends js.Object {
  var autoIndent: js.UndefOr[scala.Boolean] = js.undefined
  var borders: js.UndefOr[CellPropertiesBorderLoadOptions] = js.undefined
  var fill: js.UndefOr[CellPropertiesFillLoadOptions] = js.undefined
  var font: js.UndefOr[CellPropertiesFontLoadOptions] = js.undefined
  var horizontalAlignment: js.UndefOr[scala.Boolean] = js.undefined
  var indentLevel: js.UndefOr[scala.Boolean] = js.undefined
  var protection: js.UndefOr[scala.Boolean] = js.undefined
  var readingOrder: js.UndefOr[scala.Boolean] = js.undefined
  var shrinkToFit: js.UndefOr[scala.Boolean] = js.undefined
  var textOrientation: js.UndefOr[scala.Boolean] = js.undefined
  var useStandardHeight: js.UndefOr[scala.Boolean] = js.undefined
  var useStandardWidth: js.UndefOr[scala.Boolean] = js.undefined
  var verticalAlignment: js.UndefOr[scala.Boolean] = js.undefined
  var wrapText: js.UndefOr[scala.Boolean] = js.undefined
}

object CellPropertiesFormatLoadOptions {
  @scala.inline
  def apply(
    autoIndent: js.UndefOr[scala.Boolean] = js.undefined,
    borders: CellPropertiesBorderLoadOptions = null,
    fill: CellPropertiesFillLoadOptions = null,
    font: CellPropertiesFontLoadOptions = null,
    horizontalAlignment: js.UndefOr[scala.Boolean] = js.undefined,
    indentLevel: js.UndefOr[scala.Boolean] = js.undefined,
    protection: js.UndefOr[scala.Boolean] = js.undefined,
    readingOrder: js.UndefOr[scala.Boolean] = js.undefined,
    shrinkToFit: js.UndefOr[scala.Boolean] = js.undefined,
    textOrientation: js.UndefOr[scala.Boolean] = js.undefined,
    useStandardHeight: js.UndefOr[scala.Boolean] = js.undefined,
    useStandardWidth: js.UndefOr[scala.Boolean] = js.undefined,
    verticalAlignment: js.UndefOr[scala.Boolean] = js.undefined,
    wrapText: js.UndefOr[scala.Boolean] = js.undefined
  ): CellPropertiesFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoIndent)) __obj.updateDynamic("autoIndent")(autoIndent)
    if (borders != null) __obj.updateDynamic("borders")(borders)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (font != null) __obj.updateDynamic("font")(font)
    if (!js.isUndefined(horizontalAlignment)) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment)
    if (!js.isUndefined(indentLevel)) __obj.updateDynamic("indentLevel")(indentLevel)
    if (!js.isUndefined(protection)) __obj.updateDynamic("protection")(protection)
    if (!js.isUndefined(readingOrder)) __obj.updateDynamic("readingOrder")(readingOrder)
    if (!js.isUndefined(shrinkToFit)) __obj.updateDynamic("shrinkToFit")(shrinkToFit)
    if (!js.isUndefined(textOrientation)) __obj.updateDynamic("textOrientation")(textOrientation)
    if (!js.isUndefined(useStandardHeight)) __obj.updateDynamic("useStandardHeight")(useStandardHeight)
    if (!js.isUndefined(useStandardWidth)) __obj.updateDynamic("useStandardWidth")(useStandardWidth)
    if (!js.isUndefined(verticalAlignment)) __obj.updateDynamic("verticalAlignment")(verticalAlignment)
    if (!js.isUndefined(wrapText)) __obj.updateDynamic("wrapText")(wrapText)
    __obj.asInstanceOf[CellPropertiesFormatLoadOptions]
  }
}

