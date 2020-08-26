package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Asset extends js.Object {
  var asset: js.UndefOr[Double] = js.native
  var autoPlay: js.UndefOr[Boolean] = js.native
  var duration: js.UndefOr[Double] = js.native
  var loop: js.UndefOr[Boolean] = js.native
  var overlap: js.UndefOr[Boolean] = js.native
  var pitch: js.UndefOr[Double] = js.native
  var startTime: js.UndefOr[Double] = js.native
  var volume: js.UndefOr[Double] = js.native
}

object Asset {
  @scala.inline
  def apply(): Asset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Asset]
  }
  @scala.inline
  implicit class AssetOps[Self <: Asset] (val x: Self) extends AnyVal {
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
    def setAsset(value: Double): Self = this.set("asset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsset: Self = this.set("asset", js.undefined)
    @scala.inline
    def setAutoPlay(value: Boolean): Self = this.set("autoPlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPlay: Self = this.set("autoPlay", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    @scala.inline
    def setOverlap(value: Boolean): Self = this.set("overlap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlap: Self = this.set("overlap", js.undefined)
    @scala.inline
    def setPitch(value: Double): Self = this.set("pitch", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePitch: Self = this.set("pitch", js.undefined)
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
  }
  
}

