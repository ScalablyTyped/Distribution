package typings
package ngDashCommandLib.ngCommandNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	* Command proxy object.
	*/
trait ICommand extends js.Object {
  /**
  		* Determines whether the command can execute or not.
  		*/
  var canExecute: scala.Boolean
  /**
  		* Determines whether the command is currently executing.
  		*/
  var isExecuting: scala.Boolean
  /**
  		* Executes the command function.
  		*/
  def execute(): angularLib.angularMod.angularNs.IPromise[_]
}

object ICommand {
  @scala.inline
  def apply(
    canExecute: scala.Boolean,
    execute: js.Function0[angularLib.angularMod.angularNs.IPromise[_]],
    isExecuting: scala.Boolean
  ): ICommand = {
    val __obj = js.Dynamic.literal(canExecute = canExecute, execute = execute, isExecuting = isExecuting)
  
    __obj.asInstanceOf[ICommand]
  }
}

