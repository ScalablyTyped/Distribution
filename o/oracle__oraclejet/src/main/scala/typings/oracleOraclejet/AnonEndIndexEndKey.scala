package typings.oracleOraclejet

import typings.oracleOraclejet.ojtableMod.ojTable.RowSelectionEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndIndexEndKey[K] extends RowSelectionEnd[K] {
  var endIndex: AnonRowNumber
  var endKey: js.UndefOr[Anon23[K]] = js.undefined
}

object AnonEndIndexEndKey {
  @scala.inline
  def apply[K](endIndex: AnonRowNumber, endKey: Anon23[K] = null): AnonEndIndexEndKey[K] = {
    val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any])
    if (endKey != null) __obj.updateDynamic("endKey")(endKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEndIndexEndKey[K]]
  }
}

