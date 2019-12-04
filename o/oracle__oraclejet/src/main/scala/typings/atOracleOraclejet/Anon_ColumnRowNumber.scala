package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnRowNumber extends js.Object {
  var column: js.UndefOr[Double] = js.undefined
  var row: Double
}

object Anon_ColumnRowNumber {
  @scala.inline
  def apply(row: Double, column: Int | Double = null): Anon_ColumnRowNumber = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColumnRowNumber]
  }
}

