package typings.atOracleOraclejet

import typings.atOracleOraclejet.ojtableMod.ojTable.RowSelectionEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndIndexEndKeyAnonRowAnonRowK[K] extends RowSelectionEnd[K] {
  var endIndex: js.UndefOr[Anon_Row] = js.undefined
  var endKey: Anon_RowK[K]
}

object Anon_EndIndexEndKeyAnonRowAnonRowK {
  @scala.inline
  def apply[K](endKey: Anon_RowK[K], endIndex: Anon_Row = null): Anon_EndIndexEndKeyAnonRowAnonRowK[K] = {
    val __obj = js.Dynamic.literal(endKey = endKey.asInstanceOf[js.Any])
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EndIndexEndKeyAnonRowAnonRowK[K]]
  }
}

