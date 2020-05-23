package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.disable
import typings.oracleOraclejet.oracleOraclejetStrings.enable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Row extends js.Object {
  var row: enable | disable
}

object Row {
  @scala.inline
  def apply(row: enable | disable): Row = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[Row]
  }
}

