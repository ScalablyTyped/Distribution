package typings.mnemonist.mod

import typings.mnemonist.fixedReverseHeapMod.HeapComparator
import typings.mnemonist.fixedReverseHeapMod.default
import typings.mnemonist.typesMod.IArrayLikeConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "FixedReverseHeap")
@js.native
class FixedReverseHeap[T] protected () extends default[T] {
  def this(ArrayClass: IArrayLikeConstructor, capacity: Double) = this()
  // Constructor
  def this(ArrayClass: IArrayLikeConstructor, comparator: HeapComparator[T], capacity: Double) = this()
}

