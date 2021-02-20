package typings.pixiSpine.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pool[T] extends StObject {
  
  def clear(): Unit = js.native
  
  def free(item: T): Unit = js.native
  
  def freeAll(items: ArrayLike[T]): Unit = js.native
  
  var instantiator: js.Any = js.native
  
  var items: js.Any = js.native
  
  def obtain(): T = js.native
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
  implicit class PoolMutableBuilder[Self <: Pool[_], T] (val x: Self with Pool[T]) extends AnyVal {
    
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
