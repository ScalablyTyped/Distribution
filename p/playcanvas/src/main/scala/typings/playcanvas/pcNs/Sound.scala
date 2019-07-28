package typings.playcanvas.pcNs

import typings.std.AudioBuffer
import typings.std.HTMLAudioElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.Sound
  * @class Represents the resource of an audio asset.
  * @property {AudioBuffer} buffer If the Web Audio API is supported this contains the audio data
  * @property {Audio} audio If the Web Audio API is not supported this contains the audio data
  * @property {Number} duration Returns the duration of the sound. If the sound is not loaded it returns 0.
  */
@JSGlobal("pc.Sound")
@js.native
class Sound protected () extends js.Object {
  def this(resource: AudioBuffer) = this()
  def this(resource: HTMLAudioElement) = this()
  var audio: js.UndefOr[HTMLAudioElement] = js.native
  var buffer: js.UndefOr[AudioBuffer] = js.native
  var duration: Double = js.native
}

