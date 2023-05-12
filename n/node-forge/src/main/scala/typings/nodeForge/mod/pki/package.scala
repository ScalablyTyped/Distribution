package typings.nodeForge.mod.pki

import org.scalablytyped.runtime.StringDictionary
import typings.nodeForge.anon.ValidityCheckDate
import typings.nodeForge.mod.Bytes
import typings.nodeForge.mod.Hex
import typings.nodeForge.mod.asn1.Asn1
import typings.nodeForge.mod.jsbn.BigInteger
import typings.nodeForge.mod.pki.^
import typings.nodeForge.mod.pki.ed25519.Key
import typings.nodeForge.mod.util.ByteStringBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def certificateFromAsn1(obj: Asn1): Certificate = ^.asInstanceOf[js.Dynamic].applyDynamic("certificateFromAsn1")(obj.asInstanceOf[js.Any]).asInstanceOf[Certificate]
inline def certificateFromAsn1(obj: Asn1, computeHash: Boolean): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("certificateFromAsn1")(obj.asInstanceOf[js.Any], computeHash.asInstanceOf[js.Any])).asInstanceOf[Certificate]

inline def certificateFromPem(pem: PEM): Certificate = ^.asInstanceOf[js.Dynamic].applyDynamic("certificateFromPem")(pem.asInstanceOf[js.Any]).asInstanceOf[Certificate]
inline def certificateFromPem(pem: PEM, computeHash: Boolean): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("certificateFromPem")(pem.asInstanceOf[js.Any], computeHash.asInstanceOf[js.Any])).asInstanceOf[Certificate]
inline def certificateFromPem(pem: PEM, computeHash: Boolean, strict: Boolean): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("certificateFromPem")(pem.asInstanceOf[js.Any], computeHash.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Certificate]
inline def certificateFromPem(pem: PEM, computeHash: Unit, strict: Boolean): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("certificateFromPem")(pem.asInstanceOf[js.Any], computeHash.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Certificate]

inline def certificateToAsn1(cert: Certificate): Asn1 = ^.asInstanceOf[js.Dynamic].applyDynamic("certificateToAsn1")(cert.asInstanceOf[js.Any]).asInstanceOf[Asn1]

inline def certificateToPem(cert: Certificate): PEM = ^.asInstanceOf[js.Dynamic].applyDynamic("certificateToPem")(cert.asInstanceOf[js.Any]).asInstanceOf[PEM]
inline def certificateToPem(cert: Certificate, maxline: Double): PEM = (^.asInstanceOf[js.Dynamic].applyDynamic("certificateToPem")(cert.asInstanceOf[js.Any], maxline.asInstanceOf[js.Any])).asInstanceOf[PEM]

inline def certificationRequestFromAsn1(obj: Asn1): Certificate = ^.asInstanceOf[js.Dynamic].applyDynamic("certificationRequestFromAsn1")(obj.asInstanceOf[js.Any]).asInstanceOf[Certificate]
inline def certificationRequestFromAsn1(obj: Asn1, computeHash: Boolean): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("certificationRequestFromAsn1")(obj.asInstanceOf[js.Any], computeHash.asInstanceOf[js.Any])).asInstanceOf[Certificate]

inline def certificationRequestFromPem(pem: PEM): Certificate = ^.asInstanceOf[js.Dynamic].applyDynamic("certificationRequestFromPem")(pem.asInstanceOf[js.Any]).asInstanceOf[Certificate]
inline def certificationRequestFromPem(pem: PEM, computeHash: Boolean): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("certificationRequestFromPem")(pem.asInstanceOf[js.Any], computeHash.asInstanceOf[js.Any])).asInstanceOf[Certificate]
inline def certificationRequestFromPem(pem: PEM, computeHash: Boolean, strict: Boolean): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("certificationRequestFromPem")(pem.asInstanceOf[js.Any], computeHash.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Certificate]
inline def certificationRequestFromPem(pem: PEM, computeHash: Unit, strict: Boolean): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("certificationRequestFromPem")(pem.asInstanceOf[js.Any], computeHash.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Certificate]

inline def certificationRequestToAsn1(cert: Certificate): Asn1 = ^.asInstanceOf[js.Dynamic].applyDynamic("certificationRequestToAsn1")(cert.asInstanceOf[js.Any]).asInstanceOf[Asn1]

