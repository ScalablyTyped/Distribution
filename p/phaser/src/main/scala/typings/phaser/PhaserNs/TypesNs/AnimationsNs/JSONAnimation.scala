package typings.phaser.PhaserNs.TypesNs.AnimationsNs

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONAnimation extends js.Object {
  /**
    * Delay before starting playback. Value given in milliseconds.
    */
  var delay: integer
  /**
    * How long the animation should play for in milliseconds. If not given its derived from frameRate.
    */
  var duration: integer
  /**
    * The frame rate of playback in frames per second (default 24 if duration is null)
    */
  var frameRate: integer
  /**
    * [description]
    */
  var frames: js.Array[JSONAnimationFrame]
  /**
    * Should sprite.visible = false when the animation finishes?
    */
  var hideOnComplete: Boolean
  /**
    * The key that the animation will be associated with. i.e. sprite.animations.play(key)
    */
  var key: String
  /**
    * Number of times to repeat the animation (-1 for infinity)
    */
  var repeat: integer
  /**
    * Delay before the animation repeats. Value given in milliseconds.
    */
  var repeatDelay: integer
  /**
    * Should sprite.visible = true when the animation starts to play?
    */
  var showOnStart: Boolean
  /**
    * Skip frames if the time lags, or always advanced anyway?
    */
  var skipMissedFrames: Boolean
  /**
    * A frame based animation (as opposed to a bone based animation)
    */
  var `type`: String
  /**
    * Should the animation yoyo? (reverse back down to the start) before repeating?
    */
  var yoyo: Boolean
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
    val __obj = js.Dynamic.literal(delay = delay, duration = duration, frameRate = frameRate, frames = frames, hideOnComplete = hideOnComplete, key = key, repeat = repeat, repeatDelay = repeatDelay, showOnStart = showOnStart, skipMissedFrames = skipMissedFrames, yoyo = yoyo)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[JSONAnimation]
  }
}

