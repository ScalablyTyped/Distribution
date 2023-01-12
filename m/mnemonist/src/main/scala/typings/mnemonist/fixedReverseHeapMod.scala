package typings.mnemonist

import typings.mnemonist.utilsTypesMod.IArrayLikeConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fixedReverseHeapMod {
  
  @JSImport("mnemonist/fixed-reverse-heap", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with FixedReverseHeap[T] {
    def this(ArrayClass: IArrayLikeConstructor, capacity: Double) = this()
    // Constructor
    def this(ArrayClass: IArrayLikeConstructor, comparator: HeapComparator[T], capacity: Double) = this()
    
    // Members
    /* CompleteClass */
    var capacity: Double = js.native
    
    // Methods
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def consume(): js.Iterable[T] = js.native
    
    /* CompleteClass */
    override def inspect(): Any = js.native
    
    /* CompleteClass */
    override def push(item: T): Double = js.native
    
    /* CompleteClass */
    var size: Double = js.native
    
    /* CompleteClass */
    override def toArray(): js.Iterable[T] = js.native
  }
  
  trait FixedReverseHeap[T] extends StObject {
    
    // Members
    var capacity: Double
    
    // Methods
    def clear(): Unit
    
    def consume(): js.Iterable[T]
    
    def inspect(): Any
    
    def push(item: T): Double
    
    var size: Double
    
    def toArray(): js.Iterable[T]
  }
  object FixedReverseHeap {
    
    inline def apply[T](
      capacity: Double,
      clear: () => Unit,
      consume: () => js.Iterable[T],
      inspect: () => Any,
      push: T => Double,
      size: Double,
      toArray: () => js.Iterable[T]
    ): FixedReverseHeap[T] = {
      val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), consume = js.Any.fromFunction0(consume), inspect = js.Any.fromFunction0(inspect), push = js.Any.fromFunction1(push), size = size.asInstanceOf[js.Any], toArray = js.Any.fromFunction0(toArray))
      __obj.asInstanceOf[FixedReverseHeap[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FixedReverseHeap[?], T] (val x: Self & FixedReverseHeap[T]) extends AnyVal {
      
      inline def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setConsume(value: () => js.Iterable[T]): Self = StObject.set(x, "consume", js.Any.fromFunction0(value))
      
      inline def setInspect(value: () => Any): Self = StObject.set(x, "inspect", js.Any.fromFunction0(value))
      
      inline def setPush(value: T => Double): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setToArray(value: () => js.Iterable[T]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
    }
  }
  
  type HeapComparator[T] = js.Function2[/* a */ T, /* b */ T, Double]
}
