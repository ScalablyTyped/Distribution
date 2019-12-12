package typings.officeDashJsDashPreview.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a table cell in a Word document.
  *
  * [Api set: WordApi 1.3]
  */
@js.native
trait TableCellLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the body object of the cell.
    *
    * [Api set: WordApi 1.3]
    */
  var body: js.UndefOr[BodyLoadOptions] = js.native
  /**
    *
    * Gets the index of the cell in its row. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var cellIndex: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets and sets the width of the cell's column in points. This is applicable to uniform tables.
    *
    * [Api set: WordApi 1.3]
    */
  var columnWidth: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets and sets the horizontal alignment of the cell. The value can be 'Left', 'Centered', 'Right', or 'Justified'.
    *
    * [Api set: WordApi 1.3]
    */
  var horizontalAlignment: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the parent row of the cell.
    *
    * [Api set: WordApi 1.3]
    */
  var parentRow: js.UndefOr[TableRowLoadOptions] = js.native
  /**
    *
    * Gets the parent table of the cell.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTable: js.UndefOr[TableLoadOptions] = js.native
  /**
    *
    * Gets the index of the cell's row in the table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var rowIndex: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the shading color of the cell. Color is specified in "#RRGGBB" format or by using the color name.
    *
    * [Api set: WordApi 1.3]
    */
  var shadingColor: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets and sets the text of the cell.
    *
    * [Api set: WordApi 1.3]
    */
  var value: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets and sets the vertical alignment of the cell. The value can be 'Top', 'Center', or 'Bottom'.
    *
    * [Api set: WordApi 1.3]
    */
  var verticalAlignment: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the width of the cell in points. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var width: js.UndefOr[Boolean] = js.native
}

