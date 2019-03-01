package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartPlotArea object, for use in "chartPlotArea.set({ ... })". */
trait ChartPlotAreaUpdateData extends js.Object {
  /**
    *
    * Represents the formatting of a chart plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var format: js.UndefOr[ChartPlotAreaFormatUpdateData] = js.undefined
  /**
    *
    * Represents the height value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the insideHeight value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the insideLeft value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideLeft: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the insideTop value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideTop: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the insideWidth value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the left value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var left: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the position of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartPlotAreaPosition | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Automatic | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Custom
  ] = js.undefined
  /**
    *
    * Represents the top value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var top: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the width value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ChartPlotAreaUpdateData {
  @scala.inline
  def apply(
    format: ChartPlotAreaFormatUpdateData = null,
    height: scala.Int | scala.Double = null,
    insideHeight: scala.Int | scala.Double = null,
    insideLeft: scala.Int | scala.Double = null,
    insideTop: scala.Int | scala.Double = null,
    insideWidth: scala.Int | scala.Double = null,
    left: scala.Int | scala.Double = null,
    position: officeDashJsDashPreviewLib.ExcelNs.ChartPlotAreaPosition | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Automatic | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Custom = null,
    top: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): ChartPlotAreaUpdateData = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (insideHeight != null) __obj.updateDynamic("insideHeight")(insideHeight.asInstanceOf[js.Any])
    if (insideLeft != null) __obj.updateDynamic("insideLeft")(insideLeft.asInstanceOf[js.Any])
    if (insideTop != null) __obj.updateDynamic("insideTop")(insideTop.asInstanceOf[js.Any])
    if (insideWidth != null) __obj.updateDynamic("insideWidth")(insideWidth.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartPlotAreaUpdateData]
  }
}

