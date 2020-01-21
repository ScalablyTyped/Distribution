package typings.oracleOraclejet

import typings.oracleOraclejet.ojtableMod.ojTable.RowSelectionEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndIndexEndKeyAnonRowAnonRowK[K] extends RowSelectionEnd[K] {
  var endIndex: js.UndefOr[AnonRow] = js.undefined
  var endKey: AnonRowK[K]
}

object AnonEndIndexEndKeyAnonRowAnonRowK {
  @scala.inline
  def apply[K](endKey: AnonRowK[K], endIndex: AnonRow = null): AnonEndIndexEndKeyAnonRowAnonRowK[K] = {
    val __obj = js.Dynamic.literal(endKey = endKey.asInstanceOf[js.Any])
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEndIndexEndKeyAnonRowAnonRowK[K]]
  }
}

