package typings
package officeDashJsLib.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the TableCell object, for use in "tableCell.set({ ... })". */

trait TableCellUpdateData extends js.Object {
  /**
              *
              * Gets the body object of the cell.
              *
              * [Api set: WordApi 1.3]
              */
  var body: js.UndefOr[BodyUpdateData] = js.undefined
  /**
               *
               * Gets and sets the width of the cell's column in points. This is applicable to uniform tables.
               *
               * [Api set: WordApi 1.3]
               */
  var columnWidth: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Gets and sets the horizontal alignment of the cell. The value can be 'Left', 'Centered', 'Right', or 'Justified'.
               *
               * [Api set: WordApi 1.3]
               */
  var horizontalAlignment: js.UndefOr[
    officeDashJsLib.WordNs.Alignment | officeDashJsLib.officeDashJsLibStrings.Mixed | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Centered | officeDashJsLib.officeDashJsLibStrings.Right | officeDashJsLib.officeDashJsLibStrings.Justified
  ] = js.undefined
  /**
               *
               * Gets or sets the shading color of the cell. Color is specified in "#RRGGBB" format or by using the color name.
               *
               * [Api set: WordApi 1.3]
               */
  var shadingColor: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * Gets and sets the text of the cell.
               *
               * [Api set: WordApi 1.3]
               */
  var value: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * Gets and sets the vertical alignment of the cell. The value can be 'Top', 'Center', or 'Bottom'.
               *
               * [Api set: WordApi 1.3]
               */
  var verticalAlignment: js.UndefOr[
    officeDashJsLib.WordNs.VerticalAlignment | officeDashJsLib.officeDashJsLibStrings.Mixed | officeDashJsLib.officeDashJsLibStrings.Top | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.Bottom
  ] = js.undefined
}

