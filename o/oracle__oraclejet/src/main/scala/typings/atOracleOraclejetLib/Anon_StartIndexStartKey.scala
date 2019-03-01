package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StartIndexStartKey[K]
  extends atOracleOraclejetLib.ojtableMod.ojTableNs.ColumnSelectionStart[K] {
  var startIndex: js.UndefOr[Anon_ColumnNumber] = js.undefined
  var startKey: Anon_ColumnK[K]
}

object Anon_StartIndexStartKey {
  @scala.inline
  def apply[K](startKey: Anon_ColumnK[K], startIndex: Anon_ColumnNumber = null): Anon_StartIndexStartKey[K] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("startKey")(startKey)
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex)
    __obj.asInstanceOf[Anon_StartIndexStartKey[K]]
  }
}

