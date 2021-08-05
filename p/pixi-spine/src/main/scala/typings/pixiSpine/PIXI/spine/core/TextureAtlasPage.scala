package typings.pixiSpine.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextureAtlasPage extends StObject {
  
  var baseTexture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.BaseTexture */ js.Any
  
  var height: Double
  
  var magFilter: TextureFilter
  
  var minFilter: TextureFilter
  
  var name: String
  
  def setFilters(): Unit
  
  var uWrap: TextureWrap
  
  var vWrap: TextureWrap
  
  var width: Double
}
object TextureAtlasPage {
  
  inline def apply(
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
  
  extension [Self <: TextureAtlasPage](x: Self) {
    
    inline def setBaseTexture(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.BaseTexture */ js.Any
    ): Self = StObject.set(x, "baseTexture", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setMagFilter(value: TextureFilter): Self = StObject.set(x, "magFilter", value.asInstanceOf[js.Any])
    
    inline def setMinFilter(value: TextureFilter): Self = StObject.set(x, "minFilter", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSetFilters(value: () => Unit): Self = StObject.set(x, "setFilters", js.Any.fromFunction0(value))
    
    inline def setUWrap(value: TextureWrap): Self = StObject.set(x, "uWrap", value.asInstanceOf[js.Any])
    
    inline def setVWrap(value: TextureWrap): Self = StObject.set(x, "vWrap", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
