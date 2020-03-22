package typings.oracleOraclejet

import typings.oracleOraclejet.oracleOraclejetStrings.multiple
import typings.oracleOraclejet.oracleOraclejetStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon19 extends js.Object {
  var column: single | multiple
  var row: single | multiple
}

object Anon19 {
  @scala.inline
  def apply(column: single | multiple, row: single | multiple): Anon19 = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon19]
  }
}

