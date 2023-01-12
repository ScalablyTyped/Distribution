package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowMap extends StObject {
  
  var cached: Boolean
  
  def destroy(): Unit
  
  var renderTargets: Any
  
  var texture: Any
}
object ShadowMap {
  
  inline def apply(cached: Boolean, destroy: () => Unit, renderTargets: Any, texture: Any): ShadowMap = {
    val __obj = js.Dynamic.literal(cached = cached.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), renderTargets = renderTargets.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShadowMap] (val x: Self) extends AnyVal {
    
    inline def setCached(value: Boolean): Self = StObject.set(x, "cached", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setRenderTargets(value: Any): Self = StObject.set(x, "renderTargets", value.asInstanceOf[js.Any])
    
    inline def setTexture(value: Any): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
  }
}
