package typings.oracleOraclejet

import typings.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStartKey[K] extends ColumnSelectionStart[K] {
  var startIndex: Anon20
  var startKey: js.UndefOr[Anon21[K]] = js.undefined
}

object AnonStartKey {
  @scala.inline
  def apply[K](startIndex: Anon20, startKey: Anon21[K] = null): AnonStartKey[K] = {
    val __obj = js.Dynamic.literal(startIndex = startIndex.asInstanceOf[js.Any])
    if (startKey != null) __obj.updateDynamic("startKey")(startKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStartKey[K]]
  }
}

