package typings.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.openssiWebsdk.openssiWebsdkStrings.outbound_request
  - typings.openssiWebsdk.openssiWebsdkStrings.inbound_request
  - typings.openssiWebsdk.openssiWebsdkStrings.outbound_offer
  - typings.openssiWebsdk.openssiWebsdkStrings.inbound_offer
  - typings.openssiWebsdk.openssiWebsdkStrings.accepted
  - typings.openssiWebsdk.openssiWebsdkStrings.rejected
  - typings.openssiWebsdk.openssiWebsdkStrings.issued
  - typings.openssiWebsdk.openssiWebsdkStrings.stored
*/
trait CredentialState extends js.Object

object CredentialState {
  @scala.inline
  def accepted: typings.openssiWebsdk.openssiWebsdkStrings.accepted = this.cast("accepted")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inbound_offer: typings.openssiWebsdk.openssiWebsdkStrings.inbound_offer = this.cast("inbound_offer")
  @scala.inline
  def inbound_request: typings.openssiWebsdk.openssiWebsdkStrings.inbound_request = this.cast("inbound_request")
  @scala.inline
  def issued: typings.openssiWebsdk.openssiWebsdkStrings.issued = this.cast("issued")
  @scala.inline
  def outbound_offer: typings.openssiWebsdk.openssiWebsdkStrings.outbound_offer = this.cast("outbound_offer")
  @scala.inline
  def outbound_request: typings.openssiWebsdk.openssiWebsdkStrings.outbound_request = this.cast("outbound_request")
  @scala.inline
  def rejected: typings.openssiWebsdk.openssiWebsdkStrings.rejected = this.cast("rejected")
  @scala.inline
  def stored: typings.openssiWebsdk.openssiWebsdkStrings.stored = this.cast("stored")
}

