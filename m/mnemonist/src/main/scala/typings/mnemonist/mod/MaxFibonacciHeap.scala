package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.fibonacciHeapMod.FibonacciHeapComparator
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "MaxFibonacciHeap")
@js.native
// Constructor
class MaxFibonacciHeap[T] ()
  extends typings.mnemonist.fibonacciHeapMod.MaxFibonacciHeap[T] {
  def this(comparator: FibonacciHeapComparator[T]) = this()
}

/* static members */
@JSImport("mnemonist", "MaxFibonacciHeap")
@js.native
object MaxFibonacciHeap extends js.Object {
  def from[I](iterable: StringDictionary[I]): typings.mnemonist.fibonacciHeapMod.FibonacciHeap[I] = js.native
  // Statics
  def from[I](iterable: Iterable[I]): typings.mnemonist.fibonacciHeapMod.FibonacciHeap[I] = js.native
}

