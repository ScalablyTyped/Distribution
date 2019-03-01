package typings
package atOracleOraclejetLib.ojlistviewMod.ojListViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ContextByNode[K] extends js.Object {
  var group: js.UndefOr[scala.Boolean] = js.undefined
  var index: scala.Double
  var key: K
  var parent: js.UndefOr[stdLib.Element] = js.undefined
  var subId: java.lang.String
}

object ContextByNode {
  @scala.inline
  def apply[K](
    index: scala.Double,
    key: K,
    subId: java.lang.String,
    group: js.UndefOr[scala.Boolean] = js.undefined,
    parent: stdLib.Element = null
  ): ContextByNode[K] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.updateDynamic("subId")(subId)
    if (!js.isUndefined(group)) __obj.updateDynamic("group")(group)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[ContextByNode[K]]
  }
}

