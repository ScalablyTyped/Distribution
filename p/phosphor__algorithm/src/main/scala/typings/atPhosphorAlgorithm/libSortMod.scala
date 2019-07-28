package typings.atPhosphorAlgorithm

import typings.atPhosphorAlgorithm.libIterMod.IterableOrArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm/lib/sort", JSImport.Namespace)
@js.native
object libSortMod extends js.Object {
  def topologicSort[T](edges: IterableOrArrayLike[js.Tuple2[T, T]]): js.Array[T] = js.native
}

