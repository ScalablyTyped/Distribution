package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "enums")
@js.native
object enumsNs extends js.Object {
  @js.native
  sealed trait aead extends js.Object
  
  @js.native
  sealed trait armor extends js.Object
  
  @js.native
  sealed trait compression extends js.Object
  
  trait curve extends js.Object
  
  @js.native
  sealed trait features extends js.Object
  
  @js.native
  sealed trait hash extends js.Object
  
  @js.native
  sealed trait keyFlags extends js.Object
  
  @js.native
  sealed trait keyStatus extends js.Object
  
  @js.native
  sealed trait literal extends js.Object
  
  @js.native
  sealed trait packet extends js.Object
  
  @js.native
  sealed trait publicKey extends js.Object
  
  @js.native
  sealed trait reasonForRevocation extends js.Object
  
  @js.native
  sealed trait s2k extends js.Object
  
  @js.native
  sealed trait signature extends js.Object
  
  @js.native
  sealed trait signatureSubpacket extends js.Object
  
  @js.native
  sealed trait symmetric extends js.Object
  
  @js.native
  sealed trait webHash extends js.Object
  
  /**
    * Converts from an integer to string.
    */
  def read(): scala.Unit = js.native
  /**
    * Asserts validity and converts from string/integer to integer.
    */
  def write(): scala.Unit = js.native
  /**
    * {@link https://tools.ietf.org/html/draft-ietf-openpgp-rfc4880bis-04#section-9.6|RFC4880bis-04, section 9.6}
    */
  @js.native
  object aead extends js.Object {
    @js.native
    sealed trait eax
      extends openpgpLib.openpgpMod.enumsNs.aead
    
    @js.native
    sealed trait experimental_gcm
      extends openpgpLib.openpgpMod.enumsNs.aead
    
    @js.native
    sealed trait ocb
      extends openpgpLib.openpgpMod.enumsNs.aead
    
    /* 1 */ val eax: eax with scala.Double = js.native
    /* 100 */ val experimental_gcm: experimental_gcm with scala.Double = js.native
    /* 2 */ val ocb: ocb with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[openpgpLib.openpgpMod.enumsNs.aead with scala.Double] = js.native
  }
  
  /**
    * Armor type
    */
  @js.native
  object armor extends js.Object {
    @js.native
    sealed trait message
      extends openpgpLib.openpgpMod.enumsNs.armor
    
    @js.native
    sealed trait multipart_last
      extends openpgpLib.openpgpMod.enumsNs.armor
    
    @js.native
    sealed trait multipart_section
      extends openpgpLib.openpgpMod.enumsNs.armor
    
    @js.native
    sealed trait private_key
      extends openpgpLib.openpgpMod.enumsNs.armor
    
    @js.native
    sealed trait public_key
      extends openpgpLib.openpgpMod.enumsNs.armor
    
    @js.native
    sealed trait signature
      extends openpgpLib.openpgpMod.enumsNs.armor
    
    @js.native
    sealed trait signed
      extends openpgpLib.openpgpMod.enumsNs.armor
    
    /* 3 */ val message: message with scala.Double = js.native
    /* 1 */ val multipart_last: multipart_last with scala.Double = js.native
    /* 0 */ val multipart_section: multipart_section with scala.Double = js.native
    /* 5 */ val private_key: private_key with scala.Double = js.native
    /* 4 */ val public_key: public_key with scala.Double = js.native
    /* 6 */ val signature: signature with scala.Double = js.native
    /* 2 */ val signed: signed with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[openpgpLib.openpgpMod.enumsNs.armor with scala.Double] = js.native
  }
  
  /**
    * {@link https://tools.ietf.org/html/rfc4880#section-9.3|RFC4880, section 9.3}
    */
  @js.native
  object compression extends js.Object {
    @js.native
    sealed trait bzip2
      extends openpgpLib.openpgpMod.enumsNs.compression
    
    @js.native
    sealed trait uncompressed
      extends openpgpLib.openpgpMod.enumsNs.compression
    
    /**
      * RFC1951
      */
    @js.native
    sealed trait zip
      extends openpgpLib.openpgpMod.enumsNs.compression
    
    /**
      * RFC1950
      */
    @js.native
    sealed trait zlib
      extends openpgpLib.openpgpMod.enumsNs.compression
    
