package typings.oracleOraclejet

import typings.oracleOraclejet.ojtableMod.ojTable.RowSelectionEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndIndexEndKeyAnonRow[K] extends RowSelectionEnd[K] {
  var endIndex: AnonRow
  var endKey: js.UndefOr[AnonRowK[K]] = js.undefined
}

object AnonEndIndexEndKeyAnonRow {
  @scala.inline
  def apply[K](endIndex: AnonRow, endKey: AnonRowK[K] = null): AnonEndIndexEndKeyAnonRow[K] = {
    val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any])
    if (endKey != null) __obj.updateDynamic("endKey")(endKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEndIndexEndKeyAnonRow[K]]
  }
}

