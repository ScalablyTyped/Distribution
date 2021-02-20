package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScenePluginFileConfig extends StObject {
  
  /**
    * The default file extension to use if no url is provided.
    */
  var extension: js.UndefOr[String] = js.native
  
  /**
    * The key of the file. Must be unique within the Loader.
    */
  var key: String = js.native
  
  /**
    * If this plugin is to be added to the Scene, this is the property key for it.
    */
  var sceneKey: js.UndefOr[String] = js.native
  
  /**
    * If this plugin is to be added to Scene.Systems, this is the property key for it.
    */
  var systemKey: js.UndefOr[String] = js.native
  
  /**
    * The absolute or relative URL to load the file from. Or, a Scene Plugin.
    */
  var url: js.UndefOr[String | js.Function] = js.native
  
  /**
    * Extra XHR Settings specifically for this file.
    */
  var xhrSettings: js.UndefOr[XHRSettingsObject] = js.native
}
object ScenePluginFileConfig {
  
  @scala.inline
  def apply(key: String): ScenePluginFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScenePluginFileConfig]
  }
  
  @scala.inline
  implicit class ScenePluginFileConfigMutableBuilder[Self <: ScenePluginFileConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSceneKey(value: String): Self = StObject.set(x, "sceneKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSceneKeyUndefined: Self = StObject.set(x, "sceneKey", js.undefined)
    
    @scala.inline
    def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemKeyUndefined: Self = StObject.set(x, "systemKey", js.undefined)
    
    @scala.inline
    def setUrl(value: String | js.Function): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setXhrSettings(value: XHRSettingsObject): Self = StObject.set(x, "xhrSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhrSettingsUndefined: Self = StObject.set(x, "xhrSettings", js.undefined)
  }
}
