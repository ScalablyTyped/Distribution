package typings.mnemonist.fibonacciHeapMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist/fibonacci-heap", "MaxFibonacciHeap")
@js.native
// Constructor
class MaxFibonacciHeap[T] () extends js.Object {
  def this(comparator: FibonacciHeapComparator[T]) = this()
  // Members
  var size: Double = js.native
  // Methods
  def clear(): Unit = js.native
  def inspect(): js.Any = js.native
  def peek(): js.UndefOr[T] = js.native
  def pop(): js.UndefOr[T] = js.native
  def push(item: T): Double = js.native
}

/* static members */
@JSImport("mnemonist/fibonacci-heap", "MaxFibonacciHeap")
@js.native
object MaxFibonacciHeap extends js.Object {
  def from[I](iterable: StringDictionary[I]): FibonacciHeap[I] = js.native
  // Statics
  def from[I](iterable: Iterable[I]): FibonacciHeap[I] = js.native
}

