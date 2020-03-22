package typings.openfin.apiGlobalHotkeyMod

import typings.openfin.openfinStrings.registered
import typings.openfin.openfinStrings.unregistered
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.openfin.openfinStrings.registered
  - typings.openfin.openfinStrings.unregistered
*/
trait nonHotkeyEvents extends js.Object

object nonHotkeyEvents {
  @scala.inline
  def REGISTERED: registered = this.cast("registered")
  @scala.inline
  def UNREGISTERED: unregistered = this.cast("unregistered")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

