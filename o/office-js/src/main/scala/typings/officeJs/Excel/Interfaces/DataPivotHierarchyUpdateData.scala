package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.AggregationFunction
import typings.officeJs.Excel.ShowAsRule
import typings.officeJs.officeJsStrings.Automatic
import typings.officeJs.officeJsStrings.Average
import typings.officeJs.officeJsStrings.Count
import typings.officeJs.officeJsStrings.CountNumbers
import typings.officeJs.officeJsStrings.Max
import typings.officeJs.officeJsStrings.Min
import typings.officeJs.officeJsStrings.Product
import typings.officeJs.officeJsStrings.StandardDeviation
import typings.officeJs.officeJsStrings.StandardDeviationP
import typings.officeJs.officeJsStrings.Sum
import typings.officeJs.officeJsStrings.Unknown_
import typings.officeJs.officeJsStrings.Variance
import typings.officeJs.officeJsStrings.VarianceP
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