    /* 3 */ val bzip2: bzip2 with scala.Double = js.native
    /* 0 */ val uncompressed: uncompressed with scala.Double = js.native
    /* 1 */ val zip: zip with scala.Double = js.native
    /* 2 */ val zlib: zlib with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[openpgpLib.openpgpMod.enumsNs.compression with scala.Double] = js.native
  }
  
  /**
    * {@link https://tools.ietf.org/html/draft-ietf-openpgp-rfc4880bis-04#section-5.2.3.25|RFC4880bis-04, section 5.2.3.25}
    */
  @js.native
  object features extends js.Object {
    /**
      * 0x02 - AEAD Encrypted Data Packet (packet 20) and version 5
      * Symmetric-Key Encrypted Session Key Packets (packet 3)
      */
    @js.native
    sealed trait aead
      extends openpgpLib.openpgpMod.enumsNs.features
    
    /**
      * 0x01 - Modification Detection (packets 18 and 19)
      */
    @js.native
    sealed trait modification_detection
      extends openpgpLib.openpgpMod.enumsNs.features
    
    /**
      * 0x04 - Version 5 Public-Key Packet format and corresponding new
      * fingerprint format
      */
    @js.native
    sealed trait v5_keys
      extends openpgpLib.openpgpMod.enumsNs.features
    
    /* 2 */ val aead: aead with scala.Double = js.native
    /* 1 */ val modification_detection: modification_detection with scala.Double = js.native
    /* 4 */ val v5_keys: v5_keys with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[openpgpLib.openpgpMod.enumsNs.features with scala.Double] = js.native
  }
  
  /**
    * {@link https://tools.ietf.org/html/rfc4880#section-9.4|RFC4880, section 9.4}
    */
  @js.native
  object hash extends js.Object {
    @js.native
    sealed trait md5
      extends openpgpLib.openpgpMod.enumsNs.hash
    
    @js.native
    sealed trait ripemd
      extends openpgpLib.openpgpMod.enumsNs.hash
    
    @js.native
    sealed trait sha1
      extends openpgpLib.openpgpMod.enumsNs.hash
    
    @js.native
    sealed trait sha224
      extends openpgpLib.openpgpMod.enumsNs.hash
    
    @js.native
    sealed trait sha256
      extends openpgpLib.openpgpMod.enumsNs.hash
    
    @js.native
    sealed trait sha384
      extends openpgpLib.openpgpMod.enumsNs.hash
    
    @js.native
    sealed trait sha512
      extends openpgpLib.openpgpMod.enumsNs.hash
    
    /* 1 */ val md5: md5 with scala.Double = js.native
    /* 3 */ val ripemd: ripemd with scala.Double = js.native
    /* 2 */ val sha1: sha1 with scala.Double = js.native
    /* 11 */ val sha224: sha224 with scala.Double = js.native
    /* 8 */ val sha256: sha256 with scala.Double = js.native
    /* 9 */ val sha384: sha384 with scala.Double = js.native
    /* 10 */ val sha512: sha512 with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[openpgpLib.openpgpMod.enumsNs.hash with scala.Double] = js.native
  }
  
  /**
    * Key flags
    */
  @js.native
  object keyFlags extends js.Object {
    /**
      * 0x20 - This key may be used for authentication.
      */
    @js.native
    sealed trait authentication
      extends openpgpLib.openpgpMod.enumsNs.keyFlags
    
    /**
      * 0x01 - This key may be used to certify other keys.
      */
    @js.native
    sealed trait certify_keys
      extends openpgpLib.openpgpMod.enumsNs.keyFlags
    
    /**
      * 0x04 - This key may be used to encrypt communications.
      */
    @js.native
    sealed trait encrypt_communication
      extends openpgpLib.openpgpMod.enumsNs.keyFlags
    
    /**
      * 0x08 - This key may be used to encrypt storage.
      */
    @js.native
    sealed trait encrypt_storage
      extends openpgpLib.openpgpMod.enumsNs.keyFlags
    
    /**
      * 0x80 - The private component of this key may be in the
      * possession of more than one person.
      */
    @js.native
    sealed trait shared_private_key
      extends openpgpLib.openpgpMod.enumsNs.keyFlags
    
    /**
      * 0x02 - This key may be used to sign data.
      */
    @js.native
    sealed trait sign_data
      extends openpgpLib.openpgpMod.enumsNs.keyFlags
    
