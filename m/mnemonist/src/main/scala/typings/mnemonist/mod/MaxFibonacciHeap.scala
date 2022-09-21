package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.fibonacciHeapMod.FibonacciHeapComparator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "MaxFibonacciHeap")
@js.native
// Constructor
open class MaxFibonacciHeap[T] ()
  extends typings.mnemonist.fibonacciHeapMod.MaxFibonacciHeap[T] {
  def this(comparator: FibonacciHeapComparator[T]) = this()
}
/* static members */
object MaxFibonacciHeap {
  
  @JSImport("mnemonist", "MaxFibonacciHeap")
  @js.native
  val ^ : js.Any = js.native
  
  // Statics
  inline def from[I](iterable: js.Iterable[I]): typings.mnemonist.fibonacciHeapMod.FibonacciHeap[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.mnemonist.fibonacciHeapMod.FibonacciHeap[I]]
  inline def from[I](iterable: StringDictionary[I]): typings.mnemonist.fibonacciHeapMod.FibonacciHeap[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.mnemonist.fibonacciHeapMod.FibonacciHeap[I]]
}
