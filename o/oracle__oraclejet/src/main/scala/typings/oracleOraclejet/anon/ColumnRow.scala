package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnRow extends js.Object {
  var column: Double
  var row: Double
}

object ColumnRow {
  @scala.inline
  def apply(column: Double, row: Double): ColumnRow = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnRow]
  }
}

