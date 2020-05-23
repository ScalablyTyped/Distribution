package typings.phaser.Phaser.Types.Tweens

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TweenConfigDefaults extends js.Object {
  /**
    * The number of milliseconds to delay before the tween will start.
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * The duration of the tween in milliseconds.
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * The easing equation to use for the tween.
    */
  var ease: js.UndefOr[String] = js.undefined
  /**
    * Optional easing parameters.
    */
  var easeParams: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Horizontally flip the target of the Tween when it completes (before it yoyos, if set to do so). Only works for targets that support the `flipX` property.
    */
  var flipX: js.UndefOr[Boolean] = js.undefined
  /**
    * Vertically flip the target of the Tween when it completes (before it yoyos, if set to do so). Only works for targets that support the `flipY` property.
    */
  var flipY: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of milliseconds to hold the tween for before yoyo'ing.
    */
  var hold: js.UndefOr[Double] = js.undefined
  /**
    * The number of times to repeat the tween.
    */
  var repeat: js.UndefOr[Double] = js.undefined
  /**
    * The number of milliseconds to pause before a tween will repeat.
    */
  var repeatDelay: js.UndefOr[Double] = js.undefined
  /**
    * The object, or an array of objects, to run the tween on.
    */
  var targets: js.Object | js.Array[js.Object]
  /**
    * Should the tween complete, then reverse the values incrementally to get back to the starting tween values? The reverse tweening will also take `duration` milliseconds to complete.
    */
  var yoyo: js.UndefOr[Boolean] = js.undefined
}

object TweenConfigDefaults {
  @scala.inline
  def apply(
    targets: js.Object | js.Array[js.Object],
    delay: js.UndefOr[Double] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    ease: String = null,
    easeParams: js.Array[_] = null,
    flipX: js.UndefOr[Boolean] = js.undefined,
    flipY: js.UndefOr[Boolean] = js.undefined,
    hold: js.UndefOr[Double] = js.undefined,
    repeat: js.UndefOr[Double] = js.undefined,
    repeatDelay: js.UndefOr[Double] = js.undefined,
    yoyo: js.UndefOr[Boolean] = js.undefined
  ): TweenConfigDefaults = {
    val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    if (easeParams != null) __obj.updateDynamic("easeParams")(easeParams.asInstanceOf[js.Any])
    if (!js.isUndefined(flipX)) __obj.updateDynamic("flipX")(flipX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flipY)) __obj.updateDynamic("flipY")(flipY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hold)) __obj.updateDynamic("hold")(hold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(repeat)) __obj.updateDynamic("repeat")(repeat.get.asInstanceOf[js.Any])
    if (!js.isUndefined(repeatDelay)) __obj.updateDynamic("repeatDelay")(repeatDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yoyo)) __obj.updateDynamic("yoyo")(yoyo.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TweenConfigDefaults]
  }
}

