package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.heapMod.HeapComparator
import typings.mnemonist.heapMod.default
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "Heap")
@js.native
// Constructor
class Heap[T] () extends default[T] {
  def this(comparator: HeapComparator[T]) = this()
}

/* static members */
@JSImport("mnemonist", "Heap")
@js.native
object Heap extends js.Object {
  def from[I](iterable: StringDictionary[I]): typings.mnemonist.heapMod.Heap[I] = js.native
  def from[I](iterable: StringDictionary[I], comparator: HeapComparator[I]): typings.mnemonist.heapMod.Heap[I] = js.native
  // Statics
  def from[I](iterable: Iterable[I]): typings.mnemonist.heapMod.Heap[I] = js.native
  def from[I](iterable: Iterable[I], comparator: HeapComparator[I]): typings.mnemonist.heapMod.Heap[I] = js.native
}

