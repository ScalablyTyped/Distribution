package typings
package officeDashJsDashPreviewLib.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "table.toJSON()". */
trait TableData extends js.Object {
  /**
    *
    * Gets or sets whether the borders are visible or not. True if they are visible, false if they are hidden.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var borderVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets the number of columns in the table.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var columnCount: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Gets the ID of the table. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the number of rows in the table.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var rowCount: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Gets all of the table rows. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var rows: js.UndefOr[js.Array[TableRowData]] = js.undefined
}

object TableData {
  @scala.inline
  def apply(
    borderVisible: js.UndefOr[scala.Boolean] = js.undefined,
    columnCount: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    rowCount: scala.Int | scala.Double = null,
    rows: js.Array[TableRowData] = null
  ): TableData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(borderVisible)) __obj.updateDynamic("borderVisible")(borderVisible)
    if (columnCount != null) __obj.updateDynamic("columnCount")(columnCount.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (rowCount != null) __obj.updateDynamic("rowCount")(rowCount.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows)
    __obj.asInstanceOf[TableData]
  }
}

