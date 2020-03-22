package typings.oracleOraclejet

import typings.oracleOraclejet.ojtableMod.ojTable.RowSelectionStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStartIndexAnonRowNumber[K] extends RowSelectionStart[K] {
  var startIndex: AnonRowNumber
  var startKey: js.UndefOr[Anon23[K]] = js.undefined
}

object AnonStartIndexAnonRowNumber {
  @scala.inline
  def apply[K](startIndex: AnonRowNumber, startKey: Anon23[K] = null): AnonStartIndexAnonRowNumber[K] = {
    val __obj = js.Dynamic.literal(startIndex = startIndex.asInstanceOf[js.Any])
    if (startKey != null) __obj.updateDynamic("startKey")(startKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStartIndexAnonRowNumber[K]]
  }
}

