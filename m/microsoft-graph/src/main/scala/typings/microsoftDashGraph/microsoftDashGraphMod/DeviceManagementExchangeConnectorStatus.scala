package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.none_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.connectionPending
  - typings.microsoftDashGraph.microsoftDashGraphStrings.connected
  - typings.microsoftDashGraph.microsoftDashGraphStrings.disconnected
*/
trait DeviceManagementExchangeConnectorStatus extends js.Object

object DeviceManagementExchangeConnectorStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typings.microsoftDashGraph.microsoftDashGraphStrings.connected = this.cast("connected")
  @scala.inline
  def connectionPending: typings.microsoftDashGraph.microsoftDashGraphStrings.connectionPending = this.cast("connectionPending")
  @scala.inline
  def disconnected: typings.microsoftDashGraph.microsoftDashGraphStrings.disconnected = this.cast("disconnected")
  @scala.inline
  def none: none_ = this.cast("none")
}

