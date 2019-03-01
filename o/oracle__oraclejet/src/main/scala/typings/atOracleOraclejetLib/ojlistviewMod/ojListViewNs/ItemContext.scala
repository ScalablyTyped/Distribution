package typings
package atOracleOraclejetLib.ojlistviewMod.ojListViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ItemContext[K, D] extends js.Object {
  var data: D
  var datasource: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]
  var depth: js.UndefOr[scala.Double] = js.undefined
  var index: scala.Double
  var key: K
  var leaf: js.UndefOr[scala.Boolean] = js.undefined
  var parentElement: stdLib.Element
  var parentKey: js.UndefOr[K] = js.undefined
}

object ItemContext {
  @scala.inline
  def apply[K, D](
    data: D,
    datasource: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D],
    index: scala.Double,
    key: K,
    parentElement: stdLib.Element,
    depth: scala.Int | scala.Double = null,
    leaf: js.UndefOr[scala.Boolean] = js.undefined,
    parentKey: K = null
  ): ItemContext[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("datasource")(datasource)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.updateDynamic("parentElement")(parentElement)
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (!js.isUndefined(leaf)) __obj.updateDynamic("leaf")(leaf)
    if (parentKey != null) __obj.updateDynamic("parentKey")(parentKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemContext[K, D]]
  }
}

