package typings.ngCommand.ngCommand

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
  def execute(): js.Any
}

object ICommand {
  @scala.inline
  def apply(canExecute: Boolean, execute: () => js.Any, isExecuting: Boolean): ICommand = {
    val __obj = js.Dynamic.literal(canExecute = canExecute.asInstanceOf[js.Any], execute = js.Any.fromFunction0(execute), isExecuting = isExecuting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommand]
  }
}

