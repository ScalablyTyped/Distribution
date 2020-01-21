package typings.oracleOraclejet

import typings.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndIndex[K] extends ColumnSelectionEnd[K] {
  var endIndex: AnonColumnNumber
  var endKey: js.UndefOr[AnonColumnK[K]] = js.undefined
}

object AnonEndIndex {
  @scala.inline
  def apply[K](endIndex: AnonColumnNumber, endKey: AnonColumnK[K] = null): AnonEndIndex[K] = {
    val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any])
    if (endKey != null) __obj.updateDynamic("endKey")(endKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEndIndex[K]]
  }
}

