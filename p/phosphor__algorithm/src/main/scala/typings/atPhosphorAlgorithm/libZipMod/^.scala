package typings.atPhosphorAlgorithm.libZipMod

import typings.atPhosphorAlgorithm.libIterMod.IIterator
import typings.atPhosphorAlgorithm.libIterMod.IterableOrArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm/lib/zip", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def zip[T](objects: IterableOrArrayLike[T]*): IIterator[js.Array[T]] = js.native
}

