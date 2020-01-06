package typings.openssiDashWebsdk.openssiDashWebsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.openssiDashWebsdk.openssiDashWebsdkStrings.outbound_request
  - typings.openssiDashWebsdk.openssiDashWebsdkStrings.inbound_request
  - typings.openssiDashWebsdk.openssiDashWebsdkStrings.outbound_offer
  - typings.openssiDashWebsdk.openssiDashWebsdkStrings.inbound_offer
  - typings.openssiDashWebsdk.openssiDashWebsdkStrings.accepted
  - typings.openssiDashWebsdk.openssiDashWebsdkStrings.rejected
  - typings.openssiDashWebsdk.openssiDashWebsdkStrings.issued
  - typings.openssiDashWebsdk.openssiDashWebsdkStrings.stored
*/
trait CredentialState extends js.Object

object CredentialState {
  @scala.inline
  def accepted: typings.openssiDashWebsdk.openssiDashWebsdkStrings.accepted = this.cast("accepted")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inbound_offer: typings.openssiDashWebsdk.openssiDashWebsdkStrings.inbound_offer = this.cast("inbound_offer")
  @scala.inline
  def inbound_request: typings.openssiDashWebsdk.openssiDashWebsdkStrings.inbound_request = this.cast("inbound_request")
  @scala.inline
  def issued: typings.openssiDashWebsdk.openssiDashWebsdkStrings.issued = this.cast("issued")
  @scala.inline
  def outbound_offer: typings.openssiDashWebsdk.openssiDashWebsdkStrings.outbound_offer = this.cast("outbound_offer")
  @scala.inline
  def outbound_request: typings.openssiDashWebsdk.openssiDashWebsdkStrings.outbound_request = this.cast("outbound_request")
  @scala.inline
  def rejected: typings.openssiDashWebsdk.openssiDashWebsdkStrings.rejected = this.cast("rejected")
  @scala.inline
  def stored: typings.openssiDashWebsdk.openssiDashWebsdkStrings.stored = this.cast("stored")
}

