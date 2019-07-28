package typings.officeDashJs.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a table in a OneNote page.
  *
  * [Api set: OneNoteApi 1.1]
  */
trait TableLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets whether the borders are visible or not. True if they are visible, false if they are hidden.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var borderVisible: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the number of columns in the table.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var columnCount: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the ID of the table. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the Paragraph object that contains the Table object.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var paragraph: js.UndefOr[ParagraphLoadOptions] = js.undefined
  /**
    *
    * Gets the number of rows in the table.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var rowCount: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets all of the table rows.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var rows: js.UndefOr[TableRowCollectionLoadOptions] = js.undefined
}

object TableLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    borderVisible: js.UndefOr[Boolean] = js.undefined,
    columnCount: js.UndefOr[Boolean] = js.undefined,
    id: js.UndefOr[Boolean] = js.undefined,
    paragraph: ParagraphLoadOptions = null,
    rowCount: js.UndefOr[Boolean] = js.undefined,
    rows: TableRowCollectionLoadOptions = null
  ): TableLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(borderVisible)) __obj.updateDynamic("borderVisible")(borderVisible)
    if (!js.isUndefined(columnCount)) __obj.updateDynamic("columnCount")(columnCount)
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id)
    if (paragraph != null) __obj.updateDynamic("paragraph")(paragraph)
    if (!js.isUndefined(rowCount)) __obj.updateDynamic("rowCount")(rowCount)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    __obj.asInstanceOf[TableLoadOptions]
  }
}

