package typings
package officeDashJsDashPreviewLib.OneNoteNs.InterfacesNs

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
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Gets the index of the cell in its row. Read-only.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var cellIndex: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Gets the ID of the cell. Read-only.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var id: js.UndefOr[scala.Boolean] = js.undefined
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
  var rowIndex: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Gets and sets the shading color of the cell
               *
               * [Api set: OneNoteApi 1.1]
               */
  var shadingColor: js.UndefOr[scala.Boolean] = js.undefined
}

