package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ShapeFont object, for use in "shapeFont.set({ ... })". */
trait ShapeFontUpdateData extends js.Object {
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
    * HTML color code representation of the text color. E.g. #FF0000 represents Red. Returns null if the TextRange includes text fragments with different colors.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents the italic status of font. Return null if the TextRange includes both italic and non-italic text fragments.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var italic: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents font name (e.g. "Calibri"). If the text is Complex Script or East Asian language, represents corresponding font name; otherwise represents Latin font name.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents font size in points (e.g. 11). Return null if the TextRange includes text fragments with different font sizes.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var size: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Type of underline applied to the font. Return null if the TextRange includes text fragments with different underline styles. See Excel.ShapeFontUnderlineStyle for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var underline: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ShapeFontUnderlineStyle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Single | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Double | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Heavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Dotted | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DottedHeavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Dash | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashHeavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashLong | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashLongHeavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DotDash | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DotDashHeavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DotDotDash | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DotDotDashHeavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Wavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WavyHeavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WavyDouble
  ] = js.undefined
}

object ShapeFontUpdateData {
  @scala.inline
  def apply(
    bold: js.UndefOr[scala.Boolean] = js.undefined,
    color: java.lang.String = null,
    italic: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    size: scala.Int | scala.Double = null,
    underline: officeDashJsDashPreviewLib.ExcelNs.ShapeFontUnderlineStyle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Single | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Double | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Heavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Dotted | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DottedHeavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Dash | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashHeavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashLong | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashLongHeavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DotDash | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DotDashHeavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DotDotDash | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DotDotDashHeavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Wavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WavyHeavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WavyDouble = null
  ): ShapeFontUpdateData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic)
    if (name != null) __obj.updateDynamic("name")(name)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (underline != null) __obj.updateDynamic("underline")(underline.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeFontUpdateData]
  }
}

