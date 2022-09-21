package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pool[T] extends StObject {
  
  def clear(): Unit
  
  def free(item: T): Unit
  
  def freeAll(items: ArrayLike[T]): Unit
  
  /* private */ var instantiator: Any
  
  /* private */ var items: Any
  
  def obtain(): T
}
object Pool {
  
  inline def apply[T](
    clear: () => Unit,
    free: T => Unit,
    freeAll: ArrayLike[T] => Unit,
    instantiator: Any,
    items: Any,
    obtain: () => T
  ): Pool[T] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), free = js.Any.fromFunction1(free), freeAll = js.Any.fromFunction1(freeAll), instantiator = instantiator.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], obtain = js.Any.fromFunction0(obtain))
    __obj.asInstanceOf[Pool[T]]
  }
  
  extension [Self <: Pool[?], T](x: Self & Pool[T]) {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setFree(value: T => Unit): Self = StObject.set(x, "free", js.Any.fromFunction1(value))
    
    inline def setFreeAll(value: ArrayLike[T] => Unit): Self = StObject.set(x, "freeAll", js.Any.fromFunction1(value))
    
    inline def setInstantiator(value: Any): Self = StObject.set(x, "instantiator", value.asInstanceOf[js.Any])
    
    inline def setItems(value: Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setObtain(value: () => T): Self = StObject.set(x, "obtain", js.Any.fromFunction0(value))
  }
}
