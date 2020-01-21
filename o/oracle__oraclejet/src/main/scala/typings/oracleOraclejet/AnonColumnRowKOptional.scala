package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnRowKOptional[K] extends js.Object {
  var column: js.UndefOr[K] = js.undefined
  var row: K
}

object AnonColumnRowKOptional {
  @scala.inline
  def apply[K](row: K, column: K = null): AnonColumnRowKOptional[K] = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumnRowKOptional[K]]
  }
}

