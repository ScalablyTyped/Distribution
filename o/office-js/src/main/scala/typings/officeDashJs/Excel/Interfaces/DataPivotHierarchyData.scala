package typings.officeDashJs.Excel.Interfaces

import typings.officeDashJs.Excel.AggregationFunction
import typings.officeDashJs.Excel.ShowAsRule
import typings.officeDashJs.officeDashJsStrings.Automatic
import typings.officeDashJs.officeDashJsStrings.Average
import typings.officeDashJs.officeDashJsStrings.Count
import typings.officeDashJs.officeDashJsStrings.CountNumbers
import typings.officeDashJs.officeDashJsStrings.Max
import typings.officeDashJs.officeDashJsStrings.Min
import typings.officeDashJs.officeDashJsStrings.Product
import typings.officeDashJs.officeDashJsStrings.StandardDeviation
import typings.officeDashJs.officeDashJsStrings.StandardDeviationP
import typings.officeDashJs.officeDashJsStrings.Sum
import typings.officeDashJs.officeDashJsStrings.Unknown
import typings.officeDashJs.officeDashJsStrings.Variance
import typings.officeDashJs.officeDashJsStrings.VarianceP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `dataPivotHierarchy.toJSON()`. */
trait DataPivotHierarchyData extends js.Object {
  /**
    *
    * Returns the PivotFields associated with the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var field: js.UndefOr[PivotFieldData] = js.undefined
  /**
    *
    * Id of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var id: js.UndefOr[String] = js.undefined
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

object DataPivotHierarchyData {
  @scala.inline
  def apply(
    field: PivotFieldData = null,
    id: String = null,
    name: String = null,
    numberFormat: String = null,
    position: Int | Double = null,
    showAs: ShowAsRule = null,
    summarizeBy: AggregationFunction | Unknown | Automatic | Sum | Count | Average | Max | Min | Product | CountNumbers | StandardDeviation | StandardDeviationP | Variance | VarianceP = null
  ): DataPivotHierarchyData = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (showAs != null) __obj.updateDynamic("showAs")(showAs)
    if (summarizeBy != null) __obj.updateDynamic("summarizeBy")(summarizeBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPivotHierarchyData]
  }
}

