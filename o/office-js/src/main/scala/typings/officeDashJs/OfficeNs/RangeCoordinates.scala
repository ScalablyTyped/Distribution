package typings.officeDashJs.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies a cell, or row, or column, by its zero-based row and/or column number. Example: `{row: 3, column: 4}` specifies the cell in the 3rd 
  * (zero-based) row in the 4th (zero-based) column.
  */
trait RangeCoordinates extends js.Object {
  /**
    * The zero-based column of the range. If not specified, all cells, in the row specified by `row` are included.
    */
  var column: js.UndefOr[Double] = js.undefined
  /**
    * The zero-based row of the range. If not specified, all cells, in the column specified by `column` are included.
    */
  var row: js.UndefOr[Double] = js.undefined
}

object RangeCoordinates {
  @scala.inline
  def apply(column: Int | Double = null, row: Int | Double = null): RangeCoordinates = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeCoordinates]
  }
}

