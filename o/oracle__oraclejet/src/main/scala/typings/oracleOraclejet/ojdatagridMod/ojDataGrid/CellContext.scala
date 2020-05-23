package typings.oracleOraclejet.ojdatagridMod.ojDataGrid

import typings.oracleOraclejet.anon.ColumnK
import typings.oracleOraclejet.anon.ColumnRow
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.oracleOraclejetStrings.edit
import typings.oracleOraclejet.oracleOraclejetStrings.navigation
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
  var extents: ColumnRow
  var indexes: ColumnRow
  var keys: ColumnK[K]
  var mode: edit | navigation
  var parentElement: Element
}

object CellContext {
  @scala.inline
  def apply[K, D](
    cell: D,
    componentElement: Element,
    data: D,
    extents: ColumnRow,
    indexes: ColumnRow,
    keys: ColumnK[K],
    mode: edit | navigation,
    parentElement: Element,
    datasource: DataProvider[K, D] = null
  ): CellContext[K, D] = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], extents = extents.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], datasource = datasource.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellContext[K, D]]
  }
}

