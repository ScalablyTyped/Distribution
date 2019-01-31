package typings
package nodeDashForgeLib.nodeDashForgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "pki")
@js.native
object pkiNs extends js.Object {
  @js.native
  trait CAStore extends js.Object {
    def addCertificate(cert: java.lang.String): scala.Unit = js.native
    def addCertificate(cert: Certificate): scala.Unit = js.native
    def getBySubject(subject: java.lang.String): Certificate | scala.Null = js.native
    def getIssuer(subject: Certificate): Certificate | scala.Null = js.native
    def hasCertificate(cert: java.lang.String): scala.Boolean = js.native
    def hasCertificate(cert: Certificate): scala.Boolean = js.native
    def listAllCertificates(): js.Array[Certificate] = js.native
    def removeCertificate(cert: java.lang.String): Certificate | scala.Null = js.native
    def removeCertificate(cert: Certificate): Certificate | scala.Null = js.native
  }
  
  @js.native
  trait Certificate extends js.Object {
    var extensions: js.Array[_] = js.native
    var issuer: nodeDashForgeLib.Anon_AddField = js.native
    var md: js.Any = js.native
    var privateKey: PrivateKey = js.native
    var publicKey: PublicKey = js.native
    var serialNumber: java.lang.String = js.native
    var siginfo: js.Any = js.native
    var signature: js.Any = js.native
    var subject: nodeDashForgeLib.Anon_AddField = js.native
    var validity: nodeDashForgeLib.Anon_NotAfter = js.native
    var version: scala.Double = js.native
    /**
      * Gets an extension by its name or id.
      *
      * @param options the name to use or an object with:
      *          name the name to use.
      *          id the id to use.
      *
      * @return the extension or null if not found.
      */
    def getExtension(options: java.lang.String): js.UndefOr[js.Object] = js.native
    def getExtension(options: nodeDashForgeLib.Anon_Id): js.UndefOr[js.Object] = js.native
    def getExtension(options: nodeDashForgeLib.Anon_Name): js.UndefOr[js.Object] = js.native
    /**
      * Sets the extensions of this certificate.
      *
      * @param exts the array of extensions to use.
      */
    def setExtensions(exts: js.Array[_]): scala.Unit = js.native
    /**
      * Sets the issuer of this certificate.
      *
      * @param attrs the array of subject attributes to use.
      * @param uniqueId an optional a unique ID to use.
      */
    def setIssuer(attrs: js.Array[CertificateField]): scala.Unit = js.native
    def setIssuer(attrs: js.Array[CertificateField], uniqueId: java.lang.String): scala.Unit = js.native
    /**
      * Sets the subject of this certificate.
      *
      * @param attrs the array of subject attributes to use.
      * @param uniqueId an optional a unique ID to use.
      */
    def setSubject(attrs: js.Array[CertificateField]): scala.Unit = js.native
    def setSubject(attrs: js.Array[CertificateField], uniqueId: java.lang.String): scala.Unit = js.native
    /**
      * Signs this certificate using the given private key.
      *
      * @param key the private key to sign with.
      * @param md the message digest object to use (defaults to forge.md.sha1).
      */
    def sign(key: PrivateKey): scala.Unit = js.native
    def sign(key: PrivateKey, md: nodeDashForgeLib.nodeDashForgeMod.mdNs.MessageDigest): scala.Unit = js.native
    /**
      * Attempts verify the signature on the passed certificate using this
      * certificate's public key.
      *
      * @param child the certificate to verify.
      *
      * @return true if verified, false if not.
      */
    def verify(child: Certificate): scala.Boolean = js.native
  }
  
  trait CertificateField extends CertificateFieldOptions {
    var extensions: js.UndefOr[js.Array[_]] = js.undefined
    var value: js.UndefOr[js.Array[_] | java.lang.String] = js.undefined
    var valueConstructed: js.UndefOr[scala.Boolean] = js.undefined
    var valueTagClass: js.UndefOr[nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Class] = js.undefined
  }
  
  trait CertificateFieldOptions extends js.Object {
    var name: js.UndefOr[java.lang.String] = js.undefined
    var shortName: js.UndefOr[java.lang.String] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait KeyPair extends js.Object {
    var privateKey: PrivateKey
    var publicKey: PublicKey
  }
  
