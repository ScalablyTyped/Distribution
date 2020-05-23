package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowK[K] extends js.Object {
  var column: js.UndefOr[K] = js.undefined
  var row: K
}

object RowK {
  @scala.inline
  def apply[K](row: K, column: K = null): RowK[K] = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowK[K]]
  }
}

