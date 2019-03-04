package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnMultiple extends js.Object {
  var column: atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple
  var row: atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple
}

object Anon_ColumnMultiple {
  @scala.inline
  def apply(
    column: atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple,
    row: atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple
  ): Anon_ColumnMultiple = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ColumnMultiple]
  }
}

