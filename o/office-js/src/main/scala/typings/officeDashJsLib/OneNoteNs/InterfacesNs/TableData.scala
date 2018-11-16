package typings
package officeDashJsLib.OneNoteNs.InterfacesNs

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
              * Gets the Paragraph object that contains the Table object. Read-only.
              *
              * [Api set: OneNoteApi 1.1]
              */
  var paragraph: js.UndefOr[ParagraphData] = js.undefined
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

