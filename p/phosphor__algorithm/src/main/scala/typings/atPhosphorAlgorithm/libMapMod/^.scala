package typings.atPhosphorAlgorithm.libMapMod

import typings.atPhosphorAlgorithm.libIterMod.IIterator
import typings.atPhosphorAlgorithm.libIterMod.IterableOrArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm/lib/map", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def map[T, U](`object`: IterableOrArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, U]): IIterator[U] = js.native
}

