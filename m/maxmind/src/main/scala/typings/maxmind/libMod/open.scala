package typings.maxmind.libMod

import typings.maxmind.libReaderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("maxmind/lib", "open")
@js.native
object open extends js.Object {
  def apply[T](filepath: String): js.Promise[default[T]] = js.native
  def apply[T](filepath: String, opts: js.UndefOr[scala.Nothing], cb: Callback): js.Promise[default[T]] = js.native
  def apply[T](filepath: String, opts: OpenOpts): js.Promise[default[T]] = js.native
  def apply[T](filepath: String, opts: OpenOpts, cb: Callback): js.Promise[default[T]] = js.native
}

