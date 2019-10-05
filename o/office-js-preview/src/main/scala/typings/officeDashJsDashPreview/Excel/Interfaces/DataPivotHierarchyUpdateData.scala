package typings.officeDashJsDashPreview.Excel.Interfaces

import typings.officeDashJsDashPreview.Excel.AggregationFunction
import typings.officeDashJsDashPreview.Excel.ShowAsRule
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Automatic
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Average
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Count
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.CountNumbers
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Max
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Min
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Product
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.StandardDeviation
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.StandardDeviationP
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Sum
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Unknown
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Variance
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.VarianceP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the DataPivotHierarchy object, for use in `dataPivotHierarchy.set({ ... })`. */
trait DataPivotHierarchyUpdateData extends js.Object {
  /**
    *
    * Returns the PivotFields associated with the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var field: js.UndefOr[PivotFieldUpdateData] = js.undefined
  /**
    *
    * Name of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    *
    * Number format of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: js.UndefOr[String] = js.undefined
  /**
    *
    * Position of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[Double] = js.undefined
  /**
    *
    * Determines whether the data should be shown as a specific summary calculation or not.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showAs: js.UndefOr[ShowAsRule] = js.undefined
  /**
    *
    * Determines whether to show all items of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var summarizeBy: js.UndefOr[
    AggregationFunction | Unknown | Automatic | Sum | Count | Average | Max | Min | Product | CountNumbers | StandardDeviation | StandardDeviationP | Variance | VarianceP
  ] = js.undefined
}

object DataPivotHierarchyUpdateData {
  @scala.inline
  def apply(
    field: PivotFieldUpdateData = null,
    name: String = null,
    numberFormat: String = null,
    position: Int | Double = null,
    showAs: ShowAsRule = null,
    summarizeBy: AggregationFunction | Unknown | Automatic | Sum | Count | Average | Max | Min | Product | CountNumbers | StandardDeviation | StandardDeviationP | Variance | VarianceP = null
  ): DataPivotHierarchyUpdateData = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (name != null) __obj.updateDynamic("name")(name)
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (showAs != null) __obj.updateDynamic("showAs")(showAs)
    if (summarizeBy != null) __obj.updateDynamic("summarizeBy")(summarizeBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPivotHierarchyUpdateData]
  }
}

