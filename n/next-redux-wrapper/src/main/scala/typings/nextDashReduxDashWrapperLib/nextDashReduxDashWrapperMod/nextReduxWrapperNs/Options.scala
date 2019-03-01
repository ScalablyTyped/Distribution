package typings
package nextDashReduxDashWrapperLib.nextDashReduxDashWrapperMod.nextReduxWrapperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var deserializeState: js.UndefOr[js.Any] = js.undefined
  var serializeState: js.UndefOr[js.Any] = js.undefined
  var storeKey: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    deserializeState: js.Any = null,
    serializeState: js.Any = null,
    storeKey: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (deserializeState != null) __obj.updateDynamic("deserializeState")(deserializeState)
    if (serializeState != null) __obj.updateDynamic("serializeState")(serializeState)
    if (storeKey != null) __obj.updateDynamic("storeKey")(storeKey)
    __obj.asInstanceOf[Options]
  }
}

