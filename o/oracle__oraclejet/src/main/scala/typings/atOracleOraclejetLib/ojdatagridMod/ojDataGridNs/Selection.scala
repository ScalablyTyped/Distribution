package typings
package atOracleOraclejetLib.ojdatagridMod.ojDataGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait Selection[K] extends js.Object {
  var endIndex: js.UndefOr[atOracleOraclejetLib.Anon_ColumnRowNumber] = js.undefined
  var endKey: js.UndefOr[atOracleOraclejetLib.Anon_ColumnRowKOptional[K]] = js.undefined
  var startIndex: js.UndefOr[atOracleOraclejetLib.Anon_ColumnRowNumber] = js.undefined
  var startKey: js.UndefOr[atOracleOraclejetLib.Anon_ColumnRowKOptional[K]] = js.undefined
}

object Selection {
  @scala.inline
  def apply[K](
    endIndex: atOracleOraclejetLib.Anon_ColumnRowNumber = null,
    endKey: atOracleOraclejetLib.Anon_ColumnRowKOptional[K] = null,
    startIndex: atOracleOraclejetLib.Anon_ColumnRowNumber = null,
    startKey: atOracleOraclejetLib.Anon_ColumnRowKOptional[K] = null
  ): Selection[K] = {
    val __obj = js.Dynamic.literal()
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex)
    if (endKey != null) __obj.updateDynamic("endKey")(endKey)
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex)
    if (startKey != null) __obj.updateDynamic("startKey")(startKey)
    __obj.asInstanceOf[Selection[K]]
  }
}

