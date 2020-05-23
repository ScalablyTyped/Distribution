package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rows[K, D] extends js.Object {
  var rows: DataTypesDrag[K, D]
}

object Rows {
  @scala.inline
  def apply[K, D](rows: DataTypesDrag[K, D]): Rows[K, D] = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rows[K, D]]
  }
}