    /**
      * 0x10 - The private component of this key may have been split
      * by a secret-sharing mechanism.
      */
    @js.native
    sealed trait split_private_key
      extends openpgpLib.openpgpMod.enumsNs.keyFlags
    
    /* 32 */ val authentication: authentication with scala.Double = js.native
    /* 1 */ val certify_keys: certify_keys with scala.Double = js.native
    /* 4 */ val encrypt_communication: encrypt_communication with scala.Double = js.native
    /* 8 */ val encrypt_storage: encrypt_storage with scala.Double = js.native
    /* 128 */ val shared_private_key: shared_private_key with scala.Double = js.native
    /* 2 */ val sign_data: sign_data with scala.Double = js.native
    /* 16 */ val split_private_key: split_private_key with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[openpgpLib.openpgpMod.enumsNs.keyFlags with scala.Double] = js.native
  }
  
  /**
    * Key status
    */
  @js.native
  object keyStatus extends js.Object {
    @js.native
    sealed trait expired
      extends openpgpLib.openpgpMod.enumsNs.keyStatus
    
    @js.native
    sealed trait invalid
      extends openpgpLib.openpgpMod.enumsNs.keyStatus
    
    @js.native
    sealed trait no_self_cert
      extends openpgpLib.openpgpMod.enumsNs.keyStatus
    
    @js.native
    sealed trait revoked
      extends openpgpLib.openpgpMod.enumsNs.keyStatus
    
    @js.native
    sealed trait valid
      extends openpgpLib.openpgpMod.enumsNs.keyStatus
    
    /* 1 */ val expired: expired with scala.Double = js.native
    /* 0 */ val invalid: invalid with scala.Double = js.native
    /* 4 */ val no_self_cert: no_self_cert with scala.Double = js.native
    /* 2 */ val revoked: revoked with scala.Double = js.native
    /* 3 */ val valid: valid with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[openpgpLib.openpgpMod.enumsNs.keyStatus with scala.Double] = js.native
  }
  
  /**
    * Data types in the literal packet
    */
  @js.native
  object literal extends js.Object {
    /**
      * Binary data 'b'
      */
    @js.native
    sealed trait binary
      extends openpgpLib.openpgpMod.enumsNs.literal
    
    /**
      * MIME message body part 'm'
      */
    @js.native
    sealed trait mime
      extends openpgpLib.openpgpMod.enumsNs.literal
    
    /**
      * Text data 't'
      */
    @js.native
    sealed trait text
      extends openpgpLib.openpgpMod.enumsNs.literal
    
    /**
      * Utf8 data 'u'
      */
    @js.native
    sealed trait utf8
      extends openpgpLib.openpgpMod.enumsNs.literal
    
    /* 98 */ val binary: binary with scala.Double = js.native
    /* 109 */ val mime: mime with scala.Double = js.native
    /* 116 */ val text: text with scala.Double = js.native
    /* 117 */ val utf8: utf8 with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[openpgpLib.openpgpMod.enumsNs.literal with scala.Double] = js.native
  }
  
  /**
    * A list of packet types and numeric tags associated with them.
    */
  @js.native
  object packet extends js.Object {
    @js.native
    sealed trait compressed
      extends openpgpLib.openpgpMod.enumsNs.packet
    
    @js.native
    sealed trait literal
      extends openpgpLib.openpgpMod.enumsNs.packet
    
    @js.native
    sealed trait marker
      extends openpgpLib.openpgpMod.enumsNs.packet
    
    @js.native
    sealed trait modificationDetectionCode
      extends openpgpLib.openpgpMod.enumsNs.packet
    
    @js.native
    sealed trait onePassSignature
      extends openpgpLib.openpgpMod.enumsNs.packet
    
    @js.native
    sealed trait publicKey
      extends openpgpLib.openpgpMod.enumsNs.packet
    
    @js.native
    sealed trait publicKeyEncryptedSessionKey
      extends openpgpLib.openpgpMod.enumsNs.packet
    
    @js.native
    sealed trait publicSubkey
      extends openpgpLib.openpgpMod.enumsNs.packet
    
    @js.native
    sealed trait secretKey
      extends openpgpLib.openpgpMod.enumsNs.packet
    
    @js.native
    sealed trait secretSubkey
      extends openpgpLib.openpgpMod.enumsNs.packet
    
