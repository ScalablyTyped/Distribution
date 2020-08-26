package typings.obliterator

import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("obliterator/consume", JSImport.Namespace)
@js.native
object consumeMod extends js.Object {
  def default[T](iterator: Iterator[T, _, js.UndefOr[scala.Nothing]]): Unit = js.native
  def default[T](iterator: Iterator[T, _, js.UndefOr[scala.Nothing]], steps: Double): Unit = js.native
}

