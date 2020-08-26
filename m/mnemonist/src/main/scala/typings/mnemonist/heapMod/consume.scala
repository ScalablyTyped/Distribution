package typings.mnemonist.heapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist/heap", "consume")
@js.native
object consume extends js.Object {
  def apply[T](comparator: HeapComparator[T], heap: js.Array[T]): js.Array[T] = js.native
}

