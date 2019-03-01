package typings
package officeDashJsLib.OneNoteNs.InterfacesNs

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
  var cellCount: js.UndefOr[scala.Double] = js.undefined
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
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the index of the row in its parent table. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
}

object TableRowData {
  @scala.inline
  def apply(
    cellCount: scala.Int | scala.Double = null,
    cells: js.Array[TableCellData] = null,
    id: java.lang.String = null,
    rowIndex: scala.Int | scala.Double = null
  ): TableRowData = {
    val __obj = js.Dynamic.literal()
    if (cellCount != null) __obj.updateDynamic("cellCount")(cellCount.asInstanceOf[js.Any])
    if (cells != null) __obj.updateDynamic("cells")(cells)
    if (id != null) __obj.updateDynamic("id")(id)
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRowData]
  }
}

