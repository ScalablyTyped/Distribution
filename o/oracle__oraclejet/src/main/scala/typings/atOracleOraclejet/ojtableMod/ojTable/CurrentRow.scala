package typings.atOracleOraclejet.ojtableMod.ojTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait CurrentRow[K] extends js.Object {
  var rowIndex: js.UndefOr[Double] = js.undefined
  var rowKey: js.UndefOr[K] = js.undefined
}

object CurrentRow {
  @scala.inline
  def apply[K](rowIndex: Int | Double = null, rowKey: K = null): CurrentRow[K] = {
    val __obj = js.Dynamic.literal()
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentRow[K]]
  }
}

