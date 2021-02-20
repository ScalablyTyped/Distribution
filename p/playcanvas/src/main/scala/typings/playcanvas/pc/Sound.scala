package typings.playcanvas.pc

import typings.std.AudioBuffer
import typings.std.HTMLAudioElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the resource of an audio asset.
  * @property buffer - If the Web Audio API is supported this contains the audio data.
  * @property audio - If the Web Audio API is not supported this contains the audio data.
  * @property duration - Returns the duration of the sound. If the sound is not loaded it returns 0.
  * @param resource - If the Web Audio API is supported, pass an AudioBuffer object, otherwise
  an Audio object.
  */
@js.native
trait Sound extends StObject {
  
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
  implicit class SoundMutableBuilder[Self <: Sound] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudio(value: HTMLAudioElement): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuffer(value: AudioBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
  }
}
