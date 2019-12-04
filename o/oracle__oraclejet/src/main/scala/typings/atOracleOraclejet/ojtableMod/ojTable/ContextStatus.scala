package typings.atOracleOraclejet.ojtableMod.ojTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ContextStatus[K] extends js.Object {
  var currentRow: CurrentRow[K]
  var rowIndex: Double
  var rowKey: K
}

object ContextStatus {
  @scala.inline
  def apply[K](currentRow: CurrentRow[K], rowIndex: Double, rowKey: K): ContextStatus[K] = {
    val __obj = js.Dynamic.literal(currentRow = currentRow.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowKey = rowKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContextStatus[K]]
  }
}

