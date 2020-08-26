package typings.minappEnv.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("setTimeout")
@js.native
object setTimeout extends js.Object {
  def apply(handler: js.Any, timeout: js.UndefOr[scala.Nothing], args: js.Any*): Double = js.native
  def apply(handler: js.Any, timeout: js.Any, args: js.Any*): Double = js.native
  def apply(handler: js.Function1[/* repeated */ js.Any, Unit], timeout: Double): Double = js.native
}

