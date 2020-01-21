package typings.oracleOraclejet

import typings.oracleOraclejet.oracleOraclejetStrings.`oj-table-cell`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnIndexKey extends js.Object {
  var columnIndex: Double
  var key: String
  var rowIndex: Double
  var subId: `oj-table-cell`
}

object AnonColumnIndexKey {
  @scala.inline
  def apply(columnIndex: Double, key: String, rowIndex: Double, subId: `oj-table-cell`): AnonColumnIndexKey = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColumnIndexKey]
  }
}

