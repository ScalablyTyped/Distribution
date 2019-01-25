package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the DataPivotHierarchy object, for use in "dataPivotHierarchy.set({ ... })". */
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

