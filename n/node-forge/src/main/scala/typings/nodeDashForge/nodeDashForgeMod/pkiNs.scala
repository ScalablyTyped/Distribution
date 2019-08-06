package typings.nodeDashForge.nodeDashForgeMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.nodeDashForge.Anon_AddField
import typings.nodeDashForge.Anon_Id
import typings.nodeDashForge.Anon_Name
import typings.nodeDashForge.Anon_NotAfter
import typings.nodeDashForge.Anon_PrivateKey
import typings.nodeDashForge.Anon_PrivateKeyBinaryBuffer
import typings.nodeDashForge.Anon_PublicKey
import typings.nodeDashForge.Anon_Seed
import typings.nodeDashForge.nodeDashForgeMod.asn1Ns.Asn1
import typings.nodeDashForge.nodeDashForgeMod.asn1Ns.Class
import typings.nodeDashForge.nodeDashForgeMod.jsbnNs.BigInteger
import typings.nodeDashForge.nodeDashForgeMod.mdNs.MessageDigest
import typings.nodeDashForge.nodeDashForgeMod.pkiNs.CAStore
import typings.nodeDashForge.nodeDashForgeMod.pkiNs.Certificate
import typings.nodeDashForge.nodeDashForgeMod.pkiNs.CertificateField
import typings.nodeDashForge.nodeDashForgeMod.pkiNs.CertificateFieldOptions
import typings.nodeDashForge.nodeDashForgeMod.pkiNs.EncryptionOptions
import typings.nodeDashForge.nodeDashForgeMod.pkiNs.PEM
import typings.nodeDashForge.nodeDashForgeMod.pkiNs.PrivateKey
import typings.nodeDashForge.nodeDashForgeMod.pkiNs.PublicKey
import typings.nodeDashForge.nodeDashForgeMod.pkiNs.ed25519Ns.Key
import typings.nodeDashForge.nodeDashForgeMod.pkiNs.ed25519Ns.NativeBuffer
import typings.nodeDashForge.nodeDashForgeMod.pkiNs.ed25519Ns.ToNativeBufferParameters
import typings.nodeDashForge.nodeDashForgeMod.pkiNs.oids
import typings.nodeDashForge.nodeDashForgeMod.pkiNs.rsaNs.EncryptionScheme
import typings.nodeDashForge.nodeDashForgeMod.pkiNs.rsaNs.GenerateKeyPairOptions
import typings.nodeDashForge.nodeDashForgeMod.pkiNs.rsaNs.SignatureScheme
import typings.nodeDashForge.nodeDashForgeMod.pkiNs.rsaNs._EncryptionScheme
import typings.nodeDashForge.nodeDashForgeMod.pkiNs.rsaNs._SignatureScheme
import typings.nodeDashForge.nodeDashForgeMod.pssNs.PSS
import typings.nodeDashForge.nodeDashForgeMod.utilNs.ByteBuffer
import typings.nodeDashForge.nodeDashForgeMod.utilNs.ByteStringBuffer
import typings.nodeDashForge.nodeDashForgeNumbers.`32`
import typings.nodeDashForge.nodeDashForgeNumbers.`64`
import typings.nodeDashForge.nodeDashForgeStrings.`3des`
import typings.nodeDashForge.nodeDashForgeStrings.aes128
import typings.nodeDashForge.nodeDashForgeStrings.aes192
import typings.nodeDashForge.nodeDashForgeStrings.aes256
import typings.nodeDashForge.nodeDashForgeStrings.binary
import typings.nodeDashForge.nodeDashForgeStrings.sha1
import typings.nodeDashForge.nodeDashForgeStrings.sha224
import typings.nodeDashForge.nodeDashForgeStrings.sha256
import typings.nodeDashForge.nodeDashForgeStrings.sha384
import typings.nodeDashForge.nodeDashForgeStrings.sha512
import typings.nodeDashForge.nodeDashForgeStrings.utf8
import typings.std.Error
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "pki")
@js.native
object pkiNs extends js.Object {
  @js.native
  trait CAStore extends js.Object {
    def addCertificate(cert: String): Unit = js.native
    def addCertificate(cert: Certificate): Unit = js.native
    def getBySubject(subject: String): Certificate | Null = js.native
    def getIssuer(subject: Certificate): Certificate | Null = js.native
    def hasCertificate(cert: String): Boolean = js.native
    def hasCertificate(cert: Certificate): Boolean = js.native
    def listAllCertificates(): js.Array[Certificate] = js.native
    def removeCertificate(cert: String): Certificate | Null = js.native
    def removeCertificate(cert: Certificate): Certificate | Null = js.native
  }
  
