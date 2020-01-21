package typings.oracleOraclejet

import typings.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStartIndex[K] extends ColumnSelectionStart[K] {
  var startIndex: AnonColumnNumber
  var startKey: js.UndefOr[AnonColumnK[K]] = js.undefined
}

object AnonStartIndex {
  @scala.inline
  def apply[K](startIndex: AnonColumnNumber, startKey: AnonColumnK[K] = null): AnonStartIndex[K] = {
    val __obj = js.Dynamic.literal(startIndex = startIndex.asInstanceOf[js.Any])
    if (startKey != null) __obj.updateDynamic("startKey")(startKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStartIndex[K]]
  }
}

