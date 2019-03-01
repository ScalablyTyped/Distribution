package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndIndexEndKey[K]
  extends atOracleOraclejetLib.ojtableMod.ojTableNs.ColumnSelectionEnd[K] {
  var endIndex: js.UndefOr[Anon_ColumnNumber] = js.undefined
  var endKey: Anon_ColumnK[K]
}

object Anon_EndIndexEndKey {
  @scala.inline
  def apply[K](endKey: Anon_ColumnK[K], endIndex: Anon_ColumnNumber = null): Anon_EndIndexEndKey[K] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endKey")(endKey)
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex)
    __obj.asInstanceOf[Anon_EndIndexEndKey[K]]
  }
}

