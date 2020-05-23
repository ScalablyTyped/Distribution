package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var onEnd: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onPause: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onPlay: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onResume: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onStop: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var pitch: js.UndefOr[Double] = js.undefined
  var startTime: js.UndefOr[Double] = js.undefined
  var volume: js.UndefOr[Double] = js.undefined
}

object Duration {
  @scala.inline
  def apply(
    duration: js.UndefOr[Double] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    onEnd: /* repeated */ js.Any => _ = null,
    onPause: /* repeated */ js.Any => _ = null,
    onPlay: /* repeated */ js.Any => _ = null,
    onResume: /* repeated */ js.Any => _ = null,
    onStop: /* repeated */ js.Any => _ = null,
    pitch: js.UndefOr[Double] = js.undefined,
    startTime: js.UndefOr[Double] = js.undefined,
    volume: js.UndefOr[Double] = js.undefined
  ): Duration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction1(onEnd))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onResume != null) __obj.updateDynamic("onResume")(js.Any.fromFunction1(onResume))
    if (onStop != null) __obj.updateDynamic("onStop")(js.Any.fromFunction1(onStop))
    if (!js.isUndefined(pitch)) __obj.updateDynamic("pitch")(pitch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startTime)) __obj.updateDynamic("startTime")(startTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(volume)) __obj.updateDynamic("volume")(volume.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
}

