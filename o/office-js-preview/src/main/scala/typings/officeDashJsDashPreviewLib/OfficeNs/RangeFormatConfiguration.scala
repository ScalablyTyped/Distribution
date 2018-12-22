package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Specifies a range and its formatting.
     */

trait RangeFormatConfiguration extends js.Object {
  /**
           * Specifies the range. Example of using Office.Table enum: Office.Table.All. Example of using RangeCoordinates: `{row: 3, column: 4}` specifies 
           * the cell in the 3rd (zero-based) row in the 4th (zero-based) column.
           */
  var cells: Table | RangeCoordinates
  /**
           * Specifies the formatting as key-value pairs. Example: `{borderColor: "white", fontStyle: "bold"}`
           */
  var format: js.Object
}

