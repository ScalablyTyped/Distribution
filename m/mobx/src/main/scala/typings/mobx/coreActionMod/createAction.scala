package typings.mobx.coreActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/core/action", "createAction")
@js.native
object createAction extends js.Object {
  def apply(actionName: String, fn: js.Function): js.Function with IAction = js.native
  def apply(actionName: String, fn: js.Function, ref: js.Object): js.Function with IAction = js.native
}

