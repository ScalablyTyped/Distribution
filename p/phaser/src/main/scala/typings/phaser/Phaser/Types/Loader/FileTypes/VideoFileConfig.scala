package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoFileConfig extends StObject {
  
  /**
    * Load the video as a data blob, or via the Video element?
    */
  var asBlob: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The key to use for this file, or a file configuration object.
    */
  var key: String | VideoFileConfig
  
  /**
    * The load event to listen for when _not_ loading as a blob. Either 'loadeddata', 'canplay' or 'canplaythrough'.
    */
  var loadEvent: js.UndefOr[String] = js.undefined
  
  /**
    * Does the video have an audio track? If not you can enable auto-playing on it.
    */
  var noAudio: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The absolute or relative URL to load this file from in a config object.
    */
  var urlConfig: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Extra XHR Settings specifically for this file.
    */
  var xhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
}
object VideoFileConfig {
  
  inline def apply(key: String | VideoFileConfig): VideoFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoFileConfig]
  }
  
  extension [Self <: VideoFileConfig](x: Self) {
    
    inline def setAsBlob(value: Boolean): Self = StObject.set(x, "asBlob", value.asInstanceOf[js.Any])
    
    inline def setAsBlobUndefined: Self = StObject.set(x, "asBlob", js.undefined)
    
    inline def setKey(value: String | VideoFileConfig): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setLoadEvent(value: String): Self = StObject.set(x, "loadEvent", value.asInstanceOf[js.Any])
    
    inline def setLoadEventUndefined: Self = StObject.set(x, "loadEvent", js.undefined)
    
    inline def setNoAudio(value: Boolean): Self = StObject.set(x, "noAudio", value.asInstanceOf[js.Any])
    
    inline def setNoAudioUndefined: Self = StObject.set(x, "noAudio", js.undefined)
    
    inline def setUrlConfig(value: js.Any): Self = StObject.set(x, "urlConfig", value.asInstanceOf[js.Any])
    
    inline def setUrlConfigUndefined: Self = StObject.set(x, "urlConfig", js.undefined)
    
    inline def setXhrSettings(value: XHRSettingsObject): Self = StObject.set(x, "xhrSettings", value.asInstanceOf[js.Any])
    
    inline def setXhrSettingsUndefined: Self = StObject.set(x, "xhrSettings", js.undefined)
  }
}
