package typings.nodeForge.mod.tls.Alert

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Description extends js.Object
@JSImport("node-forge", "tls.Alert.Description")
@js.native
object Description extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Description with Double] = js.native
  
  @js.native
  sealed trait access_denied extends Description
  /* 49 */ @js.native
  object access_denied extends TopLevel[access_denied with Double]
  
  @js.native
  sealed trait bad_certificate extends Description
  /* 42 */ @js.native
  object bad_certificate extends TopLevel[bad_certificate with Double]
  
  @js.native
  sealed trait bad_record_mac extends Description
  /* 20 */ @js.native
  object bad_record_mac extends TopLevel[bad_record_mac with Double]
  
  @js.native
  sealed trait certificate_expired extends Description
  /* 45 */ @js.native
  object certificate_expired extends TopLevel[certificate_expired with Double]
  
  @js.native
  sealed trait certificate_revoked extends Description
  /* 44 */ @js.native
  object certificate_revoked extends TopLevel[certificate_revoked with Double]
  
  @js.native
  sealed trait certificate_unknown extends Description
  /* 46 */ @js.native
  object certificate_unknown extends TopLevel[certificate_unknown with Double]
  
  @js.native
  sealed trait close_notify extends Description
  /* 0 */ @js.native
  object close_notify extends TopLevel[close_notify with Double]
  
  @js.native
  sealed trait decode_error extends Description
  /* 50 */ @js.native
  object decode_error extends TopLevel[decode_error with Double]
  
  @js.native
  sealed trait decompression_failure extends Description
  /* 30 */ @js.native
  object decompression_failure extends TopLevel[decompression_failure with Double]
  
  @js.native
  sealed trait decrypt_error extends Description
  /* 51 */ @js.native
  object decrypt_error extends TopLevel[decrypt_error with Double]
  
  @js.native
  sealed trait decryption_failed extends Description
  /* 21 */ @js.native
  object decryption_failed extends TopLevel[decryption_failed with Double]
  
  @js.native
  sealed trait export_restriction extends Description
  /* 60 */ @js.native
  object export_restriction extends TopLevel[export_restriction with Double]
  
  @js.native
  sealed trait handshake_failure extends Description
  /* 40 */ @js.native
  object handshake_failure extends TopLevel[handshake_failure with Double]
  
  @js.native
  sealed trait illegal_parameter extends Description
  /* 47 */ @js.native
  object illegal_parameter extends TopLevel[illegal_parameter with Double]
  
  @js.native
  sealed trait insufficient_security extends Description
  /* 71 */ @js.native
  object insufficient_security extends TopLevel[insufficient_security with Double]
  
  @js.native
  sealed trait internal_error extends Description
  /* 80 */ @js.native
  object internal_error extends TopLevel[internal_error with Double]
  
  @js.native
  sealed trait no_renegotiation extends Description
  /* 100 */ @js.native
  object no_renegotiation extends TopLevel[no_renegotiation with Double]
  
  @js.native
  sealed trait protocol_version extends Description
  /* 70 */ @js.native
  object protocol_version extends TopLevel[protocol_version with Double]
  
  @js.native
  sealed trait record_overflow extends Description
  /* 22 */ @js.native
  object record_overflow extends TopLevel[record_overflow with Double]
  
  @js.native
  sealed trait unexpected_message extends Description
  /* 10 */ @js.native
  object unexpected_message extends TopLevel[unexpected_message with Double]
  
  @js.native
  sealed trait unknown_ca extends Description
  /* 48 */ @js.native
  object unknown_ca extends TopLevel[unknown_ca with Double]
  
  @js.native
  sealed trait unsupported_certificate extends Description
  /* 43 */ @js.native
  object unsupported_certificate extends TopLevel[unsupported_certificate with Double]
  
  @js.native
  sealed trait user_canceled extends Description
  /* 90 */ @js.native
  object user_canceled extends TopLevel[user_canceled with Double]
}
