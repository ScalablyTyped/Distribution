package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDuration extends js.Object {
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

object AnonDuration {
  @scala.inline
  def apply(
    duration: Int | Double = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    onEnd: /* repeated */ js.Any => _ = null,
    onPause: /* repeated */ js.Any => _ = null,
    onPlay: /* repeated */ js.Any => _ = null,
    onResume: /* repeated */ js.Any => _ = null,
    onStop: /* repeated */ js.Any => _ = null,
    pitch: Int | Double = null,
    startTime: Int | Double = null,
    volume: Int | Double = null
  ): AnonDuration = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction1(onEnd))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onResume != null) __obj.updateDynamic("onResume")(js.Any.fromFunction1(onResume))
    if (onStop != null) __obj.updateDynamic("onStop")(js.Any.fromFunction1(onStop))
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDuration]
  }
}

