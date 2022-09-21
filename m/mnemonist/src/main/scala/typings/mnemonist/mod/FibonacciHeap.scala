package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.fibonacciHeapMod.FibonacciHeapComparator
import typings.mnemonist.fibonacciHeapMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "FibonacciHeap")
@js.native
// Constructor
open class FibonacciHeap[T] () extends default[T] {
  def this(comparator: FibonacciHeapComparator[T]) = this()
}
/* static members */
object FibonacciHeap {
  
  @JSImport("mnemonist", "FibonacciHeap")
  @js.native
  val ^ : js.Any = js.native
  
  // Statics
  inline def from[I](iterable: js.Iterable[I]): typings.mnemonist.fibonacciHeapMod.FibonacciHeap[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.mnemonist.fibonacciHeapMod.FibonacciHeap[I]]
  inline def from[I](iterable: js.Iterable[I], comparator: FibonacciHeapComparator[I]): typings.mnemonist.fibonacciHeapMod.FibonacciHeap[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.fibonacciHeapMod.FibonacciHeap[I]]
  inline def from[I](iterable: StringDictionary[I]): typings.mnemonist.fibonacciHeapMod.FibonacciHeap[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.mnemonist.fibonacciHeapMod.FibonacciHeap[I]]
  inline def from[I](iterable: StringDictionary[I], comparator: FibonacciHeapComparator[I]): typings.mnemonist.fibonacciHeapMod.FibonacciHeap[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.fibonacciHeapMod.FibonacciHeap[I]]
}
