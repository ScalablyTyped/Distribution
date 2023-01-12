package typings.mnemonist

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fibonacciHeapMod {
  
  @JSImport("mnemonist/fibonacci-heap", JSImport.Default)
  @js.native
  // Constructor
  open class default[T] ()
    extends StObject
       with FibonacciHeap[T] {
    def this(comparator: FibonacciHeapComparator[T]) = this()
    
    // Methods
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def inspect(): Any = js.native
    
    /* CompleteClass */
    override def peek(): js.UndefOr[T] = js.native
    
    /* CompleteClass */
    override def pop(): js.UndefOr[T] = js.native
    
    /* CompleteClass */
    override def push(item: T): Double = js.native
    
    // Members
    /* CompleteClass */
    var size: Double = js.native
  }
  /* static members */
  object default {
    
    @JSImport("mnemonist/fibonacci-heap", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    // Statics
    inline def from[I](iterable: js.Iterable[I]): FibonacciHeap[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[FibonacciHeap[I]]
    inline def from[I](iterable: js.Iterable[I], comparator: FibonacciHeapComparator[I]): FibonacciHeap[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[FibonacciHeap[I]]
    inline def from[I](iterable: StringDictionary[I]): FibonacciHeap[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[FibonacciHeap[I]]
    inline def from[I](iterable: StringDictionary[I], comparator: FibonacciHeapComparator[I]): FibonacciHeap[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[FibonacciHeap[I]]
  }
  
  @JSImport("mnemonist/fibonacci-heap", "MaxFibonacciHeap")
  @js.native
  // Constructor
  open class MaxFibonacciHeap[T] () extends StObject {
    def this(comparator: FibonacciHeapComparator[T]) = this()
    
    // Methods
    def clear(): Unit = js.native
    
    def inspect(): Any = js.native
    
    def peek(): js.UndefOr[T] = js.native
    
    def pop(): js.UndefOr[T] = js.native
    
    def push(item: T): Double = js.native
    
    // Members
    var size: Double = js.native
  }
  /* static members */
  object MaxFibonacciHeap {
    
    @JSImport("mnemonist/fibonacci-heap", "MaxFibonacciHeap")
    @js.native
    val ^ : js.Any = js.native
    
    // Statics
    inline def from[I](iterable: js.Iterable[I]): FibonacciHeap[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[FibonacciHeap[I]]
    inline def from[I](iterable: StringDictionary[I]): FibonacciHeap[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[FibonacciHeap[I]]
  }
  
  @JSImport("mnemonist/fibonacci-heap", "MinFibonacciHeap")
  @js.native
  // Constructor
  open class MinFibonacciHeap[T] () extends StObject {
    def this(comparator: FibonacciHeapComparator[T]) = this()
    
    // Methods
    def clear(): Unit = js.native
    
    def inspect(): Any = js.native
    
    def peek(): js.UndefOr[T] = js.native
    
    def pop(): js.UndefOr[T] = js.native
    
    def push(item: T): Double = js.native
    
    // Members
    var size: Double = js.native
  }
  /* static members */
  object MinFibonacciHeap {
    
    @JSImport("mnemonist/fibonacci-heap", "MinFibonacciHeap")
    @js.native
    val ^ : js.Any = js.native
    
    // Statics
    inline def from[I](iterable: js.Iterable[I]): FibonacciHeap[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[FibonacciHeap[I]]
    inline def from[I](iterable: StringDictionary[I]): FibonacciHeap[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[FibonacciHeap[I]]
  }
  
  trait FibonacciHeap[T] extends StObject {
    
    // Methods
    def clear(): Unit
    
    def inspect(): Any
    
    def peek(): js.UndefOr[T]
    
    def pop(): js.UndefOr[T]
    
    def push(item: T): Double
    
    // Members
    var size: Double
  }
  object FibonacciHeap {
    
    inline def apply[T](
      clear: () => Unit,
      inspect: () => Any,
      peek: () => js.UndefOr[T],
      pop: () => js.UndefOr[T],
      push: T => Double,
      size: Double
    ): FibonacciHeap[T] = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), inspect = js.Any.fromFunction0(inspect), peek = js.Any.fromFunction0(peek), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[FibonacciHeap[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FibonacciHeap[?], T] (val x: Self & FibonacciHeap[T]) extends AnyVal {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setInspect(value: () => Any): Self = StObject.set(x, "inspect", js.Any.fromFunction0(value))
      
      inline def setPeek(value: () => js.UndefOr[T]): Self = StObject.set(x, "peek", js.Any.fromFunction0(value))
      
      inline def setPop(value: () => js.UndefOr[T]): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
      
      inline def setPush(value: T => Double): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  type FibonacciHeapComparator[T] = js.Function2[/* a */ T, /* b */ T, Double]
}
