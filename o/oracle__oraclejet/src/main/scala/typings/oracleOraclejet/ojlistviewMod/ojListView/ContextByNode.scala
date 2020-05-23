package typings.oracleOraclejet.ojlistviewMod.ojListView

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
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
    if (!js.isUndefined(group)) __obj.updateDynamic("group")(group.get.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextByNode[K]]
  }
}

