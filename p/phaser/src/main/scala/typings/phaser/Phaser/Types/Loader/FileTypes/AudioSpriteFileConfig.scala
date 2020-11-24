package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioSpriteFileConfig extends js.Object {
  
  /**
    * The audio configuration options.
    */
  var audioConfig: js.UndefOr[js.Any] = js.native
  
  /**
    * The absolute or relative URL to load the audio file from.
    */
  var audioURL: js.UndefOr[js.Object] = js.native
  
  /**
    * Extra XHR Settings specifically for the audio file.
    */
  var audioXhrSettings: js.UndefOr[XHRSettingsObject] = js.native
  
  /**
    * The absolute or relative URL to load the json file from. Or a well formed JSON object to use instead.
    */
  var jsonURL: String = js.native
  
  /**
    * Extra XHR Settings specifically for the json file.
    */
  var jsonXhrSettings: js.UndefOr[XHRSettingsObject] = js.native
  
  /**
    * The key of the file. Must be unique within both the Loader and the Audio Cache.
    */
  var key: String = js.native
}
object AudioSpriteFileConfig {
  
  @scala.inline
  def apply(jsonURL: String, key: String): AudioSpriteFileConfig = {
    val __obj = js.Dynamic.literal(jsonURL = jsonURL.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioSpriteFileConfig]
  }
  
  @scala.inline
  implicit class AudioSpriteFileConfigOps[Self <: AudioSpriteFileConfig] (val x: Self) extends AnyVal {
    
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
    def setJsonURL(value: String): Self = this.set("jsonURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioConfig(value: js.Any): Self = this.set("audioConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioConfig: Self = this.set("audioConfig", js.undefined)
    
    @scala.inline
    def setAudioURL(value: js.Object): Self = this.set("audioURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioURL: Self = this.set("audioURL", js.undefined)
    
    @scala.inline
    def setAudioXhrSettings(value: XHRSettingsObject): Self = this.set("audioXhrSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioXhrSettings: Self = this.set("audioXhrSettings", js.undefined)
    
    @scala.inline
    def setJsonXhrSettings(value: XHRSettingsObject): Self = this.set("jsonXhrSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonXhrSettings: Self = this.set("jsonXhrSettings", js.undefined)
  }
}
