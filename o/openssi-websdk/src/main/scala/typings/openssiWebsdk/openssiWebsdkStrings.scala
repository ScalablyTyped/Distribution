package typings.openssiWebsdk

import typings.openssiWebsdk.mod.ConnectionMethod
import typings.openssiWebsdk.mod.ConnectionState
import typings.openssiWebsdk.mod.CredentialState
import typings.openssiWebsdk.mod.VerificationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object openssiWebsdkStrings {
  @js.native
  sealed trait accepted extends CredentialState
  
  @js.native
  sealed trait connected extends ConnectionState
  
  @js.native
  sealed trait debug extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait failed extends VerificationState
  
  @js.native
  sealed trait fatal extends js.Object
  
  @js.native
  sealed trait in_band extends ConnectionMethod
  
  @js.native
  sealed trait inbound_offer
    extends ConnectionState
       with CredentialState
  
  @js.native
  sealed trait inbound_proof_request extends VerificationState
  
  @js.native
  sealed trait inbound_request extends CredentialState
  
  @js.native
  sealed trait inbound_verification_request extends VerificationState
  
  @js.native
  sealed trait info extends js.Object
  
  @js.native
  sealed trait invitation extends ConnectionMethod
  
  @js.native
  sealed trait issued extends CredentialState
  
  @js.native
  sealed trait out_of_band extends ConnectionMethod
  
  @js.native
  sealed trait outbound_offer
    extends ConnectionState
       with CredentialState
  
  @js.native
  sealed trait outbound_proof_request extends VerificationState
  
  @js.native
  sealed trait outbound_request extends CredentialState
  
  @js.native
  sealed trait outbound_verification_request extends VerificationState
  
  @js.native
  sealed trait passed extends VerificationState
  
  @js.native
  sealed trait proof_generated extends VerificationState
  
  @js.native
  sealed trait proof_shared extends VerificationState
  
  @js.native
  sealed trait rejected
    extends ConnectionState
       with CredentialState
  
  @js.native
  sealed trait stored extends CredentialState
  
  @js.native
  sealed trait trace extends js.Object
  
  @js.native
  sealed trait warn extends js.Object
  
  @scala.inline
  def accepted: accepted = "accepted".asInstanceOf[accepted]
  @scala.inline
  def connected: connected = "connected".asInstanceOf[connected]
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  @scala.inline
  def fatal: fatal = "fatal".asInstanceOf[fatal]
  @scala.inline
  def in_band: in_band = "in_band".asInstanceOf[in_band]
  @scala.inline
  def inbound_offer: inbound_offer = "inbound_offer".asInstanceOf[inbound_offer]
  @scala.inline
  def inbound_proof_request: inbound_proof_request = "inbound_proof_request".asInstanceOf[inbound_proof_request]
  @scala.inline
  def inbound_request: inbound_request = "inbound_request".asInstanceOf[inbound_request]
  @scala.inline
  def inbound_verification_request: inbound_verification_request = "inbound_verification_request".asInstanceOf[inbound_verification_request]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def invitation: invitation = "invitation".asInstanceOf[invitation]
  @scala.inline
  def issued: issued = "issued".asInstanceOf[issued]
  @scala.inline
  def out_of_band: out_of_band = "out_of_band".asInstanceOf[out_of_band]
  @scala.inline
  def outbound_offer: outbound_offer = "outbound_offer".asInstanceOf[outbound_offer]
  @scala.inline
  def outbound_proof_request: outbound_proof_request = "outbound_proof_request".asInstanceOf[outbound_proof_request]
  @scala.inline
  def outbound_request: outbound_request = "outbound_request".asInstanceOf[outbound_request]
  @scala.inline
  def outbound_verification_request: outbound_verification_request = "outbound_verification_request".asInstanceOf[outbound_verification_request]
  @scala.inline
  def passed: passed = "passed".asInstanceOf[passed]
  @scala.inline
  def proof_generated: proof_generated = "proof_generated".asInstanceOf[proof_generated]
  @scala.inline
  def proof_shared: proof_shared = "proof_shared".asInstanceOf[proof_shared]
  @scala.inline
  def rejected: rejected = "rejected".asInstanceOf[rejected]
  @scala.inline
  def stored: stored = "stored".asInstanceOf[stored]
  @scala.inline
  def trace: trace = "trace".asInstanceOf[trace]
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}

