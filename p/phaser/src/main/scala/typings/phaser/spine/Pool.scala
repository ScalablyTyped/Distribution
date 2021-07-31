package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pool[T] extends StObject {
  
  def clear(): Unit
  
  def free(item: T): Unit
  
  def freeAll(items: ArrayLike[T]): Unit
  
  var instantiator: js.Any
  
  var items: js.Any
  
  def obtain(): T
}
object Pool {
  
  @scala.inline
  def apply[T](
    clear: () => Unit,
    free: T => Unit,
    freeAll: ArrayLike[T] => Unit,
    instantiator: js.Any,
    items: js.Any,
    obtain: () => T
  ): Pool[T] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), free = js.Any.fromFunction1(free), freeAll = js.Any.fromFunction1(freeAll), instantiator = instantiator.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], obtain = js.Any.fromFunction0(obtain))
    __obj.asInstanceOf[Pool[T]]
  }
  
  @scala.inline
  implicit class PoolMutableBuilder[Self <: Pool[?], T] (val x: Self & Pool[T]) extends AnyVal {
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFree(value: T => Unit): Self = StObject.set(x, "free", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFreeAll(value: ArrayLike[T] => Unit): Self = StObject.set(x, "freeAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInstantiator(value: js.Any): Self = StObject.set(x, "instantiator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObtain(value: () => T): Self = StObject.set(x, "obtain", js.Any.fromFunction0(value))
  }
}
