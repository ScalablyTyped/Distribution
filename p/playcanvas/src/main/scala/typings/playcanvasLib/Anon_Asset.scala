package typings
package playcanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Asset extends js.Object {
  var asset: js.UndefOr[scala.Double] = js.undefined
  var autoPlay: js.UndefOr[scala.Boolean] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  var overlap: js.UndefOr[scala.Boolean] = js.undefined
  var pitch: js.UndefOr[scala.Double] = js.undefined
  var startTime: js.UndefOr[scala.Double] = js.undefined
  var volume: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Asset {
  @scala.inline
  def apply(
    asset: scala.Int | scala.Double = null,
    autoPlay: js.UndefOr[scala.Boolean] = js.undefined,
    duration: scala.Int | scala.Double = null,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    overlap: js.UndefOr[scala.Boolean] = js.undefined,
    pitch: scala.Int | scala.Double = null,
    startTime: scala.Int | scala.Double = null,
    volume: scala.Int | scala.Double = null
  ): Anon_Asset = {
    val __obj = js.Dynamic.literal()
    if (asset != null) __obj.updateDynamic("asset")(asset.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (!js.isUndefined(overlap)) __obj.updateDynamic("overlap")(overlap)
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Asset]
  }
}

