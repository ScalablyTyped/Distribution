package typings.officeJsPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "tableRow.toJSON()". */
trait TableRowData extends js.Object {
  /**
    *
    * Gets the number of cells in the row. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var cellCount: js.UndefOr[Double] = js.undefined
  /**
    *
    * Gets the cells in the row. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var cells: js.UndefOr[js.Array[TableCellData]] = js.undefined
  /**
    *
    * Gets the ID of the row. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets the index of the row in its parent table. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
}

object TableRowData {
  @scala.inline
  def apply(
    cellCount: js.UndefOr[Double] = js.undefined,
    cells: js.Array[TableCellData] = null,
    id: String = null,
    rowIndex: js.UndefOr[Double] = js.undefined
  ): TableRowData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cellCount)) __obj.updateDynamic("cellCount")(cellCount.get.asInstanceOf[js.Any])
    if (cells != null) __obj.updateDynamic("cells")(cells.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRowData]
  }
}

