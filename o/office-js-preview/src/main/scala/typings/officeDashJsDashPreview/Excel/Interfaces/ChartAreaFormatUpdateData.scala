package typings.officeDashJsDashPreview.Excel.Interfaces

import typings.officeDashJsDashPreview.Excel.ChartColorScheme
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ColorfulPalette1
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ColorfulPalette2
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ColorfulPalette3
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ColorfulPalette4
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette1
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette10
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette11
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette12
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette13
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette2
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette3
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette4
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette5
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette6
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette7
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette8
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette9
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartAreaFormat object, for use in `chartAreaFormat.set({ ... })`. */
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
    * Returns or sets color scheme of the chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var colorScheme: js.UndefOr[
    ChartColorScheme | ColorfulPalette1 | ColorfulPalette2 | ColorfulPalette3 | ColorfulPalette4 | MonochromaticPalette1 | MonochromaticPalette2 | MonochromaticPalette3 | MonochromaticPalette4 | MonochromaticPalette5 | MonochromaticPalette6 | MonochromaticPalette7 | MonochromaticPalette8 | MonochromaticPalette9 | MonochromaticPalette10 | MonochromaticPalette11 | MonochromaticPalette12 | MonochromaticPalette13
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
    * Specifies whether or not chart area of the chart has rounded corners. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var roundedCorners: js.UndefOr[Boolean] = js.undefined
}

object ChartAreaFormatUpdateData {
  @scala.inline
  def apply(
    border: ChartBorderUpdateData = null,
    colorScheme: ChartColorScheme | ColorfulPalette1 | ColorfulPalette2 | ColorfulPalette3 | ColorfulPalette4 | MonochromaticPalette1 | MonochromaticPalette2 | MonochromaticPalette3 | MonochromaticPalette4 | MonochromaticPalette5 | MonochromaticPalette6 | MonochromaticPalette7 | MonochromaticPalette8 | MonochromaticPalette9 | MonochromaticPalette10 | MonochromaticPalette11 | MonochromaticPalette12 | MonochromaticPalette13 = null,
    font: ChartFontUpdateData = null,
    roundedCorners: js.UndefOr[Boolean] = js.undefined
  ): ChartAreaFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (colorScheme != null) __obj.updateDynamic("colorScheme")(colorScheme.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(roundedCorners)) __obj.updateDynamic("roundedCorners")(roundedCorners.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartAreaFormatUpdateData]
  }
}

