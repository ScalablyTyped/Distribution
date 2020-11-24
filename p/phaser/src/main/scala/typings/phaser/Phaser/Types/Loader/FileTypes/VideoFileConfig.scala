package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoFileConfig extends js.Object {
  
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
  implicit class VideoFileConfigOps[Self <: VideoFileConfig] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String | VideoFileConfig): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsBlob(value: Boolean): Self = this.set("asBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsBlob: Self = this.set("asBlob", js.undefined)
    
    @scala.inline
    def setLoadEvent(value: String): Self = this.set("loadEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadEvent: Self = this.set("loadEvent", js.undefined)
    
    @scala.inline
    def setNoAudio(value: Boolean): Self = this.set("noAudio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoAudio: Self = this.set("noAudio", js.undefined)
    
    @scala.inline
    def setUrlConfig(value: js.Any): Self = this.set("urlConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlConfig: Self = this.set("urlConfig", js.undefined)
    
    @scala.inline
    def setXhrSettings(value: XHRSettingsObject): Self = this.set("xhrSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXhrSettings: Self = this.set("xhrSettings", js.undefined)
  }
}
