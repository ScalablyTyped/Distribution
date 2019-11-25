package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.deviceDefault
  - typings.microsoftDashGraph.microsoftDashGraphStrings.disabled
  - typings.microsoftDashGraph.microsoftDashGraphStrings.queueInbound
  - typings.microsoftDashGraph.microsoftDashGraphStrings.queueOutbound
  - typings.microsoftDashGraph.microsoftDashGraphStrings.queueBoth
*/
trait FirewallPacketQueueingMethodType extends js.Object

object FirewallPacketQueueingMethodType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deviceDefault: typings.microsoftDashGraph.microsoftDashGraphStrings.deviceDefault = this.cast("deviceDefault")
  @scala.inline
  def disabled: typings.microsoftDashGraph.microsoftDashGraphStrings.disabled = this.cast("disabled")
  @scala.inline
  def queueBoth: typings.microsoftDashGraph.microsoftDashGraphStrings.queueBoth = this.cast("queueBoth")
  @scala.inline
  def queueInbound: typings.microsoftDashGraph.microsoftDashGraphStrings.queueInbound = this.cast("queueInbound")
  @scala.inline
  def queueOutbound: typings.microsoftDashGraph.microsoftDashGraphStrings.queueOutbound = this.cast("queueOutbound")
}

