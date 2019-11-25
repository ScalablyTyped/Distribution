package typings.meteorDashTypings.meteorDdpMod.DDP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.meteorDashTypings.meteorDashTypingsStrings.connected
  - typings.meteorDashTypings.meteorDashTypingsStrings.connecting
  - typings.meteorDashTypings.meteorDashTypingsStrings.failed
  - typings.meteorDashTypings.meteorDashTypingsStrings.waiting
  - typings.meteorDashTypings.meteorDashTypingsStrings.offline
*/
trait Status extends js.Object

object Status {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typings.meteorDashTypings.meteorDashTypingsStrings.connected = this.cast("connected")
  @scala.inline
  def connecting: typings.meteorDashTypings.meteorDashTypingsStrings.connecting = this.cast("connecting")
  @scala.inline
  def failed: typings.meteorDashTypings.meteorDashTypingsStrings.failed = this.cast("failed")
  @scala.inline
  def offline: typings.meteorDashTypings.meteorDashTypingsStrings.offline = this.cast("offline")
  @scala.inline
  def waiting: typings.meteorDashTypings.meteorDashTypingsStrings.waiting = this.cast("waiting")
}

