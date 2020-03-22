package typings.oracleOraclejet

import typings.oracleOraclejet.ojtableMod.ojTable.RowSelectionStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStartKeyAnon23[K] extends RowSelectionStart[K] {
  var startIndex: js.UndefOr[AnonRowNumber] = js.undefined
  var startKey: Anon23[K]
}

object AnonStartKeyAnon23 {
  @scala.inline
  def apply[K](startKey: Anon23[K], startIndex: AnonRowNumber = null): AnonStartKeyAnon23[K] = {
    val __obj = js.Dynamic.literal(startKey = startKey.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStartKeyAnon23[K]]
  }
}

