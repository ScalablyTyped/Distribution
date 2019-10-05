package typings.atOracleOraclejet.ojtableMod.ojTable

import typings.atOracleOraclejet.Anon_Row
import typings.atOracleOraclejet.Anon_RowK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait RowSelectionEnd[K] extends js.Object {
  var endIndex: js.UndefOr[Anon_Row] = js.undefined
  var endKey: js.UndefOr[Anon_RowK[K]] = js.undefined
}

object RowSelectionEnd {
  @scala.inline
  def apply[K](endIndex: Anon_Row = null, endKey: Anon_RowK[K] = null): RowSelectionEnd[K] = {
    val __obj = js.Dynamic.literal()
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex)
    if (endKey != null) __obj.updateDynamic("endKey")(endKey)
    __obj.asInstanceOf[RowSelectionEnd[K]]
  }
}