  trait oids
    extends /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  var oids: oids = js.native
  def certificateFromAsn1(obj: nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Asn1): Certificate = js.native
  def certificateFromAsn1(obj: nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Asn1, computeHash: scala.Boolean): Certificate = js.native
  def certificateFromPem(pem: PEM): Certificate = js.native
  def certificateFromPem(pem: PEM, computeHash: scala.Boolean): Certificate = js.native
  def certificateFromPem(pem: PEM, computeHash: scala.Boolean, strict: scala.Boolean): Certificate = js.native
  def certificateToPem(cert: Certificate): PEM = js.native
  def certificateToPem(cert: Certificate, maxline: scala.Double): PEM = js.native
  def certificationRequestFromPem(pem: PEM): Certificate = js.native
  def certificationRequestFromPem(pem: PEM, computeHash: scala.Boolean): Certificate = js.native
  def certificationRequestFromPem(pem: PEM, computeHash: scala.Boolean, strict: scala.Boolean): Certificate = js.native
  def certificationRequestToPem(cert: Certificate): PEM = js.native
  def certificationRequestToPem(cert: Certificate, maxline: scala.Double): PEM = js.native
  def createCaStore(): CAStore = js.native
  def createCaStore(certs: js.Array[Certificate | PEM]): CAStore = js.native
  def createCertificate(): Certificate = js.native
  def createCertificationRequest(): Certificate = js.native
  def decryptRsaPrivateKey(pem: PEM): PrivateKey = js.native
  def decryptRsaPrivateKey(pem: PEM, passphrase: java.lang.String): PrivateKey = js.native
  def pemToDer(pem: PEM): nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteStringBuffer = js.native
  def privateKeyFromPem(pem: PEM): PrivateKey = js.native
  def privateKeyInfoToPem(key: nodeDashForgeLib.nodeDashForgeMod.Bytes): PEM = js.native
  def privateKeyInfoToPem(key: nodeDashForgeLib.nodeDashForgeMod.Bytes, maxline: scala.Double): PEM = js.native
  def privateKeyToPem(key: PrivateKey): PEM = js.native
  def privateKeyToPem(key: PrivateKey, maxline: scala.Double): PEM = js.native
  def publicKeyFromPem(pem: PEM): PublicKey = js.native
  def publicKeyToAsn1(publicKey: PublicKey): js.Any = js.native
  def publicKeyToPem(key: PublicKey): PEM = js.native
  def publicKeyToPem(key: PublicKey, maxline: scala.Double): PEM = js.native
  def publicKeyToRSAPublicKey(publicKey: PublicKey): js.Any = js.native
  def verifyCertificateChain(caStore: CAStore, chain: js.Array[Certificate]): scala.Boolean = js.native
  def verifyCertificateChain(
    caStore: CAStore,
    chain: js.Array[Certificate],
    customVerifyCallback: js.Function3[
      /* verified */ scala.Boolean | java.lang.String, 
      /* depth */ scala.Double, 
      /* chain */ js.Array[Certificate], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  @JSName("ed25519")
  @js.native
  object ed25519Ns extends js.Object {
    def generateKeyPair(): nodeDashForgeLib.Anon_PrivateKey = js.native
    def generateKeyPair(options: nodeDashForgeLib.Anon_Seed): nodeDashForgeLib.Anon_PrivateKey = js.native
    def publicKeyFromPrivateKey(options: nodeDashForgeLib.Anon_PrivateKeyNativeBuffer): NativeBuffer = js.native
    def sign(options: nodeDashForgeLib.Anon_Encoding): NativeBuffer = js.native
    def verify(options: nodeDashForgeLib.Anon_EncodingMessage): scala.Boolean = js.native
    @JSName("constants")
    @js.native
    object constantsNs extends js.Object {
      val HASH_BYTE_LENGTH: /* 64 */ scala.Double = js.native
      val PRIVATE_KEY_BYTE_LENGTH: /* 64 */ scala.Double = js.native
      val PUBLIC_KEY_BYTE_LENGTH: /* 32 */ scala.Double = js.native
      val SEED_BYTE_LENGTH: /* 32 */ scala.Double = js.native
      val SIGN_BYTE_LENGTH: /* 64 */ scala.Double = js.native
    }
    
    type Key = stdLib.ArrayBuffer
    type NativeBuffer = nodeLib.Buffer | stdLib.Uint8Array
  }
  
  @JSName("rsa")
  @js.native
  object rsaNs extends js.Object {
    trait GenerateKeyPairOptions extends js.Object {
      var algorithm: js.UndefOr[java.lang.String] = js.undefined
      var bits: js.UndefOr[scala.Double] = js.undefined
      var e: js.UndefOr[scala.Double] = js.undefined
      var prng: js.UndefOr[js.Any] = js.undefined
      var workLoad: js.UndefOr[scala.Double] = js.undefined
      var workerScript: js.UndefOr[java.lang.String] = js.undefined
      var workers: js.UndefOr[scala.Double] = js.undefined
    }
    
    trait KeyPair extends js.Object {
      var privateKey: PrivateKey
      var publicKey: PublicKey
    }
    
    @js.native
    trait PrivateKey extends js.Object {
      var d: nodeDashForgeLib.nodeDashForgeMod.jsbnNs.BigInteger = js.native
      var dP: nodeDashForgeLib.nodeDashForgeMod.jsbnNs.BigInteger = js.native
      var dQ: nodeDashForgeLib.nodeDashForgeMod.jsbnNs.BigInteger = js.native
      var e: nodeDashForgeLib.nodeDashForgeMod.jsbnNs.BigInteger = js.native
      var n: nodeDashForgeLib.nodeDashForgeMod.jsbnNs.BigInteger = js.native
      var p: nodeDashForgeLib.nodeDashForgeMod.jsbnNs.BigInteger = js.native
      var q: nodeDashForgeLib.nodeDashForgeMod.jsbnNs.BigInteger = js.native
      var qInv: nodeDashForgeLib.nodeDashForgeMod.jsbnNs.BigInteger = js.native
      def decrypt(data: nodeDashForgeLib.nodeDashForgeMod.Bytes): nodeDashForgeLib.nodeDashForgeMod.Bytes = js.native
      def decrypt(data: nodeDashForgeLib.nodeDashForgeMod.Bytes, scheme: EncryptionScheme): nodeDashForgeLib.nodeDashForgeMod.Bytes = js.native
      def decrypt(data: nodeDashForgeLib.nodeDashForgeMod.Bytes, scheme: EncryptionScheme, schemeOptions: js.Any): nodeDashForgeLib.nodeDashForgeMod.Bytes = js.native
      def sign(md: nodeDashForgeLib.nodeDashForgeMod.mdNs.MessageDigest): nodeDashForgeLib.nodeDashForgeMod.Bytes = js.native
      def sign(md: nodeDashForgeLib.nodeDashForgeMod.mdNs.MessageDigest, scheme: SignatureScheme): nodeDashForgeLib.nodeDashForgeMod.Bytes = js.native
    }
    
    @js.native
    trait PublicKey extends js.Object {
      var e: nodeDashForgeLib.nodeDashForgeMod.jsbnNs.BigInteger = js.native
      var n: nodeDashForgeLib.nodeDashForgeMod.jsbnNs.BigInteger = js.native
      def encrypt(data: nodeDashForgeLib.nodeDashForgeMod.Bytes): nodeDashForgeLib.nodeDashForgeMod.Bytes = js.native
      def encrypt(data: nodeDashForgeLib.nodeDashForgeMod.Bytes, scheme: EncryptionScheme): nodeDashForgeLib.nodeDashForgeMod.Bytes = js.native
      def encrypt(data: nodeDashForgeLib.nodeDashForgeMod.Bytes, scheme: EncryptionScheme, schemeOptions: js.Any): nodeDashForgeLib.nodeDashForgeMod.Bytes = js.native
      def verify(
        digest: nodeDashForgeLib.nodeDashForgeMod.Bytes,
        signature: nodeDashForgeLib.nodeDashForgeMod.Bytes
      ): scala.Boolean = js.native
      def verify(
        digest: nodeDashForgeLib.nodeDashForgeMod.Bytes,
        signature: nodeDashForgeLib.nodeDashForgeMod.Bytes,
        scheme: SignatureScheme
      ): scala.Boolean = js.native
    }
    
    def generateKeyPair(): KeyPair = js.native
    def generateKeyPair(bits: scala.Double): KeyPair = js.native
    def generateKeyPair(bits: scala.Double, e: scala.Double): KeyPair = js.native
    def generateKeyPair(
      bits: scala.Double,
      e: scala.Double,
      callback: js.Function2[/* err */ nodeLib.Error, /* keypair */ KeyPair, scala.Unit]
    ): KeyPair = js.native
    def generateKeyPair(options: GenerateKeyPairOptions): KeyPair = js.native
    def generateKeyPair(
      options: GenerateKeyPairOptions,
      callback: js.Function2[/* err */ nodeLib.Error, /* keypair */ KeyPair, scala.Unit]
    ): KeyPair = js.native
    def setPublicKey(n: js.Any, e: js.Any): js.Any = js.native
    type EncryptionScheme = nodeDashForgeLib.nodeDashForgeLibStrings.`RSAES-PKCS1-V1_5` | nodeDashForgeLib.nodeDashForgeLibStrings.`RSA-OAEP` | nodeDashForgeLib.nodeDashForgeLibStrings.RAW | nodeDashForgeLib.nodeDashForgeLibStrings.NONE | scala.Null
    type SignatureScheme = nodeDashForgeLib.nodeDashForgeLibStrings.`RSASSA-PKCS1-V1_5` | nodeDashForgeLib.nodeDashForgeMod.pssNs.PSS | nodeDashForgeLib.nodeDashForgeLibStrings.NONE | scala.Null
  }
  
  type PEM = java.lang.String
  type PrivateKey = nodeDashForgeLib.nodeDashForgeMod.pkiNs.rsaNs.PrivateKey | nodeDashForgeLib.nodeDashForgeMod.pkiNs.ed25519Ns.Key
  type PublicKey = nodeDashForgeLib.nodeDashForgeMod.pkiNs.rsaNs.PublicKey | nodeDashForgeLib.nodeDashForgeMod.pkiNs.ed25519Ns.Key
}

