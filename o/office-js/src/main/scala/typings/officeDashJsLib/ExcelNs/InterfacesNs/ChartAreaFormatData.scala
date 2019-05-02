package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "chartAreaFormat.toJSON()". */
trait ChartAreaFormatData extends js.Object {
  /**
    *
    * Represents the border format of chart area, which includes color, linestyle, and weight. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var border: js.UndefOr[ChartBorderData] = js.undefined
  /**
    *
    * Returns or sets color scheme of the chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var colorScheme: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartColorScheme | officeDashJsLib.officeDashJsLibStrings.ColorfulPalette1 | officeDashJsLib.officeDashJsLibStrings.ColorfulPalette2 | officeDashJsLib.officeDashJsLibStrings.ColorfulPalette3 | officeDashJsLib.officeDashJsLibStrings.ColorfulPalette4 | officeDashJsLib.officeDashJsLibStrings.MonochromaticPalette1 | officeDashJsLib.officeDashJsLibStrings.MonochromaticPalette2 | officeDashJsLib.officeDashJsLibStrings.MonochromaticPalette3 | officeDashJsLib.officeDashJsLibStrings.MonochromaticPalette4 | officeDashJsLib.officeDashJsLibStrings.MonochromaticPalette5 | officeDashJsLib.officeDashJsLibStrings.MonochromaticPalette6 | officeDashJsLib.officeDashJsLibStrings.MonochromaticPalette7 | officeDashJsLib.officeDashJsLibStrings.MonochromaticPalette8 | officeDashJsLib.officeDashJsLibStrings.MonochromaticPalette9 | officeDashJsLib.officeDashJsLibStrings.MonochromaticPalette10 | officeDashJsLib.officeDashJsLibStrings.MonochromaticPalette11 | officeDashJsLib.officeDashJsLibStrings.MonochromaticPalette12 | officeDashJsLib.officeDashJsLibStrings.MonochromaticPalette13
  ] = js.undefined
  /**
    *
    * Represents the font attributes (font name, font size, color, etc.) for the current object. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[ChartFontData] = js.undefined
  /**
    *
    * Specifies whether or not chart area of the chart has rounded corners. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var roundedCorners: js.UndefOr[scala.Boolean] = js.undefined
}

object ChartAreaFormatData {
  @scala.inline
  def apply(
    border: ChartBorderData = null,
    colorScheme: officeDashJsLib.ExcelNs.ChartColorScheme | officeDashJsLib.officeDashJsLibStrings.ColorfulPalette1 | officeDashJsLib.officeDashJsLibStrings.ColorfulPalette2 | officeDashJsLib.officeDashJsLibStrings.ColorfulPalette3 | officeDashJsLib.officeDashJsLibStrings.ColorfulPalette4 | officeDashJsLib.officeDashJsLibStrings.MonochromaticPalette1 | officeDashJsLib.officeDashJsLibStrings.MonochromaticPalette2 | officeDashJsLib.officeDashJsLibStrings.MonochromaticPalette3 | officeDashJsLib.officeDashJsLibStrings.MonochromaticPalette4 | officeDashJsLib.officeDashJsLibStrings.MonochromaticPalette5 | officeDashJsLib.officeDashJsLibStrings.MonochromaticPalette6 | officeDashJsLib.officeDashJsLibStrings.MonochromaticPalette7 | officeDashJsLib.officeDashJsLibStrings.MonochromaticPalette8 | officeDashJsLib.officeDashJsLibStrings.MonochromaticPalette9 | officeDashJsLib.officeDashJsLibStrings.MonochromaticPalette10 | officeDashJsLib.officeDashJsLibStrings.MonochromaticPalette11 | officeDashJsLib.officeDashJsLibStrings.MonochromaticPalette12 | officeDashJsLib.officeDashJsLibStrings.MonochromaticPalette13 = null,
    font: ChartFontData = null,
    roundedCorners: js.UndefOr[scala.Boolean] = js.undefined
  ): ChartAreaFormatData = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (colorScheme != null) __obj.updateDynamic("colorScheme")(colorScheme.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font)
    if (!js.isUndefined(roundedCorners)) __obj.updateDynamic("roundedCorners")(roundedCorners)
    __obj.asInstanceOf[ChartAreaFormatData]
  }
}

