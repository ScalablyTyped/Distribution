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
    * Decode audio data into a format ready for playback via Web Audio.
    * 
    * The audio data can be a base64 encoded string, an audio media-type data uri, or an ArrayBuffer instance.
    * 
    * The `audioKey` is the key that will be used to save the decoded audio to the audio cache.
    * 
    * Instead of passing a single entry you can instead pass an array of `Phaser.Types.Sound.DecodeAudioConfig`
    * objects as the first and only argument.
    * 
    * Decoding is an async process, so be sure to listen for the events to know when decoding has completed.
    * 
    * Once the audio has decoded it can be added to the Sound Manager or played via its key.
    * @param audioKey The string-based key to be used to reference the decoded audio in the audio cache, or an array of audio config objects.
    * @param audioData The audio data, either a base64 encoded string, an audio media-type data uri, or an ArrayBuffer instance.
    */
  def decodeAudio(): scala.Unit = js.native
  def decodeAudio(audioKey: java.lang.String): scala.Unit = js.native
  def decodeAudio(audioKey: java.lang.String, audioData: java.lang.String): scala.Unit = js.native
  def decodeAudio(audioKey: java.lang.String, audioData: stdLib.ArrayBuffer): scala.Unit = js.native
  def decodeAudio(audioKey: js.Array[phaserLib.PhaserNs.TypesNs.SoundNs.DecodeAudioConfig]): scala.Unit = js.native
  def decodeAudio(
    audioKey: js.Array[phaserLib.PhaserNs.TypesNs.SoundNs.DecodeAudioConfig],
    audioData: java.lang.String
  ): scala.Unit = js.native
  def decodeAudio(
    audioKey: js.Array[phaserLib.PhaserNs.TypesNs.SoundNs.DecodeAudioConfig],
    audioData: stdLib.ArrayBuffer
  ): scala.Unit = js.native
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

