package typings.openssiDashWebsdk.openssiDashWebsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.openssiDashWebsdk.openssiDashWebsdkStrings.outbound_verification_request
  - typings.openssiDashWebsdk.openssiDashWebsdkStrings.inbound_verification_request
  - typings.openssiDashWebsdk.openssiDashWebsdkStrings.outbound_proof_request
  - typings.openssiDashWebsdk.openssiDashWebsdkStrings.inbound_proof_request
  - typings.openssiDashWebsdk.openssiDashWebsdkStrings.proof_generated
  - typings.openssiDashWebsdk.openssiDashWebsdkStrings.proof_shared
  - typings.openssiDashWebsdk.openssiDashWebsdkStrings.passed
  - typings.openssiDashWebsdk.openssiDashWebsdkStrings.failed
*/
trait VerificationState extends js.Object

object VerificationState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failed: typings.openssiDashWebsdk.openssiDashWebsdkStrings.failed = this.cast("failed")
  @scala.inline
  def inbound_proof_request: typings.openssiDashWebsdk.openssiDashWebsdkStrings.inbound_proof_request = this.cast("inbound_proof_request")
  @scala.inline
  def inbound_verification_request: typings.openssiDashWebsdk.openssiDashWebsdkStrings.inbound_verification_request = this.cast("inbound_verification_request")
  @scala.inline
  def outbound_proof_request: typings.openssiDashWebsdk.openssiDashWebsdkStrings.outbound_proof_request = this.cast("outbound_proof_request")
  @scala.inline
  def outbound_verification_request: typings.openssiDashWebsdk.openssiDashWebsdkStrings.outbound_verification_request = this.cast("outbound_verification_request")
  @scala.inline
  def passed: typings.openssiDashWebsdk.openssiDashWebsdkStrings.passed = this.cast("passed")
  @scala.inline
  def proof_generated: typings.openssiDashWebsdk.openssiDashWebsdkStrings.proof_generated = this.cast("proof_generated")
  @scala.inline
  def proof_shared: typings.openssiDashWebsdk.openssiDashWebsdkStrings.proof_shared = this.cast("proof_shared")
}

