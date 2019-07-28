package typings.phaser.PhaserNs.SoundNs

import typings.phaser.PhaserNs.Game
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * No audio implementation of the sound manager. It is used if audio has been
  * disabled in the game config or the device doesn't support any audio.
  * 
  * It represents a graceful degradation of sound manager logic that provides
  * minimal functionality and prevents Phaser projects that use audio from
  * breaking on devices that don't support any audio playback technologies.
  */
@JSGlobal("Phaser.Sound.NoAudioSoundManager")
@js.native
class NoAudioSoundManager protected () extends BaseSoundManager {
  /**
    * 
    * @param game Reference to the current game instance.
    */
  def this(game: Game) = this()
}