    @js.native
    sealed trait signature
      extends openpgpLib.openpgpMod.enumsNs.packet
    
    @js.native
    sealed trait symEncryptedAEADProtected
      extends openpgpLib.openpgpMod.enumsNs.packet
    
    @js.native
    sealed trait symEncryptedIntegrityProtected
      extends openpgpLib.openpgpMod.enumsNs.packet
    
    @js.native
    sealed trait symEncryptedSessionKey
      extends openpgpLib.openpgpMod.enumsNs.packet
    
    @js.native
    sealed trait symmetricallyEncrypted
      extends openpgpLib.openpgpMod.enumsNs.packet
    
    @js.native
    sealed trait trust
      extends openpgpLib.openpgpMod.enumsNs.packet
    
    @js.native
    sealed trait userAttribute
      extends openpgpLib.openpgpMod.enumsNs.packet
    
    @js.native
    sealed trait userid
      extends openpgpLib.openpgpMod.enumsNs.packet
    
    /* 8 */ val compressed: compressed with scala.Double = js.native
    /* 11 */ val literal: literal with scala.Double = js.native
    /* 10 */ val marker: marker with scala.Double = js.native
    /* 19 */ val modificationDetectionCode: modificationDetectionCode with scala.Double = js.native
    /* 4 */ val onePassSignature: onePassSignature with scala.Double = js.native
    /* 6 */ val publicKey: publicKey with scala.Double = js.native
    /* 1 */ val publicKeyEncryptedSessionKey: publicKeyEncryptedSessionKey with scala.Double = js.native
    /* 14 */ val publicSubkey: publicSubkey with scala.Double = js.native
    /* 5 */ val secretKey: secretKey with scala.Double = js.native
    /* 7 */ val secretSubkey: secretSubkey with scala.Double = js.native
    /* 2 */ val signature: signature with scala.Double = js.native
    /* 20 */ val symEncryptedAEADProtected: symEncryptedAEADProtected with scala.Double = js.native
    /* 18 */ val symEncryptedIntegrityProtected: symEncryptedIntegrityProtected with scala.Double = js.native
    /* 3 */ val symEncryptedSessionKey: symEncryptedSessionKey with scala.Double = js.native
    /* 9 */ val symmetricallyEncrypted: symmetricallyEncrypted with scala.Double = js.native
    /* 12 */ val trust: trust with scala.Double = js.native
    /* 17 */ val userAttribute: userAttribute with scala.Double = js.native
    /* 13 */ val userid: userid with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[openpgpLib.openpgpMod.enumsNs.packet with scala.Double] = js.native
  }
  
  /**
    * {@link https://tools.ietf.org/html/draft-ietf-openpgp-rfc4880bis-04#section-9.1|RFC4880bis-04, section 9.1}
    */
  @js.native
  object publicKey extends js.Object {
    /**
      * Reserved for AEDH
      */
    @js.native
    sealed trait aedh
      extends openpgpLib.openpgpMod.enumsNs.publicKey
    
    /**
      * Reserved for AEDSA
      */
    @js.native
    sealed trait aedsa
      extends openpgpLib.openpgpMod.enumsNs.publicKey
    
    /**
      * DSA (Sign only) [FIPS186] [HAC]
      */
    @js.native
    sealed trait dsa
      extends openpgpLib.openpgpMod.enumsNs.publicKey
    
    /**
      * ECDH (Encrypt only) [RFC6637]
      */
    @js.native
    sealed trait ecdh
      extends openpgpLib.openpgpMod.enumsNs.publicKey
    
    /**
      * ECDSA (Sign only) [RFC6637]
      */
    @js.native
    sealed trait ecdsa
      extends openpgpLib.openpgpMod.enumsNs.publicKey
    
    /**
      * EdDSA (Sign only)
      * [ {@link https://tools.ietf.org/html/draft-koch-eddsa-for-openpgp-04|Draft RFC}]
      */
    @js.native
    sealed trait eddsa
      extends openpgpLib.openpgpMod.enumsNs.publicKey
    
    /**
      * Elgamal (Encrypt only) [ELGAMAL] [HAC]
      */
    @js.native
    sealed trait elgamal
      extends openpgpLib.openpgpMod.enumsNs.publicKey
    
