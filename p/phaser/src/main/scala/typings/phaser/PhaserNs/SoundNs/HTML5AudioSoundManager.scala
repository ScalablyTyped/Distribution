package typings.phaser.PhaserNs.SoundNs

import typings.phaser.PhaserNs.Game
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HTML5AudioSoundManager
  */
@JSGlobal("Phaser.Sound.HTML5AudioSoundManager")
@js.native
class HTML5AudioSoundManager protected () extends BaseSoundManager {
  /**
    * 
    * @param game Reference to the current game instance.
    */
  def this(game: Game) = this()
  /**
    * Value representing time difference, in seconds, between calling
    * play method on an audio tag and when it actually starts playing.
    * It is used to achieve more accurate delayed sound playback.
    * 
    * You might need to tweak this value to get the desired results
    * since audio play delay varies depending on the browser/platform.
    */
  var audioPlayDelay: Double = js.native
  /**
    * A value by which we should offset the loop end marker of the
    * looping sound to compensate for lag, caused by changing audio
    * tag playback position, in order to achieve gapless looping.
    * 
    * You might need to tweak this value to get the desired results
    * since loop lag varies depending on the browser/platform.
    */
  var loopEndOffset: Double = js.native
  /**
    * Flag indicating whether if there are no idle instances of HTML5 Audio tag,
    * for any particular sound, if one of the used tags should be hijacked and used
    * for succeeding playback or if succeeding Phaser.Sound.HTML5AudioSound#play
    * call should be ignored.
    */
  var `override`: Boolean = js.native
  /**
    * Method used internally by Phaser.Sound.HTML5AudioSound class methods and property setters
    * to check if sound manager is locked and then either perform action immediately or queue it
    * to be performed once the sound manager gets unlocked.
    * @param sound Sound object on which to perform queued action.
    * @param prop Name of the method to be called or property to be assigned a value to.
    * @param value An optional parameter that either holds an array of arguments to be passed to the method call or value to be set to the property.
    */
  /* protected */ def isLocked(sound: HTML5AudioSound, prop: String): Boolean = js.native
  /* protected */ def isLocked(sound: HTML5AudioSound, prop: String, value: js.Any): Boolean = js.native
  /**
    * Sets the muted state of all this Sound Manager.
    * @param value `true` to mute all sounds, `false` to unmute them.
    */
  def setMute(value: Boolean): HTML5AudioSoundManager = js.native
  /**
    * Sets the volume of this Sound Manager.
    * @param value The global volume of this Sound Manager.
    */
  def setVolume(value: Double): HTML5AudioSoundManager = js.native
}

