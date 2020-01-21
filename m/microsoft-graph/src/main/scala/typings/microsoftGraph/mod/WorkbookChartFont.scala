package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookChartFont extends Entity {
  // Represents the bold status of font.
  var bold: js.UndefOr[Boolean] = js.undefined
  // HTML color code representation of the text color. E.g. #FF0000 represents Red.
  var color: js.UndefOr[String] = js.undefined
  // Represents the italic status of the font.
  var italic: js.UndefOr[Boolean] = js.undefined
  // Font name (e.g. 'Calibri')
  var name: js.UndefOr[String] = js.undefined
  // Size of the font (e.g. 11)
  var size: js.UndefOr[Double] = js.undefined
  // Type of underline applied to the font. The possible values are: None, Single.
  var underline: js.UndefOr[String] = js.undefined
}

object WorkbookChartFont {
  @scala.inline
  def apply(
    bold: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    id: String = null,
    italic: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    size: Int | Double = null,
    underline: String = null
  ): WorkbookChartFont = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (underline != null) __obj.updateDynamic("underline")(underline.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookChartFont]
  }
}

