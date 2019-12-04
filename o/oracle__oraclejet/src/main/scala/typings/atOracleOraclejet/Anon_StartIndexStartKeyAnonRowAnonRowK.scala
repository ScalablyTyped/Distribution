package typings.atOracleOraclejet

import typings.atOracleOraclejet.ojtableMod.ojTable.RowSelectionStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StartIndexStartKeyAnonRowAnonRowK[K] extends RowSelectionStart[K] {
  var startIndex: js.UndefOr[Anon_Row] = js.undefined
  var startKey: Anon_RowK[K]
}

object Anon_StartIndexStartKeyAnonRowAnonRowK {
  @scala.inline
  def apply[K](startKey: Anon_RowK[K], startIndex: Anon_Row = null): Anon_StartIndexStartKeyAnonRowAnonRowK[K] = {
    val __obj = js.Dynamic.literal(startKey = startKey.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_StartIndexStartKeyAnonRowAnonRowK[K]]
  }
}

