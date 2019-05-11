package typings
package phaserLib.PhaserNs.TypesNs.AnimationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONAnimation extends js.Object {
  /**
    * Delay before starting playback. Value given in milliseconds.
    */
  var delay: phaserLib.integer
  /**
    * How long the animation should play for in milliseconds. If not given its derived from frameRate.
    */
  var duration: phaserLib.integer
  /**
    * The frame rate of playback in frames per second (default 24 if duration is null)
    */
  var frameRate: phaserLib.integer
  /**
    * [description]
    */
  var frames: js.Array[JSONAnimationFrame]
  /**
    * Should sprite.visible = false when the animation finishes?
    */
  var hideOnComplete: scala.Boolean
  /**
    * The key that the animation will be associated with. i.e. sprite.animations.play(key)
    */
  var key: java.lang.String
  /**
    * Number of times to repeat the animation (-1 for infinity)
    */
  var repeat: phaserLib.integer
  /**
    * Delay before the animation repeats. Value given in milliseconds.
    */
  var repeatDelay: phaserLib.integer
  /**
    * Should sprite.visible = true when the animation starts to play?
    */
  var showOnStart: scala.Boolean
  /**
    * Skip frames if the time lags, or always advanced anyway?
    */
  var skipMissedFrames: scala.Boolean
  /**
    * A frame based animation (as opposed to a bone based animation)
    */
  var `type`: java.lang.String
  /**
    * Should the animation yoyo? (reverse back down to the start) before repeating?
    */
  var yoyo: scala.Boolean
}

object JSONAnimation {
  @scala.inline
  def apply(
    delay: phaserLib.integer,
    duration: phaserLib.integer,
    frameRate: phaserLib.integer,
    frames: js.Array[JSONAnimationFrame],
    hideOnComplete: scala.Boolean,
    key: java.lang.String,
    repeat: phaserLib.integer,
    repeatDelay: phaserLib.integer,
    showOnStart: scala.Boolean,
    skipMissedFrames: scala.Boolean,
    `type`: java.lang.String,
    yoyo: scala.Boolean
  ): JSONAnimation = {
    val __obj = js.Dynamic.literal(delay = delay, duration = duration, frameRate = frameRate, frames = frames, hideOnComplete = hideOnComplete, key = key, repeat = repeat, repeatDelay = repeatDelay, showOnStart = showOnStart, skipMissedFrames = skipMissedFrames, yoyo = yoyo)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[JSONAnimation]
  }
}

