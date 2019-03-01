package typings
package atOracleOraclejetLib.ojdatagridMod.ojDataGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait LabelContext[K, D] extends js.Object {
  var axis: atOracleOraclejetLib.atOracleOraclejetLibStrings.column | atOracleOraclejetLib.atOracleOraclejetLibStrings.columnEnd | atOracleOraclejetLib.atOracleOraclejetLibStrings.row | atOracleOraclejetLib.atOracleOraclejetLibStrings.rowEnd
  var componentElement: stdLib.Element
  var datasource: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
  var key: K
  var level: scala.Double
  var parentElement: stdLib.Element
}

object LabelContext {
  @scala.inline
  def apply[K, D](
    axis: atOracleOraclejetLib.atOracleOraclejetLibStrings.column | atOracleOraclejetLib.atOracleOraclejetLibStrings.columnEnd | atOracleOraclejetLib.atOracleOraclejetLibStrings.row | atOracleOraclejetLib.atOracleOraclejetLibStrings.rowEnd,
    componentElement: stdLib.Element,
    key: K,
    level: scala.Double,
    parentElement: stdLib.Element,
    datasource: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D] = null
  ): LabelContext[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    __obj.updateDynamic("componentElement")(componentElement)
    __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("parentElement")(parentElement)
    if (datasource != null) __obj.updateDynamic("datasource")(datasource)
    __obj.asInstanceOf[LabelContext[K, D]]
  }
}

