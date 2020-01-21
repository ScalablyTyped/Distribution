package typings.naverWhale

import typings.chrome.chrome.commands.Command
import typings.chrome.chrome.commands.CommandEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcommands extends js.Object {
  var onCommand: CommandEvent
  def getAll(callback: js.Function1[/* commands */ js.Array[Command], Unit]): Unit
}

object Typeofcommands {
  @scala.inline
  def apply(getAll: js.Function1[/* commands */ js.Array[Command], Unit] => Unit, onCommand: CommandEvent): Typeofcommands = {
    val __obj = js.Dynamic.literal(getAll = js.Any.fromFunction1(getAll), onCommand = onCommand.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Typeofcommands]
  }
}

