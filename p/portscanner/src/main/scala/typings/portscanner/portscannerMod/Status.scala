package typings.portscanner.portscannerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.portscanner.portscannerStrings.open
  - typings.portscanner.portscannerStrings.closed
*/
trait Status extends js.Object

object Status {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typings.portscanner.portscannerStrings.closed = this.cast("closed")
  @scala.inline
  def open: typings.portscanner.portscannerStrings.open = this.cast("open")
}

