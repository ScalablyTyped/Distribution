package typings
package pDashForeverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-forever", JSImport.Namespace)
@js.native
object pDashForeverMod extends js.Object {
  val end: js.Symbol = js.native
  def apply[T](fn: js.Function1[/* previousValue */ js.UndefOr[T], T | js.Thenable[T] | js.Symbol]): js.Promise[scala.Unit] = js.native
  def apply[T](fn: js.Function1[/* previousValue */ T, T | js.Thenable[T] | js.Symbol], initialValue: T): js.Promise[scala.Unit] = js.native
}

