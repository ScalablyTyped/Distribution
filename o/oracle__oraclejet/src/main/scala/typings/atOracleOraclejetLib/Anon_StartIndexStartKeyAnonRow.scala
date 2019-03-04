package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StartIndexStartKeyAnonRow[K]
  extends atOracleOraclejetLib.ojtableMod.ojTableNs.RowSelectionStart[K] {
  var startIndex: Anon_Row
  var startKey: js.UndefOr[Anon_RowK[K]] = js.undefined
}

object Anon_StartIndexStartKeyAnonRow {
  @scala.inline
  def apply[K](startIndex: Anon_Row, startKey: Anon_RowK[K] = null): Anon_StartIndexStartKeyAnonRow[K] = {
    val __obj = js.Dynamic.literal(startIndex = startIndex)
    if (startKey != null) __obj.updateDynamic("startKey")(startKey)
    __obj.asInstanceOf[Anon_StartIndexStartKeyAnonRow[K]]
  }
}

