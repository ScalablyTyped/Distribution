package typings.mnemonist.heapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist/heap", "pop")
@js.native
object pop extends js.Object {
  def apply[T](comparator: HeapComparator[T], heap: js.Array[T]): T = js.native
}

