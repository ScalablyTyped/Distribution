package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Asset extends js.Object {
  var asset: js.UndefOr[Double] = js.undefined
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var overlap: js.UndefOr[Boolean] = js.undefined
  var pitch: js.UndefOr[Double] = js.undefined
  var startTime: js.UndefOr[Double] = js.undefined
  var volume: js.UndefOr[Double] = js.undefined
}

object Asset {
  @scala.inline
  def apply(
    asset: js.UndefOr[Double] = js.undefined,
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    overlap: js.UndefOr[Boolean] = js.undefined,
    pitch: js.UndefOr[Double] = js.undefined,
    startTime: js.UndefOr[Double] = js.undefined,
    volume: js.UndefOr[Double] = js.undefined
  ): Asset = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asset)) __obj.updateDynamic("asset")(asset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overlap)) __obj.updateDynamic("overlap")(overlap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pitch)) __obj.updateDynamic("pitch")(pitch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startTime)) __obj.updateDynamic("startTime")(startTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(volume)) __obj.updateDynamic("volume")(volume.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Asset]
  }
}