  @js.native
  trait Certificate extends js.Object {
    var extensions: js.Array[_] = js.native
    var issuer: Anon_AddField = js.native
    var md: js.Any = js.native
    var privateKey: PrivateKey = js.native
    var publicKey: PublicKey = js.native
    var serialNumber: String = js.native
    var siginfo: js.Any = js.native
    var signature: js.Any = js.native
    var subject: Anon_AddField = js.native
    var validity: Anon_NotAfter = js.native
    var version: Double = js.native
    /**
      * Gets an extension by its name or id.
      *
      * @param options the name to use or an object with:
      *          name the name to use.
      *          id the id to use.
      *
      * @return the extension or null if not found.
      */
    def getExtension(options: String): js.UndefOr[js.Object] = js.native
    def getExtension(options: Anon_Id): js.UndefOr[js.Object] = js.native
    def getExtension(options: Anon_Name): js.UndefOr[js.Object] = js.native
    /**
      * Sets the extensions of this certificate.
      *
      * @param exts the array of extensions to use.
      */
    def setExtensions(exts: js.Array[_]): Unit = js.native
    /**
      * Sets the issuer of this certificate.
      *
      * @param attrs the array of subject attributes to use.
      * @param uniqueId an optional a unique ID to use.
      */
    def setIssuer(attrs: js.Array[CertificateField]): Unit = js.native
    def setIssuer(attrs: js.Array[CertificateField], uniqueId: String): Unit = js.native
    /**
      * Sets the subject of this certificate.
      *
      * @param attrs the array of subject attributes to use.
      * @param uniqueId an optional a unique ID to use.
      */
    def setSubject(attrs: js.Array[CertificateField]): Unit = js.native
    def setSubject(attrs: js.Array[CertificateField], uniqueId: String): Unit = js.native
    /**
      * Signs this certificate using the given private key.
      *
      * @param key the private key to sign with.
      * @param md the message digest object to use (defaults to forge.md.sha1).
      */
    def sign(key: PrivateKey): Unit = js.native
    def sign(key: PrivateKey, md: MessageDigest): Unit = js.native
    /**
      * Attempts verify the signature on the passed certificate using this
      * certificate's public key.
      *
      * @param child the certificate to verify.
      *
      * @return true if verified, false if not.
      */
    def verify(child: Certificate): Boolean = js.native
  }
  
  trait CertificateField extends CertificateFieldOptions {
    var extensions: js.UndefOr[js.Array[_]] = js.undefined
    var value: js.UndefOr[js.Array[_] | String] = js.undefined
    var valueConstructed: js.UndefOr[Boolean] = js.undefined
    var valueTagClass: js.UndefOr[Class] = js.undefined
  }
  
  trait CertificateFieldOptions extends js.Object {
    var name: js.UndefOr[String] = js.undefined
    var shortName: js.UndefOr[String] = js.undefined
    var `type`: js.UndefOr[String] = js.undefined
  }
  
  trait EncryptionOptions extends js.Object {
    var algorithm: js.UndefOr[aes128 | aes192 | aes256 | `3des`] = js.undefined
    var count: js.UndefOr[Double] = js.undefined
    var legacy: js.UndefOr[Boolean] = js.undefined
    var prfAlgorithm: js.UndefOr[sha1 | sha224 | sha256 | sha384 | sha512] = js.undefined
    var saltSize: js.UndefOr[Double] = js.undefined
  }
  
  trait KeyPair extends js.Object {
    var privateKey: PrivateKey
    var publicKey: PublicKey
  }
  
