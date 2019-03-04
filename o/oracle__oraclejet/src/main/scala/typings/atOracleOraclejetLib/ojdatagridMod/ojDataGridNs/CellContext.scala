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

object CellContext {
  @scala.inline
  def apply[K, D](
    cell: D,
    componentElement: stdLib.Element,
    data: D,
    extents: atOracleOraclejetLib.Anon_ColumnRow,
    indexes: atOracleOraclejetLib.Anon_ColumnRow,
    keys: atOracleOraclejetLib.Anon_ColumnRowK[K],
    mode: atOracleOraclejetLib.atOracleOraclejetLibStrings.edit | atOracleOraclejetLib.atOracleOraclejetLibStrings.navigation,
    parentElement: stdLib.Element,
    datasource: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D] = null
  ): CellContext[K, D] = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], componentElement = componentElement, data = data.asInstanceOf[js.Any], extents = extents, indexes = indexes, keys = keys, mode = mode.asInstanceOf[js.Any], parentElement = parentElement)
    if (datasource != null) __obj.updateDynamic("datasource")(datasource)
    __obj.asInstanceOf[CellContext[K, D]]
  }
}

