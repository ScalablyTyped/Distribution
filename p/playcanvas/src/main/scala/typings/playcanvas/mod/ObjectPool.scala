package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A pool of reusable objects of the same type. Designed to promote reuse of objects to reduce
  * garbage collection.
  *
  * @ignore
  */
trait ObjectPool extends StObject {
  
  var _constructor: js.Function
  
  /**
    * The number of object instances that are currently allocated.
    *
    * @type {number}
    * @private
    */
  /* private */ var _count: Any
  
  /**
    * Array of object instances.
    *
    * @type {object[]}
    * @private
    */
  /* private */ var _pool: Any
  
  /**
    * @param {number} size - The number of object instances to allocate.
    * @private
    */
  /* private */ var _resize: Any
  
  /**
    * Returns an object instance from the pool. If no instances are available, the pool will be
    * doubled in size and a new instance will be returned.
    *
    * @returns {object} An object instance from the pool.
    */
  def allocate(): js.Object
  
  /**
    * All object instances in the pool will be available again. The pool itself will not be
    * resized.
    */
  def freeAll(): Unit
}
object ObjectPool {
  
  inline def apply(
    _constructor: js.Function,
    _count: Any,
    _pool: Any,
    _resize: Any,
    allocate: () => js.Object,
    freeAll: () => Unit
  ): ObjectPool = {
    val __obj = js.Dynamic.literal(_constructor = _constructor.asInstanceOf[js.Any], _count = _count.asInstanceOf[js.Any], _pool = _pool.asInstanceOf[js.Any], _resize = _resize.asInstanceOf[js.Any], allocate = js.Any.fromFunction0(allocate), freeAll = js.Any.fromFunction0(freeAll))
    __obj.asInstanceOf[ObjectPool]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectPool] (val x: Self) extends AnyVal {
    
    inline def setAllocate(value: () => js.Object): Self = StObject.set(x, "allocate", js.Any.fromFunction0(value))
    
    inline def setFreeAll(value: () => Unit): Self = StObject.set(x, "freeAll", js.Any.fromFunction0(value))
    
    inline def set_constructor(value: js.Function): Self = StObject.set(x, "_constructor", value.asInstanceOf[js.Any])
    
    inline def set_count(value: Any): Self = StObject.set(x, "_count", value.asInstanceOf[js.Any])
    
    inline def set_pool(value: Any): Self = StObject.set(x, "_pool", value.asInstanceOf[js.Any])
    
    inline def set_resize(value: Any): Self = StObject.set(x, "_resize", value.asInstanceOf[js.Any])
  }
}
