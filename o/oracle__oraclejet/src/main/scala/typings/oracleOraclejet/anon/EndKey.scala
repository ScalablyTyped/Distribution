package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndKey[K] extends ColumnSelectionEnd[K] {
  var endIndex: js.UndefOr[`20`] = js.undefined
  var endKey: `21`[K]
}

object EndKey {
  @scala.inline
  def apply[K](endKey: `21`[K], endIndex: `20` = null): EndKey[K] = {
    val __obj = js.Dynamic.literal(endKey = endKey.asInstanceOf[js.Any])
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndKey[K]]
  }
}

