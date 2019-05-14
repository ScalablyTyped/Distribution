package typings
package atOracleOraclejetLib.ojtableMod.ojTableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait RowSelectionEnd[K] extends js.Object {
  var endIndex: js.UndefOr[atOracleOraclejetLib.Anon_Row] = js.undefined
  var endKey: js.UndefOr[atOracleOraclejetLib.Anon_RowK[K]] = js.undefined
}

object RowSelectionEnd {
  @scala.inline
  def apply[K](endIndex: atOracleOraclejetLib.Anon_Row = null, endKey: atOracleOraclejetLib.Anon_RowK[K] = null): RowSelectionEnd[K] = {
    val __obj = js.Dynamic.literal()
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex)
    if (endKey != null) __obj.updateDynamic("endKey")(endKey)
    __obj.asInstanceOf[RowSelectionEnd[K]]
  }
}