inline def certificationRequestToPem(cert: Certificate): PEM = ^.asInstanceOf[js.Dynamic].applyDynamic("certificationRequestToPem")(cert.asInstanceOf[js.Any]).asInstanceOf[PEM]
inline def certificationRequestToPem(cert: Certificate, maxline: Double): PEM = (^.asInstanceOf[js.Dynamic].applyDynamic("certificationRequestToPem")(cert.asInstanceOf[js.Any], maxline.asInstanceOf[js.Any])).asInstanceOf[PEM]

inline def createCaStore(): CAStore = ^.asInstanceOf[js.Dynamic].applyDynamic("createCaStore")().asInstanceOf[CAStore]
inline def createCaStore(certs: js.Array[Certificate | PEM]): CAStore = ^.asInstanceOf[js.Dynamic].applyDynamic("createCaStore")(certs.asInstanceOf[js.Any]).asInstanceOf[CAStore]

inline def createCertificate(): Certificate = ^.asInstanceOf[js.Dynamic].applyDynamic("createCertificate")().asInstanceOf[Certificate]

inline def createCertificationRequest(): CertificateRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("createCertificationRequest")().asInstanceOf[CertificateRequest]

inline def decryptPrivateKeyInfo(obj: Asn1, password: String): Asn1 = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptPrivateKeyInfo")(obj.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Asn1]

inline def decryptRsaPrivateKey(pem: PEM): typings.nodeForge.mod.pki.rsa.PrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("decryptRsaPrivateKey")(pem.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.rsa.PrivateKey]
inline def decryptRsaPrivateKey(pem: PEM, passphrase: String): typings.nodeForge.mod.pki.rsa.PrivateKey = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptRsaPrivateKey")(pem.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.rsa.PrivateKey]

inline def encryptPrivateKeyInfo(obj: Asn1, password: String): Asn1 = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptPrivateKeyInfo")(obj.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Asn1]
inline def encryptPrivateKeyInfo(obj: Asn1, password: String, options: EncryptionOptions): Asn1 = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptPrivateKeyInfo")(obj.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Asn1]

inline def encryptRsaPrivateKey(privateKey: PrivateKey, password: String): PEM = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptRsaPrivateKey")(privateKey.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[PEM]
inline def encryptRsaPrivateKey(privateKey: PrivateKey, password: String, options: EncryptionOptions): PEM = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptRsaPrivateKey")(privateKey.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PEM]

inline def encryptedPrivateKeyFromPem(pem: PEM): Asn1 = ^.asInstanceOf[js.Dynamic].applyDynamic("encryptedPrivateKeyFromPem")(pem.asInstanceOf[js.Any]).asInstanceOf[Asn1]

inline def encryptedPrivateKeyToPem(obj: Asn1): PEM = ^.asInstanceOf[js.Dynamic].applyDynamic("encryptedPrivateKeyToPem")(obj.asInstanceOf[js.Any]).asInstanceOf[PEM]

inline def getPublicKeyFingerprint(publicKey: PublicKey): ByteStringBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKeyFingerprint")(publicKey.asInstanceOf[js.Any]).asInstanceOf[ByteStringBuffer]
inline def getPublicKeyFingerprint(publicKey: PublicKey, options: BinaryFingerprintOptions): Bytes = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKeyFingerprint")(publicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Bytes]
inline def getPublicKeyFingerprint(publicKey: PublicKey, options: ByteBufferFingerprintOptions): ByteStringBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKeyFingerprint")(publicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ByteStringBuffer]
inline def getPublicKeyFingerprint(publicKey: PublicKey, options: HexFingerprintOptions): Hex = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKeyFingerprint")(publicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Hex]

inline def oids: typings.nodeForge.mod.pki.oids = ^.asInstanceOf[js.Dynamic].selectDynamic("oids").asInstanceOf[typings.nodeForge.mod.pki.oids]
type oids = StringDictionary[String]
inline def oids_=(x: typings.nodeForge.mod.pki.oids): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oids")(x.asInstanceOf[js.Any])

inline def pemToDer(pem: PEM): ByteStringBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("pemToDer")(pem.asInstanceOf[js.Any]).asInstanceOf[ByteStringBuffer]

inline def privateKeyFromAsn1(privateKey: Asn1): PrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyFromAsn1")(privateKey.asInstanceOf[js.Any]).asInstanceOf[PrivateKey]

inline def privateKeyFromPem(pem: PEM): typings.nodeForge.mod.pki.rsa.PrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyFromPem")(pem.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.rsa.PrivateKey]

