package typings.maxmind.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maxmind", "open")
@js.native
object open extends js.Object {
  
  def apply[T](filepath: String): js.Promise[typings.mmdbLib.mod.default[T]] = js.native
  def apply[T](filepath: String, opts: js.UndefOr[scala.Nothing], cb: Callback): js.Promise[typings.mmdbLib.mod.default[T]] = js.native
  def apply[T](filepath: String, opts: OpenOpts): js.Promise[typings.mmdbLib.mod.default[T]] = js.native
  def apply[T](filepath: String, opts: OpenOpts, cb: Callback): js.Promise[typings.mmdbLib.mod.default[T]] = js.native
}
