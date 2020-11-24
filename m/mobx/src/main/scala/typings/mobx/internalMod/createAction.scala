package typings.mobx.internalMod

import typings.mobx.coreActionMod.IAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/internal", "createAction")
@js.native
object createAction extends js.Object {
  
  def apply(actionName: String, fn: js.Function): js.Function with IAction = js.native
  def apply(actionName: String, fn: js.Function, ref: js.Object): js.Function with IAction = js.native
}
