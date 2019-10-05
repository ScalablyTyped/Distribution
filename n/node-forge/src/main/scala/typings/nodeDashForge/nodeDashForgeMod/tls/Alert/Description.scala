package typings.nodeDashForge.nodeDashForgeMod.tls.Alert

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
  
  /* 49 */ val access_denied: typings.nodeDashForge.nodeDashForgeMod.tls.Alert.Description.access_denied with Double = js.native
  /* 42 */ val bad_certificate: typings.nodeDashForge.nodeDashForgeMod.tls.Alert.Description.bad_certificate with Double = js.native
  /* 20 */ val bad_record_mac: typings.nodeDashForge.nodeDashForgeMod.tls.Alert.Description.bad_record_mac with Double = js.native
  /* 45 */ val certificate_expired: typings.nodeDashForge.nodeDashForgeMod.tls.Alert.Description.certificate_expired with Double = js.native
  /* 44 */ val certificate_revoked: typings.nodeDashForge.nodeDashForgeMod.tls.Alert.Description.certificate_revoked with Double = js.native
  /* 46 */ val certificate_unknown: typings.nodeDashForge.nodeDashForgeMod.tls.Alert.Description.certificate_unknown with Double = js.native
  /* 0 */ val close_notify: typings.nodeDashForge.nodeDashForgeMod.tls.Alert.Description.close_notify with Double = js.native
  /* 50 */ val decode_error: typings.nodeDashForge.nodeDashForgeMod.tls.Alert.Description.decode_error with Double = js.native
  /* 30 */ val decompression_failure: typings.nodeDashForge.nodeDashForgeMod.tls.Alert.Description.decompression_failure with Double = js.native
  /* 51 */ val decrypt_error: typings.nodeDashForge.nodeDashForgeMod.tls.Alert.Description.decrypt_error with Double = js.native
  /* 21 */ val decryption_failed: typings.nodeDashForge.nodeDashForgeMod.tls.Alert.Description.decryption_failed with Double = js.native
  /* 60 */ val export_restriction: typings.nodeDashForge.nodeDashForgeMod.tls.Alert.Description.export_restriction with Double = js.native
  /* 40 */ val handshake_failure: typings.nodeDashForge.nodeDashForgeMod.tls.Alert.Description.handshake_failure with Double = js.native
  /* 47 */ val illegal_parameter: typings.nodeDashForge.nodeDashForgeMod.tls.Alert.Description.illegal_parameter with Double = js.native
  /* 71 */ val insufficient_security: typings.nodeDashForge.nodeDashForgeMod.tls.Alert.Description.insufficient_security with Double = js.native
  /* 80 */ val internal_error: typings.nodeDashForge.nodeDashForgeMod.tls.Alert.Description.internal_error with Double = js.native
  /* 100 */ val no_renegotiation: typings.nodeDashForge.nodeDashForgeMod.tls.Alert.Description.no_renegotiation with Double = js.native
  /* 70 */ val protocol_version: typings.nodeDashForge.nodeDashForgeMod.tls.Alert.Description.protocol_version with Double = js.native
  /* 22 */ val record_overflow: typings.nodeDashForge.nodeDashForgeMod.tls.Alert.Description.record_overflow with Double = js.native
  /* 10 */ val unexpected_message: typings.nodeDashForge.nodeDashForgeMod.tls.Alert.Description.unexpected_message with Double = js.native
  /* 48 */ val unknown_ca: typings.nodeDashForge.nodeDashForgeMod.tls.Alert.Description.unknown_ca with Double = js.native
  /* 43 */ val unsupported_certificate: typings.nodeDashForge.nodeDashForgeMod.tls.Alert.Description.unsupported_certificate with Double = js.native
  /* 90 */ val user_canceled: typings.nodeDashForge.nodeDashForgeMod.tls.Alert.Description.user_canceled with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Description with Double] = js.native
}

