package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.multiple
import typings.oracleOraclejet.oracleOraclejetStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `19` extends js.Object {
  var column: single | multiple
  var row: single | multiple
}

object `19` {
  @scala.inline
  def apply(column: single | multiple, row: single | multiple): `19` = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[`19`]
  }
}

