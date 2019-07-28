package typings.phaser.PhaserNs.SoundNs

import typings.phaser.PhaserNs.TypesNs.SoundNs.SoundConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * No audio implementation of the sound. It is used if audio has been
  * disabled in the game config or the device doesn't support any audio.
  * 
  * It represents a graceful degradation of sound logic that provides
  * minimal functionality and prevents Phaser projects that use audio from
  * breaking on devices that don't support any audio playback technologies.
  */
@JSGlobal("Phaser.Sound.NoAudioSound")
@js.native
class NoAudioSound protected () extends BaseSound {
  /**
    * 
    * @param manager Reference to the current sound manager instance.
    * @param key Asset key for the sound.
    * @param config An optional config object containing default sound settings. Default {}.
    */
  def this(manager: NoAudioSoundManager, key: String) = this()
  def this(manager: NoAudioSoundManager, key: String, config: SoundConfig) = this()
}

