package typings.playcanvas.mod

import typings.std.AudioBuffer
import typings.std.HTMLAudioElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the resource of an audio asset.
  */
@JSImport("playcanvas", "Sound")
@js.native
open class Sound protected () extends StObject {
  def this(resource: AudioBuffer) = this()
  /**
    * Create a new Sound instance.
    *
    * @param {HTMLAudioElement|AudioBuffer} resource - If the Web Audio API is supported, pass an
    * AudioBuffer object, otherwise an Audio object.
    */
  def this(resource: HTMLAudioElement) = this()
  
  /**
    * If the Web Audio API is not supported this contains the audio data.
    *
    * @type {HTMLAudioElement}
    */
  var audio: HTMLAudioElement = js.native
  
  /**
    * If the Web Audio API is supported this contains the audio data.
    *
    * @type {AudioBuffer}
    */
  var buffer: AudioBuffer = js.native
  
  /**
    * Gets the duration of the sound. If the sound is not loaded it returns 0.
    *
    * @type {number}
    */
  def duration: Double = js.native
}
