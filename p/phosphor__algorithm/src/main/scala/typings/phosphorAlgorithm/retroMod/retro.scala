package typings.phosphorAlgorithm.retroMod

import typings.phosphorAlgorithm.iterMod.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm/lib/retro", "retro")
@js.native
object retro extends js.Object {
  def apply[T](`object`: RetroableOrArrayLike[T]): IIterator[T] = js.native
}

