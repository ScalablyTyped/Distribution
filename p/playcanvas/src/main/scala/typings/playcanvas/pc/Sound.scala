package typings.playcanvas.pc

import typings.std.AudioBuffer
import typings.std.HTMLAudioElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Sound
  * @classdesc Represents the resource of an audio asset.
  * @param {HTMLAudioElement|AudioBuffer} resource - If the Web Audio API is supported, pass an AudioBuffer object, otherwise
  * an Audio object.
  * @property {AudioBuffer} buffer If the Web Audio API is supported this contains the audio data.
  * @property {HTMLAudioElement} audio If the Web Audio API is not supported this contains the audio data.
  * @property {number} duration Returns the duration of the sound. If the sound is not loaded it returns 0.
  */
@JSGlobal("pc.Sound")
@js.native
class Sound protected () extends js.Object {
  def this(resource: AudioBuffer) = this()
  def this(resource: HTMLAudioElement) = this()
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

