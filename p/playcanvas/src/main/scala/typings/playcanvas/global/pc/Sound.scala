package typings.playcanvas.global.pc

import typings.std.AudioBuffer
import typings.std.HTMLAudioElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the resource of an audio asset.
  * @property buffer - If the Web Audio API is supported this contains the audio data.
  * @property audio - If the Web Audio API is not supported this contains the audio data.
  * @property duration - Returns the duration of the sound. If the sound is not loaded it returns 0.
  * @param resource - If the Web Audio API is supported, pass an AudioBuffer object, otherwise
  an Audio object.
  */
@JSGlobal("pc.Sound")
@js.native
class Sound protected ()
  extends typings.playcanvas.pc.Sound {
  def this(resource: AudioBuffer) = this()
  def this(resource: HTMLAudioElement) = this()
  /**
    * If the Web Audio API is not supported this contains the audio data.
    */
  /* CompleteClass */
  override var audio: HTMLAudioElement = js.native
  /**
    * If the Web Audio API is supported this contains the audio data.
    */
  /* CompleteClass */
  override var buffer: AudioBuffer = js.native
  /**
    * Returns the duration of the sound. If the sound is not loaded it returns 0.
    */
  /* CompleteClass */
  override var duration: Double = js.native
}

