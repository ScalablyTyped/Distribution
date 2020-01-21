package typings.mobx.internalMod

import typings.std.IterableIterator
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "makeIterable")
@js.native
object makeIterable extends js.Object {
  def apply[T](iterator: Iterator[T, _, js.UndefOr[scala.Nothing]]): IterableIterator[T] = js.native
}

