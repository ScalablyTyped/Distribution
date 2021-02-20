package typings.openpgp.mod.enums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait signatureSubpacket extends StObject
/**
  * Signature subpacket type
  */
@JSImport("openpgp", "enums.signatureSubpacket")
@js.native
object signatureSubpacket extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[signatureSubpacket with Double] = js.native
  
  @js.native
  sealed trait embedded_signature extends signatureSubpacket
  /* 32 */ val embedded_signature: typings.openpgp.mod.enums.signatureSubpacket.embedded_signature with Double = js.native
  
  @js.native
  sealed trait exportable_certification extends signatureSubpacket
  /* 4 */ val exportable_certification: typings.openpgp.mod.enums.signatureSubpacket.exportable_certification with Double = js.native
  
  @js.native
  sealed trait features extends signatureSubpacket
  /* 30 */ val features: typings.openpgp.mod.enums.signatureSubpacket.features with Double = js.native
  
  @js.native
  sealed trait issuer extends signatureSubpacket
  /* 16 */ val issuer: typings.openpgp.mod.enums.signatureSubpacket.issuer with Double = js.native
  
  @js.native
  sealed trait issuer_fingerprint extends signatureSubpacket
  /* 33 */ val issuer_fingerprint: typings.openpgp.mod.enums.signatureSubpacket.issuer_fingerprint with Double = js.native
  
  @js.native
  sealed trait key_expiration_time extends signatureSubpacket
  /* 9 */ val key_expiration_time: typings.openpgp.mod.enums.signatureSubpacket.key_expiration_time with Double = js.native
  
  @js.native
  sealed trait key_flags extends signatureSubpacket
  /* 27 */ val key_flags: typings.openpgp.mod.enums.signatureSubpacket.key_flags with Double = js.native
  
  @js.native
  sealed trait key_server_preferences extends signatureSubpacket
  /* 23 */ val key_server_preferences: typings.openpgp.mod.enums.signatureSubpacket.key_server_preferences with Double = js.native
  
  @js.native
  sealed trait notation_data extends signatureSubpacket
  /* 20 */ val notation_data: typings.openpgp.mod.enums.signatureSubpacket.notation_data with Double = js.native
  
  @js.native
  sealed trait placeholder_backwards_compatibility extends signatureSubpacket
  /* 10 */ val placeholder_backwards_compatibility: typings.openpgp.mod.enums.signatureSubpacket.placeholder_backwards_compatibility with Double = js.native
  
  @js.native
  sealed trait policy_uri extends signatureSubpacket
  /* 26 */ val policy_uri: typings.openpgp.mod.enums.signatureSubpacket.policy_uri with Double = js.native
  
  @js.native
  sealed trait preferred_aead_algorithms extends signatureSubpacket
  /* 34 */ val preferred_aead_algorithms: typings.openpgp.mod.enums.signatureSubpacket.preferred_aead_algorithms with Double = js.native
  
  @js.native
  sealed trait preferred_compression_algorithms extends signatureSubpacket
  /* 22 */ val preferred_compression_algorithms: typings.openpgp.mod.enums.signatureSubpacket.preferred_compression_algorithms with Double = js.native
  
  @js.native
  sealed trait preferred_hash_algorithms extends signatureSubpacket
  /* 21 */ val preferred_hash_algorithms: typings.openpgp.mod.enums.signatureSubpacket.preferred_hash_algorithms with Double = js.native
  
  @js.native
  sealed trait preferred_key_server extends signatureSubpacket
  /* 24 */ val preferred_key_server: typings.openpgp.mod.enums.signatureSubpacket.preferred_key_server with Double = js.native
  
  @js.native
  sealed trait preferred_symmetric_algorithms extends signatureSubpacket
  /* 11 */ val preferred_symmetric_algorithms: typings.openpgp.mod.enums.signatureSubpacket.preferred_symmetric_algorithms with Double = js.native
  
  @js.native
  sealed trait primary_user_id extends signatureSubpacket
  /* 25 */ val primary_user_id: typings.openpgp.mod.enums.signatureSubpacket.primary_user_id with Double = js.native
  
  @js.native
  sealed trait reason_for_revocation extends signatureSubpacket
  /* 29 */ val reason_for_revocation: typings.openpgp.mod.enums.signatureSubpacket.reason_for_revocation with Double = js.native
  
  @js.native
  sealed trait regular_expression extends signatureSubpacket
  /* 6 */ val regular_expression: typings.openpgp.mod.enums.signatureSubpacket.regular_expression with Double = js.native
  
  @js.native
  sealed trait revocable extends signatureSubpacket
  /* 7 */ val revocable: typings.openpgp.mod.enums.signatureSubpacket.revocable with Double = js.native
  
  @js.native
  sealed trait revocation_key extends signatureSubpacket
  /* 12 */ val revocation_key: typings.openpgp.mod.enums.signatureSubpacket.revocation_key with Double = js.native
  
  @js.native
  sealed trait signature_creation_time extends signatureSubpacket
  /* 2 */ val signature_creation_time: typings.openpgp.mod.enums.signatureSubpacket.signature_creation_time with Double = js.native
  
  @js.native
  sealed trait signature_expiration_time extends signatureSubpacket
  /* 3 */ val signature_expiration_time: typings.openpgp.mod.enums.signatureSubpacket.signature_expiration_time with Double = js.native
  
  @js.native
  sealed trait signature_target extends signatureSubpacket
  /* 31 */ val signature_target: typings.openpgp.mod.enums.signatureSubpacket.signature_target with Double = js.native
  
  @js.native
  sealed trait signers_user_id extends signatureSubpacket
  /* 28 */ val signers_user_id: typings.openpgp.mod.enums.signatureSubpacket.signers_user_id with Double = js.native
  
  @js.native
  sealed trait trust_signature extends signatureSubpacket
  /* 5 */ val trust_signature: typings.openpgp.mod.enums.signatureSubpacket.trust_signature with Double = js.native
}
