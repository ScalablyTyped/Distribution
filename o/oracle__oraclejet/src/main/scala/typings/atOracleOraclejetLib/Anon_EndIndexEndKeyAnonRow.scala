package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndIndexEndKeyAnonRow[K]
  extends atOracleOraclejetLib.ojtableMod.ojTableNs.RowSelectionEnd[K] {
  var endIndex: Anon_Row
  var endKey: js.UndefOr[Anon_RowK[K]] = js.undefined
}

object Anon_EndIndexEndKeyAnonRow {
  @scala.inline
  def apply[K](endIndex: Anon_Row, endKey: Anon_RowK[K] = null): Anon_EndIndexEndKeyAnonRow[K] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endIndex")(endIndex)
    if (endKey != null) __obj.updateDynamic("endKey")(endKey)
    __obj.asInstanceOf[Anon_EndIndexEndKeyAnonRow[K]]
  }
}

