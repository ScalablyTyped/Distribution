package typings.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.openfin.openfinStrings.registered
  - typings.openfin.openfinStrings.unregistered
*/
trait OpenFinGlobalHotkeyEventType extends js.Object

object OpenFinGlobalHotkeyEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def registered: typings.openfin.openfinStrings.registered = this.cast("registered")
  @scala.inline
  def unregistered: typings.openfin.openfinStrings.unregistered = this.cast("unregistered")
}

