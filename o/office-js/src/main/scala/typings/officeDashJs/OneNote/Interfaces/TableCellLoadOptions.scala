package typings.officeDashJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a cell in a OneNote table.
  *
  * [Api set: OneNoteApi 1.1]
  */
trait TableCellLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the index of the cell in its row. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var cellIndex: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the ID of the cell. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the collection of Paragraph objects in the TableCell.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var paragraphs: js.UndefOr[ParagraphCollectionLoadOptions] = js.undefined
  /**
    *
    * Gets the parent row of the cell.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentRow: js.UndefOr[TableRowLoadOptions] = js.undefined
  /**
    *
    * Gets the index of the cell's row in the table. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var rowIndex: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets and sets the shading color of the cell
    *
    * [Api set: OneNoteApi 1.1]
    */
  var shadingColor: js.UndefOr[Boolean] = js.undefined
}

object TableCellLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    cellIndex: js.UndefOr[Boolean] = js.undefined,
    id: js.UndefOr[Boolean] = js.undefined,
    paragraphs: ParagraphCollectionLoadOptions = null,
    parentRow: TableRowLoadOptions = null,
    rowIndex: js.UndefOr[Boolean] = js.undefined,
    shadingColor: js.UndefOr[Boolean] = js.undefined
  ): TableCellLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(cellIndex)) __obj.updateDynamic("cellIndex")(cellIndex)
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id)
    if (paragraphs != null) __obj.updateDynamic("paragraphs")(paragraphs)
    if (parentRow != null) __obj.updateDynamic("parentRow")(parentRow)
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex)
    if (!js.isUndefined(shadingColor)) __obj.updateDynamic("shadingColor")(shadingColor)
    __obj.asInstanceOf[TableCellLoadOptions]
  }
}

