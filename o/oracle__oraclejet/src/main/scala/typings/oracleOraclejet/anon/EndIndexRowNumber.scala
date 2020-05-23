package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.RowSelectionEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndIndexRowNumber[K] extends RowSelectionEnd[K] {
  var endIndex: js.UndefOr[RowNumber] = js.undefined
  var endKey: `23`[K]
}

object EndIndexRowNumber {
  @scala.inline
  def apply[K](endKey: `23`[K], endIndex: RowNumber = null): EndIndexRowNumber[K] = {
    val __obj = js.Dynamic.literal(endKey = endKey.asInstanceOf[js.Any])
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndIndexRowNumber[K]]
  }
}

