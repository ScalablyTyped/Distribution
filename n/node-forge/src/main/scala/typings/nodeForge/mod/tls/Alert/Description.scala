package typings.nodeForge.mod.tls.Alert

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Description extends js.Object

@JSImport("node-forge", "tls.Alert.Description")
@js.native
object Description extends js.Object {
  @js.native
  sealed trait access_denied extends Description
  
  @js.native
  sealed trait bad_certificate extends Description
  
  @js.native
  sealed trait bad_record_mac extends Description
  
  @js.native
  sealed trait certificate_expired extends Description
  
  @js.native
  sealed trait certificate_revoked extends Description
  
  @js.native
  sealed trait certificate_unknown extends Description
  
  @js.native
  sealed trait close_notify extends Description
  
  @js.native
  sealed trait decode_error extends Description
  
  @js.native
  sealed trait decompression_failure extends Description
  
  @js.native
  sealed trait decrypt_error extends Description
  
  @js.native
  sealed trait decryption_failed extends Description
  
  @js.native
  sealed trait export_restriction extends Description
  
  @js.native
  sealed trait handshake_failure extends Description
  
  @js.native
  sealed trait illegal_parameter extends Description
  
  @js.native
  sealed trait insufficient_security extends Description
  
  @js.native
  sealed trait internal_error extends Description
  
  @js.native
  sealed trait no_renegotiation extends Description
  
  @js.native
  sealed trait protocol_version extends Description
  
  @js.native
  sealed trait record_overflow extends Description
  
  @js.native
  sealed trait unexpected_message extends Description
  
  @js.native
  sealed trait unknown_ca extends Description
  
  @js.native
  sealed trait unsupported_certificate extends Description
  
  @js.native
  sealed trait user_canceled extends Description
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Description with Double] = js.native
  /* 49 */ @js.native
  object access_denied extends TopLevel[access_denied with Double]
  
  /* 42 */ @js.native
  object bad_certificate extends TopLevel[bad_certificate with Double]
  
  /* 20 */ @js.native
  object bad_record_mac extends TopLevel[bad_record_mac with Double]
  
  /* 45 */ @js.native
  object certificate_expired extends TopLevel[certificate_expired with Double]
  
  /* 44 */ @js.native
  object certificate_revoked extends TopLevel[certificate_revoked with Double]
  
  /* 46 */ @js.native
  object certificate_unknown extends TopLevel[certificate_unknown with Double]
  
  /* 0 */ @js.native
  object close_notify extends TopLevel[close_notify with Double]
  
  /* 50 */ @js.native
  object decode_error extends TopLevel[decode_error with Double]
  
  /* 30 */ @js.native
  object decompression_failure extends TopLevel[decompression_failure with Double]
  
  /* 51 */ @js.native
  object decrypt_error extends TopLevel[decrypt_error with Double]
  
  /* 21 */ @js.native
  object decryption_failed extends TopLevel[decryption_failed with Double]
  
  /* 60 */ @js.native
  object export_restriction extends TopLevel[export_restriction with Double]
  
  /* 40 */ @js.native
  object handshake_failure extends TopLevel[handshake_failure with Double]
  
  /* 47 */ @js.native
  object illegal_parameter extends TopLevel[illegal_parameter with Double]
  
  /* 71 */ @js.native
  object insufficient_security extends TopLevel[insufficient_security with Double]
  
  /* 80 */ @js.native
  object internal_error extends TopLevel[internal_error with Double]
  
  /* 100 */ @js.native
  object no_renegotiation extends TopLevel[no_renegotiation with Double]
  
  /* 70 */ @js.native
  object protocol_version extends TopLevel[protocol_version with Double]
  
  /* 22 */ @js.native
  object record_overflow extends TopLevel[record_overflow with Double]
  
  /* 10 */ @js.native
  object unexpected_message extends TopLevel[unexpected_message with Double]
  
  /* 48 */ @js.native
  object unknown_ca extends TopLevel[unknown_ca with Double]
  
  /* 43 */ @js.native
  object unsupported_certificate extends TopLevel[unsupported_certificate with Double]
  
  /* 90 */ @js.native
  object user_canceled extends TopLevel[user_canceled with Double]
  
}

