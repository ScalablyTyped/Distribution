package typings.mobx.coreActionMod

import typings.std.IArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/core/action", "_startAction")
@js.native
object startAction extends js.Object {
  def apply(actionName: String, scope: js.Any): IActionRunInfo = js.native
  def apply(actionName: String, scope: js.Any, args: IArguments): IActionRunInfo = js.native
}

