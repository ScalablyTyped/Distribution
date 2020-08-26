package typings.mnemonist.fixedReverseHeapMod

import typings.mnemonist.typesMod.IArrayLikeConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist/fixed-reverse-heap", JSImport.Default)
@js.native
class default[T] protected () extends FixedReverseHeap[T] {
  def this(ArrayClass: IArrayLikeConstructor, capacity: Double) = this()
  // Constructor
  def this(ArrayClass: IArrayLikeConstructor, comparator: HeapComparator[T], capacity: Double) = this()
}