    /**
      * RSA (Encrypt only) [HAC]
      */
    @js.native
    sealed trait rsa_encrypt
      extends openpgpLib.openpgpMod.enumsNs.publicKey
    
    /**
      * RSA (Encrypt or Sign) [HAC]
      */
    @js.native
    sealed trait rsa_encrypt_sign
      extends openpgpLib.openpgpMod.enumsNs.publicKey
    
    /**
      * RSA (Sign only) [HAC]
      */
    @js.native
    sealed trait rsa_sign
      extends openpgpLib.openpgpMod.enumsNs.publicKey
    
    /* 23 */ val aedh: aedh with scala.Double = js.native
    /* 24 */ val aedsa: aedsa with scala.Double = js.native
    /* 17 */ val dsa: dsa with scala.Double = js.native
    /* 18 */ val ecdh: ecdh with scala.Double = js.native
    /* 19 */ val ecdsa: ecdsa with scala.Double = js.native
    /* 22 */ val eddsa: eddsa with scala.Double = js.native
    /* 16 */ val elgamal: elgamal with scala.Double = js.native
    /* 2 */ val rsa_encrypt: rsa_encrypt with scala.Double = js.native
    /* 1 */ val rsa_encrypt_sign: rsa_encrypt_sign with scala.Double = js.native
    /* 3 */ val rsa_sign: rsa_sign with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[openpgpLib.openpgpMod.enumsNs.publicKey with scala.Double] = js.native
  }
  
  /**
    * {@link https://tools.ietf.org/html/rfc4880#section-5.2.3.23|RFC4880, section 5.2.3.23}
    */
  @js.native
  object reasonForRevocation extends js.Object {
    /**
      * Key material has been comPromise<any>d (key revocations)
      */
    @js.native
    sealed trait key_comPromised
      extends openpgpLib.openpgpMod.enumsNs.reasonForRevocation
    
    /**
      * Key is retired and no longer used (key revocations)
      */
    @js.native
    sealed trait key_retired
      extends openpgpLib.openpgpMod.enumsNs.reasonForRevocation
    
    /**
      * Key is superseded (key revocations)
      */
    @js.native
    sealed trait key_superseded
      extends openpgpLib.openpgpMod.enumsNs.reasonForRevocation
    
    /**
      * No reason specified (key revocations or cert revocations)
      */
    @js.native
    sealed trait no_reason
      extends openpgpLib.openpgpMod.enumsNs.reasonForRevocation
    
    /**
      * User ID information is no longer valid (cert revocations)
      */
    @js.native
    sealed trait userid_invalid
      extends openpgpLib.openpgpMod.enumsNs.reasonForRevocation
    
    /* 2 */ val key_comPromised: key_comPromised with scala.Double = js.native
    /* 3 */ val key_retired: key_retired with scala.Double = js.native
    /* 1 */ val key_superseded: key_superseded with scala.Double = js.native
    /* 0 */ val no_reason: no_reason with scala.Double = js.native
    /* 32 */ val userid_invalid: userid_invalid with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[openpgpLib.openpgpMod.enumsNs.reasonForRevocation with scala.Double] = js.native
  }
  
  /**
    * A string to key specifier type
    */
  @js.native
  object s2k extends js.Object {
    @js.native
    sealed trait gnu
      extends openpgpLib.openpgpMod.enumsNs.s2k
    
    @js.native
    sealed trait iterated
      extends openpgpLib.openpgpMod.enumsNs.s2k
    
    @js.native
    sealed trait salted
      extends openpgpLib.openpgpMod.enumsNs.s2k
    
    @js.native
    sealed trait simple
      extends openpgpLib.openpgpMod.enumsNs.s2k
    
    /* 101 */ val gnu: gnu with scala.Double = js.native
    /* 3 */ val iterated: iterated with scala.Double = js.native
    /* 1 */ val salted: salted with scala.Double = js.native
    /* 0 */ val simple: simple with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[openpgpLib.openpgpMod.enumsNs.s2k with scala.Double] = js.native
  }
  
  /**
    * One pass signature packet type
    */
  @js.native
  object signature extends js.Object {
    /**
      * 0x00: Signature of a binary document.
      */
    @js.native
    sealed trait binary
      extends openpgpLib.openpgpMod.enumsNs.signature
    
