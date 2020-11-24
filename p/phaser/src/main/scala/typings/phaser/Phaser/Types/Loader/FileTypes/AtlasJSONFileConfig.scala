package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AtlasJSONFileConfig extends js.Object {
  
  /**
    * The default file extension to use for the atlas json if no url is provided.
    */
  var atlasExtension: js.UndefOr[String] = js.native
  
  /**
    * The absolute or relative URL to load the atlas json file from. Or, a well formed JSON object to use instead.
    */
  var atlasURL: js.UndefOr[js.Object | String] = js.native
  
  /**
    * Extra XHR Settings specifically for the atlas json file.
    */
  var atlasXhrSettings: js.UndefOr[XHRSettingsObject] = js.native
  
  /**
    * The key of the file. Must be unique within both the Loader and the Texture Manager.
    */
  var key: String = js.native
  
  /**
    * The filename of an associated normal map. It uses the same path and url to load as the texture image.
    */
  var normalMap: js.UndefOr[String] = js.native
  
  /**
    * The default file extension to use for the image texture if no url is provided.
    */
  var textureExtension: js.UndefOr[String] = js.native
  
  /**
    * The absolute or relative URL to load the texture image file from.
    */
  var textureURL: js.UndefOr[String] = js.native
  
  /**
    * Extra XHR Settings specifically for the texture image file.
    */
  var textureXhrSettings: js.UndefOr[XHRSettingsObject] = js.native
}
object AtlasJSONFileConfig {
  
  @scala.inline
  def apply(key: String): AtlasJSONFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtlasJSONFileConfig]
  }
  
  @scala.inline
  implicit class AtlasJSONFileConfigOps[Self <: AtlasJSONFileConfig] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtlasExtension(value: String): Self = this.set("atlasExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAtlasExtension: Self = this.set("atlasExtension", js.undefined)
    
    @scala.inline
    def setAtlasURL(value: js.Object | String): Self = this.set("atlasURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAtlasURL: Self = this.set("atlasURL", js.undefined)
    
    @scala.inline
    def setAtlasXhrSettings(value: XHRSettingsObject): Self = this.set("atlasXhrSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAtlasXhrSettings: Self = this.set("atlasXhrSettings", js.undefined)
    
    @scala.inline
    def setNormalMap(value: String): Self = this.set("normalMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalMap: Self = this.set("normalMap", js.undefined)
    
    @scala.inline
    def setTextureExtension(value: String): Self = this.set("textureExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextureExtension: Self = this.set("textureExtension", js.undefined)
    
    @scala.inline
    def setTextureURL(value: String): Self = this.set("textureURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextureURL: Self = this.set("textureURL", js.undefined)
    
    @scala.inline
    def setTextureXhrSettings(value: XHRSettingsObject): Self = this.set("textureXhrSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextureXhrSettings: Self = this.set("textureXhrSettings", js.undefined)
  }
}
