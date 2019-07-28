package typings.atOracleOraclejet.ojtableMod.ojTableNs

import typings.atOracleOraclejet.Anon_ColumnK
import typings.atOracleOraclejet.Anon_ColumnNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ColumnSelectionEnd[K] extends js.Object {
  var endIndex: js.UndefOr[Anon_ColumnNumber] = js.undefined
  var endKey: js.UndefOr[Anon_ColumnK[K]] = js.undefined
}

object ColumnSelectionEnd {
  @scala.inline
  def apply[K](endIndex: Anon_ColumnNumber = null, endKey: Anon_ColumnK[K] = null): ColumnSelectionEnd[K] = {
    val __obj = js.Dynamic.literal()
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex)
    if (endKey != null) __obj.updateDynamic("endKey")(endKey)
    __obj.asInstanceOf[ColumnSelectionEnd[K]]
  }
}

