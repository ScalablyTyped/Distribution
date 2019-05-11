package typings
package phaserLib.PhaserNs.TypesNs.TweensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TweenConfigDefaults extends js.Object {
  /**
    * The number of milliseconds to delay before the tween will start.
    */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /**
    * The duration of the tween in milliseconds.
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * The easing equation to use for the tween.
    */
  var ease: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional easing parameters.
    */
  var easeParams: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Horizontally flip the target of the Tween when it completes (before it yoyos, if set to do so). Only works for targets that support the `flipX` property.
    */
  var flipX: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Vertically flip the target of the Tween when it completes (before it yoyos, if set to do so). Only works for targets that support the `flipY` property.
    */
  var flipY: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The number of milliseconds to hold the tween for before yoyo'ing.
    */
  var hold: js.UndefOr[scala.Double] = js.undefined
  /**
    * The number of times to repeat the tween.
    */
  var repeat: js.UndefOr[scala.Double] = js.undefined
  /**
    * The number of milliseconds to pause before a tween will repeat.
    */
  var repeatDelay: js.UndefOr[scala.Double] = js.undefined
  /**
    * The object, or an array of objects, to run the tween on.
    */
  var targets: js.Object | js.Array[js.Object]
  /**
    * Should the tween complete, then reverse the values incrementally to get back to the starting tween values? The reverse tweening will also take `duration` milliseconds to complete.
    */
  var yoyo: js.UndefOr[scala.Boolean] = js.undefined
}

object TweenConfigDefaults {
  @scala.inline
  def apply(
    targets: js.Object | js.Array[js.Object],
    delay: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    ease: java.lang.String = null,
    easeParams: js.Array[_] = null,
    flipX: js.UndefOr[scala.Boolean] = js.undefined,
    flipY: js.UndefOr[scala.Boolean] = js.undefined,
    hold: scala.Int | scala.Double = null,
    repeat: scala.Int | scala.Double = null,
    repeatDelay: scala.Int | scala.Double = null,
    yoyo: js.UndefOr[scala.Boolean] = js.undefined
  ): TweenConfigDefaults = {
    val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(ease)
    if (easeParams != null) __obj.updateDynamic("easeParams")(easeParams)
    if (!js.isUndefined(flipX)) __obj.updateDynamic("flipX")(flipX)
    if (!js.isUndefined(flipY)) __obj.updateDynamic("flipY")(flipY)
    if (hold != null) __obj.updateDynamic("hold")(hold.asInstanceOf[js.Any])
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    if (repeatDelay != null) __obj.updateDynamic("repeatDelay")(repeatDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(yoyo)) __obj.updateDynamic("yoyo")(yoyo)
    __obj.asInstanceOf[TweenConfigDefaults]
  }
}

