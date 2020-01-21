package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.deviceDefault
  - typings.microsoftGraph.microsoftGraphStrings.disabled
  - typings.microsoftGraph.microsoftGraphStrings.queueInbound
  - typings.microsoftGraph.microsoftGraphStrings.queueOutbound
  - typings.microsoftGraph.microsoftGraphStrings.queueBoth
*/
trait FirewallPacketQueueingMethodType extends js.Object

object FirewallPacketQueueingMethodType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deviceDefault: typings.microsoftGraph.microsoftGraphStrings.deviceDefault = this.cast("deviceDefault")
  @scala.inline
  def disabled: typings.microsoftGraph.microsoftGraphStrings.disabled = this.cast("disabled")
  @scala.inline
  def queueBoth: typings.microsoftGraph.microsoftGraphStrings.queueBoth = this.cast("queueBoth")
  @scala.inline
  def queueInbound: typings.microsoftGraph.microsoftGraphStrings.queueInbound = this.cast("queueInbound")
  @scala.inline
  def queueOutbound: typings.microsoftGraph.microsoftGraphStrings.queueOutbound = this.cast("queueOutbound")
}

