package typings
package atOracleOraclejetLib.ojtableMod.ojTableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ContextStatus[K] extends js.Object {
  var currentRow: CurrentRow[K]
  var rowIndex: scala.Double
  var rowKey: K
}

object ContextStatus {
  @scala.inline
  def apply[K](currentRow: CurrentRow[K], rowIndex: scala.Double, rowKey: K): ContextStatus[K] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currentRow")(currentRow)
    __obj.updateDynamic("rowIndex")(rowIndex)
    __obj.updateDynamic("rowKey")(rowKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextStatus[K]]
  }
}

