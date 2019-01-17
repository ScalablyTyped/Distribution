package typings
package atOracleOraclejetLib.ojdatagridMod.ojDataGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait CellContext[K, D] extends js.Object {
  var cell: D
  var componentElement: stdLib.Element
  var data: D
  var datasource: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
  var extents: atOracleOraclejetLib.Anon_ColumnRow
  var indexes: atOracleOraclejetLib.Anon_ColumnRow
  var keys: atOracleOraclejetLib.Anon_ColumnRowK[K]
  var mode: atOracleOraclejetLib.atOracleOraclejetLibStrings.edit | atOracleOraclejetLib.atOracleOraclejetLibStrings.navigation
  var parentElement: stdLib.Element
}

