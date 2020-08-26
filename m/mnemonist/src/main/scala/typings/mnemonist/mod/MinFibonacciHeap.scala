package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.fibonacciHeapMod.FibonacciHeapComparator
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "MinFibonacciHeap")
@js.native
// Constructor
class MinFibonacciHeap[T] ()
  extends typings.mnemonist.fibonacciHeapMod.MinFibonacciHeap[T] {
  def this(comparator: FibonacciHeapComparator[T]) = this()
}

/* static members */
@JSImport("mnemonist", "MinFibonacciHeap")
@js.native
object MinFibonacciHeap extends js.Object {
  def from[I](iterable: StringDictionary[I]): typings.mnemonist.fibonacciHeapMod.FibonacciHeap[I] = js.native
  // Statics
  def from[I](iterable: Iterable[I]): typings.mnemonist.fibonacciHeapMod.FibonacciHeap[I] = js.native
}

