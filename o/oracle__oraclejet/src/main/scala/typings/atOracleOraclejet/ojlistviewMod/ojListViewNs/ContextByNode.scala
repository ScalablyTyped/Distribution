package typings.atOracleOraclejet.ojlistviewMod.ojListViewNs

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ContextByNode[K] extends js.Object {
  var group: js.UndefOr[Boolean] = js.undefined
  var index: Double
  var key: K
  var parent: js.UndefOr[Element] = js.undefined
  var subId: String
}

object ContextByNode {
  @scala.inline
  def apply[K](
    index: Double,
    key: K,
    subId: String,
    group: js.UndefOr[Boolean] = js.undefined,
    parent: Element = null
  ): ContextByNode[K] = {
    val __obj = js.Dynamic.literal(index = index, key = key.asInstanceOf[js.Any], subId = subId)
    if (!js.isUndefined(group)) __obj.updateDynamic("group")(group)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[ContextByNode[K]]
  }
}

