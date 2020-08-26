package typings.mnemonist.heapMod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist/heap", "nlargest")
@js.native
object nlargest extends js.Object {
  def apply[T](comparator: HeapComparator[T], n: Double, values: Iterable[T]): js.Array[T] = js.native
  def apply[T](n: Double, values: Iterable[T]): js.Array[T] = js.native
}

