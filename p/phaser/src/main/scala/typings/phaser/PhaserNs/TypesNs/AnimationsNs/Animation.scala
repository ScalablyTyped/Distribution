package typings.phaser.PhaserNs.TypesNs.AnimationsNs

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends js.Object {
  /**
    * The key of the texture all frames of the animation will use. Can be overridden on a per frame basis.
    */
  var defaultTextureKey: js.UndefOr[String] = js.undefined
  /**
    * Delay before starting playback. Value given in milliseconds.
    */
  var delay: js.UndefOr[integer] = js.undefined
  /**
    * How long the animation should play for in milliseconds. If not given its derived from frameRate.
    */
  var duration: js.UndefOr[integer] = js.undefined
  /**
    * The frame rate of playback in frames per second (default 24 if duration is null)
    */
  var frameRate: js.UndefOr[integer] = js.undefined
  /**
    * An object containing data used to generate the frames for the animation
    */
  var frames: js.UndefOr[js.Array[AnimationFrame]] = js.undefined
  /**
    * Should sprite.visible = false when the animation finishes?
    */
  var hideOnComplete: js.UndefOr[Boolean] = js.undefined
  /**
    * The key that the animation will be associated with. i.e. sprite.animations.play(key)
    */
  var key: js.UndefOr[String] = js.undefined
  /**
    * Number of times to repeat the animation (-1 for infinity)
    */
  var repeat: js.UndefOr[integer] = js.undefined
  /**
    * Delay before the animation repeats. Value given in milliseconds.
    */
  var repeatDelay: js.UndefOr[integer] = js.undefined
  /**
    * Should sprite.visible = true when the animation starts to play?
    */
  var showOnStart: js.UndefOr[Boolean] = js.undefined
  /**
    * Skip frames if the time lags, or always advanced anyway?
    */
  var skipMissedFrames: js.UndefOr[Boolean] = js.undefined
  /**
    * Should the animation yoyo? (reverse back down to the start) before repeating?
    */
  var yoyo: js.UndefOr[Boolean] = js.undefined
}

object Animation {
  @scala.inline
  def apply(
    defaultTextureKey: String = null,
    delay: js.UndefOr[integer] = js.undefined,
    duration: js.UndefOr[integer] = js.undefined,
    frameRate: js.UndefOr[integer] = js.undefined,
    frames: js.Array[AnimationFrame] = null,
    hideOnComplete: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    repeat: js.UndefOr[integer] = js.undefined,
    repeatDelay: js.UndefOr[integer] = js.undefined,
    showOnStart: js.UndefOr[Boolean] = js.undefined,
    skipMissedFrames: js.UndefOr[Boolean] = js.undefined,
    yoyo: js.UndefOr[Boolean] = js.undefined
  ): Animation = {
    val __obj = js.Dynamic.literal()
    if (defaultTextureKey != null) __obj.updateDynamic("defaultTextureKey")(defaultTextureKey)
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay)
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration)
    if (!js.isUndefined(frameRate)) __obj.updateDynamic("frameRate")(frameRate)
    if (frames != null) __obj.updateDynamic("frames")(frames)
    if (!js.isUndefined(hideOnComplete)) __obj.updateDynamic("hideOnComplete")(hideOnComplete)
    if (key != null) __obj.updateDynamic("key")(key)
    if (!js.isUndefined(repeat)) __obj.updateDynamic("repeat")(repeat)
    if (!js.isUndefined(repeatDelay)) __obj.updateDynamic("repeatDelay")(repeatDelay)
    if (!js.isUndefined(showOnStart)) __obj.updateDynamic("showOnStart")(showOnStart)
    if (!js.isUndefined(skipMissedFrames)) __obj.updateDynamic("skipMissedFrames")(skipMissedFrames)
    if (!js.isUndefined(yoyo)) __obj.updateDynamic("yoyo")(yoyo)
    __obj.asInstanceOf[Animation]
  }
}

