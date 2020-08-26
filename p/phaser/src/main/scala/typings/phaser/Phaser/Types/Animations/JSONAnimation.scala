package typings.phaser.Phaser.Types.Animations

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONAnimation extends js.Object {
  /**
    * Delay before starting playback. Value given in milliseconds.
    */
  var delay: integer = js.native
  /**
    * How long the animation should play for in milliseconds. If not given its derived from frameRate.
    */
  var duration: integer = js.native
  /**
    * The frame rate of playback in frames per second (default 24 if duration is null)
    */
  var frameRate: integer = js.native
  /**
    * An array of the AnimationFrame objects inside this Animation.
    */
  var frames: js.Array[JSONAnimationFrame] = js.native
  /**
    * Should sprite.visible = false when the animation finishes?
    */
  var hideOnComplete: Boolean = js.native
  /**
    * The key that the animation will be associated with. i.e. sprite.animations.play(key)
    */
  var key: String = js.native
  /**
    * Number of times to repeat the animation (-1 for infinity)
    */
  var repeat: integer = js.native
  /**
    * Delay before the animation repeats. Value given in milliseconds.
    */
  var repeatDelay: integer = js.native
  /**
    * Should sprite.visible = true when the animation starts to play?
    */
  var showOnStart: Boolean = js.native
  /**
    * Skip frames if the time lags, or always advanced anyway?
    */
  var skipMissedFrames: Boolean = js.native
  /**
    * A frame based animation (as opposed to a bone based animation)
    */
  var `type`: String = js.native
  /**
    * Should the animation yoyo? (reverse back down to the start) before repeating?
    */
  var yoyo: Boolean = js.native
}

object JSONAnimation {
  @scala.inline
  def apply(
    delay: integer,
    duration: integer,
    frameRate: integer,
    frames: js.Array[JSONAnimationFrame],
    hideOnComplete: Boolean,
    key: String,
    repeat: integer,
    repeatDelay: integer,
    showOnStart: Boolean,
    skipMissedFrames: Boolean,
    `type`: String,
    yoyo: Boolean
  ): JSONAnimation = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], frameRate = frameRate.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], hideOnComplete = hideOnComplete.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any], repeatDelay = repeatDelay.asInstanceOf[js.Any], showOnStart = showOnStart.asInstanceOf[js.Any], skipMissedFrames = skipMissedFrames.asInstanceOf[js.Any], yoyo = yoyo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONAnimation]
  }
  @scala.inline
  implicit class JSONAnimationOps[Self <: JSONAnimation] (val x: Self) extends AnyVal {
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
    def setDelay(value: integer): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: integer): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameRate(value: integer): Self = this.set("frameRate", value.asInstanceOf[js.Any])
    @scala.inline
    def setFramesVarargs(value: JSONAnimationFrame*): Self = this.set("frames", js.Array(value :_*))
    @scala.inline
    def setFrames(value: js.Array[JSONAnimationFrame]): Self = this.set("frames", value.asInstanceOf[js.Any])
    @scala.inline
    def setHideOnComplete(value: Boolean): Self = this.set("hideOnComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepeat(value: integer): Self = this.set("repeat", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepeatDelay(value: integer): Self = this.set("repeatDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowOnStart(value: Boolean): Self = this.set("showOnStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkipMissedFrames(value: Boolean): Self = this.set("skipMissedFrames", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setYoyo(value: Boolean): Self = this.set("yoyo", value.asInstanceOf[js.Any])
  }
  
}

