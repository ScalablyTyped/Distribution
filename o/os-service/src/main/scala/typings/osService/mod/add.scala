package typings.osService.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("os-service", "add")
@js.native
object add extends js.Object {
  def apply(name: String): Unit = js.native
  def apply(name: String, callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
  def apply(name: String, opts: AddOptions, callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
}

