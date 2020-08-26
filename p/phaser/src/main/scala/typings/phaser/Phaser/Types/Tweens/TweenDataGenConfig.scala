package typings.phaser.Phaser.Types.Tweens

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TweenDataGenConfig extends js.Object {
  /**
    * Time in ms/frames before tween will start.
    */
  var delay: js.Function = js.native
  /**
    * Duration of the tween in ms/frames, excludes time for yoyo or repeats.
    */
  var duration: js.Function = js.native
  /**
    * Time in ms/frames the tween will pause before running the yoyo or starting a repeat.
    */
  var hold: js.Function = js.native
  /**
    * Number of times to repeat the tween. The tween will always run once regardless, so a repeat value of '1' will play the tween twice.
    */
  var repeat: js.Function = js.native
  /**
    * Time in ms/frames before the repeat will start.
    */
  var repeatDelay: js.Function = js.native
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
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], hold = hold.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any], repeatDelay = repeatDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[TweenDataGenConfig]
  }
  @scala.inline
  implicit class TweenDataGenConfigOps[Self <: TweenDataGenConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelay(value: js.Function): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: js.Function): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setHold(value: js.Function): Self = this.set("hold", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepeat(value: js.Function): Self = this.set("repeat", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepeatDelay(value: js.Function): Self = this.set("repeatDelay", value.asInstanceOf[js.Any])
  }
  
}

