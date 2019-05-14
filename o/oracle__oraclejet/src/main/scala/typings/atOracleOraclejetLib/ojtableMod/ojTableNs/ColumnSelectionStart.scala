package typings
package atOracleOraclejetLib.ojtableMod.ojTableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ColumnSelectionStart[K] extends js.Object {
  var startIndex: js.UndefOr[atOracleOraclejetLib.Anon_ColumnNumber] = js.undefined
  var startKey: js.UndefOr[atOracleOraclejetLib.Anon_ColumnK[K]] = js.undefined
}

object ColumnSelectionStart {
  @scala.inline
  def apply[K](
    startIndex: atOracleOraclejetLib.Anon_ColumnNumber = null,
    startKey: atOracleOraclejetLib.Anon_ColumnK[K] = null
  ): ColumnSelectionStart[K] = {
    val __obj = js.Dynamic.literal()
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex)
    if (startKey != null) __obj.updateDynamic("startKey")(startKey)
    __obj.asInstanceOf[ColumnSelectionStart[K]]
  }
}

