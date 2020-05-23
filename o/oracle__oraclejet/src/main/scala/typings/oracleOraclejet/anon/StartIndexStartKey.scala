package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartIndexStartKey[K] extends ColumnSelectionStart[K] {
  var startIndex: js.UndefOr[`20`] = js.undefined
  var startKey: `21`[K]
}

object StartIndexStartKey {
  @scala.inline
  def apply[K](startKey: `21`[K], startIndex: `20` = null): StartIndexStartKey[K] = {
    val __obj = js.Dynamic.literal(startKey = startKey.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartIndexStartKey[K]]
  }
}

