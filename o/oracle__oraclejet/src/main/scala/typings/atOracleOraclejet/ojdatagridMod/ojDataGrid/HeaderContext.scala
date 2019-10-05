package typings.atOracleOraclejet.ojdatagridMod.ojDataGrid

import typings.atOracleOraclejet.atOracleOraclejetStrings.column
import typings.atOracleOraclejet.atOracleOraclejetStrings.columnEnd
import typings.atOracleOraclejet.atOracleOraclejetStrings.row
import typings.atOracleOraclejet.atOracleOraclejetStrings.rowEnd
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait HeaderContext[K, D] extends js.Object {
  var axis: column | columnEnd | row | rowEnd
  var componentElement: Element
  var data: D
  var datasource: (DataProvider[K, D]) | Null
  var depth: Double
  var extent: Double
  var index: Double
  var key: K
  var level: Double
  var parentElement: Element
}

object HeaderContext {
  @scala.inline
  def apply[K, D](
    axis: column | columnEnd | row | rowEnd,
    componentElement: Element,
    data: D,
    depth: Double,
    extent: Double,
    index: Double,
    key: K,
    level: Double,
    parentElement: Element,
    datasource: DataProvider[K, D] = null
  ): HeaderContext[K, D] = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], componentElement = componentElement, data = data.asInstanceOf[js.Any], depth = depth, extent = extent, index = index, key = key.asInstanceOf[js.Any], level = level, parentElement = parentElement)
    if (datasource != null) __obj.updateDynamic("datasource")(datasource)
    __obj.asInstanceOf[HeaderContext[K, D]]
  }
}

