package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "enums")
@js.native
object enumsNs extends js.Object {
  @js.native
  sealed trait armor extends js.Object
  
  @js.native
  sealed trait compression extends js.Object
  
  @js.native
  sealed trait hash extends js.Object
  
  @js.native
  sealed trait keyStatus extends js.Object
  
  @js.native
  sealed trait packet extends js.Object
  
  @js.native
  sealed trait publicKey extends js.Object
  
  @js.native
  sealed trait symmetric extends js.Object
  
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
    sealed trait signed
      extends openpgpLib.openpgpMod.enumsNs.armor
    
    val message: message with java.lang.String = js.native
    val multipart_last: multipart_last with java.lang.String = js.native
    val multipart_section: multipart_section with java.lang.String = js.native
    val private_key: private_key with java.lang.String = js.native
    val public_key: public_key with java.lang.String = js.native
    val signed: signed with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[openpgpLib.openpgpMod.enumsNs.armor with java.lang.String] = js.native
  }
  
  @js.native
  object compression extends js.Object {
    @js.native
    sealed trait bzip2
      extends openpgpLib.openpgpMod.enumsNs.compression
    
    @js.native
    sealed trait uncompressed
      extends openpgpLib.openpgpMod.enumsNs.compression
    
    @js.native
    sealed trait zip
      extends openpgpLib.openpgpMod.enumsNs.compression
    
    @js.native
    sealed trait zlib
      extends openpgpLib.openpgpMod.enumsNs.compression
    
    val bzip2: bzip2 with java.lang.String = js.native
    val uncompressed: uncompressed with java.lang.String = js.native
    val zip: zip with java.lang.String = js.native
    val zlib: zlib with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[openpgpLib.openpgpMod.enumsNs.compression with java.lang.String] = js.native
  }
  
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
    
    val md5: md5 with java.lang.String = js.native
    val ripemd: ripemd with java.lang.String = js.native
    val sha1: sha1 with java.lang.String = js.native
    val sha224: sha224 with java.lang.String = js.native
    val sha256: sha256 with java.lang.String = js.native
    val sha384: sha384 with java.lang.String = js.native
    val sha512: sha512 with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[openpgpLib.openpgpMod.enumsNs.hash with java.lang.String] = js.native
  }
  
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
    
    val expired: expired with java.lang.String = js.native
    val invalid: invalid with java.lang.String = js.native
    val no_self_cert: no_self_cert with java.lang.String = js.native
    val revoked: revoked with java.lang.String = js.native
    val valid: valid with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[openpgpLib.openpgpMod.enumsNs.keyStatus with java.lang.String] = js.native
  }
  
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
    
    val compressed: compressed with java.lang.String = js.native
    val literal: literal with java.lang.String = js.native
    val marker: marker with java.lang.String = js.native
    val modificationDetectionCode: modificationDetectionCode with java.lang.String = js.native
    val onePassSignature: onePassSignature with java.lang.String = js.native
    val publicKey: publicKey with java.lang.String = js.native
    val publicKeyEncryptedSessionKey: publicKeyEncryptedSessionKey with java.lang.String = js.native
    val publicSubkey: publicSubkey with java.lang.String = js.native
    val secretKey: secretKey with java.lang.String = js.native
    val secretSubkey: secretSubkey with java.lang.String = js.native
    val signature: signature with java.lang.String = js.native
    val symEncryptedIntegrityProtected: symEncryptedIntegrityProtected with java.lang.String = js.native
    val symEncryptedSessionKey: symEncryptedSessionKey with java.lang.String = js.native
    val symmetricallyEncrypted: symmetricallyEncrypted with java.lang.String = js.native
    val trust: trust with java.lang.String = js.native
    val userAttribute: userAttribute with java.lang.String = js.native
    val userid: userid with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[openpgpLib.openpgpMod.enumsNs.packet with java.lang.String] = js.native
  }
  
  @js.native
  object publicKey extends js.Object {
    @js.native
    sealed trait dsa
      extends openpgpLib.openpgpMod.enumsNs.publicKey
    
    @js.native
    sealed trait elgamal
      extends openpgpLib.openpgpMod.enumsNs.publicKey
    
    @js.native
    sealed trait rsa_encrypt
      extends openpgpLib.openpgpMod.enumsNs.publicKey
    
    @js.native
    sealed trait rsa_encrypt_sign
      extends openpgpLib.openpgpMod.enumsNs.publicKey
    
    @js.native
    sealed trait rsa_sign
      extends openpgpLib.openpgpMod.enumsNs.publicKey
    
    val dsa: dsa with java.lang.String = js.native
    val elgamal: elgamal with java.lang.String = js.native
    val rsa_encrypt: rsa_encrypt with java.lang.String = js.native
    val rsa_encrypt_sign: rsa_encrypt_sign with java.lang.String = js.native
    val rsa_sign: rsa_sign with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[openpgpLib.openpgpMod.enumsNs.publicKey with java.lang.String] = js.native
  }
  
  @js.native
  object symmetric extends js.Object {
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
    
    val aes128: aes128 with java.lang.String = js.native
    val aes192: aes192 with java.lang.String = js.native
    val aes256: aes256 with java.lang.String = js.native
    val blowfish: blowfish with java.lang.String = js.native
    val cast5: cast5 with java.lang.String = js.native
    val idea: idea with java.lang.String = js.native
    val plaintext: plaintext with java.lang.String = js.native
    val tripledes: tripledes with java.lang.String = js.native
    val twofish: twofish with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[openpgpLib.openpgpMod.enumsNs.symmetric with java.lang.String] = js.native
  }
  
}

