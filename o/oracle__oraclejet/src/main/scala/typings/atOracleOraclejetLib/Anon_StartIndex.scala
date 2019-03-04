package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StartIndex[K]
  extends atOracleOraclejetLib.ojtableMod.ojTableNs.ColumnSelectionStart[K] {
  var startIndex: Anon_ColumnNumber
  var startKey: js.UndefOr[Anon_ColumnK[K]] = js.undefined
}

object Anon_StartIndex {
  @scala.inline
  def apply[K](startIndex: Anon_ColumnNumber, startKey: Anon_ColumnK[K] = null): Anon_StartIndex[K] = {
    val __obj = js.Dynamic.literal(startIndex = startIndex)
    if (startKey != null) __obj.updateDynamic("startKey")(startKey)
    __obj.asInstanceOf[Anon_StartIndex[K]]
  }
}

