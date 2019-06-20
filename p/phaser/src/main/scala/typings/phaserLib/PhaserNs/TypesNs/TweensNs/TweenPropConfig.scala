package typings
package phaserLib.PhaserNs.TypesNs.TweensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TweenPropConfig extends js.Object {
  /**
    * Time in ms/frames before tween will start.
    */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /**
    * Duration of the tween in ms/frames.
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * The ease function this tween uses.
    */
  var ease: js.UndefOr[java.lang.String | js.Function] = js.undefined
  /**
    * Should toggleFlipX be called when yoyo or repeat happens?
    */
  var flipX: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Should toggleFlipY be called when yoyo or repeat happens?
    */
  var flipY: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * What the property will be at the END of the Tween.
    */
  var getEnd: js.UndefOr[GetEndCallback] = js.undefined
  /**
    * What the property will be at the START of the Tween.
    */
  var getStart: js.UndefOr[GetStartCallback] = js.undefined
  /**
    * Time in ms/frames the tween will pause before repeating or returning to its starting value if yoyo is set to true.
    */
  var hold: js.UndefOr[scala.Double] = js.undefined
  /**
    * Number of times to repeat the tween. The tween will always run once regardless, so a repeat value of '1' will play the tween twice.
    */
  var repeat: js.UndefOr[scala.Double] = js.undefined
  /**
    * Time in ms/frames before the repeat will start.
    */
  var repeatDelay: js.UndefOr[scala.Double] = js.undefined
  /**
    * What the property will be at the END of the Tween.
    */
  var value: js.UndefOr[scala.Double | java.lang.String | GetEndCallback | TweenPropConfig] = js.undefined
  /**
    * Determines whether the tween should return back to its start value after hold has expired.
    */
  var yoyo: js.UndefOr[scala.Boolean] = js.undefined
}

object TweenPropConfig {
  @scala.inline
  def apply(
    delay: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    ease: java.lang.String | js.Function = null,
    flipX: js.UndefOr[scala.Boolean] = js.undefined,
    flipY: js.UndefOr[scala.Boolean] = js.undefined,
    getEnd: GetEndCallback = null,
    getStart: GetStartCallback = null,
    hold: scala.Int | scala.Double = null,
    repeat: scala.Int | scala.Double = null,
    repeatDelay: scala.Int | scala.Double = null,
    value: scala.Double | java.lang.String | GetEndCallback | TweenPropConfig = null,
    yoyo: js.UndefOr[scala.Boolean] = js.undefined
  ): TweenPropConfig = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    if (!js.isUndefined(flipX)) __obj.updateDynamic("flipX")(flipX)
    if (!js.isUndefined(flipY)) __obj.updateDynamic("flipY")(flipY)
    if (getEnd != null) __obj.updateDynamic("getEnd")(getEnd)
    if (getStart != null) __obj.updateDynamic("getStart")(getStart)
    if (hold != null) __obj.updateDynamic("hold")(hold.asInstanceOf[js.Any])
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    if (repeatDelay != null) __obj.updateDynamic("repeatDelay")(repeatDelay.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(yoyo)) __obj.updateDynamic("yoyo")(yoyo)
    __obj.asInstanceOf[TweenPropConfig]
  }
}

