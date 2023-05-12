package typings.phaser.Phaser.Types.Loader.FileTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoFileConfig extends StObject {
  
  /**
    * The key to use for this file, or a file configuration object.
    */
  var key: String | VideoFileConfig
  
  /**
    * Does the video have an audio track? If not you can enable auto-playing on it.
    */
  var noAudio: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The absolute or relative URLs to load the video files from.
    */
  var url: js.UndefOr[String | (js.Array[String | VideoFileURLConfig]) | VideoFileURLConfig] = js.undefined
}
object VideoFileConfig {
  
  inline def apply(key: String | VideoFileConfig): VideoFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoFileConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoFileConfig] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String | VideoFileConfig): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setNoAudio(value: Boolean): Self = StObject.set(x, "noAudio", value.asInstanceOf[js.Any])
    
    inline def setNoAudioUndefined: Self = StObject.set(x, "noAudio", js.undefined)
    
    inline def setUrl(value: String | (js.Array[String | VideoFileURLConfig]) | VideoFileURLConfig): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUrlVarargs(value: (String | VideoFileURLConfig)*): Self = StObject.set(x, "url", js.Array(value*))
  }
}
