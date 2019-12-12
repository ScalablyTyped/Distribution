package typings.officeDashJsDashPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of all the columns that are part of the table.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait TableColumnCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Retrieve the filter applied to the column.
    *
    * [Api set: ExcelApi 1.2]
    */
  var filter: js.UndefOr[FilterLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns a unique key that identifies the column within the table. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns the index number of the column within the columns collection of the table. Zero-indexed. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var index: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the name of the table column.
    *
    * [Api set: ExcelApi 1.1 for getting the name; 1.4 for setting it.]
    */
  var name: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.1]
    */
  var values: js.UndefOr[Boolean] = js.native
}

