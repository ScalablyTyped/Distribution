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
    delay: js.UndefOr[Double] = js.undefined,
    detune: js.UndefOr[Double] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    mute: js.UndefOr[Boolean] = js.undefined,
    rate: js.UndefOr[Double] = js.undefined,
    seek: js.UndefOr[Double] = js.undefined,
    volume: js.UndefOr[Double] = js.undefined
  ): SoundConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(detune)) __obj.updateDynamic("detune")(detune.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mute)) __obj.updateDynamic("mute")(mute.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rate)) __obj.updateDynamic("rate")(rate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(seek)) __obj.updateDynamic("seek")(seek.get.asInstanceOf[js.Any])
    if (!js.isUndefined(volume)) __obj.updateDynamic("volume")(volume.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoundConfig]
  }
}

