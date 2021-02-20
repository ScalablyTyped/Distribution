package typings.nodeForge.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object pki {
  
  type PEM = java.lang.String
  
  type PrivateKey = typings.nodeForge.mod.pki.rsa.PrivateKey | typings.nodeForge.mod.pki.ed25519.Key
  
  type PublicKey = typings.nodeForge.mod.pki.rsa.PublicKey | typings.nodeForge.mod.pki.ed25519.Key
  
  @scala.inline
  def certificateFromAsn1(obj: typings.nodeForge.mod.asn1.Asn1): typings.nodeForge.mod.pki.Certificate = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificateFromAsn1")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.Certificate]
  @scala.inline
  def certificateFromAsn1(obj: typings.nodeForge.mod.asn1.Asn1, computeHash: scala.Boolean): typings.nodeForge.mod.pki.Certificate = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificateFromAsn1")(obj.asInstanceOf[js.Any], computeHash.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.Certificate]
  
  @scala.inline
  def certificateFromPem(pem: typings.nodeForge.mod.pki.PEM): typings.nodeForge.mod.pki.Certificate = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificateFromPem")(pem.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.Certificate]
  @scala.inline
  def certificateFromPem(pem: typings.nodeForge.mod.pki.PEM, computeHash: js.UndefOr[scala.Nothing], strict: scala.Boolean): typings.nodeForge.mod.pki.Certificate = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificateFromPem")(pem.asInstanceOf[js.Any], computeHash.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.Certificate]
  @scala.inline
  def certificateFromPem(pem: typings.nodeForge.mod.pki.PEM, computeHash: scala.Boolean): typings.nodeForge.mod.pki.Certificate = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificateFromPem")(pem.asInstanceOf[js.Any], computeHash.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.Certificate]
  @scala.inline
  def certificateFromPem(pem: typings.nodeForge.mod.pki.PEM, computeHash: scala.Boolean, strict: scala.Boolean): typings.nodeForge.mod.pki.Certificate = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificateFromPem")(pem.asInstanceOf[js.Any], computeHash.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.Certificate]
  
  @scala.inline
  def certificateToAsn1(cert: typings.nodeForge.mod.pki.Certificate): typings.nodeForge.mod.asn1.Asn1 = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificateToAsn1")(cert.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.asn1.Asn1]
  
  @scala.inline
  def certificateToPem(cert: typings.nodeForge.mod.pki.Certificate): typings.nodeForge.mod.pki.PEM = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificateToPem")(cert.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.PEM]
  @scala.inline
  def certificateToPem(cert: typings.nodeForge.mod.pki.Certificate, maxline: scala.Double): typings.nodeForge.mod.pki.PEM = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificateToPem")(cert.asInstanceOf[js.Any], maxline.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.PEM]
  
  @scala.inline
  def certificationRequestFromPem(pem: typings.nodeForge.mod.pki.PEM): typings.nodeForge.mod.pki.Certificate = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificationRequestFromPem")(pem.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.Certificate]
  @scala.inline
  def certificationRequestFromPem(pem: typings.nodeForge.mod.pki.PEM, computeHash: js.UndefOr[scala.Nothing], strict: scala.Boolean): typings.nodeForge.mod.pki.Certificate = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificationRequestFromPem")(pem.asInstanceOf[js.Any], computeHash.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.Certificate]
  @scala.inline
  def certificationRequestFromPem(pem: typings.nodeForge.mod.pki.PEM, computeHash: scala.Boolean): typings.nodeForge.mod.pki.Certificate = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificationRequestFromPem")(pem.asInstanceOf[js.Any], computeHash.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.Certificate]
  @scala.inline
  def certificationRequestFromPem(pem: typings.nodeForge.mod.pki.PEM, computeHash: scala.Boolean, strict: scala.Boolean): typings.nodeForge.mod.pki.Certificate = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificationRequestFromPem")(pem.asInstanceOf[js.Any], computeHash.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.Certificate]
  
  @scala.inline
  def certificationRequestToPem(cert: typings.nodeForge.mod.pki.Certificate): typings.nodeForge.mod.pki.PEM = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificationRequestToPem")(cert.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.PEM]
  @scala.inline
  def certificationRequestToPem(cert: typings.nodeForge.mod.pki.Certificate, maxline: scala.Double): typings.nodeForge.mod.pki.PEM = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("certificationRequestToPem")(cert.asInstanceOf[js.Any], maxline.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.PEM]
  
  @scala.inline
  def createCaStore(): typings.nodeForge.mod.pki.CAStore = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("createCaStore")().asInstanceOf[typings.nodeForge.mod.pki.CAStore]
  @scala.inline
  def createCaStore(certs: js.Array[typings.nodeForge.mod.pki.Certificate | typings.nodeForge.mod.pki.PEM]): typings.nodeForge.mod.pki.CAStore = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("createCaStore")(certs.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.CAStore]
  
  @scala.inline
  def createCertificate(): typings.nodeForge.mod.pki.Certificate = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("createCertificate")().asInstanceOf[typings.nodeForge.mod.pki.Certificate]
  
  @scala.inline
  def createCertificationRequest(): typings.nodeForge.mod.pki.Certificate = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("createCertificationRequest")().asInstanceOf[typings.nodeForge.mod.pki.Certificate]
  
  @scala.inline
  def decryptPrivateKeyInfo(obj: typings.nodeForge.mod.asn1.Asn1, password: java.lang.String): typings.nodeForge.mod.asn1.Asn1 = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("decryptPrivateKeyInfo")(obj.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.asn1.Asn1]
  
  @scala.inline
  def decryptRsaPrivateKey(pem: typings.nodeForge.mod.pki.PEM): typings.nodeForge.mod.pki.rsa.PrivateKey = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("decryptRsaPrivateKey")(pem.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.rsa.PrivateKey]
  @scala.inline
  def decryptRsaPrivateKey(pem: typings.nodeForge.mod.pki.PEM, passphrase: java.lang.String): typings.nodeForge.mod.pki.rsa.PrivateKey = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("decryptRsaPrivateKey")(pem.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.rsa.PrivateKey]
  
  @scala.inline
  def encryptPrivateKeyInfo(obj: typings.nodeForge.mod.asn1.Asn1, password: java.lang.String): typings.nodeForge.mod.asn1.Asn1 = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("encryptPrivateKeyInfo")(obj.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.asn1.Asn1]
  @scala.inline
  def encryptPrivateKeyInfo(
    obj: typings.nodeForge.mod.asn1.Asn1,
    password: java.lang.String,
    options: typings.nodeForge.mod.pki.EncryptionOptions
  ): typings.nodeForge.mod.asn1.Asn1 = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("encryptPrivateKeyInfo")(obj.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.asn1.Asn1]
  
  @scala.inline
  def encryptRsaPrivateKey(privateKey: typings.nodeForge.mod.pki.PrivateKey, password: java.lang.String): typings.nodeForge.mod.pki.PEM = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("encryptRsaPrivateKey")(privateKey.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.PEM]
  @scala.inline
  def encryptRsaPrivateKey(
    privateKey: typings.nodeForge.mod.pki.PrivateKey,
    password: java.lang.String,
    options: typings.nodeForge.mod.pki.EncryptionOptions
  ): typings.nodeForge.mod.pki.PEM = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("encryptRsaPrivateKey")(privateKey.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.PEM]
  
  @scala.inline
  def encryptedPrivateKeyFromPem(pem: typings.nodeForge.mod.pki.PEM): typings.nodeForge.mod.asn1.Asn1 = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("encryptedPrivateKeyFromPem")(pem.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.asn1.Asn1]
  
  @scala.inline
  def encryptedPrivateKeyToPem(obj: typings.nodeForge.mod.asn1.Asn1): typings.nodeForge.mod.pki.PEM = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("encryptedPrivateKeyToPem")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.PEM]
  
  @scala.inline
  def getPublicKeyFingerprint(publicKey: typings.nodeForge.mod.pki.PublicKey): typings.nodeForge.mod.util.ByteStringBuffer = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKeyFingerprint")(publicKey.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.util.ByteStringBuffer]
  @scala.inline
  def getPublicKeyFingerprint(
    publicKey: typings.nodeForge.mod.pki.PublicKey,
    options: typings.nodeForge.mod.pki.BinaryFingerprintOptions
  ): typings.nodeForge.mod.Bytes = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKeyFingerprint")(publicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.Bytes]
  @scala.inline
  def getPublicKeyFingerprint(
    publicKey: typings.nodeForge.mod.pki.PublicKey,
    options: typings.nodeForge.mod.pki.ByteBufferFingerprintOptions
  ): typings.nodeForge.mod.util.ByteStringBuffer = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKeyFingerprint")(publicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.util.ByteStringBuffer]
  @scala.inline
  def getPublicKeyFingerprint(
    publicKey: typings.nodeForge.mod.pki.PublicKey,
    options: typings.nodeForge.mod.pki.HexFingerprintOptions
  ): typings.nodeForge.mod.Hex = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKeyFingerprint")(publicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.Hex]
  
  @scala.inline
  def oids: typings.nodeForge.mod.pki.oids = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].selectDynamic("oids").asInstanceOf[typings.nodeForge.mod.pki.oids]
  type oids = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  @scala.inline
  def oids_=(x: typings.nodeForge.mod.pki.oids): scala.Unit = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].updateDynamic("oids")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def pemToDer(pem: typings.nodeForge.mod.pki.PEM): typings.nodeForge.mod.util.ByteStringBuffer = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("pemToDer")(pem.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.util.ByteStringBuffer]
  
  @scala.inline
  def privateKeyFromAsn1(privateKey: typings.nodeForge.mod.asn1.Asn1): typings.nodeForge.mod.pki.PrivateKey = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyFromAsn1")(privateKey.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.PrivateKey]
  
  @scala.inline
  def privateKeyFromPem(pem: typings.nodeForge.mod.pki.PEM): typings.nodeForge.mod.pki.rsa.PrivateKey = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyFromPem")(pem.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.rsa.PrivateKey]
  
  @scala.inline
  def privateKeyInfoToPem(key: typings.nodeForge.mod.asn1.Asn1): typings.nodeForge.mod.pki.PEM = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyInfoToPem")(key.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.PEM]
  @scala.inline
  def privateKeyInfoToPem(key: typings.nodeForge.mod.asn1.Asn1, maxline: scala.Double): typings.nodeForge.mod.pki.PEM = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyInfoToPem")(key.asInstanceOf[js.Any], maxline.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.PEM]
  
  @scala.inline
  def privateKeyToAsn1(privateKey: typings.nodeForge.mod.pki.PrivateKey): typings.nodeForge.mod.asn1.Asn1 = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyToAsn1")(privateKey.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.asn1.Asn1]
  
  @scala.inline
  def privateKeyToPem(key: typings.nodeForge.mod.pki.PrivateKey): typings.nodeForge.mod.pki.PEM = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyToPem")(key.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.PEM]
  @scala.inline
  def privateKeyToPem(key: typings.nodeForge.mod.pki.PrivateKey, maxline: scala.Double): typings.nodeForge.mod.pki.PEM = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyToPem")(key.asInstanceOf[js.Any], maxline.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.PEM]
  
  @scala.inline
  def publicKeyFromAsn1(publicKey: typings.nodeForge.mod.asn1.Asn1): typings.nodeForge.mod.pki.PublicKey = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyFromAsn1")(publicKey.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.PublicKey]
  
  @scala.inline
  def publicKeyFromPem(pem: typings.nodeForge.mod.pki.PEM): typings.nodeForge.mod.pki.rsa.PublicKey = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyFromPem")(pem.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.rsa.PublicKey]
  
  @scala.inline
  def publicKeyToAsn1(publicKey: typings.nodeForge.mod.pki.PublicKey): typings.nodeForge.mod.asn1.Asn1 = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyToAsn1")(publicKey.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.asn1.Asn1]
  
  @scala.inline
  def publicKeyToPem(key: typings.nodeForge.mod.pki.PublicKey): typings.nodeForge.mod.pki.PEM = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyToPem")(key.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.PEM]
  @scala.inline
  def publicKeyToPem(key: typings.nodeForge.mod.pki.PublicKey, maxline: scala.Double): typings.nodeForge.mod.pki.PEM = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyToPem")(key.asInstanceOf[js.Any], maxline.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.PEM]
  
  @scala.inline
  def publicKeyToRSAPublicKey(publicKey: typings.nodeForge.mod.pki.PublicKey): js.Any = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyToRSAPublicKey")(publicKey.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def publicKeyToRSAPublicKeyPem(key: typings.nodeForge.mod.pki.PublicKey): typings.nodeForge.mod.pki.PEM = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyToRSAPublicKeyPem")(key.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.PEM]
  @scala.inline
  def publicKeyToRSAPublicKeyPem(key: typings.nodeForge.mod.pki.PublicKey, maxline: scala.Double): typings.nodeForge.mod.pki.PEM = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyToRSAPublicKeyPem")(key.asInstanceOf[js.Any], maxline.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.PEM]
  
  type setRsaPublicKey = js.Function2[
    /* n */ typings.nodeForge.mod.jsbn.BigInteger, 
    /* e */ typings.nodeForge.mod.jsbn.BigInteger, 
    typings.nodeForge.mod.pki.rsa.PublicKey
  ]
  
  @scala.inline
  def verifyCertificateChain(caStore: typings.nodeForge.mod.pki.CAStore, chain: js.Array[typings.nodeForge.mod.pki.Certificate]): scala.Boolean = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("verifyCertificateChain")(caStore.asInstanceOf[js.Any], chain.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def verifyCertificateChain(
    caStore: typings.nodeForge.mod.pki.CAStore,
    chain: js.Array[typings.nodeForge.mod.pki.Certificate],
    customVerifyCallback: js.Function3[
      /* verified */ scala.Boolean | java.lang.String, 
      /* depth */ scala.Double, 
      /* chain */ js.Array[typings.nodeForge.mod.pki.Certificate], 
      scala.Boolean
    ]
  ): scala.Boolean = (typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("verifyCertificateChain")(caStore.asInstanceOf[js.Any], chain.asInstanceOf[js.Any], customVerifyCallback.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def wrapRsaPrivateKey(privateKey: typings.nodeForge.mod.asn1.Asn1): typings.nodeForge.mod.asn1.Asn1 = typings.nodeForge.mod.pki.^.asInstanceOf[js.Dynamic].applyDynamic("wrapRsaPrivateKey")(privateKey.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.asn1.Asn1]
}
