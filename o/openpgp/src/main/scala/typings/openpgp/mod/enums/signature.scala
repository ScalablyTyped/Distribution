package typings.openpgp.mod.enums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait signature extends StObject
/**
  * One pass signature packet type
  */
@JSImport("openpgp", "enums.signature")
@js.native
object signature extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[signature & Double] = js.native
  
  /**
    * 0x00: Signature of a binary document.
    */
  @js.native
  sealed trait binary
    extends StObject
       with signature
  /* 0 */ val binary: typings.openpgp.mod.enums.signature.binary & Double = js.native
  
  /**
    * 0x12: Casual certification of a User ID and Public-Key packet.
    * The issuer of this certification has done some casual
    * verification of the claim of identity.
    */
  @js.native
  sealed trait cert_casual
    extends StObject
       with signature
  /* 18 */ val cert_casual: typings.openpgp.mod.enums.signature.cert_casual & Double = js.native
  
  /**
    * 0x10: Generic certification of a User ID and Public-Key packet.
    * The issuer of this certification does not make any particular
    * assertion as to how well the certifier has checked that the owner
    * of the key is in fact the person described by the User ID.
    */
  @js.native
  sealed trait cert_generic
    extends StObject
       with signature
  /* 16 */ val cert_generic: typings.openpgp.mod.enums.signature.cert_generic & Double = js.native
  
  /**
    * 0x11: Persona certification of a User ID and Public-Key packet.
    * The issuer of this certification has not done any verification of
    * the claim that the owner of this key is the User ID specified.
    */
  @js.native
  sealed trait cert_persona
    extends StObject
       with signature
  /* 17 */ val cert_persona: typings.openpgp.mod.enums.signature.cert_persona & Double = js.native
  
  /**
    * 0x13: Positive certification of a User ID and Public-Key packet.
    * The issuer of this certification has done substantial
    * verification of the claim of identity.
    * Most OpenPGP implementations make their "key signatures" as 0x10
    * certifications.  Some implementations can issue 0x11-0x13
    * certifications, but few differentiate between the types.
    */
  @js.native
  sealed trait cert_positive
    extends StObject
       with signature
  /* 19 */ val cert_positive: typings.openpgp.mod.enums.signature.cert_positive & Double = js.native
  
  /**
    * 0x30: Certification revocation signature
    * This signature revokes an earlier User ID certification signature
    * (signature class 0x10 through 0x13) or direct-key signature
    * (0x1F).  It should be issued by the same key that issued the
    * revoked signature or an authorized revocation key.  The signature
    * is computed over the same data as the certificate that it
    * revokes, and should have a later creation date than that
    * certificate.
    */
  @js.native
  sealed trait cert_revocation
    extends StObject
       with signature
  /* 48 */ val cert_revocation: typings.openpgp.mod.enums.signature.cert_revocation & Double = js.native
  
  /**
    * 0x1F: Signature directly on a key
    * This signature is calculated directly on a key.  It binds the
    * information in the Signature subpackets to the key, and is
    * appropriate to be used for subpackets that provide information
    * about the key, such as the Revocation Key subpacket.  It is also
    * appropriate for statements that non-self certifiers want to make
    * about the key itself, rather than the binding between a key and a
    * name.
    */
  @js.native
  sealed trait key
    extends StObject
       with signature
  /* 31 */ val key: typings.openpgp.mod.enums.signature.key & Double = js.native
  
  /**
    * 0x19: Primary Key Binding Signature
    * This signature is a statement by a signing subkey, indicating
    * that it is owned by the primary key and subkey.  This signature
    * is calculated the same way as a 0x18 signature: directly on the
    * primary key and subkey, and not on any User ID or other packets.
    * When a signature is made over a key, the hash data starts with the
    * octet 0x99, followed by a two-octet length of the key, and then body
    * of the key packet.  (Note that this is an old-style packet header for
    * a key packet with two-octet length.)  A subkey binding signature
    * (type 0x18) or primary key binding signature (type 0x19) then hashes
    * the subkey using the same format as the main key (also using 0x99 as
    * the first octet).
    */
  @js.native
  sealed trait key_binding
    extends StObject
       with signature
  /* 25 */ val key_binding: typings.openpgp.mod.enums.signature.key_binding & Double = js.native
  
  /**
    * 0x20: Key revocation signature
    * The signature is calculated directly on the key being revoked.  A
    * revoked key is not to be used.  Only revocation signatures by the
    * key being revoked, or by an authorized revocation key, should be
    * considered valid revocation signatures.a
    */
  @js.native
  sealed trait key_revocation
    extends StObject
       with signature
  /* 32 */ val key_revocation: typings.openpgp.mod.enums.signature.key_revocation & Double = js.native
  
  /**
    * 0x02: Standalone signature.
    * This signature is a signature of only its own subpacket contents.
    * It is calculated identically to a signature over a zero-lengh
    * binary document.  Note that it doesn't make sense to have a V3
    * standalone signature.
    */
  @js.native
  sealed trait standalone
    extends StObject
       with signature
  /* 2 */ val standalone: typings.openpgp.mod.enums.signature.standalone & Double = js.native
  
  /**
    * 0x18: Subkey Binding Signature
    * This signature is a statement by the top-level signing key that
    * indicates that it owns the subkey.  This signature is calculated
    * directly on the primary key and subkey, and not on any User ID or
    * other packets.  A signature that binds a signing subkey MUST have
    * an Embedded Signature subpacket in this binding signature that
    * contains a 0x19 signature made by the signing subkey on the
    * primary key and subkey.
    */
  @js.native
  sealed trait subkey_binding
    extends StObject
       with signature
  /* 24 */ val subkey_binding: typings.openpgp.mod.enums.signature.subkey_binding & Double = js.native
  
  /**
    * 0x28: Subkey revocation signature
    * The signature is calculated directly on the subkey being revoked.
    * A revoked subkey is not to be used.  Only revocation signatures
    * by the top-level signature key that is bound to this subkey, or
    * by an authorized revocation key, should be considered valid
    * revocation signatures.
    * Key revocation signatures (types 0x20 and 0x28)
    * hash only the key being revoked.
    */
  @js.native
  sealed trait subkey_revocation
    extends StObject
       with signature
  /* 40 */ val subkey_revocation: typings.openpgp.mod.enums.signature.subkey_revocation & Double = js.native
  
  /**
    * 0x01: Signature of a canonical text document.
    * Canonicalyzing the document by converting line endings.
    */
  @js.native
  sealed trait text
    extends StObject
       with signature
  /* 1 */ val text: typings.openpgp.mod.enums.signature.text & Double = js.native
  
  /**
    * 0x50: Third-Party Confirmation signature.
    * This signature is a signature over some other OpenPGP Signature
    * packet(s).  It is analogous to a notary seal on the signed data.
    * A third-party signature SHOULD include Signature Target
    * subpacket(s) to give easy identification.  Note that we really do
    * mean SHOULD.  There are plausible uses for this (such as a blind
    * party that only sees the signature, not the key or source
    * document) that cannot include a target subpacket.
    */
  @js.native
  sealed trait third_party
    extends StObject
       with signature
  /* 80 */ val third_party: typings.openpgp.mod.enums.signature.third_party & Double = js.native
  
  /**
    * 0x40: Timestamp signature.
    * This signature is only meaningful for the timestamp contained in
    * it.
    */
  @js.native
  sealed trait timestamp
    extends StObject
       with signature
  /* 64 */ val timestamp: typings.openpgp.mod.enums.signature.timestamp & Double = js.native
}
