package typings.node.vmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vm", "runInNewContext")
@js.native
object runInNewContext extends js.Object {
  def apply(code: String): js.Any = js.native
  def apply(code: String, sandbox: js.UndefOr[scala.Nothing], options: String): js.Any = js.native
  def apply(code: String, sandbox: js.UndefOr[scala.Nothing], options: RunningScriptOptions): js.Any = js.native
  def apply(code: String, sandbox: Context): js.Any = js.native
  def apply(code: String, sandbox: Context, options: String): js.Any = js.native
  def apply(code: String, sandbox: Context, options: RunningScriptOptions): js.Any = js.native
}

