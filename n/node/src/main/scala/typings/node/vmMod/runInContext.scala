package typings.node.vmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vm", "runInContext")
@js.native
object runInContext extends js.Object {
  def apply(code: java.lang.String, contextifiedSandbox: Context): js.Any = js.native
  def apply(code: java.lang.String, contextifiedSandbox: Context, options: java.lang.String): js.Any = js.native
  def apply(code: java.lang.String, contextifiedSandbox: Context, options: RunningScriptOptions): js.Any = js.native
}

