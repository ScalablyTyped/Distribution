package typings
package meteorDashCollectionDashHooksLib.CollectionHooksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookOptionValue extends js.Object {
  var fetchPrevious: js.UndefOr[scala.Boolean] = js.undefined
}

object HookOptionValue {
  @scala.inline
  def apply(fetchPrevious: js.UndefOr[scala.Boolean] = js.undefined): HookOptionValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fetchPrevious)) __obj.updateDynamic("fetchPrevious")(fetchPrevious)
    __obj.asInstanceOf[HookOptionValue]
  }
}

