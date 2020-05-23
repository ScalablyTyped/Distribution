package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnNumber extends js.Object {
  var column: js.UndefOr[Double] = js.undefined
  var row: Double
}

object ColumnNumber {
  @scala.inline
  def apply(row: Double, column: js.UndefOr[Double] = js.undefined): ColumnNumber = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnNumber]
  }
}

