package typings.atOracleOraclejet

import typings.atOracleOraclejet.ojtableMod.ojTable.ColumnSelectionEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndIndexEndKey[K] extends ColumnSelectionEnd[K] {
  var endIndex: js.UndefOr[Anon_ColumnNumber] = js.undefined
  var endKey: Anon_ColumnK[K]
}

object Anon_EndIndexEndKey {
  @scala.inline
  def apply[K](endKey: Anon_ColumnK[K], endIndex: Anon_ColumnNumber = null): Anon_EndIndexEndKey[K] = {
    val __obj = js.Dynamic.literal(endKey = endKey.asInstanceOf[js.Any])
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EndIndexEndKey[K]]
  }
}

