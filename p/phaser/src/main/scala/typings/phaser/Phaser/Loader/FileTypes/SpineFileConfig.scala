package typings.phaser.Phaser.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpineFileConfig extends js.Object {
  
  var atlasExtension: js.UndefOr[String] = js.native
  
  var atlasURL: js.UndefOr[String] = js.native
  
  var atlasXhrSettings: js.UndefOr[XHRSettingsObject] = js.native
  
  var key: String = js.native
  
  var normalMap: js.UndefOr[String] = js.native
  
  var textureExtension: js.UndefOr[String] = js.native
  
  var textureURL: js.UndefOr[String] = js.native
  
  var textureXhrSettings: js.UndefOr[XHRSettingsObject] = js.native
}
object SpineFileConfig {
  
  @scala.inline
  def apply(key: String): SpineFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpineFileConfig]
  }
  
  @scala.inline
  implicit class SpineFileConfigOps[Self <: SpineFileConfig] (val x: Self) extends AnyVal {
    
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
    def setAtlasURL(value: String): Self = this.set("atlasURL", value.asInstanceOf[js.Any])
    
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
