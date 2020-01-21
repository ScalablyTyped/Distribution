package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.none_
  - typings.microsoftGraph.microsoftGraphStrings.connectionPending
  - typings.microsoftGraph.microsoftGraphStrings.connected
  - typings.microsoftGraph.microsoftGraphStrings.disconnected
*/
trait DeviceManagementExchangeConnectorStatus extends js.Object

object DeviceManagementExchangeConnectorStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typings.microsoftGraph.microsoftGraphStrings.connected = this.cast("connected")
  @scala.inline
  def connectionPending: typings.microsoftGraph.microsoftGraphStrings.connectionPending = this.cast("connectionPending")
  @scala.inline
  def disconnected: typings.microsoftGraph.microsoftGraphStrings.disconnected = this.cast("disconnected")
  @scala.inline
  def none: none_ = this.cast("none")
}

