package typings
package maxmindLib.maxmindMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenOpts extends js.Object {
  var cache: js.UndefOr[maxmindLib.Anon_Max] = js.undefined
  var watchForUpdates: js.UndefOr[scala.Boolean] = js.undefined
  var watchForUpdatesHook: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var watchForUpdatesNonPersistent: js.UndefOr[scala.Boolean] = js.undefined
}

object OpenOpts {
  @scala.inline
  def apply(
    cache: maxmindLib.Anon_Max = null,
    watchForUpdates: js.UndefOr[scala.Boolean] = js.undefined,
    watchForUpdatesHook: () => scala.Unit = null,
    watchForUpdatesNonPersistent: js.UndefOr[scala.Boolean] = js.undefined
  ): OpenOpts = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (!js.isUndefined(watchForUpdates)) __obj.updateDynamic("watchForUpdates")(watchForUpdates)
    if (watchForUpdatesHook != null) __obj.updateDynamic("watchForUpdatesHook")(js.Any.fromFunction0(watchForUpdatesHook))
    if (!js.isUndefined(watchForUpdatesNonPersistent)) __obj.updateDynamic("watchForUpdatesNonPersistent")(watchForUpdatesNonPersistent)
    __obj.asInstanceOf[OpenOpts]
  }
}

