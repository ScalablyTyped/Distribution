package typings.pixiJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseTexture extends StObject {
  
  var baseTexture: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[Boolean] = js.undefined
  
  var texture: js.UndefOr[Boolean] = js.undefined
}
object BaseTexture {
  
  inline def apply(): BaseTexture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseTexture]
  }
  
  extension [Self <: BaseTexture](x: Self) {
    
    inline def setBaseTexture(value: Boolean): Self = StObject.set(x, "baseTexture", value.asInstanceOf[js.Any])
    
    inline def setBaseTextureUndefined: Self = StObject.set(x, "baseTexture", js.undefined)
    
    inline def setChildren(value: Boolean): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setTexture(value: Boolean): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
    
    inline def setTextureUndefined: Self = StObject.set(x, "texture", js.undefined)
  }
}
