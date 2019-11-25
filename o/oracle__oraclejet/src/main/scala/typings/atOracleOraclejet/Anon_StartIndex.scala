package typings.atOracleOraclejet

import typings.atOracleOraclejet.ojtableMod.ojTable.ColumnSelectionStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StartIndex[K] extends ColumnSelectionStart[K] {
  var startIndex: Anon_ColumnNumber
  var startKey: js.UndefOr[Anon_ColumnK[K]] = js.undefined
}

object Anon_StartIndex {
  @scala.inline
  def apply[K](startIndex: Anon_ColumnNumber, startKey: Anon_ColumnK[K] = null): Anon_StartIndex[K] = {
    val __obj = js.Dynamic.literal(startIndex = startIndex.asInstanceOf[js.Any])
    if (startKey != null) __obj.updateDynamic("startKey")(startKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_StartIndex[K]]
  }
}

