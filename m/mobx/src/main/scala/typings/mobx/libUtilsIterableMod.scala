package typings.mobx

import typings.std.IterableIterator
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/utils/iterable", JSImport.Namespace)
@js.native
object libUtilsIterableMod extends js.Object {
  def makeIterable[T](iterator: Iterator[T, _, js.UndefOr[scala.Nothing]]): IterableIterator[T] = js.native
}

