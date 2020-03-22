package typings.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.openfin.openfinStrings.connected
  - typings.openfin.openfinStrings.disconnected
*/
trait OpenFinExternalApplicationEventType extends js.Object

object OpenFinExternalApplicationEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typings.openfin.openfinStrings.connected = this.cast("connected")
  @scala.inline
  def disconnected: typings.openfin.openfinStrings.disconnected = this.cast("disconnected")
}

