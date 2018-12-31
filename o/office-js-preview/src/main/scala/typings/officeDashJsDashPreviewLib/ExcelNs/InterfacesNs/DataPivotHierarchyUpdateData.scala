package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

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
    * Determines whether the data should be sown as a specific summary calculation or not.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showAs: js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ShowAsRule] = js.undefined
  /**
    *
    * Determines whether to show all items of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var summarizeBy: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.AggregationFunction | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Unknown | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Automatic | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Sum | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Count | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Average | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Max | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Min | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Product | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.CountNumbers | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.StandardDeviation | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.StandardDeviationP | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Variance | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.VarianceP
  ] = js.undefined
}

