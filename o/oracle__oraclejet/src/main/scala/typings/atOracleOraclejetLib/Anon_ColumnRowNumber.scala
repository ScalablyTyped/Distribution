package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnRowNumber extends js.Object {
  var column: js.UndefOr[scala.Double] = js.undefined
  var row: scala.Double
}

object Anon_ColumnRowNumber {
  @scala.inline
  def apply(row: scala.Double, column: scala.Int | scala.Double = null): Anon_ColumnRowNumber = {
    val __obj = js.Dynamic.literal(row = row)
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColumnRowNumber]
  }
}

