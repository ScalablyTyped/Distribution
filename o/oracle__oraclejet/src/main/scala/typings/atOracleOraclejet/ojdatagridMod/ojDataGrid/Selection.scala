package typings.atOracleOraclejet.ojdatagridMod.ojDataGrid

import typings.atOracleOraclejet.Anon_ColumnRowKOptional
import typings.atOracleOraclejet.Anon_ColumnRowNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait Selection[K] extends js.Object {
  var endIndex: js.UndefOr[Anon_ColumnRowNumber] = js.undefined
  var endKey: js.UndefOr[Anon_ColumnRowKOptional[K]] = js.undefined
  var startIndex: js.UndefOr[Anon_ColumnRowNumber] = js.undefined
  var startKey: js.UndefOr[Anon_ColumnRowKOptional[K]] = js.undefined
}

object Selection {
  @scala.inline
  def apply[K](
    endIndex: Anon_ColumnRowNumber = null,
    endKey: Anon_ColumnRowKOptional[K] = null,
    startIndex: Anon_ColumnRowNumber = null,
    startKey: Anon_ColumnRowKOptional[K] = null
  ): Selection[K] = {
    val __obj = js.Dynamic.literal()
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex)
    if (endKey != null) __obj.updateDynamic("endKey")(endKey)
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex)
    if (startKey != null) __obj.updateDynamic("startKey")(startKey)
    __obj.asInstanceOf[Selection[K]]
  }
}

