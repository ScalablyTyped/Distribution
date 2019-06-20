package typings
package phaserLib.PhaserNs.TypesNs.SoundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Audio Data object.
  * 
  * You can pass an array of these objects to the WebAudioSoundManager `decodeAudio` method to have it decode
  * them all at once.
  */
trait DecodeAudioConfig extends js.Object {
  /**
    * The audio data, either a base64 encoded string, an audio media-type data uri, or an ArrayBuffer instance.
    */
  var data: stdLib.ArrayBuffer | java.lang.String
  /**
    * The string-based key to be used to reference the decoded audio in the audio cache.
    */
  var key: java.lang.String
}

object DecodeAudioConfig {
  @scala.inline
  def apply(data: stdLib.ArrayBuffer | java.lang.String, key: java.lang.String): DecodeAudioConfig = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key)
  
    __obj.asInstanceOf[DecodeAudioConfig]
  }
}