inline def privateKeyInfoToPem(key: Asn1): PEM = ^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyInfoToPem")(key.asInstanceOf[js.Any]).asInstanceOf[PEM]
inline def privateKeyInfoToPem(key: Asn1, maxline: Double): PEM = (^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyInfoToPem")(key.asInstanceOf[js.Any], maxline.asInstanceOf[js.Any])).asInstanceOf[PEM]

inline def privateKeyToAsn1(privateKey: PrivateKey): Asn1 = ^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyToAsn1")(privateKey.asInstanceOf[js.Any]).asInstanceOf[Asn1]

inline def privateKeyToPem(key: PrivateKey): PEM = ^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyToPem")(key.asInstanceOf[js.Any]).asInstanceOf[PEM]
inline def privateKeyToPem(key: PrivateKey, maxline: Double): PEM = (^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyToPem")(key.asInstanceOf[js.Any], maxline.asInstanceOf[js.Any])).asInstanceOf[PEM]

inline def publicKeyFromAsn1(publicKey: Asn1): PublicKey = ^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyFromAsn1")(publicKey.asInstanceOf[js.Any]).asInstanceOf[PublicKey]

inline def publicKeyFromPem(pem: PEM): typings.nodeForge.mod.pki.rsa.PublicKey = ^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyFromPem")(pem.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.rsa.PublicKey]

inline def publicKeyToAsn1(publicKey: PublicKey): Asn1 = ^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyToAsn1")(publicKey.asInstanceOf[js.Any]).asInstanceOf[Asn1]

inline def publicKeyToPem(key: PublicKey): PEM = ^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyToPem")(key.asInstanceOf[js.Any]).asInstanceOf[PEM]
inline def publicKeyToPem(key: PublicKey, maxline: Double): PEM = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyToPem")(key.asInstanceOf[js.Any], maxline.asInstanceOf[js.Any])).asInstanceOf[PEM]

inline def publicKeyToRSAPublicKey(publicKey: PublicKey): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyToRSAPublicKey")(publicKey.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def publicKeyToRSAPublicKeyPem(key: PublicKey): PEM = ^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyToRSAPublicKeyPem")(key.asInstanceOf[js.Any]).asInstanceOf[PEM]
inline def publicKeyToRSAPublicKeyPem(key: PublicKey, maxline: Double): PEM = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyToRSAPublicKeyPem")(key.asInstanceOf[js.Any], maxline.asInstanceOf[js.Any])).asInstanceOf[PEM]

/* was `typeof pki.rsa.setPrivateKey` */
inline def setRsaPrivateKey(
  n: BigInteger,
  e: BigInteger,
  d: BigInteger,
  p: BigInteger,
  q: BigInteger,
  dP: BigInteger,
  dQ: BigInteger,
  qInv: BigInteger
): typings.nodeForge.mod.pki.rsa.PrivateKey = (^.asInstanceOf[js.Dynamic].applyDynamic("setRsaPrivateKey")(n.asInstanceOf[js.Any], e.asInstanceOf[js.Any], d.asInstanceOf[js.Any], p.asInstanceOf[js.Any], q.asInstanceOf[js.Any], dP.asInstanceOf[js.Any], dQ.asInstanceOf[js.Any], qInv.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.rsa.PrivateKey]

/* was `typeof pki.rsa.setPublicKey` */
inline def setRsaPublicKey(n: BigInteger, e: BigInteger): typings.nodeForge.mod.pki.rsa.PublicKey = (^.asInstanceOf[js.Dynamic].applyDynamic("setRsaPublicKey")(n.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.rsa.PublicKey]

inline def verifyCertificateChain(caStore: CAStore, chain: js.Array[Certificate]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyCertificateChain")(caStore.asInstanceOf[js.Any], chain.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def verifyCertificateChain(
  caStore: CAStore,
  chain: js.Array[Certificate],
  options: js.Function3[
  /* verified */ Boolean | String, 
  /* depth */ Double, 
  /* certs */ js.Array[Certificate], 
  Boolean
]
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyCertificateChain")(caStore.asInstanceOf[js.Any], chain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def verifyCertificateChain(caStore: CAStore, chain: js.Array[Certificate], options: ValidityCheckDate): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyCertificateChain")(caStore.asInstanceOf[js.Any], chain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def wrapRsaPrivateKey(privateKey: Asn1): Asn1 = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapRsaPrivateKey")(privateKey.asInstanceOf[js.Any]).asInstanceOf[Asn1]

type PEM = String

type PrivateKey = typings.nodeForge.mod.pki.rsa.PrivateKey | Key

type PublicKey = typings.nodeForge.mod.pki.rsa.PublicKey | Key
