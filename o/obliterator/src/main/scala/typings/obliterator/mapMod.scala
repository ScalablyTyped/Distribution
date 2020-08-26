package typings.obliterator

import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("obliterator/map", JSImport.Namespace)
@js.native
object mapMod extends js.Object {
  def default[S, T](predicate: MapFunction[S, T], iterator: Iterator[S, _, js.UndefOr[scala.Nothing]]): typings.obliterator.iteratorMod.default[T] = js.native
  type MapFunction[S, T] = js.Function1[/* item */ S, T]
}

