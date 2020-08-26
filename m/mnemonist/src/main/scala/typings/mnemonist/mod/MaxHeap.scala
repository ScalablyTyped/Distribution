package typings.mnemonist.mod

import typings.mnemonist.heapMod.HeapComparator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "MaxHeap")
@js.native
// Constructor
class MaxHeap[T] ()
  extends typings.mnemonist.heapMod.MaxHeap[T] {
  def this(comparator: HeapComparator[T]) = this()
}

