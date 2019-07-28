package typings.openpgp.openpgpMod

import typings.openpgp.openpgpMod.enumsNs.aead
import typings.openpgp.openpgpMod.enumsNs.armor
import typings.openpgp.openpgpMod.enumsNs.compression
import typings.openpgp.openpgpMod.enumsNs.features
import typings.openpgp.openpgpMod.enumsNs.hash
import typings.openpgp.openpgpMod.enumsNs.keyFlags
import typings.openpgp.openpgpMod.enumsNs.keyStatus
import typings.openpgp.openpgpMod.enumsNs.literal
import typings.openpgp.openpgpMod.enumsNs.packet
import typings.openpgp.openpgpMod.enumsNs.publicKey
import typings.openpgp.openpgpMod.enumsNs.reasonForRevocation
import typings.openpgp.openpgpMod.enumsNs.s2k
import typings.openpgp.openpgpMod.enumsNs.signature
import typings.openpgp.openpgpMod.enumsNs.signatureSubpacket
import typings.openpgp.openpgpMod.enumsNs.symmetric
import typings.openpgp.openpgpMod.enumsNs.webHash
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
  
  /**
    * Maps curve names under various standards to one
    * @see
    */
  /* Rewritten from type alias, can be one of: 
    - typings.openpgp.openpgpStrings.p256
    - typings.openpgp.openpgpStrings.p384
    - typings.openpgp.openpgpStrings.p251
    - typings.openpgp.openpgpStrings.secp256k1
    - typings.openpgp.openpgpStrings.ed25519
    - typings.openpgp.openpgpStrings.curve25519
    - typings.openpgp.openpgpStrings.brainpoolP256r1
    - typings.openpgp.openpgpStrings.brainpoolP384r1
    - typings.openpgp.openpgpStrings.brainpoolP512r1
  */
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
  def read(): Unit = js.native
  /**
    * Asserts validity and converts from string/integer to integer.
    */
  def write(): Unit = js.native
  /**
    * {@link https://tools.ietf.org/html/draft-ietf-openpgp-rfc4880bis-04#section-9.6|RFC4880bis-04, section 9.6}
    */
  @js.native
  object aead extends js.Object {
    @js.native
    sealed trait eax extends aead
    
    @js.native
    sealed trait experimental_gcm extends aead
    
    @js.native
    sealed trait ocb extends aead
    
    /* 1 */ val eax: typings.openpgp.openpgpMod.enumsNs.aead.eax with Double = js.native
    /* 100 */ val experimental_gcm: typings.openpgp.openpgpMod.enumsNs.aead.experimental_gcm with Double = js.native
    /* 2 */ val ocb: typings.openpgp.openpgpMod.enumsNs.aead.ocb with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[aead with Double] = js.native
  }
  
  /**
    * Armor type
    */
  @js.native
  object armor extends js.Object {
    @js.native
    sealed trait message extends armor
    
    @js.native
    sealed trait multipart_last extends armor
    
    @js.native
    sealed trait multipart_section extends armor
    
    @js.native
    sealed trait private_key extends armor
    
    @js.native
    sealed trait public_key extends armor
    
    @js.native
    sealed trait signature extends armor
    
    @js.native
    sealed trait signed extends armor
    
    /* 3 */ val message: typings.openpgp.openpgpMod.enumsNs.armor.message with Double = js.native
    /* 1 */ val multipart_last: typings.openpgp.openpgpMod.enumsNs.armor.multipart_last with Double = js.native
    /* 0 */ val multipart_section: typings.openpgp.openpgpMod.enumsNs.armor.multipart_section with Double = js.native
    /* 5 */ val private_key: typings.openpgp.openpgpMod.enumsNs.armor.private_key with Double = js.native
    /* 4 */ val public_key: typings.openpgp.openpgpMod.enumsNs.armor.public_key with Double = js.native
    /* 6 */ val signature: typings.openpgp.openpgpMod.enumsNs.armor.signature with Double = js.native
    /* 2 */ val signed: typings.openpgp.openpgpMod.enumsNs.armor.signed with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[armor with Double] = js.native
  }
  
  /**
    * {@link https://tools.ietf.org/html/rfc4880#section-9.3|RFC4880, section 9.3}
    */
  @js.native
  object compression extends js.Object {
    @js.native
    sealed trait bzip2 extends compression
    
    @js.native
    sealed trait uncompressed extends compression
    
    /**
      * RFC1951
      */
    @js.native
    sealed trait zip extends compression
    
    /**
      * RFC1950
      */
    @js.native
    sealed trait zlib extends compression
    
    /* 3 */ val bzip2: typings.openpgp.openpgpMod.enumsNs.compression.bzip2 with Double = js.native
    /* 0 */ val uncompressed: typings.openpgp.openpgpMod.enumsNs.compression.uncompressed with Double = js.native
    /* 1 */ val zip: typings.openpgp.openpgpMod.enumsNs.compression.zip with Double = js.native
    /* 2 */ val zlib: typings.openpgp.openpgpMod.enumsNs.compression.zlib with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[compression with Double] = js.native
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
    sealed trait aead extends features
    
    /**
      * 0x01 - Modification Detection (packets 18 and 19)
      */
    @js.native
    sealed trait modification_detection extends features
    
    /**
      * 0x04 - Version 5 Public-Key Packet format and corresponding new
      * fingerprint format
      */
    @js.native
    sealed trait v5_keys extends features
    
    /* 2 */ val aead: typings.openpgp.openpgpMod.enumsNs.features.aead with Double = js.native
    /* 1 */ val modification_detection: typings.openpgp.openpgpMod.enumsNs.features.modification_detection with Double = js.native
    /* 4 */ val v5_keys: typings.openpgp.openpgpMod.enumsNs.features.v5_keys with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[features with Double] = js.native
  }
  
  /**
    * {@link https://tools.ietf.org/html/rfc4880#section-9.4|RFC4880, section 9.4}
    */
  @js.native
  object hash extends js.Object {
    @js.native
    sealed trait md5 extends hash
    
    @js.native
    sealed trait ripemd extends hash
    
    @js.native
    sealed trait sha1 extends hash
    
    @js.native
    sealed trait sha224 extends hash
    
    @js.native
    sealed trait sha256 extends hash
    
    @js.native
    sealed trait sha384 extends hash
    
    @js.native
    sealed trait sha512 extends hash
    
    /* 1 */ val md5: typings.openpgp.openpgpMod.enumsNs.hash.md5 with Double = js.native
    /* 3 */ val ripemd: typings.openpgp.openpgpMod.enumsNs.hash.ripemd with Double = js.native
    /* 2 */ val sha1: typings.openpgp.openpgpMod.enumsNs.hash.sha1 with Double = js.native
    /* 11 */ val sha224: typings.openpgp.openpgpMod.enumsNs.hash.sha224 with Double = js.native
    /* 8 */ val sha256: typings.openpgp.openpgpMod.enumsNs.hash.sha256 with Double = js.native
    /* 9 */ val sha384: typings.openpgp.openpgpMod.enumsNs.hash.sha384 with Double = js.native
    /* 10 */ val sha512: typings.openpgp.openpgpMod.enumsNs.hash.sha512 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[hash with Double] = js.native
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
    sealed trait authentication extends keyFlags
    
    /**
      * 0x01 - This key may be used to certify other keys.
      */
    @js.native
    sealed trait certify_keys extends keyFlags
    
    /**
      * 0x04 - This key may be used to encrypt communications.
      */
    @js.native
    sealed trait encrypt_communication extends keyFlags
    
    /**
      * 0x08 - This key may be used to encrypt storage.
      */
    @js.native
    sealed trait encrypt_storage extends keyFlags
    
    /**
      * 0x80 - The private component of this key may be in the
      * possession of more than one person.
      */
    @js.native
    sealed trait shared_private_key extends keyFlags
    
    /**
      * 0x02 - This key may be used to sign data.
      */
    @js.native
    sealed trait sign_data extends keyFlags
    
    /**
      * 0x10 - The private component of this key may have been split
      * by a secret-sharing mechanism.
      */
    @js.native
    sealed trait split_private_key extends keyFlags
    
    /* 32 */ val authentication: typings.openpgp.openpgpMod.enumsNs.keyFlags.authentication with Double = js.native
    /* 1 */ val certify_keys: typings.openpgp.openpgpMod.enumsNs.keyFlags.certify_keys with Double = js.native
    /* 4 */ val encrypt_communication: typings.openpgp.openpgpMod.enumsNs.keyFlags.encrypt_communication with Double = js.native
    /* 8 */ val encrypt_storage: typings.openpgp.openpgpMod.enumsNs.keyFlags.encrypt_storage with Double = js.native
    /* 128 */ val shared_private_key: typings.openpgp.openpgpMod.enumsNs.keyFlags.shared_private_key with Double = js.native
    /* 2 */ val sign_data: typings.openpgp.openpgpMod.enumsNs.keyFlags.sign_data with Double = js.native
    /* 16 */ val split_private_key: typings.openpgp.openpgpMod.enumsNs.keyFlags.split_private_key with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[keyFlags with Double] = js.native
  }
  
  /**
    * Key status
    */
  @js.native
  object keyStatus extends js.Object {
    @js.native
    sealed trait expired extends keyStatus
    
    @js.native
    sealed trait invalid extends keyStatus
    
    @js.native
    sealed trait no_self_cert extends keyStatus
    
    @js.native
    sealed trait revoked extends keyStatus
    
    @js.native
    sealed trait valid extends keyStatus
    
    /* 1 */ val expired: typings.openpgp.openpgpMod.enumsNs.keyStatus.expired with Double = js.native
    /* 0 */ val invalid: typings.openpgp.openpgpMod.enumsNs.keyStatus.invalid with Double = js.native
    /* 4 */ val no_self_cert: typings.openpgp.openpgpMod.enumsNs.keyStatus.no_self_cert with Double = js.native
    /* 2 */ val revoked: typings.openpgp.openpgpMod.enumsNs.keyStatus.revoked with Double = js.native
    /* 3 */ val valid: typings.openpgp.openpgpMod.enumsNs.keyStatus.valid with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[keyStatus with Double] = js.native
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
    sealed trait binary extends literal
    
    /**
      * MIME message body part 'm'
      */
    @js.native
    sealed trait mime extends literal
    
    /**
      * Text data 't'
      */
    @js.native
    sealed trait text extends literal
    
    /**
      * Utf8 data 'u'
      */
    @js.native
    sealed trait utf8 extends literal
    
    /* 98 */ val binary: typings.openpgp.openpgpMod.enumsNs.literal.binary with Double = js.native
    /* 109 */ val mime: typings.openpgp.openpgpMod.enumsNs.literal.mime with Double = js.native
    /* 116 */ val text: typings.openpgp.openpgpMod.enumsNs.literal.text with Double = js.native
    /* 117 */ val utf8: typings.openpgp.openpgpMod.enumsNs.literal.utf8 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[literal with Double] = js.native
  }
  
  /**
    * A list of packet types and numeric tags associated with them.
    */
  @js.native
  object packet extends js.Object {
    @js.native
    sealed trait compressed extends packet
    
    @js.native
    sealed trait literal extends packet
    
    @js.native
    sealed trait marker extends packet
    
    @js.native
    sealed trait modificationDetectionCode extends packet
    
    @js.native
    sealed trait onePassSignature extends packet
    
    @js.native
    sealed trait publicKey extends packet
    
    @js.native
    sealed trait publicKeyEncryptedSessionKey extends packet
    
    @js.native
    sealed trait publicSubkey extends packet
    
    @js.native
    sealed trait secretKey extends packet
    
    @js.native
    sealed trait secretSubkey extends packet
    
    @js.native
    sealed trait signature extends packet
    
    @js.native
    sealed trait symEncryptedAEADProtected extends packet
    
    @js.native
    sealed trait symEncryptedIntegrityProtected extends packet
    
    @js.native
    sealed trait symEncryptedSessionKey extends packet
    
    @js.native
    sealed trait symmetricallyEncrypted extends packet
    
    @js.native
    sealed trait trust extends packet
    
    @js.native
    sealed trait userAttribute extends packet
    
    @js.native
    sealed trait userid extends packet
    
    /* 8 */ val compressed: typings.openpgp.openpgpMod.enumsNs.packet.compressed with Double = js.native
    /* 11 */ val literal: typings.openpgp.openpgpMod.enumsNs.packet.literal with Double = js.native
    /* 10 */ val marker: typings.openpgp.openpgpMod.enumsNs.packet.marker with Double = js.native
    /* 19 */ val modificationDetectionCode: typings.openpgp.openpgpMod.enumsNs.packet.modificationDetectionCode with Double = js.native
    /* 4 */ val onePassSignature: typings.openpgp.openpgpMod.enumsNs.packet.onePassSignature with Double = js.native
    /* 6 */ val publicKey: typings.openpgp.openpgpMod.enumsNs.packet.publicKey with Double = js.native
    /* 1 */ val publicKeyEncryptedSessionKey: typings.openpgp.openpgpMod.enumsNs.packet.publicKeyEncryptedSessionKey with Double = js.native
    /* 14 */ val publicSubkey: typings.openpgp.openpgpMod.enumsNs.packet.publicSubkey with Double = js.native
    /* 5 */ val secretKey: typings.openpgp.openpgpMod.enumsNs.packet.secretKey with Double = js.native
    /* 7 */ val secretSubkey: typings.openpgp.openpgpMod.enumsNs.packet.secretSubkey with Double = js.native
    /* 2 */ val signature: typings.openpgp.openpgpMod.enumsNs.packet.signature with Double = js.native
    /* 20 */ val symEncryptedAEADProtected: typings.openpgp.openpgpMod.enumsNs.packet.symEncryptedAEADProtected with Double = js.native
    /* 18 */ val symEncryptedIntegrityProtected: typings.openpgp.openpgpMod.enumsNs.packet.symEncryptedIntegrityProtected with Double = js.native
    /* 3 */ val symEncryptedSessionKey: typings.openpgp.openpgpMod.enumsNs.packet.symEncryptedSessionKey with Double = js.native
    /* 9 */ val symmetricallyEncrypted: typings.openpgp.openpgpMod.enumsNs.packet.symmetricallyEncrypted with Double = js.native
    /* 12 */ val trust: typings.openpgp.openpgpMod.enumsNs.packet.trust with Double = js.native
    /* 17 */ val userAttribute: typings.openpgp.openpgpMod.enumsNs.packet.userAttribute with Double = js.native
    /* 13 */ val userid: typings.openpgp.openpgpMod.enumsNs.packet.userid with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[packet with Double] = js.native
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
    sealed trait aedh extends publicKey
    
    /**
      * Reserved for AEDSA
      */
    @js.native
    sealed trait aedsa extends publicKey
    
    /**
      * DSA (Sign only) [FIPS186] [HAC]
      */
    @js.native
    sealed trait dsa extends publicKey
    
    /**
      * ECDH (Encrypt only) [RFC6637]
      */
    @js.native
    sealed trait ecdh extends publicKey
    
    /**
      * ECDSA (Sign only) [RFC6637]
      */
    @js.native
    sealed trait ecdsa extends publicKey
    
    /**
      * EdDSA (Sign only)
      * [ {@link https://tools.ietf.org/html/draft-koch-eddsa-for-openpgp-04|Draft RFC}]
      */
    @js.native
    sealed trait eddsa extends publicKey
    
    /**
      * Elgamal (Encrypt only) [ELGAMAL] [HAC]
      */
    @js.native
    sealed trait elgamal extends publicKey
    
    /**
      * RSA (Encrypt only) [HAC]
      */
    @js.native
    sealed trait rsa_encrypt extends publicKey
    
    /**
      * RSA (Encrypt or Sign) [HAC]
      */
    @js.native
    sealed trait rsa_encrypt_sign extends publicKey
    
    /**
      * RSA (Sign only) [HAC]
      */
    @js.native
    sealed trait rsa_sign extends publicKey
    
    /* 23 */ val aedh: typings.openpgp.openpgpMod.enumsNs.publicKey.aedh with Double = js.native
    /* 24 */ val aedsa: typings.openpgp.openpgpMod.enumsNs.publicKey.aedsa with Double = js.native
    /* 17 */ val dsa: typings.openpgp.openpgpMod.enumsNs.publicKey.dsa with Double = js.native
    /* 18 */ val ecdh: typings.openpgp.openpgpMod.enumsNs.publicKey.ecdh with Double = js.native
    /* 19 */ val ecdsa: typings.openpgp.openpgpMod.enumsNs.publicKey.ecdsa with Double = js.native
    /* 22 */ val eddsa: typings.openpgp.openpgpMod.enumsNs.publicKey.eddsa with Double = js.native
    /* 16 */ val elgamal: typings.openpgp.openpgpMod.enumsNs.publicKey.elgamal with Double = js.native
    /* 2 */ val rsa_encrypt: typings.openpgp.openpgpMod.enumsNs.publicKey.rsa_encrypt with Double = js.native
    /* 1 */ val rsa_encrypt_sign: typings.openpgp.openpgpMod.enumsNs.publicKey.rsa_encrypt_sign with Double = js.native
    /* 3 */ val rsa_sign: typings.openpgp.openpgpMod.enumsNs.publicKey.rsa_sign with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[publicKey with Double] = js.native
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
    sealed trait key_comPromised extends reasonForRevocation
    
    /**
      * Key is retired and no longer used (key revocations)
      */
    @js.native
    sealed trait key_retired extends reasonForRevocation
    
    /**
      * Key is superseded (key revocations)
      */
    @js.native
    sealed trait key_superseded extends reasonForRevocation
    
    /**
      * No reason specified (key revocations or cert revocations)
      */
    @js.native
    sealed trait no_reason extends reasonForRevocation
    
    /**
      * User ID information is no longer valid (cert revocations)
      */
    @js.native
    sealed trait userid_invalid extends reasonForRevocation
    
    /* 2 */ val key_comPromised: typings.openpgp.openpgpMod.enumsNs.reasonForRevocation.key_comPromised with Double = js.native
    /* 3 */ val key_retired: typings.openpgp.openpgpMod.enumsNs.reasonForRevocation.key_retired with Double = js.native
    /* 1 */ val key_superseded: typings.openpgp.openpgpMod.enumsNs.reasonForRevocation.key_superseded with Double = js.native
    /* 0 */ val no_reason: typings.openpgp.openpgpMod.enumsNs.reasonForRevocation.no_reason with Double = js.native
    /* 32 */ val userid_invalid: typings.openpgp.openpgpMod.enumsNs.reasonForRevocation.userid_invalid with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[reasonForRevocation with Double] = js.native
  }
  
  /**
    * A string to key specifier type
    */
  @js.native
  object s2k extends js.Object {
    @js.native
    sealed trait gnu extends s2k
    
    @js.native
    sealed trait iterated extends s2k
    
    @js.native
    sealed trait salted extends s2k
    
    @js.native
    sealed trait simple extends s2k
    
    /* 101 */ val gnu: typings.openpgp.openpgpMod.enumsNs.s2k.gnu with Double = js.native
    /* 3 */ val iterated: typings.openpgp.openpgpMod.enumsNs.s2k.iterated with Double = js.native
    /* 1 */ val salted: typings.openpgp.openpgpMod.enumsNs.s2k.salted with Double = js.native
    /* 0 */ val simple: typings.openpgp.openpgpMod.enumsNs.s2k.simple with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[s2k with Double] = js.native
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
    sealed trait binary extends signature
    
    /**
      * 0x12: Casual certification of a User ID and Public-Key packet.
      * The issuer of this certification has done some casual
      * verification of the claim of identity.
      */
    @js.native
    sealed trait cert_casual extends signature
    
    /**
      * 0x10: Generic certification of a User ID and Public-Key packet.
      * The issuer of this certification does not make any particular
      * assertion as to how well the certifier has checked that the owner
      * of the key is in fact the person described by the User ID.
      */
    @js.native
    sealed trait cert_generic extends signature
    
    /**
      * 0x11: Persona certification of a User ID and Public-Key packet.
      * The issuer of this certification has not done any verification of
      * the claim that the owner of this key is the User ID specified.
      */
    @js.native
    sealed trait cert_persona extends signature
    
    /**
      * 0x13: Positive certification of a User ID and Public-Key packet.
      * The issuer of this certification has done substantial
      * verification of the claim of identity.
      * Most OpenPGP implementations make their "key signatures" as 0x10
      * certifications.  Some implementations can issue 0x11-0x13
      * certifications, but few differentiate between the types.
      */
    @js.native
    sealed trait cert_positive extends signature
    
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
    sealed trait cert_revocation extends signature
    
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
    sealed trait key extends signature
    
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
    sealed trait key_binding extends signature
    
    /**
      * 0x20: Key revocation signature
      * The signature is calculated directly on the key being revoked.  A
      * revoked key is not to be used.  Only revocation signatures by the
      * key being revoked, or by an authorized revocation key, should be
      * considered valid revocation signatures.a
      */
    @js.native
    sealed trait key_revocation extends signature
    
    /**
      * 0x02: Standalone signature.
      * This signature is a signature of only its own subpacket contents.
      * It is calculated identically to a signature over a zero-lengh
      * binary document.  Note that it doesn't make sense to have a V3
      * standalone signature.
      */
    @js.native
    sealed trait standalone extends signature
    
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
    sealed trait subkey_binding extends signature
    
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
    sealed trait subkey_revocation extends signature
    
    /**
      * 0x01: Signature of a canonical text document.
      * Canonicalyzing the document by converting line endings.
      */
    @js.native
    sealed trait text extends signature
    
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
    sealed trait third_party extends signature
    
    /**
      * 0x40: Timestamp signature.
      * This signature is only meaningful for the timestamp contained in
      * it.
      */
    @js.native
    sealed trait timestamp extends signature
    
    /* 0 */ val binary: typings.openpgp.openpgpMod.enumsNs.signature.binary with Double = js.native
    /* 18 */ val cert_casual: typings.openpgp.openpgpMod.enumsNs.signature.cert_casual with Double = js.native
    /* 16 */ val cert_generic: typings.openpgp.openpgpMod.enumsNs.signature.cert_generic with Double = js.native
    /* 17 */ val cert_persona: typings.openpgp.openpgpMod.enumsNs.signature.cert_persona with Double = js.native
    /* 19 */ val cert_positive: typings.openpgp.openpgpMod.enumsNs.signature.cert_positive with Double = js.native
    /* 48 */ val cert_revocation: typings.openpgp.openpgpMod.enumsNs.signature.cert_revocation with Double = js.native
    /* 31 */ val key: typings.openpgp.openpgpMod.enumsNs.signature.key with Double = js.native
    /* 25 */ val key_binding: typings.openpgp.openpgpMod.enumsNs.signature.key_binding with Double = js.native
    /* 32 */ val key_revocation: typings.openpgp.openpgpMod.enumsNs.signature.key_revocation with Double = js.native
    /* 2 */ val standalone: typings.openpgp.openpgpMod.enumsNs.signature.standalone with Double = js.native
    /* 24 */ val subkey_binding: typings.openpgp.openpgpMod.enumsNs.signature.subkey_binding with Double = js.native
    /* 40 */ val subkey_revocation: typings.openpgp.openpgpMod.enumsNs.signature.subkey_revocation with Double = js.native
    /* 1 */ val text: typings.openpgp.openpgpMod.enumsNs.signature.text with Double = js.native
    /* 80 */ val third_party: typings.openpgp.openpgpMod.enumsNs.signature.third_party with Double = js.native
    /* 64 */ val timestamp: typings.openpgp.openpgpMod.enumsNs.signature.timestamp with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[signature with Double] = js.native
  }
  
  /**
    * Signature subpacket type
    */
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
    
    /* 32 */ val embedded_signature: typings.openpgp.openpgpMod.enumsNs.signatureSubpacket.embedded_signature with Double = js.native
    /* 4 */ val exportable_certification: typings.openpgp.openpgpMod.enumsNs.signatureSubpacket.exportable_certification with Double = js.native
    /* 30 */ val features: typings.openpgp.openpgpMod.enumsNs.signatureSubpacket.features with Double = js.native
    /* 16 */ val issuer: typings.openpgp.openpgpMod.enumsNs.signatureSubpacket.issuer with Double = js.native
    /* 33 */ val issuer_fingerprint: typings.openpgp.openpgpMod.enumsNs.signatureSubpacket.issuer_fingerprint with Double = js.native
    /* 9 */ val key_expiration_time: typings.openpgp.openpgpMod.enumsNs.signatureSubpacket.key_expiration_time with Double = js.native
    /* 27 */ val key_flags: typings.openpgp.openpgpMod.enumsNs.signatureSubpacket.key_flags with Double = js.native
    /* 23 */ val key_server_preferences: typings.openpgp.openpgpMod.enumsNs.signatureSubpacket.key_server_preferences with Double = js.native
    /* 20 */ val notation_data: typings.openpgp.openpgpMod.enumsNs.signatureSubpacket.notation_data with Double = js.native
    /* 10 */ val placeholder_backwards_compatibility: typings.openpgp.openpgpMod.enumsNs.signatureSubpacket.placeholder_backwards_compatibility with Double = js.native
    /* 26 */ val policy_uri: typings.openpgp.openpgpMod.enumsNs.signatureSubpacket.policy_uri with Double = js.native
    /* 34 */ val preferred_aead_algorithms: typings.openpgp.openpgpMod.enumsNs.signatureSubpacket.preferred_aead_algorithms with Double = js.native
    /* 22 */ val preferred_compression_algorithms: typings.openpgp.openpgpMod.enumsNs.signatureSubpacket.preferred_compression_algorithms with Double = js.native
    /* 21 */ val preferred_hash_algorithms: typings.openpgp.openpgpMod.enumsNs.signatureSubpacket.preferred_hash_algorithms with Double = js.native
    /* 24 */ val preferred_key_server: typings.openpgp.openpgpMod.enumsNs.signatureSubpacket.preferred_key_server with Double = js.native
    /* 11 */ val preferred_symmetric_algorithms: typings.openpgp.openpgpMod.enumsNs.signatureSubpacket.preferred_symmetric_algorithms with Double = js.native
    /* 25 */ val primary_user_id: typings.openpgp.openpgpMod.enumsNs.signatureSubpacket.primary_user_id with Double = js.native
    /* 29 */ val reason_for_revocation: typings.openpgp.openpgpMod.enumsNs.signatureSubpacket.reason_for_revocation with Double = js.native
    /* 6 */ val regular_expression: typings.openpgp.openpgpMod.enumsNs.signatureSubpacket.regular_expression with Double = js.native
    /* 7 */ val revocable: typings.openpgp.openpgpMod.enumsNs.signatureSubpacket.revocable with Double = js.native
    /* 12 */ val revocation_key: typings.openpgp.openpgpMod.enumsNs.signatureSubpacket.revocation_key with Double = js.native
    /* 2 */ val signature_creation_time: typings.openpgp.openpgpMod.enumsNs.signatureSubpacket.signature_creation_time with Double = js.native
    /* 3 */ val signature_expiration_time: typings.openpgp.openpgpMod.enumsNs.signatureSubpacket.signature_expiration_time with Double = js.native
    /* 31 */ val signature_target: typings.openpgp.openpgpMod.enumsNs.signatureSubpacket.signature_target with Double = js.native
    /* 28 */ val signers_user_id: typings.openpgp.openpgpMod.enumsNs.signatureSubpacket.signers_user_id with Double = js.native
    /* 5 */ val trust_signature: typings.openpgp.openpgpMod.enumsNs.signatureSubpacket.trust_signature with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[signatureSubpacket with Double] = js.native
  }
  
  /**
    * {@link https://tools.ietf.org/html/rfc4880#section-9.2|RFC4880, section 9.2}
    */
  @js.native
  object symmetric extends js.Object {
    @js.native
    sealed trait `3des` extends symmetric
    
    @js.native
    sealed trait aes128 extends symmetric
    
    @js.native
    sealed trait aes192 extends symmetric
    
    @js.native
    sealed trait aes256 extends symmetric
    
    @js.native
    sealed trait blowfish extends symmetric
    
    @js.native
    sealed trait cast5 extends symmetric
    
    /**
      * Not implemented!
      */
    @js.native
    sealed trait idea extends symmetric
    
    @js.native
    sealed trait plaintext extends symmetric
    
    @js.native
    sealed trait tripledes extends symmetric
    
    @js.native
    sealed trait twofish extends symmetric
    
    /* 2 */ val `3des`: typings.openpgp.openpgpMod.enumsNs.symmetric.`3des` with Double = js.native
    /* 7 */ val aes128: typings.openpgp.openpgpMod.enumsNs.symmetric.aes128 with Double = js.native
    /* 8 */ val aes192: typings.openpgp.openpgpMod.enumsNs.symmetric.aes192 with Double = js.native
    /* 9 */ val aes256: typings.openpgp.openpgpMod.enumsNs.symmetric.aes256 with Double = js.native
    /* 4 */ val blowfish: typings.openpgp.openpgpMod.enumsNs.symmetric.blowfish with Double = js.native
    /* 3 */ val cast5: typings.openpgp.openpgpMod.enumsNs.symmetric.cast5 with Double = js.native
    /* 1 */ val idea: typings.openpgp.openpgpMod.enumsNs.symmetric.idea with Double = js.native
    /* 0 */ val plaintext: typings.openpgp.openpgpMod.enumsNs.symmetric.plaintext with Double = js.native
    /* 2 */ val tripledes: typings.openpgp.openpgpMod.enumsNs.symmetric.tripledes with Double = js.native
    /* 10 */ val twofish: typings.openpgp.openpgpMod.enumsNs.symmetric.twofish with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[symmetric with Double] = js.native
  }
  
  /**
    * A list of hash names as accepted by webCrypto functions.
    * {@link https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest|Parameters, algo}
    */
  @js.native
  object webHash extends js.Object {
    @js.native
    sealed trait `SHA-1` extends webHash
    
    @js.native
    sealed trait `SHA-256` extends webHash
    
    @js.native
    sealed trait `SHA-384` extends webHash
    
    @js.native
    sealed trait `SHA-512` extends webHash
    
    /* 2 */ val `SHA-1`: typings.openpgp.openpgpMod.enumsNs.webHash.`SHA-1` with Double = js.native
    /* 8 */ val `SHA-256`: typings.openpgp.openpgpMod.enumsNs.webHash.`SHA-256` with Double = js.native
    /* 9 */ val `SHA-384`: typings.openpgp.openpgpMod.enumsNs.webHash.`SHA-384` with Double = js.native
    /* 10 */ val `SHA-512`: typings.openpgp.openpgpMod.enumsNs.webHash.`SHA-512` with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[webHash with Double] = js.native
  }
  
}

