package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartAreaFormat object, for use in "chartAreaFormat.set({ ... })". */
trait ChartAreaFormatUpdateData extends js.Object {
  /**
    *
    * Represents the border format of chart area, which includes color, linestyle, and weight.
    *
    * [Api set: ExcelApi 1.7]
    */
  var border: js.UndefOr[ChartBorderUpdateData] = js.undefined
  /**
    *
    * Returns or sets an integer that represents the color scheme for the chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var colorScheme: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartColorScheme | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ColorfulPalette1 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ColorfulPalette2 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ColorfulPalette3 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ColorfulPalette4 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette1 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette2 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette3 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette4 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette5 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette6 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette7 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette8 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette9 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette10 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette11 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette12 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette13
  ] = js.undefined
  /**
    *
    * Represents the font attributes (font name, font size, color, etc.) for the current object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[ChartFontUpdateData] = js.undefined
  /**
    *
    * True if the chart area of the chart has rounded corners. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var roundedCorners: js.UndefOr[scala.Boolean] = js.undefined
}

object ChartAreaFormatUpdateData {
  @scala.inline
  def apply(
    border: ChartBorderUpdateData = null,
    colorScheme: officeDashJsDashPreviewLib.ExcelNs.ChartColorScheme | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ColorfulPalette1 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ColorfulPalette2 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ColorfulPalette3 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ColorfulPalette4 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette1 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette2 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette3 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette4 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette5 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette6 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette7 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette8 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette9 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette10 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette11 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette12 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette13 = null,
    font: ChartFontUpdateData = null,
    roundedCorners: js.UndefOr[scala.Boolean] = js.undefined
  ): ChartAreaFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (colorScheme != null) __obj.updateDynamic("colorScheme")(colorScheme.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font)
    if (!js.isUndefined(roundedCorners)) __obj.updateDynamic("roundedCorners")(roundedCorners)
    __obj.asInstanceOf[ChartAreaFormatUpdateData]
  }
}

