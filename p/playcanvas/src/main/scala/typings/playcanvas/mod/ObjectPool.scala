package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectPool extends StObject {
  
  var _constructor: Any
  
  var _count: Double
  
  var _pool: js.Array[Any]
  
  def _resize(size: Any): Unit
  
  def allocate(): Any
  
  def freeAll(): Unit
}
object ObjectPool {
  
  inline def apply(
    _constructor: Any,
    _count: Double,
    _pool: js.Array[Any],
    _resize: Any => Unit,
    allocate: () => Any,
    freeAll: () => Unit
  ): ObjectPool = {
    val __obj = js.Dynamic.literal(_constructor = _constructor.asInstanceOf[js.Any], _count = _count.asInstanceOf[js.Any], _pool = _pool.asInstanceOf[js.Any], _resize = js.Any.fromFunction1(_resize), allocate = js.Any.fromFunction0(allocate), freeAll = js.Any.fromFunction0(freeAll))
    __obj.asInstanceOf[ObjectPool]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectPool] (val x: Self) extends AnyVal {
    
    inline def setAllocate(value: () => Any): Self = StObject.set(x, "allocate", js.Any.fromFunction0(value))
    
    inline def setFreeAll(value: () => Unit): Self = StObject.set(x, "freeAll", js.Any.fromFunction0(value))
    
    inline def set_constructor(value: Any): Self = StObject.set(x, "_constructor", value.asInstanceOf[js.Any])
    
    inline def set_count(value: Double): Self = StObject.set(x, "_count", value.asInstanceOf[js.Any])
    
    inline def set_pool(value: js.Array[Any]): Self = StObject.set(x, "_pool", value.asInstanceOf[js.Any])
    
    inline def set_poolVarargs(value: Any*): Self = StObject.set(x, "_pool", js.Array(value*))
    
    inline def set_resize(value: Any => Unit): Self = StObject.set(x, "_resize", js.Any.fromFunction1(value))
  }
}
