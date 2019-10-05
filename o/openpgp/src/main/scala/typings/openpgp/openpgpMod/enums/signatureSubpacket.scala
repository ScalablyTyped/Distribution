package typings.openpgp.openpgpMod.enums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait signatureSubpacket extends js.Object

/**
  * Signature subpacket type
  */
@JSImport("openpgp", "enums.signatureSubpacket")
@js.native
object signatureSubpacket extends js.Object {
  @js.native
  sealed trait embedded_signature extends signatureSubpacket
  
  @js.native
  sealed trait exportable_certification extends signatureSubpacket
  
  @js.native
  sealed trait features extends signatureSubpacket
  
  @js.native
  sealed trait issuer extends signatureSubpacket
  
  @js.native
  sealed trait issuer_fingerprint extends signatureSubpacket
  
  @js.native
  sealed trait key_expiration_time extends signatureSubpacket
  
  @js.native
  sealed trait key_flags extends signatureSubpacket
  
  @js.native
  sealed trait key_server_preferences extends signatureSubpacket
  
  @js.native
  sealed trait notation_data extends signatureSubpacket
  
  @js.native
  sealed trait placeholder_backwards_compatibility extends signatureSubpacket
  
  @js.native
  sealed trait policy_uri extends signatureSubpacket
  
  @js.native
  sealed trait preferred_aead_algorithms extends signatureSubpacket
  
  @js.native
  sealed trait preferred_compression_algorithms extends signatureSubpacket
  
  @js.native
  sealed trait preferred_hash_algorithms extends signatureSubpacket
  
  @js.native
  sealed trait preferred_key_server extends signatureSubpacket
  
  @js.native
  sealed trait preferred_symmetric_algorithms extends signatureSubpacket
  
  @js.native
  sealed trait primary_user_id extends signatureSubpacket
  
  @js.native
  sealed trait reason_for_revocation extends signatureSubpacket
  
  @js.native
  sealed trait regular_expression extends signatureSubpacket
  
  @js.native
  sealed trait revocable extends signatureSubpacket
  
  @js.native
  sealed trait revocation_key extends signatureSubpacket
  
  @js.native
  sealed trait signature_creation_time extends signatureSubpacket
  
  @js.native
  sealed trait signature_expiration_time extends signatureSubpacket
  
  @js.native
  sealed trait signature_target extends signatureSubpacket
  
  @js.native
  sealed trait signers_user_id extends signatureSubpacket
  
  @js.native
  sealed trait trust_signature extends signatureSubpacket
  
  /* 32 */ val embedded_signature: typings.openpgp.openpgpMod.enums.signatureSubpacket.embedded_signature with Double = js.native
  /* 4 */ val exportable_certification: typings.openpgp.openpgpMod.enums.signatureSubpacket.exportable_certification with Double = js.native
  /* 30 */ val features: typings.openpgp.openpgpMod.enums.signatureSubpacket.features with Double = js.native
  /* 16 */ val issuer: typings.openpgp.openpgpMod.enums.signatureSubpacket.issuer with Double = js.native
  /* 33 */ val issuer_fingerprint: typings.openpgp.openpgpMod.enums.signatureSubpacket.issuer_fingerprint with Double = js.native
  /* 9 */ val key_expiration_time: typings.openpgp.openpgpMod.enums.signatureSubpacket.key_expiration_time with Double = js.native
  /* 27 */ val key_flags: typings.openpgp.openpgpMod.enums.signatureSubpacket.key_flags with Double = js.native
  /* 23 */ val key_server_preferences: typings.openpgp.openpgpMod.enums.signatureSubpacket.key_server_preferences with Double = js.native
  /* 20 */ val notation_data: typings.openpgp.openpgpMod.enums.signatureSubpacket.notation_data with Double = js.native
  /* 10 */ val placeholder_backwards_compatibility: typings.openpgp.openpgpMod.enums.signatureSubpacket.placeholder_backwards_compatibility with Double = js.native
  /* 26 */ val policy_uri: typings.openpgp.openpgpMod.enums.signatureSubpacket.policy_uri with Double = js.native
  /* 34 */ val preferred_aead_algorithms: typings.openpgp.openpgpMod.enums.signatureSubpacket.preferred_aead_algorithms with Double = js.native
  /* 22 */ val preferred_compression_algorithms: typings.openpgp.openpgpMod.enums.signatureSubpacket.preferred_compression_algorithms with Double = js.native
  /* 21 */ val preferred_hash_algorithms: typings.openpgp.openpgpMod.enums.signatureSubpacket.preferred_hash_algorithms with Double = js.native
  /* 24 */ val preferred_key_server: typings.openpgp.openpgpMod.enums.signatureSubpacket.preferred_key_server with Double = js.native
  /* 11 */ val preferred_symmetric_algorithms: typings.openpgp.openpgpMod.enums.signatureSubpacket.preferred_symmetric_algorithms with Double = js.native
  /* 25 */ val primary_user_id: typings.openpgp.openpgpMod.enums.signatureSubpacket.primary_user_id with Double = js.native
  /* 29 */ val reason_for_revocation: typings.openpgp.openpgpMod.enums.signatureSubpacket.reason_for_revocation with Double = js.native
  /* 6 */ val regular_expression: typings.openpgp.openpgpMod.enums.signatureSubpacket.regular_expression with Double = js.native
  /* 7 */ val revocable: typings.openpgp.openpgpMod.enums.signatureSubpacket.revocable with Double = js.native
  /* 12 */ val revocation_key: typings.openpgp.openpgpMod.enums.signatureSubpacket.revocation_key with Double = js.native
  /* 2 */ val signature_creation_time: typings.openpgp.openpgpMod.enums.signatureSubpacket.signature_creation_time with Double = js.native
  /* 3 */ val signature_expiration_time: typings.openpgp.openpgpMod.enums.signatureSubpacket.signature_expiration_time with Double = js.native
  /* 31 */ val signature_target: typings.openpgp.openpgpMod.enums.signatureSubpacket.signature_target with Double = js.native
  /* 28 */ val signers_user_id: typings.openpgp.openpgpMod.enums.signatureSubpacket.signers_user_id with Double = js.native
  /* 5 */ val trust_signature: typings.openpgp.openpgpMod.enums.signatureSubpacket.trust_signature with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[signatureSubpacket with Double] = js.native
}

