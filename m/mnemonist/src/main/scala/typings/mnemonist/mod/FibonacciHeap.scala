package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.fibonacciHeapMod.FibonacciHeapComparator
import typings.mnemonist.fibonacciHeapMod.default
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "FibonacciHeap")
@js.native
// Constructor
class FibonacciHeap[T] () extends default[T] {
  def this(comparator: FibonacciHeapComparator[T]) = this()
}

/* static members */
@JSImport("mnemonist", "FibonacciHeap")
@js.native
object FibonacciHeap extends js.Object {
  def from[I](iterable: StringDictionary[I]): typings.mnemonist.fibonacciHeapMod.FibonacciHeap[I] = js.native
  def from[I](iterable: StringDictionary[I], comparator: FibonacciHeapComparator[I]): typings.mnemonist.fibonacciHeapMod.FibonacciHeap[I] = js.native
  // Statics
  def from[I](iterable: Iterable[I]): typings.mnemonist.fibonacciHeapMod.FibonacciHeap[I] = js.native
  def from[I](iterable: Iterable[I], comparator: FibonacciHeapComparator[I]): typings.mnemonist.fibonacciHeapMod.FibonacciHeap[I] = js.native
}

