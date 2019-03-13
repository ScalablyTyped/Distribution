package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the font attributes, such as font name, font size, and color, for a shape's TextRange object.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait ShapeFontLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the bold status of font. Returns null the TextRange includes both bold and non-bold text fragments.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var bold: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * The HTML color code representation of the text color (e.g. "#FF0000" represents red). Returns null if the TextRange includes text fragments with different colors.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var color: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the italic status of font. Returns null if the TextRange includes both italic and non-italic text fragments.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var italic: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents font name (e.g. "Calibri"). If the text is Complex Script or East Asian language, this is the corresponding font name; otherwise it is the Latin font name.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var name: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents font size in points (e.g. 11). Returns null if the TextRange includes text fragments with different font sizes.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var size: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Type of underline applied to the font. Returns null if the TextRange includes text fragments with different underline styles. See Excel.ShapeFontUnderlineStyle for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var underline: js.UndefOr[scala.Boolean] = js.undefined
}

object ShapeFontLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    bold: js.UndefOr[scala.Boolean] = js.undefined,
    color: js.UndefOr[scala.Boolean] = js.undefined,
    italic: js.UndefOr[scala.Boolean] = js.undefined,
    name: js.UndefOr[scala.Boolean] = js.undefined,
    size: js.UndefOr[scala.Boolean] = js.undefined,
    underline: js.UndefOr[scala.Boolean] = js.undefined
  ): ShapeFontLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic)
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size)
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline)
    __obj.asInstanceOf[ShapeFontLoadOptions]
  }
}

