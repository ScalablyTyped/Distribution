package typings.offlineJs

import typings.offlineJs.anon.Delay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OfflineOptions extends js.Object {
  // TODO Should these types be `boolean|Function`?
  // The project documentation is not clear here.
  var checkOnLoad: js.UndefOr[Boolean] = js.native
  var checks: js.UndefOr[OfflineChecks] = js.native
  var game: js.UndefOr[Boolean] = js.native
  var interceptRequests: js.UndefOr[Boolean] = js.native
  var reconnect: Delay = js.native
  var requests: js.UndefOr[Boolean] = js.native
}

object OfflineOptions {
  @scala.inline
  def apply(reconnect: Delay): OfflineOptions = {
    val __obj = js.Dynamic.literal(reconnect = reconnect.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfflineOptions]
  }
  @scala.inline
  implicit class OfflineOptionsOps[Self <: OfflineOptions] (val x: Self) extends AnyVal {
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
    def setReconnect(value: Delay): Self = this.set("reconnect", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckOnLoad(value: Boolean): Self = this.set("checkOnLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckOnLoad: Self = this.set("checkOnLoad", js.undefined)
    @scala.inline
    def setChecks(value: OfflineChecks): Self = this.set("checks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecks: Self = this.set("checks", js.undefined)
    @scala.inline
    def setGame(value: Boolean): Self = this.set("game", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGame: Self = this.set("game", js.undefined)
    @scala.inline
    def setInterceptRequests(value: Boolean): Self = this.set("interceptRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterceptRequests: Self = this.set("interceptRequests", js.undefined)
    @scala.inline
    def setRequests(value: Boolean): Self = this.set("requests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequests: Self = this.set("requests", js.undefined)
  }
  
}

