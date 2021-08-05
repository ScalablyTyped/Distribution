package typings.nodeForge.mod.pki

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def certificateFromAsn1(obj: typings.nodeForge.mod.asn1.Asn1): typings.nodeForge.mod.pki.Certificate = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificateFromAsn1")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.Certificate]
inline def certificateFromAsn1(obj: typings.nodeForge.mod.asn1.Asn1, computeHash: scala.Boolean): typings.nodeForge.mod.pki.Certificate = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificateFromAsn1")(obj.asInstanceOf[js.Any], computeHash.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.Certificate]

inline def certificateFromPem(pem: typings.nodeForge.mod.pki.PEM): typings.nodeForge.mod.pki.Certificate = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificateFromPem")(pem.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.Certificate]
inline def certificateFromPem(pem: typings.nodeForge.mod.pki.PEM, computeHash: scala.Boolean): typings.nodeForge.mod.pki.Certificate = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificateFromPem")(pem.asInstanceOf[js.Any], computeHash.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.Certificate]
inline def certificateFromPem(pem: typings.nodeForge.mod.pki.PEM, computeHash: scala.Boolean, strict: scala.Boolean): typings.nodeForge.mod.pki.Certificate = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificateFromPem")(pem.asInstanceOf[js.Any], computeHash.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.Certificate]
inline def certificateFromPem(pem: typings.nodeForge.mod.pki.PEM, computeHash: scala.Unit, strict: scala.Boolean): typings.nodeForge.mod.pki.Certificate = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificateFromPem")(pem.asInstanceOf[js.Any], computeHash.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.Certificate]

inline def certificateToAsn1(cert: typings.nodeForge.mod.pki.Certificate): typings.nodeForge.mod.asn1.Asn1 = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificateToAsn1")(cert.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.asn1.Asn1]

inline def certificateToPem(cert: typings.nodeForge.mod.pki.Certificate): typings.nodeForge.mod.pki.PEM = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificateToPem")(cert.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.PEM]
inline def certificateToPem(cert: typings.nodeForge.mod.pki.Certificate, maxline: scala.Double): typings.nodeForge.mod.pki.PEM = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificateToPem")(cert.asInstanceOf[js.Any], maxline.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.PEM]

inline def certificationRequestFromPem(pem: typings.nodeForge.mod.pki.PEM): typings.nodeForge.mod.pki.Certificate = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificationRequestFromPem")(pem.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.Certificate]
inline def certificationRequestFromPem(pem: typings.nodeForge.mod.pki.PEM, computeHash: scala.Boolean): typings.nodeForge.mod.pki.Certificate = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificationRequestFromPem")(pem.asInstanceOf[js.Any], computeHash.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.Certificate]
inline def certificationRequestFromPem(pem: typings.nodeForge.mod.pki.PEM, computeHash: scala.Boolean, strict: scala.Boolean): typings.nodeForge.mod.pki.Certificate = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificationRequestFromPem")(pem.asInstanceOf[js.Any], computeHash.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.Certificate]
inline def certificationRequestFromPem(pem: typings.nodeForge.mod.pki.PEM, computeHash: scala.Unit, strict: scala.Boolean): typings.nodeForge.mod.pki.Certificate = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificationRequestFromPem")(pem.asInstanceOf[js.Any], computeHash.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.Certificate]

inline def certificationRequestToPem(cert: typings.nodeForge.mod.pki.Certificate): typings.nodeForge.mod.pki.PEM = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificationRequestToPem")(cert.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.PEM]
inline def certificationRequestToPem(cert: typings.nodeForge.mod.pki.Certificate, maxline: scala.Double): typings.nodeForge.mod.pki.PEM = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificationRequestToPem")(cert.asInstanceOf[js.Any], maxline.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.PEM]

inline def createCaStore(): typings.nodeForge.mod.pki.CAStore = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("createCaStore")().asInstanceOf[typings.nodeForge.mod.pki.CAStore]
inline def createCaStore(certs: js.Array[typings.nodeForge.mod.pki.Certificate | typings.nodeForge.mod.pki.PEM]): typings.nodeForge.mod.pki.CAStore = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("createCaStore")(certs.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.CAStore]

inline def createCertificate(): typings.nodeForge.mod.pki.Certificate = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("createCertificate")().asInstanceOf[typings.nodeForge.mod.pki.Certificate]

inline def createCertificationRequest(): typings.nodeForge.mod.pki.Certificate = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("createCertificationRequest")().asInstanceOf[typings.nodeForge.mod.pki.Certificate]

