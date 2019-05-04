package typings
package atPhosphorAlgorithmLib.libFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm/lib/filter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def filter[T](
    `object`: atPhosphorAlgorithmLib.libIterMod.IterableOrArrayLike[T],
    fn: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean]
  ): atPhosphorAlgorithmLib.libIterMod.IIterator[T] = js.native
}

