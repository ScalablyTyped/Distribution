package typings
package naverDashWhaleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcommands extends js.Object {
  var onCommand: chromeLib.chromeNs.commandsNs.CommandEvent
  def getAll(callback: js.Function1[/* commands */ js.Array[chromeLib.chromeNs.commandsNs.Command], scala.Unit]): scala.Unit
}

object Typeofcommands {
  @scala.inline
  def apply(
    getAll: js.Function1[/* commands */ js.Array[chromeLib.chromeNs.commandsNs.Command], scala.Unit] => scala.Unit,
    onCommand: chromeLib.chromeNs.commandsNs.CommandEvent
  ): Typeofcommands = {
    val __obj = js.Dynamic.literal(getAll = js.Any.fromFunction1(getAll), onCommand = onCommand)
  
    __obj.asInstanceOf[Typeofcommands]
  }
}

