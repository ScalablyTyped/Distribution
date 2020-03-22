package typings.oracleOraclejet

import typings.oracleOraclejet.ojtableMod.ojTable.RowSelectionEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndIndexAnonRowNumber[K] extends RowSelectionEnd[K] {
  var endIndex: js.UndefOr[AnonRowNumber] = js.undefined
  var endKey: Anon23[K]
}

object AnonEndIndexAnonRowNumber {
  @scala.inline
  def apply[K](endKey: Anon23[K], endIndex: AnonRowNumber = null): AnonEndIndexAnonRowNumber[K] = {
    val __obj = js.Dynamic.literal(endKey = endKey.asInstanceOf[js.Any])
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEndIndexAnonRowNumber[K]]
  }
}

