package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.RowSelectionStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartKey23[K] extends RowSelectionStart[K] {
  var startIndex: js.UndefOr[RowNumber] = js.undefined
  var startKey: `23`[K]
}

object StartKey23 {
  @scala.inline
  def apply[K](startKey: `23`[K], startIndex: RowNumber = null): StartKey23[K] = {
    val __obj = js.Dynamic.literal(startKey = startKey.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartKey23[K]]
  }
}

