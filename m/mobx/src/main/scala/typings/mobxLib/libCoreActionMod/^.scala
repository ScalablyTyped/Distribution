package typings
package mobxLib.libCoreActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/core/action", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def allowStateChanges[T](allowStateChanges: scala.Boolean, func: js.Function0[T]): T = js.native
  def allowStateChangesEnd(prev: scala.Boolean): scala.Unit = js.native
  def allowStateChangesInsideComputed[T](func: js.Function0[T]): T = js.native
  def allowStateChangesStart(allowStateChanges: scala.Boolean): scala.Boolean = js.native
  def createAction(actionName: java.lang.String, fn: js.Function): js.Function with mobxLib.libCoreActionMod.IAction = js.native
  def executeAction(actionName: java.lang.String, fn: js.Function): js.Any = js.native
  def executeAction(actionName: java.lang.String, fn: js.Function, scope: js.Any): js.Any = js.native
  def executeAction(actionName: java.lang.String, fn: js.Function, scope: js.Any, args: stdLib.IArguments): js.Any = js.native
}

