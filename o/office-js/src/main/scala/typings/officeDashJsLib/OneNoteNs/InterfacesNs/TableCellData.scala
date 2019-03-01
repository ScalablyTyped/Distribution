package typings
package officeDashJsLib.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "tableCell.toJSON()". */
trait TableCellData extends js.Object {
  /**
    *
    * Gets the index of the cell in its row. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var cellIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Gets the ID of the cell. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the collection of Paragraph objects in the TableCell. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var paragraphs: js.UndefOr[js.Array[ParagraphData]] = js.undefined
  /**
    *
    * Gets the index of the cell's row in the table. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Gets and sets the shading color of the cell
    *
    * [Api set: OneNoteApi 1.1]
    */
  var shadingColor: js.UndefOr[java.lang.String] = js.undefined
}

object TableCellData {
  @scala.inline
  def apply(
    cellIndex: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    paragraphs: js.Array[ParagraphData] = null,
    rowIndex: scala.Int | scala.Double = null,
    shadingColor: java.lang.String = null
  ): TableCellData = {
    val __obj = js.Dynamic.literal()
    if (cellIndex != null) __obj.updateDynamic("cellIndex")(cellIndex.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (paragraphs != null) __obj.updateDynamic("paragraphs")(paragraphs)
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (shadingColor != null) __obj.updateDynamic("shadingColor")(shadingColor)
    __obj.asInstanceOf[TableCellData]
  }
}

