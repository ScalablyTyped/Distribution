package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.RowSelectionStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartIndexRowNumber[K] extends RowSelectionStart[K] {
  var startIndex: RowNumber
  var startKey: js.UndefOr[`23`[K]] = js.undefined
}

object StartIndexRowNumber {
  @scala.inline
  def apply[K](startIndex: RowNumber, startKey: `23`[K] = null): StartIndexRowNumber[K] = {
    val __obj = js.Dynamic.literal(startIndex = startIndex.asInstanceOf[js.Any])
    if (startKey != null) __obj.updateDynamic("startKey")(startKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartIndexRowNumber[K]]
  }
}

