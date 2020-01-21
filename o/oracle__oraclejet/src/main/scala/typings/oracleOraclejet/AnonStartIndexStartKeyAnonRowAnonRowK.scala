package typings.oracleOraclejet

import typings.oracleOraclejet.ojtableMod.ojTable.RowSelectionStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStartIndexStartKeyAnonRowAnonRowK[K] extends RowSelectionStart[K] {
  var startIndex: js.UndefOr[AnonRow] = js.undefined
  var startKey: AnonRowK[K]
}

object AnonStartIndexStartKeyAnonRowAnonRowK {
  @scala.inline
  def apply[K](startKey: AnonRowK[K], startIndex: AnonRow = null): AnonStartIndexStartKeyAnonRowAnonRowK[K] = {
    val __obj = js.Dynamic.literal(startKey = startKey.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStartIndexStartKeyAnonRowAnonRowK[K]]
  }
}

