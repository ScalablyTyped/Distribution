package typings.pFifo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-fifo", JSImport.Namespace)
  @js.native
  open class ^[T] ()
    extends StObject
       with PFifo[T] {
    
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    
    /* CompleteClass */
    override def push(chunk: T): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def shift(): js.Promise[T] = js.native
  }
  
  trait PFifo[T] extends StObject {
    
    def isEmpty(): Boolean
    
    def push(chunk: T): js.Promise[Unit]
    
    def shift(): js.Promise[T]
  }
  object PFifo {
    
    inline def apply[T](isEmpty: () => Boolean, push: T => js.Promise[Unit], shift: () => js.Promise[T]): PFifo[T] = {
      val __obj = js.Dynamic.literal(isEmpty = js.Any.fromFunction0(isEmpty), push = js.Any.fromFunction1(push), shift = js.Any.fromFunction0(shift))
      __obj.asInstanceOf[PFifo[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PFifo[?], T] (val x: Self & PFifo[T]) extends AnyVal {
      
      inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      inline def setPush(value: T => js.Promise[Unit]): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      inline def setShift(value: () => js.Promise[T]): Self = StObject.set(x, "shift", js.Any.fromFunction0(value))
    }
  }
}
