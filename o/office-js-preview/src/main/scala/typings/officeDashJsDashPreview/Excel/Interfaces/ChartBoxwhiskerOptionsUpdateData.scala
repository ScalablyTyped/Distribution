package typings.officeDashJsDashPreview.Excel.Interfaces

import typings.officeDashJsDashPreview.Excel.ChartBoxQuartileCalculation
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Exclusive
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Inclusive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartBoxwhiskerOptions object, for use in `chartBoxwhiskerOptions.set({ ... })`. */
trait ChartBoxwhiskerOptionsUpdateData extends js.Object {
  /**
    *
    * Returns or sets the quartile calculation type of a box and whisker chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var quartileCalculation: js.UndefOr[ChartBoxQuartileCalculation | Inclusive | Exclusive] = js.undefined
  /**
    *
    * Specifies whether or not the inner points are shown in a box and whisker chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showInnerPoints: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether or not the mean line is shown in a box and whisker chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showMeanLine: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether or not the mean marker is shown in a box and whisker chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showMeanMarker: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether or not outlier points are shown in a box and whisker chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showOutlierPoints: js.UndefOr[Boolean] = js.undefined
}

object ChartBoxwhiskerOptionsUpdateData {
  @scala.inline
  def apply(
    quartileCalculation: ChartBoxQuartileCalculation | Inclusive | Exclusive = null,
    showInnerPoints: js.UndefOr[Boolean] = js.undefined,
    showMeanLine: js.UndefOr[Boolean] = js.undefined,
    showMeanMarker: js.UndefOr[Boolean] = js.undefined,
    showOutlierPoints: js.UndefOr[Boolean] = js.undefined
  ): ChartBoxwhiskerOptionsUpdateData = {
    val __obj = js.Dynamic.literal()
    if (quartileCalculation != null) __obj.updateDynamic("quartileCalculation")(quartileCalculation.asInstanceOf[js.Any])
    if (!js.isUndefined(showInnerPoints)) __obj.updateDynamic("showInnerPoints")(showInnerPoints)
    if (!js.isUndefined(showMeanLine)) __obj.updateDynamic("showMeanLine")(showMeanLine)
    if (!js.isUndefined(showMeanMarker)) __obj.updateDynamic("showMeanMarker")(showMeanMarker)
    if (!js.isUndefined(showOutlierPoints)) __obj.updateDynamic("showOutlierPoints")(showOutlierPoints)
    __obj.asInstanceOf[ChartBoxwhiskerOptionsUpdateData]
  }
}

