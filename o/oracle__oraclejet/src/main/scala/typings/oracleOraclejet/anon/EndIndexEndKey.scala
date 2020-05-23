package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.RowSelectionEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndIndexEndKey[K] extends RowSelectionEnd[K] {
  var endIndex: RowNumber
  var endKey: js.UndefOr[`23`[K]] = js.undefined
}

object EndIndexEndKey {
  @scala.inline
  def apply[K](endIndex: RowNumber, endKey: `23`[K] = null): EndIndexEndKey[K] = {
    val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any])
    if (endKey != null) __obj.updateDynamic("endKey")(endKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndIndexEndKey[K]]
  }
}

