package typings.mnemonist.heapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist/heap", "heapify")
@js.native
object heapify extends js.Object {
  def apply[T](comparator: HeapComparator[T], array: js.Array[T]): Unit = js.native
}

