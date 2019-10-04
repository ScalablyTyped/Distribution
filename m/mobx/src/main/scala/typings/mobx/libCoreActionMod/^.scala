package typings.mobx.libCoreActionMod

import typings.std.IArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/core/action", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def _endAction(runInfo: IActionRunInfo): Unit = js.native
  def _startAction(actionName: String, scope: js.Any): IActionRunInfo = js.native
  def _startAction(actionName: String, scope: js.Any, args: IArguments): IActionRunInfo = js.native
  def allowStateChanges[T](allowStateChanges: Boolean, func: js.Function0[T]): T = js.native
  def allowStateChangesEnd(prev: Boolean): Unit = js.native
  def allowStateChangesInsideComputed[T](func: js.Function0[T]): T = js.native
  def allowStateChangesStart(allowStateChanges: Boolean): Boolean = js.native
  def createAction(actionName: String, fn: js.Function): js.Function with IAction = js.native
  def createAction(actionName: String, fn: js.Function, ref: js.Object): js.Function with IAction = js.native
  def executeAction(actionName: String, fn: js.Function): js.Any = js.native
  def executeAction(actionName: String, fn: js.Function, scope: js.Any): js.Any = js.native
  def executeAction(actionName: String, fn: js.Function, scope: js.Any, args: IArguments): js.Any = js.native
}

