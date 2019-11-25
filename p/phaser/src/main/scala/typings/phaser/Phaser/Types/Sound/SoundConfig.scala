package typings.phaser.Phaser.Types.Sound

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Config object containing various sound settings.
  */
trait SoundConfig extends js.Object {
  /**
    * Time, in seconds, that should elapse before the sound actually starts its playback.
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * Represents detuning of sound in [cents](https://en.wikipedia.org/wiki/Cent_%28music%29).
    */
  var detune: js.UndefOr[Double] = js.undefined
  /**
    * Whether or not the sound or current sound marker should loop.
    */
  var loop: js.UndefOr[Boolean] = js.undefined
  /**
    * Boolean indicating whether the sound should be muted or not.
    */
  var mute: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines the speed at which the sound should be played.
    */
  var rate: js.UndefOr[Double] = js.undefined
  /**
    * Position of playback for this sound, in seconds.
    */
  var seek: js.UndefOr[Double] = js.undefined
  /**
    * A value between 0 (silence) and 1 (full volume).
    */
  var volume: js.UndefOr[Double] = js.undefined
}

object SoundConfig {
  @scala.inline
  def apply(
    delay: Int | Double = null,
    detune: Int | Double = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    mute: js.UndefOr[Boolean] = js.undefined,
    rate: Int | Double = null,
    seek: Int | Double = null,
    volume: Int | Double = null
  ): SoundConfig = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (detune != null) __obj.updateDynamic("detune")(detune.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (!js.isUndefined(mute)) __obj.updateDynamic("mute")(mute.asInstanceOf[js.Any])
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    if (seek != null) __obj.updateDynamic("seek")(seek.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoundConfig]
  }
}

