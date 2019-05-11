package typings
package phaserLib.PhaserNs.SoundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Web Audio API implementation of the sound manager.
  */
@JSGlobal("Phaser.Sound.WebAudioSoundManager")
@js.native
class WebAudioSoundManager protected () extends BaseSoundManager {
  /**
    * 
    * @param game Reference to the current game instance.
    */
  def this(game: phaserLib.PhaserNs.Game) = this()
  /**
    * Sets the muted state of all this Sound Manager.
    * @param value `true` to mute all sounds, `false` to unmute them.
    */
  def setMute(value: scala.Boolean): WebAudioSoundManager = js.native
  /**
    * Sets the volume of this Sound Manager.
    * @param value The global volume of this Sound Manager.
    */
  def setVolume(value: scala.Double): WebAudioSoundManager = js.native
}

