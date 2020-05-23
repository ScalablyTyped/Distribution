package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.`oj-gantt-taskbar`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowIndex extends js.Object {
  var index: Double
  var rowIndex: Double
  var subId: `oj-gantt-taskbar`
}

object RowIndex {
  @scala.inline
  def apply(index: Double, rowIndex: Double, subId: `oj-gantt-taskbar`): RowIndex = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowIndex]
  }
}

