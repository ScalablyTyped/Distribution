package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "tableColumn.toJSON()". */

trait TableColumnData extends js.Object {
  /**
              *
              * Retrieve the filter applied to the column. Read-only.
              *
              * [Api set: ExcelApi 1.2]
              */
  var filter: js.UndefOr[FilterData] = js.undefined
  /**
               *
               * Returns a unique key that identifies the column within the table. Read-only.
               *
               * [Api set: ExcelApi 1.1]
               */
  var id: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Returns the index number of the column within the columns collection of the table. Zero-indexed. Read-only.
               *
               * [Api set: ExcelApi 1.1]
               */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Represents the name of the table column.
               *
               * [Api set: ExcelApi 1.1 for getting the name; 1.4 for setting it.]
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
               *
               * [Api set: ExcelApi 1.1]
               */
  var values: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
}

