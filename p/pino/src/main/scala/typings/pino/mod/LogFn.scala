package typings.pino.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogFn extends js.Object {
  def apply(msg: String, args: js.Any*): Unit = js.native
  def apply(obj: js.Object, msg: js.UndefOr[scala.Nothing], args: js.Any*): Unit = js.native
  def apply(obj: js.Object, msg: String, args: js.Any*): Unit = js.native
}

