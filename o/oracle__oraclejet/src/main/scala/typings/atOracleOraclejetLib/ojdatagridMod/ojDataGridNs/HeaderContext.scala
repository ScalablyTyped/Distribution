package typings
package atOracleOraclejetLib.ojdatagridMod.ojDataGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait HeaderContext[K, D] extends js.Object {
  var axis: atOracleOraclejetLib.atOracleOraclejetLibStrings.column | atOracleOraclejetLib.atOracleOraclejetLibStrings.columnEnd | atOracleOraclejetLib.atOracleOraclejetLibStrings.row | atOracleOraclejetLib.atOracleOraclejetLibStrings.rowEnd
  var componentElement: stdLib.Element
  var data: D
  var datasource: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
  var depth: scala.Double
  var extent: scala.Double
  var index: scala.Double
  var key: K
  var level: scala.Double
  var parentElement: stdLib.Element
}