    /**
      * 0x12: Casual certification of a User ID and Public-Key packet.
      * The issuer of this certification has done some casual
      * verification of the claim of identity.
      */
    @js.native
    sealed trait cert_casual
      extends openpgpLib.openpgpMod.enumsNs.signature
    
    /**
      * 0x10: Generic certification of a User ID and Public-Key packet.
      * The issuer of this certification does not make any particular
      * assertion as to how well the certifier has checked that the owner
      * of the key is in fact the person described by the User ID.
      */
    @js.native
    sealed trait cert_generic
      extends openpgpLib.openpgpMod.enumsNs.signature
    
    /**
      * 0x11: Persona certification of a User ID and Public-Key packet.
      * The issuer of this certification has not done any verification of
      * the claim that the owner of this key is the User ID specified.
      */
    @js.native
    sealed trait cert_persona
      extends openpgpLib.openpgpMod.enumsNs.signature
    
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
      extends openpgpLib.openpgpMod.enumsNs.signature
    
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
      extends openpgpLib.openpgpMod.enumsNs.signature
    
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
      extends openpgpLib.openpgpMod.enumsNs.signature
    
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
      extends openpgpLib.openpgpMod.enumsNs.signature
    
    /**
      * 0x20: Key revocation signature
      * The signature is calculated directly on the key being revoked.  A
      * revoked key is not to be used.  Only revocation signatures by the
      * key being revoked, or by an authorized revocation key, should be
      * considered valid revocation signatures.a
      */
    @js.native
    sealed trait key_revocation
      extends openpgpLib.openpgpMod.enumsNs.signature
    
    /**
      * 0x02: Standalone signature.
      * This signature is a signature of only its own subpacket contents.
      * It is calculated identically to a signature over a zero-lengh
      * binary document.  Note that it doesn't make sense to have a V3
      * standalone signature.
      */
    @js.native
    sealed trait standalone
      extends openpgpLib.openpgpMod.enumsNs.signature
    
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
      extends openpgpLib.openpgpMod.enumsNs.signature
    
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
      extends openpgpLib.openpgpMod.enumsNs.signature
    
    /**
      * 0x01: Signature of a canonical text document.
      * Canonicalyzing the document by converting line endings.
      */
    @js.native
    sealed trait text
      extends openpgpLib.openpgpMod.enumsNs.signature
    
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
      extends openpgpLib.openpgpMod.enumsNs.signature
    
    /**
      * 0x40: Timestamp signature.
      * This signature is only meaningful for the timestamp contained in
      * it.
      */
    @js.native
    sealed trait timestamp
      extends openpgpLib.openpgpMod.enumsNs.signature
    
    /* 0 */ val binary: binary with scala.Double = js.native
    /* 18 */ val cert_casual: cert_casual with scala.Double = js.native
    /* 16 */ val cert_generic: cert_generic with scala.Double = js.native
    /* 17 */ val cert_persona: cert_persona with scala.Double = js.native
    /* 19 */ val cert_positive: cert_positive with scala.Double = js.native
    /* 48 */ val cert_revocation: cert_revocation with scala.Double = js.native
    /* 31 */ val key: key with scala.Double = js.native
    /* 25 */ val key_binding: key_binding with scala.Double = js.native
    /* 32 */ val key_revocation: key_revocation with scala.Double = js.native
    /* 2 */ val standalone: standalone with scala.Double = js.native
    /* 24 */ val subkey_binding: subkey_binding with scala.Double = js.native
    /* 40 */ val subkey_revocation: subkey_revocation with scala.Double = js.native
    /* 1 */ val text: text with scala.Double = js.native
    /* 80 */ val third_party: third_party with scala.Double = js.native
    /* 64 */ val timestamp: timestamp with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[openpgpLib.openpgpMod.enumsNs.signature with scala.Double] = js.native
  }
  
  /**
    * Signature subpacket type
    */
  @js.native
  object signatureSubpacket extends js.Object {
    @js.native
    sealed trait embedded_signature
      extends openpgpLib.openpgpMod.enumsNs.signatureSubpacket
    
    @js.native
    sealed trait exportable_certification
      extends openpgpLib.openpgpMod.enumsNs.signatureSubpacket
    
    @js.native
    sealed trait features
      extends openpgpLib.openpgpMod.enumsNs.signatureSubpacket
    
    @js.native
    sealed trait issuer
      extends openpgpLib.openpgpMod.enumsNs.signatureSubpacket
    
