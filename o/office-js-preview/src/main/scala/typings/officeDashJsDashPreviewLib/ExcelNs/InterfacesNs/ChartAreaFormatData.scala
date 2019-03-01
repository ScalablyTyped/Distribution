package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

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
    * Returns or sets an integer that represents the color scheme for the chart. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var colorScheme: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartColorScheme | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ColorfulPalette1 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ColorfulPalette2 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ColorfulPalette3 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ColorfulPalette4 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette1 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette2 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette3 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette4 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette5 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette6 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette7 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette8 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette9 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette10 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette11 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette12 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette13
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
    * True if the chart area of the chart has rounded corners. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var roundedCorners: js.UndefOr[scala.Boolean] = js.undefined
}

object ChartAreaFormatData {
  @scala.inline
  def apply(
    border: ChartBorderData = null,
    colorScheme: officeDashJsDashPreviewLib.ExcelNs.ChartColorScheme | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ColorfulPalette1 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ColorfulPalette2 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ColorfulPalette3 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ColorfulPalette4 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette1 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette2 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette3 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette4 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette5 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette6 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette7 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette8 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette9 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette10 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette11 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette12 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette13 = null,
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

