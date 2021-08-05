package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import typings.std.AudioContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioFileConfig extends StObject {
  
  /**
    * The AudioContext this file will use to process itself.
    */
  var audioContext: js.UndefOr[AudioContext] = js.undefined
  
  /**
    * The key of the file. Must be unique within the Loader and Audio Cache.
    */
  var key: String
  
  /**
    * The absolute or relative URL to load the file from.
    */
  var urlConfig: js.UndefOr[String] = js.undefined
  
  /**
    * Extra XHR Settings specifically for this file.
    */
  var xhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
}
object AudioFileConfig {
  
  inline def apply(key: String): AudioFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioFileConfig]
  }
  
  extension [Self <: AudioFileConfig](x: Self) {
    
    inline def setAudioContext(value: AudioContext): Self = StObject.set(x, "audioContext", value.asInstanceOf[js.Any])
    
    inline def setAudioContextUndefined: Self = StObject.set(x, "audioContext", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setUrlConfig(value: String): Self = StObject.set(x, "urlConfig", value.asInstanceOf[js.Any])
    
    inline def setUrlConfigUndefined: Self = StObject.set(x, "urlConfig", js.undefined)
    
    inline def setXhrSettings(value: XHRSettingsObject): Self = StObject.set(x, "xhrSettings", value.asInstanceOf[js.Any])
    
    inline def setXhrSettingsUndefined: Self = StObject.set(x, "xhrSettings", js.undefined)
  }
}
