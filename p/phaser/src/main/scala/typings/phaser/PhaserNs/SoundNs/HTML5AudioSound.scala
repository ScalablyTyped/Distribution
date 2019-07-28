package typings.phaser.PhaserNs.SoundNs

import typings.phaser.PhaserNs.TypesNs.SoundNs.SoundConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HTML5 Audio implementation of the sound.
  */
@JSGlobal("Phaser.Sound.HTML5AudioSound")
@js.native
class HTML5AudioSound protected () extends BaseSound {
  /**
    * 
    * @param manager Reference to the current sound manager instance.
    * @param key Asset key for the sound.
    * @param config An optional config object containing default sound settings. Default {}.
    */
  def this(manager: HTML5AudioSoundManager, key: String) = this()
  def this(manager: HTML5AudioSoundManager, key: String, config: SoundConfig) = this()
  /**
    * The detune value of this Sound, given in [cents](https://en.wikipedia.org/wiki/Cent_%28music%29).
    * The range of the value is -1200 to 1200, but we recommend setting it to [50](https://en.wikipedia.org/wiki/50_Cent).
    */
  var detune: Double = js.native
  /**
    * Flag indicating whether or not the sound or current sound marker will loop.
    */
  var loop: Boolean = js.native
  /**
    * Boolean indicating whether the sound is muted or not.
    * Gets or sets the muted state of this sound.
    */
  var mute: Boolean = js.native
  /**
    * Rate at which this Sound will be played.
    * Value of 1.0 plays the audio at full speed, 0.5 plays the audio at half speed
    * and 2.0 doubles the audios playback speed.
    */
  var rate: Double = js.native
  /**
    * Property representing the position of playback for this sound, in seconds.
    * Setting it to a specific value moves current playback to that position.
    * The value given is clamped to the range 0 to current marker duration.
    * Setting seek of a stopped sound has no effect.
    */
  var seek: Double = js.native
  /**
    * Gets or sets the volume of this sound, a value between 0 (silence) and 1 (full volume).
    */
  var volume: Double = js.native
  /**
    * Sets the detune value of this Sound, given in [cents](https://en.wikipedia.org/wiki/Cent_%28music%29).
    * The range of the value is -1200 to 1200, but we recommend setting it to [50](https://en.wikipedia.org/wiki/50_Cent).
    * @param value The range of the value is -1200 to 1200, but we recommend setting it to [50](https://en.wikipedia.org/wiki/50_Cent).
    */
  def setDetune(value: Double): HTML5AudioSound = js.native
  /**
    * Sets the loop state of this Sound.
    * @param value `true` to loop this sound, `false` to not loop it.
    */
  def setLoop(value: Boolean): HTML5AudioSound = js.native
  /**
    * Sets the muted state of this Sound.
    * @param value `true` to mute this sound, `false` to unmute it.
    */
  def setMute(value: Boolean): HTML5AudioSound = js.native
  /**
    * Sets the playback rate of this Sound.
    * 
    * For example, a value of 1.0 plays the audio at full speed, 0.5 plays the audio at half speed
    * and 2.0 doubles the audios playback speed.
    * @param value The playback rate at of this Sound.
    */
  def setRate(value: Double): HTML5AudioSound = js.native
  /**
    * Seeks to a specific point in this sound.
    * @param value The point in the sound to seek to.
    */
  def setSeek(value: Double): HTML5AudioSound = js.native
  /**
    * Sets the volume of this Sound.
    * @param value The volume of the sound.
    */
  def setVolume(value: Double): HTML5AudioSound = js.native
}

