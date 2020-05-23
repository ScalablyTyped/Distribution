package typings.oracleOraclejet.ojdatagridMod.ojDataGrid

import typings.oracleOraclejet.anon.ColumnNumber
import typings.oracleOraclejet.anon.RowK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait Selection[K] extends js.Object {
  var endIndex: js.UndefOr[ColumnNumber] = js.undefined
  var endKey: js.UndefOr[RowK[K]] = js.undefined
  var startIndex: js.UndefOr[ColumnNumber] = js.undefined
  var startKey: js.UndefOr[RowK[K]] = js.undefined
}

object Selection {
  @scala.inline
  def apply[K](
    endIndex: ColumnNumber = null,
    endKey: RowK[K] = null,
    startIndex: ColumnNumber = null,
    startKey: RowK[K] = null
  ): Selection[K] = {
    val __obj = js.Dynamic.literal()
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    if (endKey != null) __obj.updateDynamic("endKey")(endKey.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (startKey != null) __obj.updateDynamic("startKey")(startKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection[K]]
  }
}

