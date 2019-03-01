package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StartIndexStartKeyAnonRowAnonRowK[K]
  extends atOracleOraclejetLib.ojtableMod.ojTableNs.RowSelectionStart[K] {
  var startIndex: js.UndefOr[Anon_Row] = js.undefined
  var startKey: Anon_RowK[K]
}

object Anon_StartIndexStartKeyAnonRowAnonRowK {
  @scala.inline
  def apply[K](startKey: Anon_RowK[K], startIndex: Anon_Row = null): Anon_StartIndexStartKeyAnonRowAnonRowK[K] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("startKey")(startKey)
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex)
    __obj.asInstanceOf[Anon_StartIndexStartKeyAnonRowAnonRowK[K]]
  }
}

