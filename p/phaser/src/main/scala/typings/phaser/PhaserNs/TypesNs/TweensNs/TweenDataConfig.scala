package typings.phaser.PhaserNs.TypesNs.TweensNs

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TweenDataConfig extends js.Object {
  /**
    * Ease value data.
    */
  var current: js.UndefOr[Double] = js.undefined
  /**
    * Time in ms/frames before tween will start.
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * Duration of the tween in ms/frames, excludes time for yoyo or repeats.
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * The ease function this tween uses.
    */
  var ease: js.Function
  /**
    * Delta counter
    */
  var elapsed: js.UndefOr[Double] = js.undefined
  /**
    * Ease value data.
    */
  var end: js.UndefOr[Double] = js.undefined
  /**
    * Automatically call toggleFlipX when the TweenData yoyos or repeats
    */
  var flipX: js.UndefOr[Boolean] = js.undefined
  /**
    * Automatically call toggleFlipY when the TweenData yoyos or repeats
    */
  var flipY: js.UndefOr[Boolean] = js.undefined
  /**
    * LoadValue generation functions.
    */
  var gen: js.UndefOr[TweenDataGenConfig] = js.undefined
  /**
    * The returned value sets what the property will be at the END of the Tween.
    */
  var getEndValue: js.Function
  /**
    * The returned value sets what the property will be at the START of the Tween.
    */
  var getStartValue: js.Function
  /**
    * Time in ms/frames the tween will pause before running the yoyo or starting a repeat.
    */
  var hold: js.UndefOr[Double] = js.undefined
  /**
    * The property of the target being tweened.
    */
  var key: String
  /**
    * Between 0 and 1 showing completion of this TweenData.
    */
  var progress: js.UndefOr[Double] = js.undefined
  /**
    * Number of times to repeat the tween. The tween will always run once regardless, so a repeat value of '1' will play the tween twice.
    */
  var repeat: js.UndefOr[integer] = js.undefined
  /**
    * How many repeats are left to run?
    */
  var repeatCounter: js.UndefOr[integer] = js.undefined
  /**
    * Time in ms/frames before the repeat will start.
    */
  var repeatDelay: js.UndefOr[Double] = js.undefined
  /**
    * Ease value data.
    */
  var start: js.UndefOr[Double] = js.undefined
  /**
    * TWEEN_CONST.CREATED
    */
  var state: js.UndefOr[integer] = js.undefined
  /**
    * Time duration 1.
    */
  var t1: js.UndefOr[Double] = js.undefined
  /**
    * Time duration 2.
    */
  var t2: js.UndefOr[Double] = js.undefined
  /**
    * The target to tween.
    */
  var target: js.Any
  /**
    * The total calculated duration of this TweenData (based on duration, repeat, delay and yoyo)
    */
  var totalDuration: js.UndefOr[Double] = js.undefined
  /**
    * Cause the tween to return back to its start value after hold has expired.
    */
  var yoyo: js.UndefOr[Boolean] = js.undefined
}

object TweenDataConfig {
  @scala.inline
  def apply(
    ease: js.Function,
    getEndValue: js.Function,
    getStartValue: js.Function,
    key: String,
    target: js.Any,
    current: Int | Double = null,
    delay: Int | Double = null,
    duration: Int | Double = null,
    elapsed: Int | Double = null,
    end: Int | Double = null,
    flipX: js.UndefOr[Boolean] = js.undefined,
    flipY: js.UndefOr[Boolean] = js.undefined,
    gen: TweenDataGenConfig = null,
    hold: Int | Double = null,
    progress: Int | Double = null,
    repeat: js.UndefOr[integer] = js.undefined,
    repeatCounter: js.UndefOr[integer] = js.undefined,
    repeatDelay: Int | Double = null,
    start: Int | Double = null,
    state: js.UndefOr[integer] = js.undefined,
    t1: Int | Double = null,
    t2: Int | Double = null,
    totalDuration: Int | Double = null,
    yoyo: js.UndefOr[Boolean] = js.undefined
  ): TweenDataConfig = {
    val __obj = js.Dynamic.literal(ease = ease, getEndValue = getEndValue, getStartValue = getStartValue, key = key, target = target)
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (elapsed != null) __obj.updateDynamic("elapsed")(elapsed.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(flipX)) __obj.updateDynamic("flipX")(flipX)
    if (!js.isUndefined(flipY)) __obj.updateDynamic("flipY")(flipY)
    if (gen != null) __obj.updateDynamic("gen")(gen)
    if (hold != null) __obj.updateDynamic("hold")(hold.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (!js.isUndefined(repeat)) __obj.updateDynamic("repeat")(repeat)
    if (!js.isUndefined(repeatCounter)) __obj.updateDynamic("repeatCounter")(repeatCounter)
    if (repeatDelay != null) __obj.updateDynamic("repeatDelay")(repeatDelay.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (!js.isUndefined(state)) __obj.updateDynamic("state")(state)
    if (t1 != null) __obj.updateDynamic("t1")(t1.asInstanceOf[js.Any])
    if (t2 != null) __obj.updateDynamic("t2")(t2.asInstanceOf[js.Any])
    if (totalDuration != null) __obj.updateDynamic("totalDuration")(totalDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(yoyo)) __obj.updateDynamic("yoyo")(yoyo)
    __obj.asInstanceOf[TweenDataConfig]
  }
}

