package typings
package atOracleOraclejetLib.ojnavigationlistMod.ojTabBarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ItemContext[K, D] extends js.Object {
  var componentElement: stdLib.Element
  var data: D
  var datasource: js.UndefOr[atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]] = js.undefined
  var index: scala.Double
  var key: K
  var parentElement: stdLib.Element
}

object ItemContext {
  @scala.inline
  def apply[K, D](
    componentElement: stdLib.Element,
    data: D,
    index: scala.Double,
    key: K,
    parentElement: stdLib.Element,
    datasource: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D] = null
  ): ItemContext[K, D] = {
    val __obj = js.Dynamic.literal(componentElement = componentElement, data = data.asInstanceOf[js.Any], index = index, key = key.asInstanceOf[js.Any], parentElement = parentElement)
    if (datasource != null) __obj.updateDynamic("datasource")(datasource)
    __obj.asInstanceOf[ItemContext[K, D]]
  }
}

