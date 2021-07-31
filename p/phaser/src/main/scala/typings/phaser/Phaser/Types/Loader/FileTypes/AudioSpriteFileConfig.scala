package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioSpriteFileConfig extends StObject {
  
  /**
    * The audio configuration options.
    */
  var audioConfig: js.UndefOr[js.Any] = js.undefined
  
  /**
    * The absolute or relative URL to load the audio file from.
    */
  var audioURL: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Extra XHR Settings specifically for the audio file.
    */
  var audioXhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
  
  /**
    * The absolute or relative URL to load the json file from. Or a well formed JSON object to use instead.
    */
  var jsonURL: String
  
  /**
    * Extra XHR Settings specifically for the json file.
    */
  var jsonXhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
  
  /**
    * The key of the file. Must be unique within both the Loader and the Audio Cache.
    */
  var key: String
}
object AudioSpriteFileConfig {
  
  @scala.inline
  def apply(jsonURL: String, key: String): AudioSpriteFileConfig = {
    val __obj = js.Dynamic.literal(jsonURL = jsonURL.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioSpriteFileConfig]
  }
  
  @scala.inline
  implicit class AudioSpriteFileConfigMutableBuilder[Self <: AudioSpriteFileConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioConfig(value: js.Any): Self = StObject.set(x, "audioConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioConfigUndefined: Self = StObject.set(x, "audioConfig", js.undefined)
    
    @scala.inline
    def setAudioURL(value: js.Object): Self = StObject.set(x, "audioURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioURLUndefined: Self = StObject.set(x, "audioURL", js.undefined)
    
    @scala.inline
    def setAudioXhrSettings(value: XHRSettingsObject): Self = StObject.set(x, "audioXhrSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioXhrSettingsUndefined: Self = StObject.set(x, "audioXhrSettings", js.undefined)
    
    @scala.inline
    def setJsonURL(value: String): Self = StObject.set(x, "jsonURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonXhrSettings(value: XHRSettingsObject): Self = StObject.set(x, "jsonXhrSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonXhrSettingsUndefined: Self = StObject.set(x, "jsonXhrSettings", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
