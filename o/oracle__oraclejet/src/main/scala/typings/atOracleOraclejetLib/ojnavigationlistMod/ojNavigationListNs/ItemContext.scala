package typings
package atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ItemContext[K, D] extends js.Object {
  var componentElement: stdLib.Element
  var data: js.Any
  var datasource: js.UndefOr[atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]] = js.undefined
  var index: scala.Double
  var key: js.Any
  var parentElement: stdLib.Element
}

object ItemContext {
  @scala.inline
  def apply[K, D](
    componentElement: stdLib.Element,
    data: js.Any,
    index: scala.Double,
    key: js.Any,
    parentElement: stdLib.Element,
    datasource: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D] = null
  ): ItemContext[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("componentElement")(componentElement)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("parentElement")(parentElement)
    if (datasource != null) __obj.updateDynamic("datasource")(datasource)
    __obj.asInstanceOf[ItemContext[K, D]]
  }
}

