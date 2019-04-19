package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Specifies which properties to load on the `format.font` object.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait CellPropertiesFontLoadOptions extends js.Object {
  /**
    *
    * Specifies whether to load on the `bold` property.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var bold: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `color` property.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var color: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `italic` property.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var italic: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `name` property.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var name: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `size` property.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var size: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `strikethrough` property.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var strikethrough: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `subscript` property.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var subscript: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `superscript` property.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var superscript: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `tintAndShade` property.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var tintAndShade: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `underline` property.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var underline: js.UndefOr[scala.Boolean] = js.undefined
}

object CellPropertiesFontLoadOptions {
  @scala.inline
  def apply(
    bold: js.UndefOr[scala.Boolean] = js.undefined,
    color: js.UndefOr[scala.Boolean] = js.undefined,
    italic: js.UndefOr[scala.Boolean] = js.undefined,
    name: js.UndefOr[scala.Boolean] = js.undefined,
    size: js.UndefOr[scala.Boolean] = js.undefined,
    strikethrough: js.UndefOr[scala.Boolean] = js.undefined,
    subscript: js.UndefOr[scala.Boolean] = js.undefined,
    superscript: js.UndefOr[scala.Boolean] = js.undefined,
    tintAndShade: js.UndefOr[scala.Boolean] = js.undefined,
    underline: js.UndefOr[scala.Boolean] = js.undefined
  ): CellPropertiesFontLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic)
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size)
    if (!js.isUndefined(strikethrough)) __obj.updateDynamic("strikethrough")(strikethrough)
    if (!js.isUndefined(subscript)) __obj.updateDynamic("subscript")(subscript)
    if (!js.isUndefined(superscript)) __obj.updateDynamic("superscript")(superscript)
    if (!js.isUndefined(tintAndShade)) __obj.updateDynamic("tintAndShade")(tintAndShade)
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline)
    __obj.asInstanceOf[CellPropertiesFontLoadOptions]
  }
}

