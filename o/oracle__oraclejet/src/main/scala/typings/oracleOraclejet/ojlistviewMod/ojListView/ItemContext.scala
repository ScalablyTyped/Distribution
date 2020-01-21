package typings.oracleOraclejet.ojlistviewMod.ojListView

import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ItemContext[K, D] extends js.Object {
  var data: D
  var datasource: DataProvider[K, D]
  var depth: js.UndefOr[Double] = js.undefined
  var index: Double
  var key: K
  var leaf: js.UndefOr[Boolean] = js.undefined
  var parentElement: Element
  var parentKey: js.UndefOr[K] = js.undefined
}

object ItemContext {
  @scala.inline
  def apply[K, D](
    data: D,
    datasource: DataProvider[K, D],
    index: Double,
    key: K,
    parentElement: Element,
    depth: Int | Double = null,
    leaf: js.UndefOr[Boolean] = js.undefined,
    parentKey: K = null
  ): ItemContext[K, D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], datasource = datasource.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (!js.isUndefined(leaf)) __obj.updateDynamic("leaf")(leaf.asInstanceOf[js.Any])
    if (parentKey != null) __obj.updateDynamic("parentKey")(parentKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemContext[K, D]]
  }
}

