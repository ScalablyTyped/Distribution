package typings.ngDashCommand.ngCommandNs

import typings.angular.angularMod.IPromise
import typings.angular.angularMod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ngCommand.Command")
@js.native
class Command protected () extends ICommand {
  def this($scope: IScope, execute: js.Function0[IPromise[_]]) = this()
  def this($scope: IScope, execute: js.Function0[IPromise[_]], canExecute: js.Function0[Boolean]) = this()
  /**
  		* Determines whether the command can execute or not.
  		*/
  /* CompleteClass */
  override var canExecute: Boolean = js.native
  /**
  		* Determines whether the command is currently executing.
  		*/
  /* CompleteClass */
  override var isExecuting: Boolean = js.native
  /**
  		* Executes the command function.
  		*/
  /* CompleteClass */
  override def execute(): IPromise[_] = js.native
}

/* static members */
@JSGlobal("ngCommand.Command")
@js.native
object Command extends js.Object {
  var id: String = js.native
}