  var oids: oids = js.native
  def certificateFromAsn1(obj: Asn1): Certificate = js.native
  def certificateFromAsn1(obj: Asn1, computeHash: Boolean): Certificate = js.native
  def certificateFromPem(pem: PEM): Certificate = js.native
  def certificateFromPem(pem: PEM, computeHash: Boolean): Certificate = js.native
  def certificateFromPem(pem: PEM, computeHash: Boolean, strict: Boolean): Certificate = js.native
  def certificateToAsn1(cert: Certificate): Asn1 = js.native
  def certificateToPem(cert: Certificate): PEM = js.native
  def certificateToPem(cert: Certificate, maxline: Double): PEM = js.native
  def certificationRequestFromPem(pem: PEM): Certificate = js.native
  def certificationRequestFromPem(pem: PEM, computeHash: Boolean): Certificate = js.native
  def certificationRequestFromPem(pem: PEM, computeHash: Boolean, strict: Boolean): Certificate = js.native
  def certificationRequestToPem(cert: Certificate): PEM = js.native
  def certificationRequestToPem(cert: Certificate, maxline: Double): PEM = js.native
  def createCaStore(): CAStore = js.native
  def createCaStore(certs: js.Array[Certificate | PEM]): CAStore = js.native
  def createCertificate(): Certificate = js.native
  def createCertificationRequest(): Certificate = js.native
  def decryptPrivateKeyInfo(obj: Asn1, password: String): Asn1 = js.native
  def decryptRsaPrivateKey(pem: PEM): PrivateKey = js.native
  def decryptRsaPrivateKey(pem: PEM, passphrase: String): PrivateKey = js.native
  def encryptPrivateKeyInfo(obj: Asn1, password: String): Asn1 = js.native
  def encryptPrivateKeyInfo(obj: Asn1, password: String, options: EncryptionOptions): Asn1 = js.native
  def encryptRsaPrivateKey(privateKey: PrivateKey, password: String): PEM = js.native
  def encryptRsaPrivateKey(privateKey: PrivateKey, password: String, options: EncryptionOptions): PEM = js.native
  def encryptedPrivateKeyFromPem(pem: PEM): Asn1 = js.native
  def encryptedPrivateKeyToPem(obj: Asn1): PEM = js.native
  def pemToDer(pem: PEM): ByteStringBuffer = js.native
  def privateKeyFromAsn1(privateKey: Asn1): PrivateKey = js.native
  def privateKeyFromPem(pem: PEM): PrivateKey = js.native
  def privateKeyInfoToPem(key: Asn1): PEM = js.native
  def privateKeyInfoToPem(key: Asn1, maxline: Double): PEM = js.native
  def privateKeyToAsn1(privateKey: PrivateKey): Asn1 = js.native
  def privateKeyToPem(key: PrivateKey): PEM = js.native
  def privateKeyToPem(key: PrivateKey, maxline: Double): PEM = js.native
  def publicKeyFromAsn1(publicKey: Asn1): PublicKey = js.native
  def publicKeyFromPem(pem: PEM): PublicKey = js.native
  def publicKeyToAsn1(publicKey: PublicKey): Asn1 = js.native
  def publicKeyToPem(key: PublicKey): PEM = js.native
  def publicKeyToPem(key: PublicKey, maxline: Double): PEM = js.native
  def publicKeyToRSAPublicKey(publicKey: PublicKey): js.Any = js.native
  def verifyCertificateChain(caStore: CAStore, chain: js.Array[Certificate]): Boolean = js.native
  def verifyCertificateChain(
    caStore: CAStore,
    chain: js.Array[Certificate],
    customVerifyCallback: js.Function3[
      /* verified */ Boolean | String, 
      /* depth */ Double, 
      /* chain */ js.Array[Certificate], 
      Boolean
    ]
  ): Boolean = js.native
  def wrapRsaPrivateKey(privateKey: Asn1): Asn1 = js.native
  @JSName("ed25519")
  @js.native
  object ed25519Ns extends js.Object {
    trait ToNativeBufferParameters extends js.Object {
      var encoding: js.UndefOr[binary | utf8] = js.undefined
      var message: js.UndefOr[ByteBuffer | NativeBuffer | String] = js.undefined
    }
    
    // generateKeyPair does not currently accept `util.ByteBuffer` as the seed.
    def generateKeyPair(): Anon_PrivateKey = js.native
    def generateKeyPair(options: Anon_Seed): Anon_PrivateKey = js.native
    def publicKeyFromPrivateKey(options: Anon_PrivateKeyBinaryBuffer): NativeBuffer = js.native
    def sign(options: ToNativeBufferParameters with Anon_PrivateKeyBinaryBuffer): NativeBuffer = js.native
    def verify(options: ToNativeBufferParameters with Anon_PublicKey): Boolean = js.native
    @JSName("constants")
    @js.native
    object constantsNs extends js.Object {
      val HASH_BYTE_LENGTH: `64` = js.native
      val PRIVATE_KEY_BYTE_LENGTH: `64` = js.native
      val PUBLIC_KEY_BYTE_LENGTH: `32` = js.native
      val SEED_BYTE_LENGTH: `32` = js.native
      val SIGN_BYTE_LENGTH: `64` = js.native
    }
    
    // `string`s will be converted by toNativeBuffer with `encoding: 'binary'`
    type BinaryBuffer = NativeBuffer | ByteBuffer | String
    type Key = NativeBuffer
    type NativeBuffer = Buffer | Uint8Array
  }
  
  @JSName("rsa")
  @js.native
  object rsaNs extends js.Object {
    trait GenerateKeyPairOptions extends js.Object {
      var algorithm: js.UndefOr[String] = js.undefined
      var bits: js.UndefOr[Double] = js.undefined
      var e: js.UndefOr[Double] = js.undefined
      var prng: js.UndefOr[js.Any] = js.undefined
      var workLoad: js.UndefOr[Double] = js.undefined
      var workerScript: js.UndefOr[String] = js.undefined
      var workers: js.UndefOr[Double] = js.undefined
    }
    
