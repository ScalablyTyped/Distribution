package typings.atOracleOraclejet.ojnavigationlistMod.ojNavigationList

import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ItemContext[K, D] extends js.Object {
  var componentElement: Element
  var data: js.Any
  var datasource: js.UndefOr[DataProvider[K, D]] = js.undefined
  var index: Double
  var key: js.Any
  var parentElement: Element
}

object ItemContext {
  @scala.inline
  def apply[K, D](
    componentElement: Element,
    data: js.Any,
    index: Double,
    key: js.Any,
    parentElement: Element,
    datasource: DataProvider[K, D] = null
  ): ItemContext[K, D] = {
    val __obj = js.Dynamic.literal(componentElement = componentElement, data = data, index = index, key = key, parentElement = parentElement)
    if (datasource != null) __obj.updateDynamic("datasource")(datasource)
    __obj.asInstanceOf[ItemContext[K, D]]
  }
}

