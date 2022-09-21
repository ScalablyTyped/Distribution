package typings.mnemonist

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heapMod {
  
  @JSImport("mnemonist/heap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mnemonist/heap", JSImport.Default)
  @js.native
  // Constructor
  open class default[T] ()
    extends StObject
       with Heap[T] {
    def this(comparator: HeapComparator[T]) = this()
    
    // Methods
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def consume(): js.Array[T] = js.native
    
    /* CompleteClass */
    override def inspect(): Any = js.native
    
    /* CompleteClass */
    override def peek(): js.UndefOr[T] = js.native
    
    /* CompleteClass */
    override def pop(): js.UndefOr[T] = js.native
    
    /* CompleteClass */
    override def push(item: T): Double = js.native
    
    /* CompleteClass */
    override def pushpop(item: T): js.UndefOr[T] = js.native
    
    /* CompleteClass */
    override def replace(item: T): js.UndefOr[T] = js.native
    
    // Members
    /* CompleteClass */
    var size: Double = js.native
    
    /* CompleteClass */
    override def toArray(): js.Array[T] = js.native
  }
  /* static members */
  object default {
    
    @JSImport("mnemonist/heap", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    // Statics
    inline def from[I](iterable: js.Iterable[I]): Heap[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[Heap[I]]
    inline def from[I](iterable: js.Iterable[I], comparator: HeapComparator[I]): Heap[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[Heap[I]]
    inline def from[I](iterable: StringDictionary[I]): Heap[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[Heap[I]]
    inline def from[I](iterable: StringDictionary[I], comparator: HeapComparator[I]): Heap[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[Heap[I]]
  }
  
  @JSImport("mnemonist/heap", "MaxHeap")
  @js.native
  // Constructor
  open class MaxHeap[T] () extends StObject {
    def this(comparator: HeapComparator[T]) = this()
    
    // Methods
    def clear(): Unit = js.native
    
    def consume(): js.Array[T] = js.native
    
    def inspect(): Any = js.native
    
    def peek(): js.UndefOr[T] = js.native
    
    def pop(): js.UndefOr[T] = js.native
    
    def push(item: T): Double = js.native
    
    def pushpop(item: T): js.UndefOr[T] = js.native
    
    def replace(item: T): js.UndefOr[T] = js.native
    
    // Members
    var size: Double = js.native
    
    def toArray(): js.Array[T] = js.native
  }
  /* static members */
  object MaxHeap {
    
    @JSImport("mnemonist/heap", "MaxHeap")
    @js.native
    val ^ : js.Any = js.native
    
    // Statics
    inline def from[I](iterable: js.Iterable[I]): Heap[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[Heap[I]]
    inline def from[I](iterable: js.Iterable[I], comparator: HeapComparator[I]): Heap[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[Heap[I]]
    inline def from[I](iterable: StringDictionary[I]): Heap[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[Heap[I]]
    inline def from[I](iterable: StringDictionary[I], comparator: HeapComparator[I]): Heap[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[Heap[I]]
  }
  
  @JSImport("mnemonist/heap", "MinHeap")
  @js.native
  // Constructor
  open class MinHeap[T] () extends StObject {
    def this(comparator: HeapComparator[T]) = this()
    
    // Methods
    def clear(): Unit = js.native
    
    def consume(): js.Array[T] = js.native
    
    def inspect(): Any = js.native
    
    def peek(): js.UndefOr[T] = js.native
    
    def pop(): js.UndefOr[T] = js.native
    
    def push(item: T): Double = js.native
    
    def pushpop(item: T): js.UndefOr[T] = js.native
    
    def replace(item: T): js.UndefOr[T] = js.native
    
    // Members
    var size: Double = js.native
    
    def toArray(): js.Array[T] = js.native
  }
  /* static members */
  object MinHeap {
    
    @JSImport("mnemonist/heap", "MinHeap")
    @js.native
    val ^ : js.Any = js.native
    
    // Statics
    inline def from[I](iterable: js.Iterable[I]): Heap[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[Heap[I]]
    inline def from[I](iterable: js.Iterable[I], comparator: HeapComparator[I]): Heap[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[Heap[I]]
    inline def from[I](iterable: StringDictionary[I]): Heap[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[Heap[I]]
    inline def from[I](iterable: StringDictionary[I], comparator: HeapComparator[I]): Heap[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[Heap[I]]
  }
  
  inline def consume[T](comparator: HeapComparator[T], heap: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("consume")(comparator.asInstanceOf[js.Any], heap.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def heapify[T](comparator: HeapComparator[T], array: js.Array[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("heapify")(comparator.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def nlargest[T](comparator: HeapComparator[T], n: Double, values: js.Iterable[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("nlargest")(comparator.asInstanceOf[js.Any], n.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def nlargest[T](n: Double, values: js.Iterable[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("nlargest")(n.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def nsmallest[T](comparator: HeapComparator[T], n: Double, values: js.Iterable[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("nsmallest")(comparator.asInstanceOf[js.Any], n.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def nsmallest[T](n: Double, values: js.Iterable[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("nsmallest")(n.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def pop[T](comparator: HeapComparator[T], heap: js.Array[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pop")(comparator.asInstanceOf[js.Any], heap.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def push[T](comparator: HeapComparator[T], heap: js.Array[T], item: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(comparator.asInstanceOf[js.Any], heap.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def pushpop[T](comparator: HeapComparator[T], heap: js.Array[T], item: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pushpop")(comparator.asInstanceOf[js.Any], heap.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def replace[T](comparator: HeapComparator[T], heap: js.Array[T], item: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(comparator.asInstanceOf[js.Any], heap.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[T]
  
  trait Heap[T] extends StObject {
    
    // Methods
    def clear(): Unit
    
    def consume(): js.Array[T]
    
    def inspect(): Any
    
    def peek(): js.UndefOr[T]
    
    def pop(): js.UndefOr[T]
    
    def push(item: T): Double
    
    def pushpop(item: T): js.UndefOr[T]
    
    def replace(item: T): js.UndefOr[T]
    
    // Members
    var size: Double
    
    def toArray(): js.Array[T]
  }
  object Heap {
    
    inline def apply[T](
      clear: () => Unit,
      consume: () => js.Array[T],
      inspect: () => Any,
      peek: () => js.UndefOr[T],
      pop: () => js.UndefOr[T],
      push: T => Double,
      pushpop: T => js.UndefOr[T],
      replace: T => js.UndefOr[T],
      size: Double,
      toArray: () => js.Array[T]
    ): Heap[T] = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), consume = js.Any.fromFunction0(consume), inspect = js.Any.fromFunction0(inspect), peek = js.Any.fromFunction0(peek), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), pushpop = js.Any.fromFunction1(pushpop), replace = js.Any.fromFunction1(replace), size = size.asInstanceOf[js.Any], toArray = js.Any.fromFunction0(toArray))
      __obj.asInstanceOf[Heap[T]]
    }
    
    extension [Self <: Heap[?], T](x: Self & Heap[T]) {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setConsume(value: () => js.Array[T]): Self = StObject.set(x, "consume", js.Any.fromFunction0(value))
      
      inline def setInspect(value: () => Any): Self = StObject.set(x, "inspect", js.Any.fromFunction0(value))
      
      inline def setPeek(value: () => js.UndefOr[T]): Self = StObject.set(x, "peek", js.Any.fromFunction0(value))
      
      inline def setPop(value: () => js.UndefOr[T]): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
      
      inline def setPush(value: T => Double): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      inline def setPushpop(value: T => js.UndefOr[T]): Self = StObject.set(x, "pushpop", js.Any.fromFunction1(value))
      
      inline def setReplace(value: T => js.UndefOr[T]): Self = StObject.set(x, "replace", js.Any.fromFunction1(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setToArray(value: () => js.Array[T]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
    }
  }
  
  type HeapComparator[T] = js.Function2[/* a */ T, /* b */ T, Double]
}
