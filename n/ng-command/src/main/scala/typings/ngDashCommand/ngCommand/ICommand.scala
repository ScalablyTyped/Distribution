package typings.ngDashCommand.ngCommand

import typings.angular.angularMod.IPromise
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
  var canExecute: Boolean
  /**
  		* Determines whether the command is currently executing.
  		*/
  var isExecuting: Boolean
  /**
  		* Executes the command function.
  		*/
  def execute(): IPromise[_]
}

object ICommand {
  @scala.inline
  def apply(canExecute: Boolean, execute: () => IPromise[_], isExecuting: Boolean): ICommand = {
    val __obj = js.Dynamic.literal(canExecute = canExecute, execute = js.Any.fromFunction0(execute), isExecuting = isExecuting)
  
    __obj.asInstanceOf[ICommand]
  }
}

