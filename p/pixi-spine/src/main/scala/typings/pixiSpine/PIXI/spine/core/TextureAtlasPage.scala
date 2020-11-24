package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextureAtlasPage extends js.Object {
  
  var baseTexture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.BaseTexture */ js.Any = js.native
  
  var height: Double = js.native
  
  var magFilter: TextureFilter = js.native
  
  var minFilter: TextureFilter = js.native
  
  var name: String = js.native
  
  def setFilters(): Unit = js.native
  
  var uWrap: TextureWrap = js.native
  
  var vWrap: TextureWrap = js.native
  
  var width: Double = js.native
}
object TextureAtlasPage {
  
  @scala.inline
  def apply(
    baseTexture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.BaseTexture */ js.Any,
    height: Double,
    magFilter: TextureFilter,
    minFilter: TextureFilter,
    name: String,
    setFilters: () => Unit,
    uWrap: TextureWrap,
    vWrap: TextureWrap,
    width: Double
  ): TextureAtlasPage = {
    val __obj = js.Dynamic.literal(baseTexture = baseTexture.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], magFilter = magFilter.asInstanceOf[js.Any], minFilter = minFilter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setFilters = js.Any.fromFunction0(setFilters), uWrap = uWrap.asInstanceOf[js.Any], vWrap = vWrap.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
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
    def setBaseTexture(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.BaseTexture */ js.Any
    ): Self = this.set("baseTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagFilter(value: TextureFilter): Self = this.set("magFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinFilter(value: TextureFilter): Self = this.set("minFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFilters(value: () => Unit): Self = this.set("setFilters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUWrap(value: TextureWrap): Self = this.set("uWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVWrap(value: TextureWrap): Self = this.set("vWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
