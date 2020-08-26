package typings.mnemonist.heapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist/heap", "push")
@js.native
object push extends js.Object {
  def apply[T](comparator: HeapComparator[T], heap: js.Array[T], item: T): Unit = js.native
}

