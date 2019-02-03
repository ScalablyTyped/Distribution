package typings
package ngDashCommandLib.ngCommandNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ngCommand.Command")
@js.native
class Command protected () extends ICommand {
  def this($scope: angularLib.angularMod.angularNs.IScope, execute: js.Function0[angularLib.angularMod.angularNs.IPromise[_]]) = this()
  def this($scope: angularLib.angularMod.angularNs.IScope, execute: js.Function0[angularLib.angularMod.angularNs.IPromise[_]], canExecute: js.Function0[scala.Boolean]) = this()
  /**
  		* Determines whether the command can execute or not.
  		*/
  /* CompleteClass */
  override var canExecute: scala.Boolean = js.native
  /**
  		* Determines whether the command is currently executing.
  		*/
  /* CompleteClass */
  override var isExecuting: scala.Boolean = js.native
  /**
  		* Executes the command function.
  		*/
  /* CompleteClass */
  override def execute(): angularLib.angularMod.angularNs.IPromise[_] = js.native
}

/* static members */
@JSGlobal("ngCommand.Command")
@js.native
object Command extends js.Object {
  var id: java.lang.String = js.native
}

