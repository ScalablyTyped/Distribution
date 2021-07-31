package typings.openpgp.mod.enums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  def apply(value: Double): js.UndefOr[signatureSubpacket & Double] = js.native
  
  @js.native
  sealed trait embedded_signature
    extends StObject
       with signatureSubpacket
  /* 32 */ val embedded_signature: typings.openpgp.mod.enums.signatureSubpacket.embedded_signature & Double = js.native
  
  @js.native
  sealed trait exportable_certification
    extends StObject
       with signatureSubpacket
  /* 4 */ val exportable_certification: typings.openpgp.mod.enums.signatureSubpacket.exportable_certification & Double = js.native
  
  @js.native
  sealed trait features
    extends StObject
       with signatureSubpacket
  /* 30 */ val features: typings.openpgp.mod.enums.signatureSubpacket.features & Double = js.native
  
  @js.native
  sealed trait issuer
    extends StObject
       with signatureSubpacket
  /* 16 */ val issuer: typings.openpgp.mod.enums.signatureSubpacket.issuer & Double = js.native
  
  @js.native
  sealed trait issuer_fingerprint
    extends StObject
       with signatureSubpacket
  /* 33 */ val issuer_fingerprint: typings.openpgp.mod.enums.signatureSubpacket.issuer_fingerprint & Double = js.native
  
  @js.native
  sealed trait key_expiration_time
    extends StObject
       with signatureSubpacket
  /* 9 */ val key_expiration_time: typings.openpgp.mod.enums.signatureSubpacket.key_expiration_time & Double = js.native
  
  @js.native
  sealed trait key_flags
    extends StObject
       with signatureSubpacket
  /* 27 */ val key_flags: typings.openpgp.mod.enums.signatureSubpacket.key_flags & Double = js.native
  
  @js.native
  sealed trait key_server_preferences
    extends StObject
       with signatureSubpacket
  /* 23 */ val key_server_preferences: typings.openpgp.mod.enums.signatureSubpacket.key_server_preferences & Double = js.native
  
  @js.native
  sealed trait notation_data
    extends StObject
       with signatureSubpacket
  /* 20 */ val notation_data: typings.openpgp.mod.enums.signatureSubpacket.notation_data & Double = js.native
  
  @js.native
  sealed trait placeholder_backwards_compatibility
    extends StObject
       with signatureSubpacket
  /* 10 */ val placeholder_backwards_compatibility: typings.openpgp.mod.enums.signatureSubpacket.placeholder_backwards_compatibility & Double = js.native
  
  @js.native
  sealed trait policy_uri
    extends StObject
       with signatureSubpacket
  /* 26 */ val policy_uri: typings.openpgp.mod.enums.signatureSubpacket.policy_uri & Double = js.native
  
  @js.native
  sealed trait preferred_aead_algorithms
    extends StObject
       with signatureSubpacket
  /* 34 */ val preferred_aead_algorithms: typings.openpgp.mod.enums.signatureSubpacket.preferred_aead_algorithms & Double = js.native
  
  @js.native
  sealed trait preferred_compression_algorithms
    extends StObject
       with signatureSubpacket
  /* 22 */ val preferred_compression_algorithms: typings.openpgp.mod.enums.signatureSubpacket.preferred_compression_algorithms & Double = js.native
  
  @js.native
  sealed trait preferred_hash_algorithms
    extends StObject
       with signatureSubpacket
  /* 21 */ val preferred_hash_algorithms: typings.openpgp.mod.enums.signatureSubpacket.preferred_hash_algorithms & Double = js.native
  
  @js.native
  sealed trait preferred_key_server
    extends StObject
       with signatureSubpacket
  /* 24 */ val preferred_key_server: typings.openpgp.mod.enums.signatureSubpacket.preferred_key_server & Double = js.native
  
  @js.native
  sealed trait preferred_symmetric_algorithms
    extends StObject
       with signatureSubpacket
  /* 11 */ val preferred_symmetric_algorithms: typings.openpgp.mod.enums.signatureSubpacket.preferred_symmetric_algorithms & Double = js.native
  
  @js.native
  sealed trait primary_user_id
    extends StObject
       with signatureSubpacket
  /* 25 */ val primary_user_id: typings.openpgp.mod.enums.signatureSubpacket.primary_user_id & Double = js.native
  
  @js.native
  sealed trait reason_for_revocation
    extends StObject
       with signatureSubpacket
  /* 29 */ val reason_for_revocation: typings.openpgp.mod.enums.signatureSubpacket.reason_for_revocation & Double = js.native
  
  @js.native
  sealed trait regular_expression
    extends StObject
       with signatureSubpacket
  /* 6 */ val regular_expression: typings.openpgp.mod.enums.signatureSubpacket.regular_expression & Double = js.native
  
  @js.native
  sealed trait revocable
    extends StObject
       with signatureSubpacket
  /* 7 */ val revocable: typings.openpgp.mod.enums.signatureSubpacket.revocable & Double = js.native
  
  @js.native
  sealed trait revocation_key
    extends StObject
       with signatureSubpacket
  /* 12 */ val revocation_key: typings.openpgp.mod.enums.signatureSubpacket.revocation_key & Double = js.native
  
  @js.native
  sealed trait signature_creation_time
    extends StObject
       with signatureSubpacket
  /* 2 */ val signature_creation_time: typings.openpgp.mod.enums.signatureSubpacket.signature_creation_time & Double = js.native
  
  @js.native
  sealed trait signature_expiration_time
    extends StObject
       with signatureSubpacket
  /* 3 */ val signature_expiration_time: typings.openpgp.mod.enums.signatureSubpacket.signature_expiration_time & Double = js.native
  
  @js.native
  sealed trait signature_target
    extends StObject
       with signatureSubpacket
  /* 31 */ val signature_target: typings.openpgp.mod.enums.signatureSubpacket.signature_target & Double = js.native
  
  @js.native
  sealed trait signers_user_id
    extends StObject
       with signatureSubpacket
  /* 28 */ val signers_user_id: typings.openpgp.mod.enums.signatureSubpacket.signers_user_id & Double = js.native
  
  @js.native
  sealed trait trust_signature
    extends StObject
       with signatureSubpacket
  /* 5 */ val trust_signature: typings.openpgp.mod.enums.signatureSubpacket.trust_signature & Double = js.native
}
