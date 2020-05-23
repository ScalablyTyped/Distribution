package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndIndex[K] extends ColumnSelectionEnd[K] {
  var endIndex: `20`
  var endKey: js.UndefOr[`21`[K]] = js.undefined
}

object EndIndex {
  @scala.inline
  def apply[K](endIndex: `20`, endKey: `21`[K] = null): EndIndex[K] = {
    val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any])
    if (endKey != null) __obj.updateDynamic("endKey")(endKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndIndex[K]]
  }
}

