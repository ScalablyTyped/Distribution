package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnK[K] extends js.Object {
  var column: K
  var row: K
}

object ColumnK {
  @scala.inline
  def apply[K](column: K, row: K): ColumnK[K] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnK[K]]
  }
}

