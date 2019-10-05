package typings.phaser.Phaser.Types.Tweens

import typings.phaser.Phaser.Tweens.Tween
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TweenDataConfig extends js.Object {
  /**
    * Ease value data.
    */
  var current: js.UndefOr[Double] = js.native
  /**
    * Time in ms/frames before tween will start.
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * Duration of the tween in ms/frames, excludes time for yoyo or repeats.
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * The ease function this tween uses.
    */
  var ease: js.Function = js.native
  /**
    * Delta counter
    */
  var elapsed: js.UndefOr[Double] = js.native
  /**
    * Ease value data.
    */
  var end: js.UndefOr[Double] = js.native
  /**
    * Automatically call toggleFlipX when the TweenData yoyos or repeats
    */
  var flipX: js.UndefOr[Boolean] = js.native
  /**
    * Automatically call toggleFlipY when the TweenData yoyos or repeats
    */
  var flipY: js.UndefOr[Boolean] = js.native
  /**
    * LoadValue generation functions.
    */
  var gen: js.UndefOr[TweenDataGenConfig] = js.native
  /**
    * If not null, is invoked _immediately_ as soon as the TweenData is running, and is set on the target property.
    */
  @JSName("getActiveValue")
  var getActiveValue_Original: GetActiveCallback = js.native
  /**
    * The returned value sets what the property will be at the END of the Tween.
    */
  @JSName("getEndValue")
  var getEndValue_Original: GetEndCallback = js.native
  /**
    * The returned value sets what the property will be at the START of the Tween.
    */
  @JSName("getStartValue")
  var getStartValue_Original: GetStartCallback = js.native
  /**
    * Time in ms/frames the tween will pause before running the yoyo or starting a repeat.
    */
  var hold: js.UndefOr[Double] = js.native
  /**
    * The target index within the Tween targets array.
    */
  var index: integer = js.native
  /**
    * The property of the target being tweened.
    */
  var key: String = js.native
  /**
    * Between 0 and 1 showing completion of this TweenData.
    */
  var progress: js.UndefOr[Double] = js.native
  /**
    * Number of times to repeat the tween. The tween will always run once regardless, so a repeat value of '1' will play the tween twice.
    */
  var repeat: js.UndefOr[integer] = js.native
  /**
    * How many repeats are left to run?
    */
  var repeatCounter: js.UndefOr[integer] = js.native
  /**
    * Time in ms/frames before the repeat will start.
    */
  var repeatDelay: js.UndefOr[Double] = js.native
  /**
    * Ease value data.
    */
  var start: js.UndefOr[Double] = js.native
  /**
    * TWEEN_CONST.CREATED
    */
  var state: js.UndefOr[integer] = js.native
  /**
    * Time duration 1.
    */
  var t1: js.UndefOr[Double] = js.native
  /**
    * Time duration 2.
    */
  var t2: js.UndefOr[Double] = js.native
  /**
    * The target to tween.
    */
  var target: js.Any = js.native
  /**
    * The total calculated duration of this TweenData (based on duration, repeat, delay and yoyo)
    */
  var totalDuration: js.UndefOr[Double] = js.native
  /**
    * Cause the tween to return back to its start value after hold has expired.
    */
  var yoyo: js.UndefOr[Boolean] = js.native
  /**
    * If not null, is invoked _immediately_ as soon as the TweenData is running, and is set on the target property.
    */
  def getActiveValue(
    target: js.Any,
    key: String,
    value: Double,
    targetIndex: integer,
    totalTargets: integer,
    tween: Tween
  ): Unit = js.native
  /**
    * The returned value sets what the property will be at the END of the Tween.
    */
  def getEndValue(
    target: js.Any,
    key: String,
    value: Double,
    targetIndex: integer,
    totalTargets: integer,
    tween: Tween
  ): Unit = js.native
  /**
    * The returned value sets what the property will be at the START of the Tween.
    */
  def getStartValue(
    target: js.Any,
    key: String,
    value: Double,
    targetIndex: integer,
    totalTargets: integer,
    tween: Tween
  ): Unit = js.native
}

