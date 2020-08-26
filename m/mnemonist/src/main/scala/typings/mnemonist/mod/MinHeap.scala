package typings.mnemonist.mod

import typings.mnemonist.heapMod.HeapComparator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "MinHeap")
@js.native
// Constructor
class MinHeap[T] ()
  extends typings.mnemonist.heapMod.MinHeap[T] {
  def this(comparator: HeapComparator[T]) = this()
}

