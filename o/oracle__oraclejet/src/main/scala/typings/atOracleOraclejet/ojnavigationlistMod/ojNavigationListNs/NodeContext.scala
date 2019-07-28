package typings.atOracleOraclejet.ojnavigationlistMod.ojNavigationListNs

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait NodeContext[K] extends js.Object {
  var group: Boolean
  var index: Double
  var key: K
  var parent: js.UndefOr[Element] = js.undefined
  var subId: String
}

object NodeContext {
  @scala.inline
  def apply[K](group: Boolean, index: Double, key: K, subId: String, parent: Element = null): NodeContext[K] = {
    val __obj = js.Dynamic.literal(group = group, index = index, key = key.asInstanceOf[js.Any], subId = subId)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[NodeContext[K]]
  }
}