    @js.native
    sealed trait issuer_fingerprint
      extends openpgpLib.openpgpMod.enumsNs.signatureSubpacket
    
    @js.native
    sealed trait key_expiration_time
      extends openpgpLib.openpgpMod.enumsNs.signatureSubpacket
    
    @js.native
    sealed trait key_flags
      extends openpgpLib.openpgpMod.enumsNs.signatureSubpacket
    
    @js.native
    sealed trait key_server_preferences
      extends openpgpLib.openpgpMod.enumsNs.signatureSubpacket
    
    @js.native
    sealed trait notation_data
      extends openpgpLib.openpgpMod.enumsNs.signatureSubpacket
    
    @js.native
    sealed trait placeholder_backwards_compatibility
      extends openpgpLib.openpgpMod.enumsNs.signatureSubpacket
    
    @js.native
    sealed trait policy_uri
      extends openpgpLib.openpgpMod.enumsNs.signatureSubpacket
    
    @js.native
    sealed trait preferred_aead_algorithms
      extends openpgpLib.openpgpMod.enumsNs.signatureSubpacket
    
    @js.native
    sealed trait preferred_compression_algorithms
      extends openpgpLib.openpgpMod.enumsNs.signatureSubpacket
    
    @js.native
    sealed trait preferred_hash_algorithms
      extends openpgpLib.openpgpMod.enumsNs.signatureSubpacket
    
    @js.native
    sealed trait preferred_key_server
      extends openpgpLib.openpgpMod.enumsNs.signatureSubpacket
    
    @js.native
    sealed trait preferred_symmetric_algorithms
      extends openpgpLib.openpgpMod.enumsNs.signatureSubpacket
    
    @js.native
    sealed trait primary_user_id
      extends openpgpLib.openpgpMod.enumsNs.signatureSubpacket
    
    @js.native
    sealed trait reason_for_revocation
      extends openpgpLib.openpgpMod.enumsNs.signatureSubpacket
    
    @js.native
    sealed trait regular_expression
      extends openpgpLib.openpgpMod.enumsNs.signatureSubpacket
    
    @js.native
    sealed trait revocable
      extends openpgpLib.openpgpMod.enumsNs.signatureSubpacket
    
    @js.native
    sealed trait revocation_key
      extends openpgpLib.openpgpMod.enumsNs.signatureSubpacket
    
    @js.native
    sealed trait signature_creation_time
      extends openpgpLib.openpgpMod.enumsNs.signatureSubpacket
    
    @js.native
    sealed trait signature_expiration_time
      extends openpgpLib.openpgpMod.enumsNs.signatureSubpacket
    
    @js.native
    sealed trait signature_target
      extends openpgpLib.openpgpMod.enumsNs.signatureSubpacket
    
    @js.native
    sealed trait signers_user_id
      extends openpgpLib.openpgpMod.enumsNs.signatureSubpacket
    
    @js.native
    sealed trait trust_signature
      extends openpgpLib.openpgpMod.enumsNs.signatureSubpacket
    
    /* 32 */ val embedded_signature: embedded_signature with scala.Double = js.native
    /* 4 */ val exportable_certification: exportable_certification with scala.Double = js.native
    /* 30 */ val features: features with scala.Double = js.native
    /* 16 */ val issuer: issuer with scala.Double = js.native
    /* 33 */ val issuer_fingerprint: issuer_fingerprint with scala.Double = js.native
    /* 9 */ val key_expiration_time: key_expiration_time with scala.Double = js.native
    /* 27 */ val key_flags: key_flags with scala.Double = js.native
    /* 23 */ val key_server_preferences: key_server_preferences with scala.Double = js.native
    /* 20 */ val notation_data: notation_data with scala.Double = js.native
    /* 10 */ val placeholder_backwards_compatibility: placeholder_backwards_compatibility with scala.Double = js.native
    /* 26 */ val policy_uri: policy_uri with scala.Double = js.native
    /* 34 */ val preferred_aead_algorithms: preferred_aead_algorithms with scala.Double = js.native
    /* 22 */ val preferred_compression_algorithms: preferred_compression_algorithms with scala.Double = js.native
    /* 21 */ val preferred_hash_algorithms: preferred_hash_algorithms with scala.Double = js.native
    /* 24 */ val preferred_key_server: preferred_key_server with scala.Double = js.native
    /* 11 */ val preferred_symmetric_algorithms: preferred_symmetric_algorithms with scala.Double = js.native
    /* 25 */ val primary_user_id: primary_user_id with scala.Double = js.native
    /* 29 */ val reason_for_revocation: reason_for_revocation with scala.Double = js.native
    /* 6 */ val regular_expression: regular_expression with scala.Double = js.native
    /* 7 */ val revocable: revocable with scala.Double = js.native
    /* 12 */ val revocation_key: revocation_key with scala.Double = js.native
    /* 2 */ val signature_creation_time: signature_creation_time with scala.Double = js.native
    /* 3 */ val signature_expiration_time: signature_expiration_time with scala.Double = js.native
    /* 31 */ val signature_target: signature_target with scala.Double = js.native
    /* 28 */ val signers_user_id: signers_user_id with scala.Double = js.native
    /* 5 */ val trust_signature: trust_signature with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[openpgpLib.openpgpMod.enumsNs.signatureSubpacket with scala.Double] = js.native
  }
  