inline def decryptPrivateKeyInfo(obj: typings.nodeForge.mod.asn1.Asn1, password: java.lang.String): typings.nodeForge.mod.asn1.Asn1 = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("decryptPrivateKeyInfo")(obj.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.asn1.Asn1]

inline def decryptRsaPrivateKey(pem: typings.nodeForge.mod.pki.PEM): typings.nodeForge.mod.pki.rsa.PrivateKey = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("decryptRsaPrivateKey")(pem.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.rsa.PrivateKey]
inline def decryptRsaPrivateKey(pem: typings.nodeForge.mod.pki.PEM, passphrase: java.lang.String): typings.nodeForge.mod.pki.rsa.PrivateKey = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("decryptRsaPrivateKey")(pem.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.rsa.PrivateKey]

inline def encryptPrivateKeyInfo(obj: typings.nodeForge.mod.asn1.Asn1, password: java.lang.String): typings.nodeForge.mod.asn1.Asn1 = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("encryptPrivateKeyInfo")(obj.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.asn1.Asn1]
inline def encryptPrivateKeyInfo(
  obj: typings.nodeForge.mod.asn1.Asn1,
  password: java.lang.String,
  options: typings.nodeForge.mod.pki.EncryptionOptions
): typings.nodeForge.mod.asn1.Asn1 = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("encryptPrivateKeyInfo")(obj.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.asn1.Asn1]

inline def encryptRsaPrivateKey(privateKey: typings.nodeForge.mod.pki.PrivateKey, password: java.lang.String): typings.nodeForge.mod.pki.PEM = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("encryptRsaPrivateKey")(privateKey.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.PEM]
inline def encryptRsaPrivateKey(
  privateKey: typings.nodeForge.mod.pki.PrivateKey,
  password: java.lang.String,
  options: typings.nodeForge.mod.pki.EncryptionOptions
): typings.nodeForge.mod.pki.PEM = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("encryptRsaPrivateKey")(privateKey.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.PEM]

inline def encryptedPrivateKeyFromPem(pem: typings.nodeForge.mod.pki.PEM): typings.nodeForge.mod.asn1.Asn1 = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("encryptedPrivateKeyFromPem")(pem.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.asn1.Asn1]

inline def encryptedPrivateKeyToPem(obj: typings.nodeForge.mod.asn1.Asn1): typings.nodeForge.mod.pki.PEM = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("encryptedPrivateKeyToPem")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.PEM]

inline def getPublicKeyFingerprint(publicKey: typings.nodeForge.mod.pki.PublicKey): typings.nodeForge.mod.util.ByteStringBuffer = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKeyFingerprint")(publicKey.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.util.ByteStringBuffer]
inline def getPublicKeyFingerprint(
  publicKey: typings.nodeForge.mod.pki.PublicKey,
  options: typings.nodeForge.mod.pki.BinaryFingerprintOptions
): typings.nodeForge.mod.Bytes = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKeyFingerprint")(publicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.Bytes]
inline def getPublicKeyFingerprint(
  publicKey: typings.nodeForge.mod.pki.PublicKey,
  options: typings.nodeForge.mod.pki.ByteBufferFingerprintOptions
): typings.nodeForge.mod.util.ByteStringBuffer = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKeyFingerprint")(publicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.util.ByteStringBuffer]
inline def getPublicKeyFingerprint(
  publicKey: typings.nodeForge.mod.pki.PublicKey,
  options: typings.nodeForge.mod.pki.HexFingerprintOptions
): typings.nodeForge.mod.Hex = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKeyFingerprint")(publicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.Hex]

inline def oids: typings.nodeForge.mod.pki.oids = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].selectDynamic("oids").asInstanceOf[typings.nodeForge.mod.pki.oids]
type oids = org.scalablytyped.runtime.StringDictionary[java.lang.String]
inline def oids_=(x: typings.nodeForge.mod.pki.oids): scala.Unit = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].updateDynamic("oids")(x.asInstanceOf[js.Any])

inline def pemToDer(pem: typings.nodeForge.mod.pki.PEM): typings.nodeForge.mod.util.ByteStringBuffer = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("pemToDer")(pem.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.util.ByteStringBuffer]

inline def privateKeyFromAsn1(privateKey: typings.nodeForge.mod.asn1.Asn1): typings.nodeForge.mod.pki.PrivateKey = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyFromAsn1")(privateKey.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.PrivateKey]

inline def privateKeyFromPem(pem: typings.nodeForge.mod.pki.PEM): typings.nodeForge.mod.pki.rsa.PrivateKey = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyFromPem")(pem.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.rsa.PrivateKey]

