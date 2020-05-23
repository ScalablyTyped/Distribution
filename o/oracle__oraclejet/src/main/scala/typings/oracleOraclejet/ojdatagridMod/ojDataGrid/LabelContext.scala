package typings.oracleOraclejet.ojdatagridMod.ojDataGrid

import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.oracleOraclejetStrings.column
import typings.oracleOraclejet.oracleOraclejetStrings.columnEnd
import typings.oracleOraclejet.oracleOraclejetStrings.row
import typings.oracleOraclejet.oracleOraclejetStrings.rowEnd
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
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], datasource = datasource.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelContext[K, D]]
  }
}

