package typings.mobx.internalMod

import typings.std.IArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "executeAction")
@js.native
object executeAction extends js.Object {
  def apply(actionName: String, fn: js.Function): js.Any = js.native
  def apply(actionName: String, fn: js.Function, scope: js.Any): js.Any = js.native
  def apply(actionName: String, fn: js.Function, scope: js.Any, args: IArguments): js.Any = js.native
}

