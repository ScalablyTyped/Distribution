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
  an Audio object.
  */
@js.native
trait Sound extends js.Object {
  /**
    * If the Web Audio API is not supported this contains the audio data.
    */
  var audio: HTMLAudioElement = js.native
  /**
    * If the Web Audio API is supported this contains the audio data.
    */
  var buffer: AudioBuffer = js.native
  /**
    * Returns the duration of the sound. If the sound is not loaded it returns 0.
    */
  var duration: Double = js.native
}

object Sound {
  @scala.inline
  def apply(audio: HTMLAudioElement, buffer: AudioBuffer, duration: Double): Sound = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sound]
  }
  @scala.inline
  implicit class SoundOps[Self <: Sound] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAudio(value: HTMLAudioElement): Self = this.set("audio", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuffer(value: AudioBuffer): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
  }
  
}

