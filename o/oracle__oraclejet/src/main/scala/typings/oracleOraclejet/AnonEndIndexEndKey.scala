package typings.oracleOraclejet

import typings.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndIndexEndKey[K] extends ColumnSelectionEnd[K] {
  var endIndex: js.UndefOr[AnonColumnNumber] = js.undefined
  var endKey: AnonColumnK[K]
}

object AnonEndIndexEndKey {
  @scala.inline
  def apply[K](endKey: AnonColumnK[K], endIndex: AnonColumnNumber = null): AnonEndIndexEndKey[K] = {
    val __obj = js.Dynamic.literal(endKey = endKey.asInstanceOf[js.Any])
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEndIndexEndKey[K]]
  }
}

