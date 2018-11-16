package typings
package officeDashJsLib.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "tableRow.toJSON()". */

trait TableRowData extends js.Object {
  /**
               *
               * Gets the number of cells in the row. Read-only.
               *
               * [Api set: WordApi 1.3]
               */
  var cellCount: js.UndefOr[scala.Double] = js.undefined
  /**
              *
              * Gets cells. Read-only.
              *
              * [Api set: WordApi 1.3]
              */
  var cells: js.UndefOr[js.Array[TableCellData]] = js.undefined
  /**
              *
              * Gets the font. Use this to get and set font name, size, color, and other properties. Read-only.
              *
              * [Api set: WordApi 1.3]
              */
  var font: js.UndefOr[FontData] = js.undefined
  /**
               *
               * Gets and sets the horizontal alignment of every cell in the row. The value can be 'Left', 'Centered', 'Right', or 'Justified'.
               *
               * [Api set: WordApi 1.3]
               */
  var horizontalAlignment: js.UndefOr[
    officeDashJsLib.WordNs.Alignment | officeDashJsLib.officeDashJsLibStrings.Mixed | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Centered | officeDashJsLib.officeDashJsLibStrings.Right | officeDashJsLib.officeDashJsLibStrings.Justified
  ] = js.undefined
  /**
               *
               * Checks whether the row is a header row. Read-only. To set the number of header rows, use HeaderRowCount on the Table object.
               *
               * [Api set: WordApi 1.3]
               */
  var isHeader: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * Gets parent table. Read-only.
              *
              * [Api set: WordApi 1.3]
              */
  var parentTable: js.UndefOr[TableData] = js.undefined
  /**
               *
               * Gets and sets the preferred height of the row in points.
               *
               * [Api set: WordApi 1.3]
               */
  var preferredHeight: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Gets the index of the row in its parent table. Read-only.
               *
               * [Api set: WordApi 1.3]
               */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Gets and sets the shading color. Color is specified in "#RRGGBB" format or by using the color name.
               *
               * [Api set: WordApi 1.3]
               */
  var shadingColor: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * Gets and sets the text values in the row, as a 2D Javascript array.
               *
               * [Api set: WordApi 1.3]
               */
  var values: js.UndefOr[js.Array[js.Array[java.lang.String]]] = js.undefined
  /**
               *
               * Gets and sets the vertical alignment of the cells in the row. The value can be 'Top', 'Center', or 'Bottom'.
               *
               * [Api set: WordApi 1.3]
               */
  var verticalAlignment: js.UndefOr[
    officeDashJsLib.WordNs.VerticalAlignment | officeDashJsLib.officeDashJsLibStrings.Mixed | officeDashJsLib.officeDashJsLibStrings.Top | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.Bottom
  ] = js.undefined
}

