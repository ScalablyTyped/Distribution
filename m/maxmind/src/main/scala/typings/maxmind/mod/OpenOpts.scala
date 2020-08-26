package typings.maxmind.mod

import typings.maxmind.anon.Max
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenOpts extends js.Object {
  var cache: js.UndefOr[Max] = js.native
  var watchForUpdates: js.UndefOr[Boolean] = js.native
  var watchForUpdatesHook: js.UndefOr[Callback] = js.native
  var watchForUpdatesNonPersistent: js.UndefOr[Boolean] = js.native
}

object OpenOpts {
  @scala.inline
  def apply(): OpenOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenOpts]
  }
  @scala.inline
  implicit class OpenOptsOps[Self <: OpenOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCache(value: Max): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setWatchForUpdates(value: Boolean): Self = this.set("watchForUpdates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatchForUpdates: Self = this.set("watchForUpdates", js.undefined)
    @scala.inline
    def setWatchForUpdatesHook(value: () => Unit): Self = this.set("watchForUpdatesHook", js.Any.fromFunction0(value))
    @scala.inline
    def deleteWatchForUpdatesHook: Self = this.set("watchForUpdatesHook", js.undefined)
    @scala.inline
    def setWatchForUpdatesNonPersistent(value: Boolean): Self = this.set("watchForUpdatesNonPersistent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatchForUpdatesNonPersistent: Self = this.set("watchForUpdatesNonPersistent", js.undefined)
  }
  
}

