package typings.phaser.Phaser.Device

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Determines the audio playback capabilities of the device running this Phaser Game instance.
  * These values are read-only and populated during the boot sequence of the game.
  * They are then referenced by internal game systems and are available for you to access
  * via `this.sys.game.device.audio` from within any Scene.
  */
@js.native
trait Audio extends js.Object {
  /**
    * Can this device play HTML Audio tags?
    */
  var audioData: Boolean = js.native
  /**
    * Can this device play EC-3 Dolby Digital Plus files?
    */
  var dolby: Boolean = js.native
  /**
    * Can this device can play m4a files.
    */
  var m4a: Boolean = js.native
  /**
    * Can this device play mp3 files?
    */
  var mp3: Boolean = js.native
  /**
    * Can this device play ogg files?
    */
  var ogg: Boolean = js.native
  /**
    * Can this device play opus files?
    */
  var opus: Boolean = js.native
  /**
    * Can this device play wav files?
    */
  var wav: Boolean = js.native
  /**
    * Does this device have the Web Audio API?
    */
  var webAudio: Boolean = js.native
  /**
    * Can this device play webm files?
    */
  var webm: Boolean = js.native
}

object Audio {
  @scala.inline
  def apply(
    audioData: Boolean,
    dolby: Boolean,
    m4a: Boolean,
    mp3: Boolean,
    ogg: Boolean,
    opus: Boolean,
    wav: Boolean,
    webAudio: Boolean,
    webm: Boolean
  ): Audio = {
    val __obj = js.Dynamic.literal(audioData = audioData.asInstanceOf[js.Any], dolby = dolby.asInstanceOf[js.Any], m4a = m4a.asInstanceOf[js.Any], mp3 = mp3.asInstanceOf[js.Any], ogg = ogg.asInstanceOf[js.Any], opus = opus.asInstanceOf[js.Any], wav = wav.asInstanceOf[js.Any], webAudio = webAudio.asInstanceOf[js.Any], webm = webm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Audio]
  }
  @scala.inline
  implicit class AudioOps[Self <: Audio] (val x: Self) extends AnyVal {
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
    def setAudioData(value: Boolean): Self = this.set("audioData", value.asInstanceOf[js.Any])
    @scala.inline
    def setDolby(value: Boolean): Self = this.set("dolby", value.asInstanceOf[js.Any])
    @scala.inline
    def setM4a(value: Boolean): Self = this.set("m4a", value.asInstanceOf[js.Any])
    @scala.inline
    def setMp3(value: Boolean): Self = this.set("mp3", value.asInstanceOf[js.Any])
    @scala.inline
    def setOgg(value: Boolean): Self = this.set("ogg", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpus(value: Boolean): Self = this.set("opus", value.asInstanceOf[js.Any])
    @scala.inline
    def setWav(value: Boolean): Self = this.set("wav", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebAudio(value: Boolean): Self = this.set("webAudio", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebm(value: Boolean): Self = this.set("webm", value.asInstanceOf[js.Any])
  }
  
}

