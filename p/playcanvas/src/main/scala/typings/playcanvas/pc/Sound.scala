package typings.playcanvas.pc

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
  * an Audio object.
  */
trait Sound extends js.Object {
  /**
    * If the Web Audio API is not supported this contains the audio data.
    */
  var audio: HTMLAudioElement
  /**
    * If the Web Audio API is supported this contains the audio data.
    */
  var buffer: AudioBuffer
  /**
    * Returns the duration of the sound. If the sound is not loaded it returns 0.
    */
  var duration: Double
}

object Sound {
  @scala.inline
  def apply(audio: HTMLAudioElement, buffer: AudioBuffer, duration: Double): Sound = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sound]
  }
}

