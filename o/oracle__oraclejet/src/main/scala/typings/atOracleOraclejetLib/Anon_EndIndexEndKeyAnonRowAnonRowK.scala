package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndIndexEndKeyAnonRowAnonRowK[K]
  extends atOracleOraclejetLib.ojtableMod.ojTableNs.RowSelectionEnd[K] {
  var endIndex: js.UndefOr[Anon_Row] = js.undefined
  var endKey: Anon_RowK[K]
}

object Anon_EndIndexEndKeyAnonRowAnonRowK {
  @scala.inline
  def apply[K](endKey: Anon_RowK[K], endIndex: Anon_Row = null): Anon_EndIndexEndKeyAnonRowAnonRowK[K] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endKey")(endKey)
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex)
    __obj.asInstanceOf[Anon_EndIndexEndKeyAnonRowAnonRowK[K]]
  }
}

