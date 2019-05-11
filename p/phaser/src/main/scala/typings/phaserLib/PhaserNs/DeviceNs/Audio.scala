package typings
package phaserLib.PhaserNs.DeviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Determines the audio playback capabilities of the device running this Phaser Game instance.
  * These values are read-only and populated during the boot sequence of the game.
  * They are then referenced by internal game systems and are available for you to access
  * via `this.sys.game.device.audio` from within any Scene.
  */
trait Audio extends js.Object {
  /**
    * Can this device play HTML Audio tags?
    */
  var audioData: scala.Boolean
  /**
    * Can this device play EC-3 Dolby Digital Plus files?
    */
  var dolby: scala.Boolean
  /**
    * Can this device can play m4a files.
    */
  var m4a: scala.Boolean
  /**
    * Can this device play mp3 files?
    */
  var mp3: scala.Boolean
  /**
    * Can this device play ogg files?
    */
  var ogg: scala.Boolean
  /**
    * Can this device play opus files?
    */
  var opus: scala.Boolean
  /**
    * Can this device play wav files?
    */
  var wav: scala.Boolean
  /**
    * Does this device have the Web Audio API?
    */
  var webAudio: scala.Boolean
  /**
    * Can this device play webm files?
    */
  var webm: scala.Boolean
}

object Audio {
  @scala.inline
  def apply(
    audioData: scala.Boolean,
    dolby: scala.Boolean,
    m4a: scala.Boolean,
    mp3: scala.Boolean,
    ogg: scala.Boolean,
    opus: scala.Boolean,
    wav: scala.Boolean,
    webAudio: scala.Boolean,
    webm: scala.Boolean
  ): Audio = {
    val __obj = js.Dynamic.literal(audioData = audioData, dolby = dolby, m4a = m4a, mp3 = mp3, ogg = ogg, opus = opus, wav = wav, webAudio = webAudio, webm = webm)
  
    __obj.asInstanceOf[Audio]
  }
}

