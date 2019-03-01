package typings
package atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait NodeContext[K] extends js.Object {
  var group: scala.Boolean
  var index: scala.Double
  var key: K
  var parent: js.UndefOr[stdLib.Element] = js.undefined
  var subId: java.lang.String
}

object NodeContext {
  @scala.inline
  def apply[K](
    group: scala.Boolean,
    index: scala.Double,
    key: K,
    subId: java.lang.String,
    parent: stdLib.Element = null
  ): NodeContext[K] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("group")(group)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.updateDynamic("subId")(subId)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[NodeContext[K]]
  }
}

