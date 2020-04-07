package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of all the rows that are part of the table.
  
  Note that unlike Ranges or Columns, which will adjust if new rows/columns are added before them,
  a TableRow object represent the physical location of the table row, but not the data.
  That is, if the data is sorted or if new rows are added, a table row will continue
  to point at the index for which it was created.
  *
  * [Api set: ExcelApi 1.1]
  */
trait TableRowCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns the index number of the row within the rows collection of the table. Zero-indexed. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var index: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.1]
    */
  var values: js.UndefOr[Boolean] = js.undefined
}

object TableRowCollectionLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    index: js.UndefOr[Boolean] = js.undefined,
    values: js.UndefOr[Boolean] = js.undefined
  ): TableRowCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(values)) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRowCollectionLoadOptions]
  }
}