inline def privateKeyInfoToPem(key: typings.nodeForge.mod.asn1.Asn1): typings.nodeForge.mod.pki.PEM = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyInfoToPem")(key.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.PEM]
inline def privateKeyInfoToPem(key: typings.nodeForge.mod.asn1.Asn1, maxline: scala.Double): typings.nodeForge.mod.pki.PEM = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyInfoToPem")(key.asInstanceOf[js.Any], maxline.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.PEM]

inline def privateKeyToAsn1(privateKey: typings.nodeForge.mod.pki.PrivateKey): typings.nodeForge.mod.asn1.Asn1 = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyToAsn1")(privateKey.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.asn1.Asn1]

inline def privateKeyToPem(key: typings.nodeForge.mod.pki.PrivateKey): typings.nodeForge.mod.pki.PEM = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyToPem")(key.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.PEM]
inline def privateKeyToPem(key: typings.nodeForge.mod.pki.PrivateKey, maxline: scala.Double): typings.nodeForge.mod.pki.PEM = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyToPem")(key.asInstanceOf[js.Any], maxline.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.PEM]

inline def publicKeyFromAsn1(publicKey: typings.nodeForge.mod.asn1.Asn1): typings.nodeForge.mod.pki.PublicKey = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyFromAsn1")(publicKey.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.PublicKey]

inline def publicKeyFromPem(pem: typings.nodeForge.mod.pki.PEM): typings.nodeForge.mod.pki.rsa.PublicKey = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyFromPem")(pem.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.rsa.PublicKey]

inline def publicKeyToAsn1(publicKey: typings.nodeForge.mod.pki.PublicKey): typings.nodeForge.mod.asn1.Asn1 = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyToAsn1")(publicKey.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.asn1.Asn1]

inline def publicKeyToPem(key: typings.nodeForge.mod.pki.PublicKey): typings.nodeForge.mod.pki.PEM = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyToPem")(key.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.PEM]
inline def publicKeyToPem(key: typings.nodeForge.mod.pki.PublicKey, maxline: scala.Double): typings.nodeForge.mod.pki.PEM = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyToPem")(key.asInstanceOf[js.Any], maxline.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.PEM]

inline def publicKeyToRSAPublicKey(publicKey: typings.nodeForge.mod.pki.PublicKey): js.Any = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyToRSAPublicKey")(publicKey.asInstanceOf[js.Any]).asInstanceOf[js.Any]

inline def publicKeyToRSAPublicKeyPem(key: typings.nodeForge.mod.pki.PublicKey): typings.nodeForge.mod.pki.PEM = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyToRSAPublicKeyPem")(key.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.PEM]
inline def publicKeyToRSAPublicKeyPem(key: typings.nodeForge.mod.pki.PublicKey, maxline: scala.Double): typings.nodeForge.mod.pki.PEM = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyToRSAPublicKeyPem")(key.asInstanceOf[js.Any], maxline.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.PEM]

inline def verifyCertificateChain(caStore: typings.nodeForge.mod.pki.CAStore, chain: js.Array[typings.nodeForge.mod.pki.Certificate]): scala.Boolean = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("verifyCertificateChain")(caStore.asInstanceOf[js.Any], chain.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def verifyCertificateChain(
  caStore: typings.nodeForge.mod.pki.CAStore,
  chain: js.Array[typings.nodeForge.mod.pki.Certificate],
  customVerifyCallback: js.Function3[
  /* verified */ scala.Boolean | java.lang.String, 
  /* depth */ scala.Double, 
  /* chain */ js.Array[typings.nodeForge.mod.pki.Certificate], 
  scala.Boolean
]
): scala.Boolean = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("verifyCertificateChain")(caStore.asInstanceOf[js.Any], chain.asInstanceOf[js.Any], customVerifyCallback.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def wrapRsaPrivateKey(privateKey: typings.nodeForge.mod.asn1.Asn1): typings.nodeForge.mod.asn1.Asn1 = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("wrapRsaPrivateKey")(privateKey.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.asn1.Asn1]

type PEM = java.lang.String

type PrivateKey = typings.nodeForge.mod.pki.rsa.PrivateKey | typings.nodeForge.mod.pki.ed25519.Key

type PublicKey = typings.nodeForge.mod.pki.rsa.PublicKey | typings.nodeForge.mod.pki.ed25519.Key

type setRsaPublicKey = js.Function2[
/* n */ typings.nodeForge.mod.jsbn.BigInteger, 
/* e */ typings.nodeForge.mod.jsbn.BigInteger, 
typings.nodeForge.mod.pki.rsa.PublicKey]
