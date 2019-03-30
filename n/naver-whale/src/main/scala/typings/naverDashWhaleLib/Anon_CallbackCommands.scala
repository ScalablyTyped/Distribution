package typings
package naverDashWhaleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackCommands extends js.Object {
  var onCommand: chromeLib.chromeNs.commandsNs.CommandEvent
  def getAll(callback: js.Function1[/* commands */ js.Array[chromeLib.chromeNs.commandsNs.Command], scala.Unit]): scala.Unit
}

object Anon_CallbackCommands {
  @scala.inline
  def apply(
    getAll: js.Function1[/* commands */ js.Array[chromeLib.chromeNs.commandsNs.Command], scala.Unit] => scala.Unit,
    onCommand: chromeLib.chromeNs.commandsNs.CommandEvent
  ): Anon_CallbackCommands = {
    val __obj = js.Dynamic.literal(getAll = js.Any.fromFunction1(getAll), onCommand = onCommand)
  
    __obj.asInstanceOf[Anon_CallbackCommands]
  }
}

