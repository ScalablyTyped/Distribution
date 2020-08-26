package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import typings.std.AudioContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioFileConfig extends js.Object {
  /**
    * The AudioContext this file will use to process itself.
    */
  var audioContext: js.UndefOr[AudioContext] = js.native
  /**
    * The key of the file. Must be unique within the Loader and Audio Cache.
    */
  var key: String = js.native
  /**
    * The absolute or relative URL to load the file from.
    */
  var urlConfig: js.UndefOr[String] = js.native
  /**
    * Extra XHR Settings specifically for this file.
    */
  var xhrSettings: js.UndefOr[XHRSettingsObject] = js.native
}

object AudioFileConfig {
  @scala.inline
  def apply(key: String): AudioFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioFileConfig]
  }
  @scala.inline
  implicit class AudioFileConfigOps[Self <: AudioFileConfig] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setAudioContext(value: AudioContext): Self = this.set("audioContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioContext: Self = this.set("audioContext", js.undefined)
    @scala.inline
    def setUrlConfig(value: String): Self = this.set("urlConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlConfig: Self = this.set("urlConfig", js.undefined)
    @scala.inline
    def setXhrSettings(value: XHRSettingsObject): Self = this.set("xhrSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXhrSettings: Self = this.set("xhrSettings", js.undefined)
  }
  
}

