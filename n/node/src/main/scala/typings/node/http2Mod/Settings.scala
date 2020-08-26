package typings.node.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var enableConnectProtocol: js.UndefOr[Boolean] = js.native
  var enablePush: js.UndefOr[Boolean] = js.native
  var headerTableSize: js.UndefOr[Double] = js.native
  var initialWindowSize: js.UndefOr[Double] = js.native
  var maxConcurrentStreams: js.UndefOr[Double] = js.native
  var maxFrameSize: js.UndefOr[Double] = js.native
  var maxHeaderListSize: js.UndefOr[Double] = js.native
}

object Settings {
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
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
    def setEnableConnectProtocol(value: Boolean): Self = this.set("enableConnectProtocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableConnectProtocol: Self = this.set("enableConnectProtocol", js.undefined)
    @scala.inline
    def setEnablePush(value: Boolean): Self = this.set("enablePush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePush: Self = this.set("enablePush", js.undefined)
    @scala.inline
    def setHeaderTableSize(value: Double): Self = this.set("headerTableSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTableSize: Self = this.set("headerTableSize", js.undefined)
    @scala.inline
    def setInitialWindowSize(value: Double): Self = this.set("initialWindowSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialWindowSize: Self = this.set("initialWindowSize", js.undefined)
    @scala.inline
    def setMaxConcurrentStreams(value: Double): Self = this.set("maxConcurrentStreams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxConcurrentStreams: Self = this.set("maxConcurrentStreams", js.undefined)
    @scala.inline
    def setMaxFrameSize(value: Double): Self = this.set("maxFrameSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFrameSize: Self = this.set("maxFrameSize", js.undefined)
    @scala.inline
    def setMaxHeaderListSize(value: Double): Self = this.set("maxHeaderListSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeaderListSize: Self = this.set("maxHeaderListSize", js.undefined)
  }
  
}

