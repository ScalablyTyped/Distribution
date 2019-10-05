package typings.officeDashJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Contains a collection of TableRow objects.
  *
  * [Api set: OneNoteApi 1.1]
  */
trait TableRowCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the number of cells in the row. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var cellCount: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the cells in the row.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var cells: js.UndefOr[TableCellCollectionLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the ID of the row. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the parent table.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentTable: js.UndefOr[TableLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the index of the row in its parent table. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var rowIndex: js.UndefOr[Boolean] = js.undefined
}

object TableRowCollectionLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    cellCount: js.UndefOr[Boolean] = js.undefined,
    cells: TableCellCollectionLoadOptions = null,
    id: js.UndefOr[Boolean] = js.undefined,
    parentTable: TableLoadOptions = null,
    rowIndex: js.UndefOr[Boolean] = js.undefined
  ): TableRowCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(cellCount)) __obj.updateDynamic("cellCount")(cellCount)
    if (cells != null) __obj.updateDynamic("cells")(cells)
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id)
    if (parentTable != null) __obj.updateDynamic("parentTable")(parentTable)
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex)
    __obj.asInstanceOf[TableRowCollectionLoadOptions]
  }
}

