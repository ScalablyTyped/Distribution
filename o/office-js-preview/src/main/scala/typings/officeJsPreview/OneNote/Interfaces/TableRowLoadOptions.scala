package typings.officeJsPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a row in a table.
  *
  * [Api set: OneNoteApi 1.1]
  */
trait TableRowLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the number of cells in the row. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var cellCount: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the cells in the row.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var cells: js.UndefOr[TableCellCollectionLoadOptions] = js.undefined
  /**
    *
    * Gets the ID of the row. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the parent table.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentTable: js.UndefOr[TableLoadOptions] = js.undefined
  /**
    *
    * Gets the index of the row in its parent table. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var rowIndex: js.UndefOr[Boolean] = js.undefined
}

object TableRowLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    cellCount: js.UndefOr[Boolean] = js.undefined,
    cells: TableCellCollectionLoadOptions = null,
    id: js.UndefOr[Boolean] = js.undefined,
    parentTable: TableLoadOptions = null,
    rowIndex: js.UndefOr[Boolean] = js.undefined
  ): TableRowLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cellCount)) __obj.updateDynamic("cellCount")(cellCount.get.asInstanceOf[js.Any])
    if (cells != null) __obj.updateDynamic("cells")(cells.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (parentTable != null) __obj.updateDynamic("parentTable")(parentTable.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRowLoadOptions]
  }
}

