package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the `format.font` properties of `getCellProperties`, `getRowProperties`, and `getColumnProperties` or the `format.font` input parameter of `setCellProperties`, `setRowProperties`, and `setColumnProperties`.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait CellPropertiesFont extends js.Object {
  /**
    *
    * Represents the `format.font.bold` property.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var bold: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the `format.font.color` property.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents the `format.font.italic` property.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var italic: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the `format.font.name` property.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents the `format.font.size` property.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var size: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the `format.font.strikethrough` property.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var strikethrough: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the `format.font.subscript` property.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var subscript: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the `format.font.superscript` property.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var superscript: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the `format.font.tintAndShade` property.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var tintAndShade: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the `format.font.underline` property.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var underline: js.UndefOr[
    RangeUnderlineStyle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Single | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Double | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SingleAccountant | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DoubleAccountant
  ] = js.undefined
}

object CellPropertiesFont {
  @scala.inline
  def apply(
    bold: js.UndefOr[scala.Boolean] = js.undefined,
    color: java.lang.String = null,
    italic: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    size: scala.Int | scala.Double = null,
    strikethrough: js.UndefOr[scala.Boolean] = js.undefined,
    subscript: js.UndefOr[scala.Boolean] = js.undefined,
    superscript: js.UndefOr[scala.Boolean] = js.undefined,
    tintAndShade: scala.Int | scala.Double = null,
    underline: RangeUnderlineStyle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Single | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Double | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SingleAccountant | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DoubleAccountant = null
  ): CellPropertiesFont = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic)
    if (name != null) __obj.updateDynamic("name")(name)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(strikethrough)) __obj.updateDynamic("strikethrough")(strikethrough)
    if (!js.isUndefined(subscript)) __obj.updateDynamic("subscript")(subscript)
    if (!js.isUndefined(superscript)) __obj.updateDynamic("superscript")(superscript)
    if (tintAndShade != null) __obj.updateDynamic("tintAndShade")(tintAndShade.asInstanceOf[js.Any])
    if (underline != null) __obj.updateDynamic("underline")(underline.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellPropertiesFont]
  }
}

