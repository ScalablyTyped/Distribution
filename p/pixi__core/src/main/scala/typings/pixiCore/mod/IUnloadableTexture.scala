package typings.pixiCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUnloadableTexture extends StObject {
  
  var _texture: Texture[Resource] | RenderTexture
  
  var children: js.Array[IUnloadableTexture]
}
object IUnloadableTexture {
  
  inline def apply(_texture: Texture[Resource] | RenderTexture, children: js.Array[IUnloadableTexture]): IUnloadableTexture = {
    val __obj = js.Dynamic.literal(_texture = _texture.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUnloadableTexture]
  }
  
  extension [Self <: IUnloadableTexture](x: Self) {
    
    inline def setChildren(value: js.Array[IUnloadableTexture]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: IUnloadableTexture*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def set_texture(value: Texture[Resource] | RenderTexture): Self = StObject.set(x, "_texture", value.asInstanceOf[js.Any])
  }
}
