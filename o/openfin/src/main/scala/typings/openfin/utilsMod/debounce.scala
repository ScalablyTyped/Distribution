package typings.openfin.utilsMod

import typings.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/platform/utils", "debounce")
@js.native
object debounce extends js.Object {
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](callback: T, delay: Double, resizing: Boolean): js.Function1[/* args */ Parameters[T], Unit] = js.native
}

