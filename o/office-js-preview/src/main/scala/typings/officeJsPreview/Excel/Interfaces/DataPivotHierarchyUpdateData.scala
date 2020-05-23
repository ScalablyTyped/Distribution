package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.AggregationFunction
import typings.officeJsPreview.Excel.ShowAsRule
import typings.officeJsPreview.officeJsPreviewStrings.Automatic
import typings.officeJsPreview.officeJsPreviewStrings.Average
import typings.officeJsPreview.officeJsPreviewStrings.Count
import typings.officeJsPreview.officeJsPreviewStrings.CountNumbers
import typings.officeJsPreview.officeJsPreviewStrings.Max
import typings.officeJsPreview.officeJsPreviewStrings.Min
import typings.officeJsPreview.officeJsPreviewStrings.Product
import typings.officeJsPreview.officeJsPreviewStrings.StandardDeviation
import typings.officeJsPreview.officeJsPreviewStrings.StandardDeviationP
import typings.officeJsPreview.officeJsPreviewStrings.Sum
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import typings.officeJsPreview.officeJsPreviewStrings.Variance
import typings.officeJsPreview.officeJsPreviewStrings.VarianceP
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
    * Specifies if the data should be shown as a specific summary calculation.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showAs: js.UndefOr[ShowAsRule] = js.undefined
  /**
    *
    * Specifies if all items of the DataPivotHierarchy are shown.
    *
    * [Api set: ExcelApi 1.8]
    */
  var summarizeBy: js.UndefOr[
    AggregationFunction | Unknown_ | Automatic | Sum | Count | Average | Max | Min | Product | CountNumbers | StandardDeviation | StandardDeviationP | Variance | VarianceP
  ] = js.undefined
}

object DataPivotHierarchyUpdateData {
  @scala.inline
  def apply(
    field: PivotFieldUpdateData = null,
    name: String = null,
    numberFormat: String = null,
    position: js.UndefOr[Double] = js.undefined,
    showAs: ShowAsRule = null,
    summarizeBy: AggregationFunction | Unknown_ | Automatic | Sum | Count | Average | Max | Min | Product | CountNumbers | StandardDeviation | StandardDeviationP | Variance | VarianceP = null
  ): DataPivotHierarchyUpdateData = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.get.asInstanceOf[js.Any])
    if (showAs != null) __obj.updateDynamic("showAs")(showAs.asInstanceOf[js.Any])
    if (summarizeBy != null) __obj.updateDynamic("summarizeBy")(summarizeBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPivotHierarchyUpdateData]
  }
}

