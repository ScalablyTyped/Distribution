package typings.phaser.Phaser.Types.Tweens

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TweenDataGenConfig extends js.Object {
  /**
    * Time in ms/frames before tween will start.
    */
  var delay: js.Function
  /**
    * Duration of the tween in ms/frames, excludes time for yoyo or repeats.
    */
  var duration: js.Function
  /**
    * Time in ms/frames the tween will pause before running the yoyo or starting a repeat.
    */
  var hold: js.Function
  /**
    * Number of times to repeat the tween. The tween will always run once regardless, so a repeat value of '1' will play the tween twice.
    */
  var repeat: js.Function
  /**
    * Time in ms/frames before the repeat will start.
    */
  var repeatDelay: js.Function
}

object TweenDataGenConfig {
  @scala.inline
  def apply(
    delay: js.Function,
    duration: js.Function,
    hold: js.Function,
    repeat: js.Function,
    repeatDelay: js.Function
  ): TweenDataGenConfig = {
    val __obj = js.Dynamic.literal(delay = delay, duration = duration, hold = hold, repeat = repeat, repeatDelay = repeatDelay)
  
    __obj.asInstanceOf[TweenDataGenConfig]
  }
}

