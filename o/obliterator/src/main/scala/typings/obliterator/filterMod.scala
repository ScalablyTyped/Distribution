package typings.obliterator

import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("obliterator/filter", JSImport.Namespace)
@js.native
object filterMod extends js.Object {
  def default[T](predicate: PredicateFunction[T], iterator: Iterator[T, _, js.UndefOr[scala.Nothing]]): typings.obliterator.iteratorMod.default[T] = js.native
  type PredicateFunction[T] = js.Function1[/* item */ T, Boolean]
}

