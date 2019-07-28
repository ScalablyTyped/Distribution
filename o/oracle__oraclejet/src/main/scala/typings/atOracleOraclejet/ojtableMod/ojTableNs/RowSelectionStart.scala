package typings.atOracleOraclejet.ojtableMod.ojTableNs

import typings.atOracleOraclejet.Anon_Row
import typings.atOracleOraclejet.Anon_RowK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait RowSelectionStart[K] extends js.Object {
  var startIndex: js.UndefOr[Anon_Row] = js.undefined
  var startKey: js.UndefOr[Anon_RowK[K]] = js.undefined
}

object RowSelectionStart {
  @scala.inline
  def apply[K](startIndex: Anon_Row = null, startKey: Anon_RowK[K] = null): RowSelectionStart[K] = {
    val __obj = js.Dynamic.literal()
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex)
    if (startKey != null) __obj.updateDynamic("startKey")(startKey)
    __obj.asInstanceOf[RowSelectionStart[K]]
  }
}

