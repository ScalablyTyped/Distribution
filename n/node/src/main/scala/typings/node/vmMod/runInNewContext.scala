package typings.node.vmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vm", "runInNewContext")
@js.native
object runInNewContext extends js.Object {
  def apply(code: java.lang.String): js.Any = js.native
  def apply(code: java.lang.String, sandbox: Context): js.Any = js.native
  def apply(code: java.lang.String, sandbox: Context, options: java.lang.String): js.Any = js.native
  def apply(code: java.lang.String, sandbox: Context, options: RunningScriptOptions): js.Any = js.native
}