    trait KeyPair extends js.Object {
      var privateKey: typings.nodeDashForge.nodeDashForgeMod.pkiNs.rsaNs.PrivateKey
      var publicKey: typings.nodeDashForge.nodeDashForgeMod.pkiNs.rsaNs.PublicKey
    }
    
    @js.native
    trait PrivateKey extends js.Object {
      var d: BigInteger = js.native
      var dP: BigInteger = js.native
      var dQ: BigInteger = js.native
      var e: BigInteger = js.native
      var n: BigInteger = js.native
      var p: BigInteger = js.native
      var q: BigInteger = js.native
      var qInv: BigInteger = js.native
      def decrypt(data: Bytes): Bytes = js.native
      def decrypt(data: Bytes, scheme: EncryptionScheme): Bytes = js.native
      def decrypt(data: Bytes, scheme: EncryptionScheme, schemeOptions: js.Any): Bytes = js.native
      def sign(md: MessageDigest): Bytes = js.native
      def sign(md: MessageDigest, scheme: SignatureScheme): Bytes = js.native
    }
    
    @js.native
    trait PublicKey extends js.Object {
      var e: BigInteger = js.native
      var n: BigInteger = js.native
      def encrypt(data: Bytes): Bytes = js.native
      def encrypt(data: Bytes, scheme: EncryptionScheme): Bytes = js.native
      def encrypt(data: Bytes, scheme: EncryptionScheme, schemeOptions: js.Any): Bytes = js.native
      def verify(digest: Bytes, signature: Bytes): Boolean = js.native
      def verify(digest: Bytes, signature: Bytes, scheme: SignatureScheme): Boolean = js.native
    }
    
    trait _EncryptionScheme extends js.Object
    
    trait _SignatureScheme extends js.Object
    
    def generateKeyPair(): typings.nodeDashForge.nodeDashForgeMod.pkiNs.rsaNs.KeyPair = js.native
    def generateKeyPair(bits: Double): typings.nodeDashForge.nodeDashForgeMod.pkiNs.rsaNs.KeyPair = js.native
    def generateKeyPair(bits: Double, e: Double): typings.nodeDashForge.nodeDashForgeMod.pkiNs.rsaNs.KeyPair = js.native
    def generateKeyPair(
      bits: Double,
      e: Double,
      callback: js.Function2[
          /* err */ Error, 
          /* keypair */ typings.nodeDashForge.nodeDashForgeMod.pkiNs.rsaNs.KeyPair, 
          Unit
        ]
    ): typings.nodeDashForge.nodeDashForgeMod.pkiNs.rsaNs.KeyPair = js.native
    def generateKeyPair(options: GenerateKeyPairOptions): typings.nodeDashForge.nodeDashForgeMod.pkiNs.rsaNs.KeyPair = js.native
    def generateKeyPair(
      options: GenerateKeyPairOptions,
      callback: js.Function2[
          /* err */ Error, 
          /* keypair */ typings.nodeDashForge.nodeDashForgeMod.pkiNs.rsaNs.KeyPair, 
          Unit
        ]
    ): typings.nodeDashForge.nodeDashForgeMod.pkiNs.rsaNs.KeyPair = js.native
    def setPublicKey(n: BigInteger, e: BigInteger): typings.nodeDashForge.nodeDashForgeMod.pkiNs.rsaNs.PublicKey = js.native
    /* Rewritten from type alias, can be one of: 
      - typings.nodeDashForge.nodeDashForgeStrings.`RSAES-PKCS1-V1_5`
      - typings.nodeDashForge.nodeDashForgeStrings.`RSA-OAEP`
      - typings.nodeDashForge.nodeDashForgeStrings.RAW
      - typings.nodeDashForge.nodeDashForgeStrings.NONE
      - scala.Null
    */
    type EncryptionScheme = _EncryptionScheme | Null
    /* Rewritten from type alias, can be one of: 
      - typings.nodeDashForge.nodeDashForgeStrings.`RSASSA-PKCS1-V1_5`
      - typings.nodeDashForge.nodeDashForgeMod.pssNs.PSS
      - typings.nodeDashForge.nodeDashForgeStrings.NONE
      - scala.Null
    */
    type SignatureScheme = _SignatureScheme | PSS | Null
  }
  
  type PEM = String
  type PrivateKey = typings.nodeDashForge.nodeDashForgeMod.pkiNs.rsaNs.PrivateKey | Key
  type PublicKey = typings.nodeDashForge.nodeDashForgeMod.pkiNs.rsaNs.PublicKey | Key
  type oids = StringDictionary[String]
  type setRsaPublicKey = js.Function2[
    /* n */ BigInteger, 
    /* e */ BigInteger, 
    typings.nodeDashForge.nodeDashForgeMod.pkiNs.rsaNs.PublicKey
  ]
}

