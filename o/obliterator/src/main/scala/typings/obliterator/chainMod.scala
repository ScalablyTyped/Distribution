package typings.obliterator

import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("obliterator/chain", JSImport.Namespace)
@js.native
object chainMod extends js.Object {
  def default[T](iterators: (Iterator[T, _, js.UndefOr[scala.Nothing]])*): typings.obliterator.iteratorMod.default[T] = js.native
}

