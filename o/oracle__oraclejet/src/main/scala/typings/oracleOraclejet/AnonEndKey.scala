package typings.oracleOraclejet

import typings.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndKey[K] extends ColumnSelectionEnd[K] {
  var endIndex: js.UndefOr[Anon20] = js.undefined
  var endKey: Anon21[K]
}

object AnonEndKey {
  @scala.inline
  def apply[K](endKey: Anon21[K], endIndex: Anon20 = null): AnonEndKey[K] = {
    val __obj = js.Dynamic.literal(endKey = endKey.asInstanceOf[js.Any])
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEndKey[K]]
  }
}

