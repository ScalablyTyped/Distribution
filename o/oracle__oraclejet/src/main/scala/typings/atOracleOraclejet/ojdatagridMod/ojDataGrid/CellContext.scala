package typings.atOracleOraclejet.ojdatagridMod.ojDataGrid

import typings.atOracleOraclejet.Anon_ColumnRow
import typings.atOracleOraclejet.Anon_ColumnRowK
import typings.atOracleOraclejet.atOracleOraclejetStrings.edit
import typings.atOracleOraclejet.atOracleOraclejetStrings.navigation
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait CellContext[K, D] extends js.Object {
  var cell: D
  var componentElement: Element
  var data: D
  var datasource: (DataProvider[K, D]) | Null
  var extents: Anon_ColumnRow
  var indexes: Anon_ColumnRow
  var keys: Anon_ColumnRowK[K]
  var mode: edit | navigation
  var parentElement: Element
}

object CellContext {
  @scala.inline
  def apply[K, D](
    cell: D,
    componentElement: Element,
    data: D,
    extents: Anon_ColumnRow,
    indexes: Anon_ColumnRow,
    keys: Anon_ColumnRowK[K],
    mode: edit | navigation,
    parentElement: Element,
    datasource: DataProvider[K, D] = null
  ): CellContext[K, D] = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], extents = extents.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any])
    if (datasource != null) __obj.updateDynamic("datasource")(datasource.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellContext[K, D]]
  }
}

