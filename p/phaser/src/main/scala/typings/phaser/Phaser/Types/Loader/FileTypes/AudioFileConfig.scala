package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import typings.std.AudioContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioFileConfig extends StObject {
  
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
  implicit class AudioFileConfigMutableBuilder[Self <: AudioFileConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioContext(value: AudioContext): Self = StObject.set(x, "audioContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioContextUndefined: Self = StObject.set(x, "audioContext", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlConfig(value: String): Self = StObject.set(x, "urlConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlConfigUndefined: Self = StObject.set(x, "urlConfig", js.undefined)
    
    @scala.inline
    def setXhrSettings(value: XHRSettingsObject): Self = StObject.set(x, "xhrSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhrSettingsUndefined: Self = StObject.set(x, "xhrSettings", js.undefined)
  }
}
