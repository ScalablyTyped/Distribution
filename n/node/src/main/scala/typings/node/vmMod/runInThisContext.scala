package typings.node.vmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vm", "runInThisContext")
@js.native
object runInThisContext extends js.Object {
  def apply(code: java.lang.String): js.Any = js.native
  def apply(code: java.lang.String, options: java.lang.String): js.Any = js.native
  def apply(code: java.lang.String, options: RunningScriptOptions): js.Any = js.native
}

