package typings.officeJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Contains a collection of TableCell objects.
  *
  * [Api set: OneNoteApi 1.1]
  */
trait TableCellCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the index of the cell in its row. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var cellIndex: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the ID of the cell. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the collection of Paragraph objects in the TableCell.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var paragraphs: js.UndefOr[ParagraphCollectionLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the parent row of the cell.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentRow: js.UndefOr[TableRowLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the index of the cell's row in the table. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var rowIndex: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets and sets the shading color of the cell
    *
    * [Api set: OneNoteApi 1.1]
    */
  var shadingColor: js.UndefOr[Boolean] = js.undefined
}

object TableCellCollectionLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    cellIndex: js.UndefOr[Boolean] = js.undefined,
    id: js.UndefOr[Boolean] = js.undefined,
    paragraphs: ParagraphCollectionLoadOptions = null,
    parentRow: TableRowLoadOptions = null,
    rowIndex: js.UndefOr[Boolean] = js.undefined,
    shadingColor: js.UndefOr[Boolean] = js.undefined
  ): TableCellCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cellIndex)) __obj.updateDynamic("cellIndex")(cellIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (paragraphs != null) __obj.updateDynamic("paragraphs")(paragraphs.asInstanceOf[js.Any])
    if (parentRow != null) __obj.updateDynamic("parentRow")(parentRow.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadingColor)) __obj.updateDynamic("shadingColor")(shadingColor.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCellCollectionLoadOptions]
  }
}

