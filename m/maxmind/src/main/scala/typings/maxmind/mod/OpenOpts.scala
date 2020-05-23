package typings.maxmind.mod

import typings.maxmind.anon.Max
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenOpts extends js.Object {
  var cache: js.UndefOr[Max] = js.undefined
  var watchForUpdates: js.UndefOr[Boolean] = js.undefined
  var watchForUpdatesHook: js.UndefOr[Callback] = js.undefined
  var watchForUpdatesNonPersistent: js.UndefOr[Boolean] = js.undefined
}

object OpenOpts {
  @scala.inline
  def apply(
    cache: Max = null,
    watchForUpdates: js.UndefOr[Boolean] = js.undefined,
    watchForUpdatesHook: () => Unit = null,
    watchForUpdatesNonPersistent: js.UndefOr[Boolean] = js.undefined
  ): OpenOpts = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (!js.isUndefined(watchForUpdates)) __obj.updateDynamic("watchForUpdates")(watchForUpdates.get.asInstanceOf[js.Any])
    if (watchForUpdatesHook != null) __obj.updateDynamic("watchForUpdatesHook")(js.Any.fromFunction0(watchForUpdatesHook))
    if (!js.isUndefined(watchForUpdatesNonPersistent)) __obj.updateDynamic("watchForUpdatesNonPersistent")(watchForUpdatesNonPersistent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenOpts]
  }
}

