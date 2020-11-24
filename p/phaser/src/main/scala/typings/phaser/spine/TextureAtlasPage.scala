package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextureAtlasPage extends js.Object {
  
  var height: Double = js.native
  
  var magFilter: TextureFilter = js.native
  
  var minFilter: TextureFilter = js.native
  
  var name: String = js.native
  
  var texture: Texture = js.native
  
  var uWrap: TextureWrap = js.native
  
  var vWrap: TextureWrap = js.native
  
  var width: Double = js.native
}
object TextureAtlasPage {
  
  @scala.inline
  def apply(
    height: Double,
    magFilter: TextureFilter,
    minFilter: TextureFilter,
    name: String,
    texture: Texture,
    uWrap: TextureWrap,
    vWrap: TextureWrap,
    width: Double
  ): TextureAtlasPage = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], magFilter = magFilter.asInstanceOf[js.Any], minFilter = minFilter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any], uWrap = uWrap.asInstanceOf[js.Any], vWrap = vWrap.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextureAtlasPage]
  }
  
  @scala.inline
  implicit class TextureAtlasPageOps[Self <: TextureAtlasPage] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagFilter(value: TextureFilter): Self = this.set("magFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinFilter(value: TextureFilter): Self = this.set("minFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTexture(value: Texture): Self = this.set("texture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUWrap(value: TextureWrap): Self = this.set("uWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVWrap(value: TextureWrap): Self = this.set("vWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
