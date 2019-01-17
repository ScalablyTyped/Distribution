package typings
package atOracleOraclejetLib.ojdatagridMod.ojDataGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait CurrentCell[K] extends js.Object {
  var axis: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.column | atOracleOraclejetLib.atOracleOraclejetLibStrings.columnEnd | atOracleOraclejetLib.atOracleOraclejetLibStrings.row | atOracleOraclejetLib.atOracleOraclejetLibStrings.rowEnd
  ] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
  var indexes: js.UndefOr[atOracleOraclejetLib.Anon_ColumnRow] = js.undefined
  var key: js.UndefOr[js.Any] = js.undefined
  var keys: js.UndefOr[atOracleOraclejetLib.Anon_ColumnRowK[K]] = js.undefined
  var level: js.UndefOr[scala.Double] = js.undefined
  var `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.cell | atOracleOraclejetLib.atOracleOraclejetLibStrings.header | atOracleOraclejetLib.atOracleOraclejetLibStrings.label
}

