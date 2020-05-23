package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartKey[K] extends ColumnSelectionStart[K] {
  var startIndex: `20`
  var startKey: js.UndefOr[`21`[K]] = js.undefined
}

object StartKey {
  @scala.inline
  def apply[K](startIndex: `20`, startKey: `21`[K] = null): StartKey[K] = {
    val __obj = js.Dynamic.literal(startIndex = startIndex.asInstanceOf[js.Any])
    if (startKey != null) __obj.updateDynamic("startKey")(startKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartKey[K]]
  }
}

