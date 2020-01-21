package typings.oracleOraclejet

import typings.oracleOraclejet.ojtableMod.ojTable.RowSelectionStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStartIndexStartKeyAnonRow[K] extends RowSelectionStart[K] {
  var startIndex: AnonRow
  var startKey: js.UndefOr[AnonRowK[K]] = js.undefined
}

object AnonStartIndexStartKeyAnonRow {
  @scala.inline
  def apply[K](startIndex: AnonRow, startKey: AnonRowK[K] = null): AnonStartIndexStartKeyAnonRow[K] = {
    val __obj = js.Dynamic.literal(startIndex = startIndex.asInstanceOf[js.Any])
    if (startKey != null) __obj.updateDynamic("startKey")(startKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStartIndexStartKeyAnonRow[K]]
  }
}

