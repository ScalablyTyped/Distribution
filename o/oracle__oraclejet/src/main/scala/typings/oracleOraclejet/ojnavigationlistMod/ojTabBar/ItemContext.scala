package typings.oracleOraclejet.ojnavigationlistMod.ojTabBar

import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ItemContext[K, D] extends js.Object {
  var componentElement: Element
  var data: D
  var datasource: js.UndefOr[DataProvider[K, D]] = js.undefined
  var index: Double
  var key: K
  var parentElement: Element
}

object ItemContext {
  @scala.inline
  def apply[K, D](
    componentElement: Element,
    data: D,
    index: Double,
    key: K,
    parentElement: Element,
    datasource: DataProvider[K, D] = null
  ): ItemContext[K, D] = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any])
    if (datasource != null) __obj.updateDynamic("datasource")(datasource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemContext[K, D]]
  }
}

