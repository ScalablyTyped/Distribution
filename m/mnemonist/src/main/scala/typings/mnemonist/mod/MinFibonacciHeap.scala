package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.fibonacciHeapMod.FibonacciHeapComparator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "MinFibonacciHeap")
@js.native
// Constructor
open class MinFibonacciHeap[T] ()
  extends typings.mnemonist.fibonacciHeapMod.MinFibonacciHeap[T] {
  def this(comparator: FibonacciHeapComparator[T]) = this()
}
/* static members */
object MinFibonacciHeap {
  
  @JSImport("mnemonist", "MinFibonacciHeap")
  @js.native
  val ^ : js.Any = js.native
  
  // Statics
  inline def from[I](iterable: js.Iterable[I]): typings.mnemonist.fibonacciHeapMod.FibonacciHeap[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.mnemonist.fibonacciHeapMod.FibonacciHeap[I]]
  inline def from[I](iterable: StringDictionary[I]): typings.mnemonist.fibonacciHeapMod.FibonacciHeap[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.mnemonist.fibonacciHeapMod.FibonacciHeap[I]]
}
