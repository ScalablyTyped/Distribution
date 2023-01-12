package typings.playcanvas.mod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowMapCache extends StObject {
  
  def add(light: Any, shadowMap: Any): Unit
  
  def clear(): Unit
  
  def destroy(): Unit
  
  def get(device: Any, light: Any): Any
  
  def getKey(light: Any): String
  
  var shadowMapCache: Map[Any, Any]
}
object ShadowMapCache {
  
  inline def apply(
    add: (Any, Any) => Unit,
    clear: () => Unit,
    destroy: () => Unit,
    get: (Any, Any) => Any,
    getKey: Any => String,
    shadowMapCache: Map[Any, Any]
  ): ShadowMapCache = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), clear = js.Any.fromFunction0(clear), destroy = js.Any.fromFunction0(destroy), get = js.Any.fromFunction2(get), getKey = js.Any.fromFunction1(getKey), shadowMapCache = shadowMapCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowMapCache]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShadowMapCache] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: (Any, Any) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setGet(value: (Any, Any) => Any): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    
    inline def setGetKey(value: Any => String): Self = StObject.set(x, "getKey", js.Any.fromFunction1(value))
    
    inline def setShadowMapCache(value: Map[Any, Any]): Self = StObject.set(x, "shadowMapCache", value.asInstanceOf[js.Any])
  }
}
