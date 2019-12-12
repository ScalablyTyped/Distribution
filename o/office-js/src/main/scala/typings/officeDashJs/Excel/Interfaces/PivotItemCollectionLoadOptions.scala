package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of all the PivotItems related to their parent PivotField.
  *
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait PivotItemCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Id of the PivotItem.
    *
    * [Api set: ExcelApi 1.8]
    */
  var id: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Determines whether the item is expanded to show child items or if it's collapsed and child items are hidden.
    *
    * [Api set: ExcelApi 1.8]
    */
  var isExpanded: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Name of the PivotItem.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Determines whether the PivotItem is visible or not.
    *
    * [Api set: ExcelApi 1.8]
    */
  var visible: js.UndefOr[Boolean] = js.native
}

