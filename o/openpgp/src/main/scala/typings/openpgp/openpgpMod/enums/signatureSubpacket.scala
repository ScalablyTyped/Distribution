package typings.openpgp.openpgpMod.enums

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[signatureSubpacket with Double] = js.native
  /* 32 */ @js.native
  object embedded_signature extends TopLevel[embedded_signature with Double]
  
  /* 4 */ @js.native
  object exportable_certification extends TopLevel[exportable_certification with Double]
  
  /* 30 */ @js.native
  object features
    extends TopLevel[typings.openpgp.openpgpMod.enums.signatureSubpacket.features with Double]
  
  /* 16 */ @js.native
  object issuer extends TopLevel[issuer with Double]
  
  /* 33 */ @js.native
  object issuer_fingerprint extends TopLevel[issuer_fingerprint with Double]
  
  /* 9 */ @js.native
  object key_expiration_time extends TopLevel[key_expiration_time with Double]
  
  /* 27 */ @js.native
  object key_flags extends TopLevel[key_flags with Double]
  
  /* 23 */ @js.native
  object key_server_preferences extends TopLevel[key_server_preferences with Double]
  
  /* 20 */ @js.native
  object notation_data extends TopLevel[notation_data with Double]
  
  /* 10 */ @js.native
  object placeholder_backwards_compatibility extends TopLevel[placeholder_backwards_compatibility with Double]
  
  /* 26 */ @js.native
  object policy_uri extends TopLevel[policy_uri with Double]
  
  /* 34 */ @js.native
  object preferred_aead_algorithms extends TopLevel[preferred_aead_algorithms with Double]
  
  /* 22 */ @js.native
  object preferred_compression_algorithms extends TopLevel[preferred_compression_algorithms with Double]
  
  /* 21 */ @js.native
  object preferred_hash_algorithms extends TopLevel[preferred_hash_algorithms with Double]
  
  /* 24 */ @js.native
  object preferred_key_server extends TopLevel[preferred_key_server with Double]
  
  /* 11 */ @js.native
  object preferred_symmetric_algorithms extends TopLevel[preferred_symmetric_algorithms with Double]
  
  /* 25 */ @js.native
  object primary_user_id extends TopLevel[primary_user_id with Double]
  
  /* 29 */ @js.native
  object reason_for_revocation extends TopLevel[reason_for_revocation with Double]
  
  /* 6 */ @js.native
  object regular_expression extends TopLevel[regular_expression with Double]
  
  /* 7 */ @js.native
  object revocable extends TopLevel[revocable with Double]
  
  /* 12 */ @js.native
  object revocation_key extends TopLevel[revocation_key with Double]
  
  /* 2 */ @js.native
  object signature_creation_time extends TopLevel[signature_creation_time with Double]
  
  /* 3 */ @js.native
  object signature_expiration_time extends TopLevel[signature_expiration_time with Double]
  
  /* 31 */ @js.native
  object signature_target extends TopLevel[signature_target with Double]
  
  /* 28 */ @js.native
  object signers_user_id extends TopLevel[signers_user_id with Double]
  
  /* 5 */ @js.native
  object trust_signature extends TopLevel[trust_signature with Double]
  
}

