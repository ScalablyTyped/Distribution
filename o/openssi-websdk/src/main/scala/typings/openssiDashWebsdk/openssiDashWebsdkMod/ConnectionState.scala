package typings.openssiDashWebsdk.openssiDashWebsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.openssiDashWebsdk.openssiDashWebsdkStrings.inbound_offer
  - typings.openssiDashWebsdk.openssiDashWebsdkStrings.outbound_offer
  - typings.openssiDashWebsdk.openssiDashWebsdkStrings.connected
  - typings.openssiDashWebsdk.openssiDashWebsdkStrings.rejected
*/
trait ConnectionState extends js.Object

object ConnectionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typings.openssiDashWebsdk.openssiDashWebsdkStrings.connected = this.cast("connected")
  @scala.inline
  def inbound_offer: typings.openssiDashWebsdk.openssiDashWebsdkStrings.inbound_offer = this.cast("inbound_offer")
  @scala.inline
  def outbound_offer: typings.openssiDashWebsdk.openssiDashWebsdkStrings.outbound_offer = this.cast("outbound_offer")
  @scala.inline
  def rejected: typings.openssiDashWebsdk.openssiDashWebsdkStrings.rejected = this.cast("rejected")
}

