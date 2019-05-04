package typings
package atPhosphorAlgorithmLib.libMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm/lib/map", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def map[T, U](
    `object`: atPhosphorAlgorithmLib.libIterMod.IterableOrArrayLike[T],
    fn: js.Function2[/* value */ T, /* index */ scala.Double, U]
  ): atPhosphorAlgorithmLib.libIterMod.IIterator[U] = js.native
}

