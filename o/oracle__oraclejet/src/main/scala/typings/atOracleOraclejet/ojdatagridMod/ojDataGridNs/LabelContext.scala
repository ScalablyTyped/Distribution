package typings.atOracleOraclejet.ojdatagridMod.ojDataGridNs

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
trait LabelContext[K, D] extends js.Object {
  var axis: column | columnEnd | row | rowEnd
  var componentElement: Element
  var datasource: (DataProvider[K, D]) | Null
  var key: K
  var level: Double
  var parentElement: Element
}

object LabelContext {
  @scala.inline
  def apply[K, D](
    axis: column | columnEnd | row | rowEnd,
    componentElement: Element,
    key: K,
    level: Double,
    parentElement: Element,
    datasource: DataProvider[K, D] = null
  ): LabelContext[K, D] = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], componentElement = componentElement, key = key.asInstanceOf[js.Any], level = level, parentElement = parentElement)
    if (datasource != null) __obj.updateDynamic("datasource")(datasource)
    __obj.asInstanceOf[LabelContext[K, D]]
  }
}

