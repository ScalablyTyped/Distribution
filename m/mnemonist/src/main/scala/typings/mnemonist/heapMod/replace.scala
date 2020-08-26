package typings.mnemonist.heapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist/heap", "replace")
@js.native
object replace extends js.Object {
  def apply[T](comparator: HeapComparator[T], heap: js.Array[T], item: T): T = js.native
}

