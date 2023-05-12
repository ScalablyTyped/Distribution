package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import typings.std.AudioContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioFileConfig extends StObject {
  
  /**
    * The optional AudioContext this file will use to process itself.
    */
  var context: js.UndefOr[AudioContext] = js.undefined
  
  /**
    * The key of the file. Must be unique within the Loader and Audio Cache.
    */
  var key: String
  
  /**
    * The absolute or relative URLs to load the audio files from.
    */
  var url: js.UndefOr[String | (js.Array[AudioFileURLConfig | String]) | AudioFileURLConfig] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioFileConfig] (val x: Self) extends AnyVal {
    
    inline def setContext(value: AudioContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String | (js.Array[AudioFileURLConfig | String]) | AudioFileURLConfig): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUrlVarargs(value: (AudioFileURLConfig | String)*): Self = StObject.set(x, "url", js.Array(value*))
    
    inline def setXhrSettings(value: XHRSettingsObject): Self = StObject.set(x, "xhrSettings", value.asInstanceOf[js.Any])
    
    inline def setXhrSettingsUndefined: Self = StObject.set(x, "xhrSettings", js.undefined)
  }
}