  /**
    * {@link https://tools.ietf.org/html/rfc4880#section-9.2|RFC4880, section 9.2}
    */
  @js.native
  object symmetric extends js.Object {
    @js.native
    sealed trait `3des`
      extends openpgpLib.openpgpMod.enumsNs.symmetric
    
    @js.native
    sealed trait aes128
      extends openpgpLib.openpgpMod.enumsNs.symmetric
    
    @js.native
    sealed trait aes192
      extends openpgpLib.openpgpMod.enumsNs.symmetric
    
    @js.native
    sealed trait aes256
      extends openpgpLib.openpgpMod.enumsNs.symmetric
    
    @js.native
    sealed trait blowfish
      extends openpgpLib.openpgpMod.enumsNs.symmetric
    
    @js.native
    sealed trait cast5
      extends openpgpLib.openpgpMod.enumsNs.symmetric
    
    /**
      * Not implemented!
      */
    @js.native
    sealed trait idea
      extends openpgpLib.openpgpMod.enumsNs.symmetric
    
    @js.native
    sealed trait plaintext
      extends openpgpLib.openpgpMod.enumsNs.symmetric
    
    @js.native
    sealed trait tripledes
      extends openpgpLib.openpgpMod.enumsNs.symmetric
    
    @js.native
    sealed trait twofish
      extends openpgpLib.openpgpMod.enumsNs.symmetric
    
    /* 2 */ val `3des`: `3des` with scala.Double = js.native
    /* 7 */ val aes128: aes128 with scala.Double = js.native
    /* 8 */ val aes192: aes192 with scala.Double = js.native
    /* 9 */ val aes256: aes256 with scala.Double = js.native
    /* 4 */ val blowfish: blowfish with scala.Double = js.native
    /* 3 */ val cast5: cast5 with scala.Double = js.native
    /* 1 */ val idea: idea with scala.Double = js.native
    /* 0 */ val plaintext: plaintext with scala.Double = js.native
    /* 2 */ val tripledes: tripledes with scala.Double = js.native
    /* 10 */ val twofish: twofish with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[openpgpLib.openpgpMod.enumsNs.symmetric with scala.Double] = js.native
  }
  
  /**
    * A list of hash names as accepted by webCrypto functions.
    * {@link https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest|Parameters, algo}
    */
  @js.native
  object webHash extends js.Object {
    @js.native
    sealed trait `SHA-1`
      extends openpgpLib.openpgpMod.enumsNs.webHash
    
    @js.native
    sealed trait `SHA-256`
      extends openpgpLib.openpgpMod.enumsNs.webHash
    
    @js.native
    sealed trait `SHA-384`
      extends openpgpLib.openpgpMod.enumsNs.webHash
    
    @js.native
    sealed trait `SHA-512`
      extends openpgpLib.openpgpMod.enumsNs.webHash
    
    /* 2 */ val `SHA-1`: `SHA-1` with scala.Double = js.native
    /* 8 */ val `SHA-256`: `SHA-256` with scala.Double = js.native
    /* 9 */ val `SHA-384`: `SHA-384` with scala.Double = js.native
    /* 10 */ val `SHA-512`: `SHA-512` with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[openpgpLib.openpgpMod.enumsNs.webHash with scala.Double] = js.native
  }
  
}

