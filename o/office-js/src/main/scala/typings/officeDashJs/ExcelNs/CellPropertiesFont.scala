package typings.officeDashJs.ExcelNs

import typings.officeDashJs.officeDashJsStrings.DoubleAccountant
import typings.officeDashJs.officeDashJsStrings.None
import typings.officeDashJs.officeDashJsStrings.Single
import typings.officeDashJs.officeDashJsStrings.SingleAccountant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the `format.font` properties of `getCellProperties`, `getRowProperties`, and `getColumnProperties` or the `format.font` input parameter of `setCellProperties`, `setRowProperties`, and `setColumnProperties`.
  *
  * [Api set: ExcelApi 1.9]
  */
trait CellPropertiesFont extends js.Object {
  /**
    *
    * Represents the `format.font.bold` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bold: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the `format.font.color` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents the `format.font.italic` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var italic: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the `format.font.name` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents the `format.font.size` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var size: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the `format.font.strikethrough` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var strikethrough: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the `format.font.subscript` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var subscript: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the `format.font.superscript` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var superscript: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the `format.font.tintAndShade` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the `format.font.underline` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var underline: js.UndefOr[
    RangeUnderlineStyle | None | Single | typings.officeDashJs.officeDashJsStrings.Double | SingleAccountant | DoubleAccountant
  ] = js.undefined
}

object CellPropertiesFont {
  @scala.inline
  def apply(
    bold: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    italic: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    size: Int | Double = null,
    strikethrough: js.UndefOr[Boolean] = js.undefined,
    subscript: js.UndefOr[Boolean] = js.undefined,
    superscript: js.UndefOr[Boolean] = js.undefined,
    tintAndShade: Int | Double = null,
    underline: RangeUnderlineStyle | None | Single | typings.officeDashJs.officeDashJsStrings.Double | SingleAccountant | DoubleAccountant = null
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

