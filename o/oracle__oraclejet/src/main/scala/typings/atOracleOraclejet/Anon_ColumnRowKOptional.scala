package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnRowKOptional[K] extends js.Object {
  var column: js.UndefOr[K] = js.undefined
  var row: K
}

object Anon_ColumnRowKOptional {
  @scala.inline
  def apply[K](row: K, column: K = null): Anon_ColumnRowKOptional[K] = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColumnRowKOptional[K]]
  }
}

