package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents which properties to load on the format.font object.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait CellPropertiesFontLoadOptions extends js.Object {
  var bold: js.UndefOr[scala.Boolean] = js.undefined
  var color: js.UndefOr[scala.Boolean] = js.undefined
  var italic: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[scala.Boolean] = js.undefined
  var strikethrough: js.UndefOr[scala.Boolean] = js.undefined
  var subscript: js.UndefOr[scala.Boolean] = js.undefined
  var superscript: js.UndefOr[scala.Boolean] = js.undefined
  var tintAndShade: js.UndefOr[scala.Boolean] = js.undefined
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

