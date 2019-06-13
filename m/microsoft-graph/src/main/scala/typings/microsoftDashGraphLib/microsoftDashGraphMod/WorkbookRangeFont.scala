package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookRangeFont extends Entity {
  /** Represents the bold status of font. */
  var bold: js.UndefOr[scala.Boolean] = js.undefined
  /** HTML color code representation of the text color. E.g. #FF0000 represents Red. */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Represents the italic status of the font. */
  var italic: js.UndefOr[scala.Boolean] = js.undefined
  /** Font name (e.g. 'Calibri') */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Font size. */
  var size: js.UndefOr[scala.Double] = js.undefined
  /** Type of underline applied to the font. The possible values are: None, Single, Double, SingleAccountant, DoubleAccountant. */
  var underline: js.UndefOr[java.lang.String] = js.undefined
}

object WorkbookRangeFont {
  @scala.inline
  def apply(
    bold: js.UndefOr[scala.Boolean] = js.undefined,
    color: java.lang.String = null,
    id: java.lang.String = null,
    italic: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    size: scala.Int | scala.Double = null,
    underline: java.lang.String = null
  ): WorkbookRangeFont = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (color != null) __obj.updateDynamic("color")(color)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic)
    if (name != null) __obj.updateDynamic("name")(name)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (underline != null) __obj.updateDynamic("underline")(underline)
    __obj.asInstanceOf[WorkbookRangeFont]
  }
}

