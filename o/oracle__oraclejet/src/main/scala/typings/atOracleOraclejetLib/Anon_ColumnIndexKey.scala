package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnIndexKey extends js.Object {
  var columnIndex: scala.Double
  var key: java.lang.String
  var rowIndex: scala.Double
  var subId: atOracleOraclejetLib.atOracleOraclejetLibStrings.`oj-table-cell`
}

object Anon_ColumnIndexKey {
  @scala.inline
  def apply(
    columnIndex: scala.Double,
    key: java.lang.String,
    rowIndex: scala.Double,
    subId: atOracleOraclejetLib.atOracleOraclejetLibStrings.`oj-table-cell`
  ): Anon_ColumnIndexKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("columnIndex")(columnIndex)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("rowIndex")(rowIndex)
    __obj.updateDynamic("subId")(subId)
    __obj.asInstanceOf[Anon_ColumnIndexKey]
  }
}

