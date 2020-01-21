package typings.phosphorCommands.mod.CommandRegistry

import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/commands", "CommandRegistry.keystrokeForKeydownEvent")
@js.native
object keystrokeForKeydownEvent extends js.Object {
  /**
    * Create a normalized keystroke for a `'keydown'` event.
    *
    * @param event - The event object for a `'keydown'` event.
    *
    * @returns A normalized keystroke, or an empty string if the event
    *   does not represent a valid keystroke for the given layout.
    */
  def apply(event: KeyboardEvent): String = js.native
}

