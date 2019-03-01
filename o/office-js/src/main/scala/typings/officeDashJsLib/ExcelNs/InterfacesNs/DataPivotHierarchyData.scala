package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "dataPivotHierarchy.toJSON()". */
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
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Name of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Number format of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Position of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Determines whether the data should be shown as a specific summary calculation or not.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showAs: js.UndefOr[officeDashJsLib.ExcelNs.ShowAsRule] = js.undefined
  /**
    *
    * Determines whether to show all items of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var summarizeBy: js.UndefOr[
    officeDashJsLib.ExcelNs.AggregationFunction | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.Automatic | officeDashJsLib.officeDashJsLibStrings.Sum | officeDashJsLib.officeDashJsLibStrings.Count | officeDashJsLib.officeDashJsLibStrings.Average | officeDashJsLib.officeDashJsLibStrings.Max | officeDashJsLib.officeDashJsLibStrings.Min | officeDashJsLib.officeDashJsLibStrings.Product | officeDashJsLib.officeDashJsLibStrings.CountNumbers | officeDashJsLib.officeDashJsLibStrings.StandardDeviation | officeDashJsLib.officeDashJsLibStrings.StandardDeviationP | officeDashJsLib.officeDashJsLibStrings.Variance | officeDashJsLib.officeDashJsLibStrings.VarianceP
  ] = js.undefined
}

object DataPivotHierarchyData {
  @scala.inline
  def apply(
    field: PivotFieldData = null,
    id: java.lang.String = null,
    name: java.lang.String = null,
    numberFormat: java.lang.String = null,
    position: scala.Int | scala.Double = null,
    showAs: officeDashJsLib.ExcelNs.ShowAsRule = null,
    summarizeBy: officeDashJsLib.ExcelNs.AggregationFunction | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.Automatic | officeDashJsLib.officeDashJsLibStrings.Sum | officeDashJsLib.officeDashJsLibStrings.Count | officeDashJsLib.officeDashJsLibStrings.Average | officeDashJsLib.officeDashJsLibStrings.Max | officeDashJsLib.officeDashJsLibStrings.Min | officeDashJsLib.officeDashJsLibStrings.Product | officeDashJsLib.officeDashJsLibStrings.CountNumbers | officeDashJsLib.officeDashJsLibStrings.StandardDeviation | officeDashJsLib.officeDashJsLibStrings.StandardDeviationP | officeDashJsLib.officeDashJsLibStrings.Variance | officeDashJsLib.officeDashJsLibStrings.VarianceP = null
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

