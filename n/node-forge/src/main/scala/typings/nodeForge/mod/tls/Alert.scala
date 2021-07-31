package typings.nodeForge.mod.tls

import typings.nodeForge.mod.tls.Alert.Description
import typings.nodeForge.mod.tls.Alert.Level
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alert extends StObject {
  
  var description: Description
  
  var level: Level
}
object Alert {
  
  @scala.inline
  def apply(description: Description, level: Level): Alert = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alert]
  }
  
  @js.native
  sealed trait Description extends StObject
  @JSImport("node-forge", "tls.Alert.Description")
  @js.native
  object Description extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Description & Double] = js.native
    
    @js.native
    sealed trait access_denied
      extends StObject
         with Description
    /* 49 */ val access_denied: typings.nodeForge.mod.tls.Alert.Description.access_denied & Double = js.native
    
    @js.native
    sealed trait bad_certificate
      extends StObject
         with Description
    /* 42 */ val bad_certificate: typings.nodeForge.mod.tls.Alert.Description.bad_certificate & Double = js.native
    
    @js.native
    sealed trait bad_record_mac
      extends StObject
         with Description
    /* 20 */ val bad_record_mac: typings.nodeForge.mod.tls.Alert.Description.bad_record_mac & Double = js.native
    
    @js.native
    sealed trait certificate_expired
      extends StObject
         with Description
    /* 45 */ val certificate_expired: typings.nodeForge.mod.tls.Alert.Description.certificate_expired & Double = js.native
    
    @js.native
    sealed trait certificate_revoked
      extends StObject
         with Description
    /* 44 */ val certificate_revoked: typings.nodeForge.mod.tls.Alert.Description.certificate_revoked & Double = js.native
    
    @js.native
    sealed trait certificate_unknown
      extends StObject
         with Description
    /* 46 */ val certificate_unknown: typings.nodeForge.mod.tls.Alert.Description.certificate_unknown & Double = js.native
    
    @js.native
    sealed trait close_notify
      extends StObject
         with Description
    /* 0 */ val close_notify: typings.nodeForge.mod.tls.Alert.Description.close_notify & Double = js.native
    
    @js.native
    sealed trait decode_error
      extends StObject
         with Description
    /* 50 */ val decode_error: typings.nodeForge.mod.tls.Alert.Description.decode_error & Double = js.native
    
    @js.native
    sealed trait decompression_failure
      extends StObject
         with Description
    /* 30 */ val decompression_failure: typings.nodeForge.mod.tls.Alert.Description.decompression_failure & Double = js.native
    
    @js.native
    sealed trait decrypt_error
      extends StObject
         with Description
    /* 51 */ val decrypt_error: typings.nodeForge.mod.tls.Alert.Description.decrypt_error & Double = js.native
    
    @js.native
    sealed trait decryption_failed
      extends StObject
         with Description
    /* 21 */ val decryption_failed: typings.nodeForge.mod.tls.Alert.Description.decryption_failed & Double = js.native
    
    @js.native
    sealed trait export_restriction
      extends StObject
         with Description
    /* 60 */ val export_restriction: typings.nodeForge.mod.tls.Alert.Description.export_restriction & Double = js.native
    
    @js.native
    sealed trait handshake_failure
      extends StObject
         with Description
    /* 40 */ val handshake_failure: typings.nodeForge.mod.tls.Alert.Description.handshake_failure & Double = js.native
    
    @js.native
    sealed trait illegal_parameter
      extends StObject
         with Description
    /* 47 */ val illegal_parameter: typings.nodeForge.mod.tls.Alert.Description.illegal_parameter & Double = js.native
    
    @js.native
    sealed trait insufficient_security
      extends StObject
         with Description
    /* 71 */ val insufficient_security: typings.nodeForge.mod.tls.Alert.Description.insufficient_security & Double = js.native
    
    @js.native
    sealed trait internal_error
      extends StObject
         with Description
    /* 80 */ val internal_error: typings.nodeForge.mod.tls.Alert.Description.internal_error & Double = js.native
    
    @js.native
    sealed trait no_renegotiation
      extends StObject
         with Description
    /* 100 */ val no_renegotiation: typings.nodeForge.mod.tls.Alert.Description.no_renegotiation & Double = js.native
    
    @js.native
    sealed trait protocol_version
      extends StObject
         with Description
    /* 70 */ val protocol_version: typings.nodeForge.mod.tls.Alert.Description.protocol_version & Double = js.native
    
    @js.native
    sealed trait record_overflow
      extends StObject
         with Description
    /* 22 */ val record_overflow: typings.nodeForge.mod.tls.Alert.Description.record_overflow & Double = js.native
    
    @js.native
    sealed trait unexpected_message
      extends StObject
         with Description
    /* 10 */ val unexpected_message: typings.nodeForge.mod.tls.Alert.Description.unexpected_message & Double = js.native
    
    @js.native
    sealed trait unknown_ca
      extends StObject
         with Description
    /* 48 */ val unknown_ca: typings.nodeForge.mod.tls.Alert.Description.unknown_ca & Double = js.native
    
    @js.native
    sealed trait unsupported_certificate
      extends StObject
         with Description
    /* 43 */ val unsupported_certificate: typings.nodeForge.mod.tls.Alert.Description.unsupported_certificate & Double = js.native
    
    @js.native
    sealed trait user_canceled
      extends StObject
         with Description
    /* 90 */ val user_canceled: typings.nodeForge.mod.tls.Alert.Description.user_canceled & Double = js.native
  }
  
  @js.native
  sealed trait Level extends StObject
  @JSImport("node-forge", "tls.Alert.Level")
  @js.native
  object Level extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Level & Double] = js.native
    
    @js.native
    sealed trait fatal
      extends StObject
         with Level
    /* 2 */ val fatal: typings.nodeForge.mod.tls.Alert.Level.fatal & Double = js.native
    
    @js.native
    sealed trait warning
      extends StObject
         with Level
    /* 1 */ val warning: typings.nodeForge.mod.tls.Alert.Level.warning & Double = js.native
  }
  
  @scala.inline
  implicit class AlertMutableBuilder[Self <: Alert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
  }
}
