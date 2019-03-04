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

object HeaderContext {
  @scala.inline
  def apply[K, D](
    axis: atOracleOraclejetLib.atOracleOraclejetLibStrings.column | atOracleOraclejetLib.atOracleOraclejetLibStrings.columnEnd | atOracleOraclejetLib.atOracleOraclejetLibStrings.row | atOracleOraclejetLib.atOracleOraclejetLibStrings.rowEnd,
    componentElement: stdLib.Element,
    data: D,
    depth: scala.Double,
    extent: scala.Double,
    index: scala.Double,
    key: K,
    level: scala.Double,
    parentElement: stdLib.Element,
    datasource: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D] = null
  ): HeaderContext[K, D] = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], componentElement = componentElement, data = data.asInstanceOf[js.Any], depth = depth, extent = extent, index = index, key = key.asInstanceOf[js.Any], level = level, parentElement = parentElement)
    if (datasource != null) __obj.updateDynamic("datasource")(datasource)
    __obj.asInstanceOf[HeaderContext[K, D]]
  }
}

