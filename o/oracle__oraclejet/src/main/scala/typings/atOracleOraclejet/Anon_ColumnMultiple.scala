package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.multiple
import typings.atOracleOraclejet.atOracleOraclejetStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnMultiple extends js.Object {
  var column: single | multiple
  var row: single | multiple
}

object Anon_ColumnMultiple {
  @scala.inline
  def apply(column: single | multiple, row: single | multiple): Anon_ColumnMultiple = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ColumnMultiple]
  }
}

