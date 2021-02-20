package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoFileConfig extends StObject {
  
  /**
    * Load the video as a data blob, or via the Video element?
    */
  var asBlob: js.UndefOr[Boolean] = js.native
  
  /**
    * The key to use for this file, or a file configuration object.
    */
  var key: String | VideoFileConfig = js.native
  
  /**
    * The load event to listen for when _not_ loading as a blob. Either 'loadeddata', 'canplay' or 'canplaythrough'.
    */
  var loadEvent: js.UndefOr[String] = js.native
  
  /**
    * Does the video have an audio track? If not you can enable auto-playing on it.
    */
  var noAudio: js.UndefOr[Boolean] = js.native
  
  /**
    * The absolute or relative URL to load this file from in a config object.
    */
  var urlConfig: js.UndefOr[js.Any] = js.native
  
  /**
    * Extra XHR Settings specifically for this file.
    */
  var xhrSettings: js.UndefOr[XHRSettingsObject] = js.native
}
object VideoFileConfig {
  
  @scala.inline
  def apply(key: String | VideoFileConfig): VideoFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoFileConfig]
  }
  
  @scala.inline
  implicit class VideoFileConfigMutableBuilder[Self <: VideoFileConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsBlob(value: Boolean): Self = StObject.set(x, "asBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsBlobUndefined: Self = StObject.set(x, "asBlob", js.undefined)
    
    @scala.inline
    def setKey(value: String | VideoFileConfig): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadEvent(value: String): Self = StObject.set(x, "loadEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadEventUndefined: Self = StObject.set(x, "loadEvent", js.undefined)
    
    @scala.inline
    def setNoAudio(value: Boolean): Self = StObject.set(x, "noAudio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoAudioUndefined: Self = StObject.set(x, "noAudio", js.undefined)
    
    @scala.inline
    def setUrlConfig(value: js.Any): Self = StObject.set(x, "urlConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlConfigUndefined: Self = StObject.set(x, "urlConfig", js.undefined)
    
    @scala.inline
    def setXhrSettings(value: XHRSettingsObject): Self = StObject.set(x, "xhrSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhrSettingsUndefined: Self = StObject.set(x, "xhrSettings", js.undefined)
  }
}
