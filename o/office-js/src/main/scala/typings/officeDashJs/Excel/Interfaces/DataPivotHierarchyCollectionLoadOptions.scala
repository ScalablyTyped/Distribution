package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of DataPivotHierarchy items associated with the PivotTable.
  *
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait DataPivotHierarchyCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns the PivotFields associated with the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var field: js.UndefOr[PivotFieldLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Id of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var id: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Name of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Number format of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Position of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Determines whether the data should be shown as a specific summary calculation or not.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showAs: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Determines whether to show all items of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var summarizeBy: js.UndefOr[Boolean] = js.native
}

