package typings.naudiodon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioOptions extends js.Object {
  var channelCount: js.UndefOr[Double] = js.native
  var deviceId: js.UndefOr[Double] = js.native
  var maxQueue: js.UndefOr[Double] = js.native
  var sampleFormat: js.UndefOr[Double] = js.native
  var sampleRate: js.UndefOr[Double] = js.native
}

object AudioOptions {
  @scala.inline
  def apply(): AudioOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioOptions]
  }
  @scala.inline
  implicit class AudioOptionsOps[Self <: AudioOptions] (val x: Self) extends AnyVal {
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
    def setChannelCount(value: Double): Self = this.set("channelCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelCount: Self = this.set("channelCount", js.undefined)
    @scala.inline
    def setDeviceId(value: Double): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    @scala.inline
    def setMaxQueue(value: Double): Self = this.set("maxQueue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxQueue: Self = this.set("maxQueue", js.undefined)
    @scala.inline
    def setSampleFormat(value: Double): Self = this.set("sampleFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleFormat: Self = this.set("sampleFormat", js.undefined)
    @scala.inline
    def setSampleRate(value: Double): Self = this.set("sampleRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleRate: Self = this.set("sampleRate", js.undefined)
  }
  
}

