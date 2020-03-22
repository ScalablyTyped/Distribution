package typings.oracleOraclejet

import typings.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStartIndexStartKey[K] extends ColumnSelectionStart[K] {
  var startIndex: js.UndefOr[Anon20] = js.undefined
  var startKey: Anon21[K]
}

object AnonStartIndexStartKey {
  @scala.inline
  def apply[K](startKey: Anon21[K], startIndex: Anon20 = null): AnonStartIndexStartKey[K] = {
    val __obj = js.Dynamic.literal(startKey = startKey.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStartIndexStartKey[K]]
  }
}

