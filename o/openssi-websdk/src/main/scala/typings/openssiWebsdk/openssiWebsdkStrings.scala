package typings.openssiWebsdk

import typings.openssiWebsdk.mod.ConnectionMethod
import typings.openssiWebsdk.mod.ConnectionState
import typings.openssiWebsdk.mod.CredentialState
import typings.openssiWebsdk.mod.VerificationState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object openssiWebsdkStrings {
  
  @js.native
  sealed trait accepted
    extends StObject
       with CredentialState
  @scala.inline
  def accepted: accepted = "accepted".asInstanceOf[accepted]
  
  @js.native
  sealed trait connected
    extends StObject
       with ConnectionState
  @scala.inline
  def connected: connected = "connected".asInstanceOf[connected]
  
  @js.native
  sealed trait debug extends StObject
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait error extends StObject
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait failed
    extends StObject
       with VerificationState
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait fatal extends StObject
  @scala.inline
  def fatal: fatal = "fatal".asInstanceOf[fatal]
  
  @js.native
  sealed trait in_band
    extends StObject
       with ConnectionMethod
  @scala.inline
  def in_band: in_band = "in_band".asInstanceOf[in_band]
  
  @js.native
  sealed trait inbound_offer
    extends StObject
       with ConnectionState
       with CredentialState
  @scala.inline
  def inbound_offer: inbound_offer = "inbound_offer".asInstanceOf[inbound_offer]
  
  @js.native
  sealed trait inbound_proof_request
    extends StObject
       with VerificationState
  @scala.inline
  def inbound_proof_request: inbound_proof_request = "inbound_proof_request".asInstanceOf[inbound_proof_request]
  
  @js.native
  sealed trait inbound_request
    extends StObject
       with CredentialState
  @scala.inline
  def inbound_request: inbound_request = "inbound_request".asInstanceOf[inbound_request]
  
  @js.native
  sealed trait inbound_verification_request
    extends StObject
       with VerificationState
  @scala.inline
  def inbound_verification_request: inbound_verification_request = "inbound_verification_request".asInstanceOf[inbound_verification_request]
  
  @js.native
  sealed trait info extends StObject
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait invitation
    extends StObject
       with ConnectionMethod
  @scala.inline
  def invitation: invitation = "invitation".asInstanceOf[invitation]
  
  @js.native
  sealed trait issued
    extends StObject
       with CredentialState
  @scala.inline
  def issued: issued = "issued".asInstanceOf[issued]
  
  @js.native
  sealed trait out_of_band
    extends StObject
       with ConnectionMethod
  @scala.inline
  def out_of_band: out_of_band = "out_of_band".asInstanceOf[out_of_band]
  
  @js.native
  sealed trait outbound_offer
    extends StObject
       with ConnectionState
       with CredentialState
  @scala.inline
  def outbound_offer: outbound_offer = "outbound_offer".asInstanceOf[outbound_offer]
  
  @js.native
  sealed trait outbound_proof_request
    extends StObject
       with VerificationState
  @scala.inline
  def outbound_proof_request: outbound_proof_request = "outbound_proof_request".asInstanceOf[outbound_proof_request]
  
  @js.native
  sealed trait outbound_request
    extends StObject
       with CredentialState
  @scala.inline
  def outbound_request: outbound_request = "outbound_request".asInstanceOf[outbound_request]
  
  @js.native
  sealed trait outbound_verification_request
    extends StObject
       with VerificationState
  @scala.inline
  def outbound_verification_request: outbound_verification_request = "outbound_verification_request".asInstanceOf[outbound_verification_request]
  
  @js.native
  sealed trait passed
    extends StObject
       with VerificationState
  @scala.inline
  def passed: passed = "passed".asInstanceOf[passed]
  
  @js.native
  sealed trait proof_generated
    extends StObject
       with VerificationState
  @scala.inline
  def proof_generated: proof_generated = "proof_generated".asInstanceOf[proof_generated]
  
  @js.native
  sealed trait proof_shared
    extends StObject
       with VerificationState
  @scala.inline
  def proof_shared: proof_shared = "proof_shared".asInstanceOf[proof_shared]
  
  @js.native
  sealed trait rejected
    extends StObject
       with ConnectionState
       with CredentialState
  @scala.inline
  def rejected: rejected = "rejected".asInstanceOf[rejected]
  
  @js.native
  sealed trait stored
    extends StObject
       with CredentialState
  @scala.inline
  def stored: stored = "stored".asInstanceOf[stored]
  
  @js.native
  sealed trait trace extends StObject
  @scala.inline
  def trace: trace = "trace".asInstanceOf[trace]
  
  @js.native
  sealed trait warn extends StObject
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}
