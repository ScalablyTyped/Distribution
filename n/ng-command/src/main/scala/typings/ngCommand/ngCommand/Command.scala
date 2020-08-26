package typings.ngCommand.ngCommand

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Command extends ICommand

object Command {
  @scala.inline
  def apply(canExecute: Boolean, execute: () => js.Any, isExecuting: Boolean): Command = {
    val __obj = js.Dynamic.literal(canExecute = canExecute.asInstanceOf[js.Any], execute = js.Any.fromFunction0(execute), isExecuting = isExecuting.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
}

