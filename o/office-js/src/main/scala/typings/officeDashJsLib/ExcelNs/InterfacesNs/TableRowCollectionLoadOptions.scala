package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * Represents a collection of all the rows that are part of the table.
            
             Note that unlike Ranges or Columns, which will adjust if new rows/columns are added before them,
             a TableRow object represent the physical location of the table row, but not the data.
             That is, if the data is sorted or if new rows are added, a table row will continue
             to point at the index for which it was created.
         *
         * [Api set: ExcelApi 1.1]
         */

trait TableRowCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Returns the index number of the row within the rows collection of the table. Zero-indexed. Read-only.
               *
               * [Api set: ExcelApi 1.1]
               */
  var index: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
               *
               * [Api set: ExcelApi 1.1]
               */
  var values: js.UndefOr[scala.Boolean] = js.undefined
}

