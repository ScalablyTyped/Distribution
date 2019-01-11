package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "pivotTable.toJSON()". */
trait PivotTableData extends js.Object {
  /**
    *
    * The Column Pivot Hierarchies of the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  var columnHierarchies: js.UndefOr[js.Array[RowColumnPivotHierarchyData]] = js.undefined
  /**
    *
    * The Data Pivot Hierarchies of the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  var dataHierarchies: js.UndefOr[js.Array[DataPivotHierarchyData]] = js.undefined
  /**
    *
    * The Filter Pivot Hierarchies of the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  var filterHierarchies: js.UndefOr[js.Array[FilterPivotHierarchyData]] = js.undefined
  /**
    *
    * The Pivot Hierarchies of the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  var hierarchies: js.UndefOr[js.Array[PivotHierarchyData]] = js.undefined
  /**
    *
    * Id of the PivotTable. Read-only.
    *
    * [Api set: ExcelApi 1.5]
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Name of the PivotTable.
    *
    * [Api set: ExcelApi 1.3]
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * The Row Pivot Hierarchies of the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  var rowHierarchies: js.UndefOr[js.Array[RowColumnPivotHierarchyData]] = js.undefined
}

