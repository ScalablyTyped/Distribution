package typings.pkijs.mod

import typings.asn1js.mod.AsnType
import typings.asn1js.mod.BmpString
import typings.asn1js.mod.CharacterString
import typings.asn1js.mod.GeneralString
import typings.asn1js.mod.GraphicString
import typings.asn1js.mod.IA5String
import typings.asn1js.mod.NumericString
import typings.asn1js.mod.OctetString
import typings.asn1js.mod.OctetStringJson
import typings.asn1js.mod.PrintableString
import typings.asn1js.mod.TeletexString
import typings.asn1js.mod.UniversalString
import typings.asn1js.mod.Utf8String
import typings.asn1js.mod.VideotexString
import typings.asn1js.mod.VisibleString
import typings.pkijs.anon.AttrCertValidityPeriod
import typings.pkijs.anon.Attributes
import typings.pkijs.anon.BaseCertificateID
import typings.pkijs.anon.Coefficient
import typings.pkijs.anon.Content
import typings.pkijs.anon.Critical
import typings.pkijs.anon.Date
import typings.pkijs.anon.Digest
import typings.pkijs.anon.EContent
import typings.pkijs.anon.FailInfo
import typings.pkijs.anon.GeneralTimeName
import typings.pkijs.anon.HashAlgorithm
import typings.pkijs.anon.HashedMessage
import typings.pkijs.anon.IdType
import typings.pkijs.anon.Issuer
import typings.pkijs.anon.Iterations
import typings.pkijs.anon.Micros
import typings.pkijs.anon.NotAfterTime
import typings.pkijs.anon.NotBefore
import typings.pkijs.anon.Other
import typings.pkijs.anon.ProducedAt
import typings.pkijs.anon.RepeatedSequence
import typings.pkijs.anon.RequestExtensions
import typings.pkijs.anon.Response
import typings.pkijs.anon.SchemaCompatibleparsingEr
import typings.pkijs.anon.SetName
import typings.pkijs.anon.SignatureValue
import typings.pkijs.anon.SubjectPublicKey
import typings.pkijs.anon.TagNumber
import typings.pkijs.anon.TbsCertListNextUpdate
import typings.pkijs.anon.TypeValue
import typings.pkijs.anon.Value
import typings.pkijs.anon.`0`
import typings.pkijs.mod.^
import typings.pkijs.pkijsBooleans.`true`
import typings.std.Algorithm
import typings.std.Crypto
import typings.std.JsonWebKey
import typings.std.Partial
import typings.std.SubtleCrypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def HASHED_MESSAGE: /* "hashedMessage" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("HASHED_MESSAGE").asInstanceOf[/* "hashedMessage" */ String]

inline def HASH_ALGORITHM: /* "hashAlgorithm" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("HASH_ALGORITHM").asInstanceOf[/* "hashAlgorithm" */ String]

inline def MICROS: /* "micros" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("MICROS").asInstanceOf[/* "micros" */ String]

inline def MILLIS: /* "millis" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("MILLIS").asInstanceOf[/* "millis" */ String]

inline def POLICY_IDENTIFIER: /* "policyIdentifier" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("POLICY_IDENTIFIER").asInstanceOf[/* "policyIdentifier" */ String]

inline def POLICY_QUALIFIERS: /* "policyQualifiers" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("POLICY_QUALIFIERS").asInstanceOf[/* "policyQualifiers" */ String]

inline def RDN: /* "RDN" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("RDN").asInstanceOf[/* "RDN" */ String]

inline def SECONDS: /* "seconds" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("SECONDS").asInstanceOf[/* "seconds" */ String]

inline def TYPE: /* "type" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("TYPE").asInstanceOf[/* "type" */ String]

inline def TYPE_AND_VALUES: /* "typesAndValues" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("TYPE_AND_VALUES").asInstanceOf[/* "typesAndValues" */ String]

inline def VALUE: /* "value" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("VALUE").asInstanceOf[/* "value" */ String]

inline def VALUE_BEFORE_DECODE: /* "valueBeforeDecode" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("VALUE_BEFORE_DECODE").asInstanceOf[/* "valueBeforeDecode" */ String]

/**
  * Check CA flag for the certificate
  * @param cert Certificate to find CA flag for
  * @returns Returns {@link Certificate} if `cert` is CA certificate otherwise return `null`
  */
inline def checkCA(cert: Certificate): Certificate | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("checkCA")(cert.asInstanceOf[js.Any]).asInstanceOf[Certificate | Null]
inline def checkCA(cert: Certificate, signerCert: Certificate): Certificate | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("checkCA")(cert.asInstanceOf[js.Any], signerCert.asInstanceOf[js.Any])).asInstanceOf[Certificate | Null]

/**
  * Create CMS ECDSA signature from WebCrypto ECDSA signature
  * @param signatureBuffer WebCrypto result of "sign" function
  */
inline def createCMSECDSASignature(signatureBuffer: js.typedarray.ArrayBuffer): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("createCMSECDSASignature")(signatureBuffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]

/**
  * Create a single ArrayBuffer from CMS ECDSA signature
  * @param cmsSignature ASN.1 SEQUENCE contains CMS ECDSA signature
  * @param pointSize Size of EC point. Use {@link ECNamedCurves.find} to get correct point size
  * @returns WebCrypto signature
  */
inline def createECDSASignatureFromCMS(cmsSignature: AsnType, pointSize: Double): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("createECDSASignatureFromCMS")(cmsSignature.asInstanceOf[js.Any], pointSize.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]

inline def engine: GlobalCryptoEngine = ^.asInstanceOf[js.Dynamic].selectDynamic("engine").asInstanceOf[GlobalCryptoEngine]
inline def engine_=(x: GlobalCryptoEngine): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("engine")(x.asInstanceOf[js.Any])

/**
  * Gets WebCrypto algorithm by well-known OID
  * @param oid algorithm identifier
  * @param safety if true throws exception on unknown algorithm identifier
  * @param target name of the target
  * @returns WebCrypto algorithm or an empty object
  */
inline def getAlgorithmByOID[T /* <: Algorithm */](oid: String): T | js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getAlgorithmByOID")(oid.asInstanceOf[js.Any]).asInstanceOf[T | js.Object]
inline def getAlgorithmByOID[T /* <: Algorithm */](oid: String, safety: Boolean): T | js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("getAlgorithmByOID")(oid.asInstanceOf[js.Any], safety.asInstanceOf[js.Any])).asInstanceOf[T | js.Object]
inline def getAlgorithmByOID[T /* <: Algorithm */](oid: String, safety: Boolean, target: String): T | js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("getAlgorithmByOID")(oid.asInstanceOf[js.Any], safety.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[T | js.Object]
inline def getAlgorithmByOID[T /* <: Algorithm */](oid: String, safety: Unit, target: String): T | js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("getAlgorithmByOID")(oid.asInstanceOf[js.Any], safety.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[T | js.Object]

inline def getAlgorithmByOID_true[T /* <: Algorithm */](oid: String, safety: `true`): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getAlgorithmByOID")(oid.asInstanceOf[js.Any], safety.asInstanceOf[js.Any])).asInstanceOf[T]
inline def getAlgorithmByOID_true[T /* <: Algorithm */](oid: String, safety: `true`, target: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getAlgorithmByOID")(oid.asInstanceOf[js.Any], safety.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[T]

/**
  * Get default algorithm parameters for each kind of operation
  * @param algorithmName Algorithm name to get common parameters for
  * @param operation Kind of operation: "sign", "encrypt", "generateKey", "importKey", "exportKey", "verify"
  */
inline def getAlgorithmParameters(algorithmName: String, operation: CryptoEngineAlgorithmOperation): CryptoEngineAlgorithmParams = (^.asInstanceOf[js.Dynamic].applyDynamic("getAlgorithmParameters")(algorithmName.asInstanceOf[js.Any], operation.asInstanceOf[js.Any])).asInstanceOf[CryptoEngineAlgorithmParams]

/**
  * Gets crypto subtle from the current "crypto engine"
  * @param safety
  * @returns Reruns {@link ICryptoEngine} or `null`
  */
inline def getCrypto(): ICryptoEngine | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getCrypto")().asInstanceOf[ICryptoEngine | Null]
inline def getCrypto(safety: Boolean): ICryptoEngine | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getCrypto")(safety.asInstanceOf[js.Any]).asInstanceOf[ICryptoEngine | Null]

/**
  * Gets crypto subtle from the current "crypto engine"
  * @param safety
  * @returns Reruns {@link ICryptoEngine} or throws en exception
  * @throws Throws {@link Error} if `subtle` is empty
  */
inline def getCrypto_true(safety: `true`): ICryptoEngine = ^.asInstanceOf[js.Dynamic].applyDynamic("getCrypto")(safety.asInstanceOf[js.Any]).asInstanceOf[ICryptoEngine]

inline def getEngine(): GlobalCryptoEngine = ^.asInstanceOf[js.Dynamic].applyDynamic("getEngine")().asInstanceOf[GlobalCryptoEngine]

/**
  * Getting hash algorithm by signature algorithm
  * @param signatureAlgorithm Signature algorithm
  */
inline def getHashAlgorithm(signatureAlgorithm: AlgorithmIdentifier): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getHashAlgorithm")(signatureAlgorithm.asInstanceOf[js.Any]).asInstanceOf[String]

/**
  * Get OID for each specific algorithm
  * @param algorithm WebCrypto Algorithm
  * @param safety if `true` throws exception on unknown algorithm
  * @param target name of the target
  * @throws Throws {@link Error} exception if unknown WebCrypto algorithm
  */
inline def getOIDByAlgorithm(algorithm: Algorithm): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOIDByAlgorithm")(algorithm.asInstanceOf[js.Any]).asInstanceOf[String]
inline def getOIDByAlgorithm(algorithm: Algorithm, safety: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getOIDByAlgorithm")(algorithm.asInstanceOf[js.Any], safety.asInstanceOf[js.Any])).asInstanceOf[String]
inline def getOIDByAlgorithm(algorithm: Algorithm, safety: Boolean, target: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getOIDByAlgorithm")(algorithm.asInstanceOf[js.Any], safety.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[String]
inline def getOIDByAlgorithm(algorithm: Algorithm, safety: Unit, target: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getOIDByAlgorithm")(algorithm.asInstanceOf[js.Any], safety.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[String]

/**
  * Initialize input Uint8Array by random values (with help from current "crypto engine")
  * @param view
  */
inline def getRandomValues(view: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomValues")(view.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]

inline def idAd: String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_ad").asInstanceOf[String]

inline def idAdCaIssuers: String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_ad_caIssuers").asInstanceOf[String]

inline def idAdOcsp: String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_ad_ocsp").asInstanceOf[String]

inline def idAnyPolicy: /* "2.5.29.32.0" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_AnyPolicy").asInstanceOf[/* "2.5.29.32.0" */ String]

inline def idAuthorityInfoAccess: /* "1.3.6.1.5.5.7.1.1" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_AuthorityInfoAccess").asInstanceOf[/* "1.3.6.1.5.5.7.1.1" */ String]

inline def idAuthorityKeyIdentifier: /* "2.5.29.35" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_AuthorityKeyIdentifier").asInstanceOf[/* "2.5.29.35" */ String]

inline def idBaseCRLNumber: /* "2.5.29.27" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_BaseCRLNumber").asInstanceOf[/* "2.5.29.27" */ String]

inline def idBasicConstraints: /* "2.5.29.19" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_BasicConstraints").asInstanceOf[/* "2.5.29.19" */ String]

inline def idCRLBagX509CRL: /* "1.2.840.113549.1.9.23.1" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_CRLBag_X509CRL").asInstanceOf[/* "1.2.840.113549.1.9.23.1" */ String]

inline def idCRLDistributionPoints: /* "2.5.29.31" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_CRLDistributionPoints").asInstanceOf[/* "2.5.29.31" */ String]

inline def idCRLNumber: /* "2.5.29.20" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_CRLNumber").asInstanceOf[/* "2.5.29.20" */ String]

inline def idCRLReason: /* "2.5.29.21" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_CRLReason").asInstanceOf[/* "2.5.29.21" */ String]

inline def idCertBagAttributeCertificate: /* "1.2.840.113549.1.9.22.3" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_CertBag_AttributeCertificate").asInstanceOf[/* "1.2.840.113549.1.9.22.3" */ String]

inline def idCertBagSDSICertificate: /* "1.2.840.113549.1.9.22.2" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_CertBag_SDSICertificate").asInstanceOf[/* "1.2.840.113549.1.9.22.2" */ String]

inline def idCertBagX509Certificate: /* "1.2.840.113549.1.9.22.1" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_CertBag_X509Certificate").asInstanceOf[/* "1.2.840.113549.1.9.22.1" */ String]

inline def idCertificateIssuer: /* "2.5.29.29" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_CertificateIssuer").asInstanceOf[/* "2.5.29.29" */ String]

inline def idCertificatePolicies: /* "2.5.29.32" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_CertificatePolicies").asInstanceOf[/* "2.5.29.32" */ String]

inline def idContentTypeData: /* "1.2.840.113549.1.7.1" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_ContentType_Data").asInstanceOf[/* "1.2.840.113549.1.7.1" */ String]

inline def idContentTypeEncryptedData: /* "1.2.840.113549.1.7.6" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_ContentType_EncryptedData").asInstanceOf[/* "1.2.840.113549.1.7.6" */ String]

inline def idContentTypeEnvelopedData: /* "1.2.840.113549.1.7.3" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_ContentType_EnvelopedData").asInstanceOf[/* "1.2.840.113549.1.7.3" */ String]

inline def idContentTypeSignedData: /* "1.2.840.113549.1.7.2" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_ContentType_SignedData").asInstanceOf[/* "1.2.840.113549.1.7.2" */ String]

inline def idEContentTypeTSTInfo: /* "1.2.840.113549.1.9.16.1.4" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_eContentType_TSTInfo").asInstanceOf[/* "1.2.840.113549.1.9.16.1.4" */ String]

inline def idExtKeyUsage: /* "2.5.29.37" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_ExtKeyUsage").asInstanceOf[/* "2.5.29.37" */ String]

inline def idFreshestCRL: /* "2.5.29.46" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_FreshestCRL").asInstanceOf[/* "2.5.29.46" */ String]

inline def idInhibitAnyPolicy: /* "2.5.29.54" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_InhibitAnyPolicy").asInstanceOf[/* "2.5.29.54" */ String]

inline def idInvalidityDate: /* "2.5.29.24" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_InvalidityDate").asInstanceOf[/* "2.5.29.24" */ String]

inline def idIssuerAltName: /* "2.5.29.18" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_IssuerAltName").asInstanceOf[/* "2.5.29.18" */ String]

inline def idIssuingDistributionPoint: /* "2.5.29.28" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_IssuingDistributionPoint").asInstanceOf[/* "2.5.29.28" */ String]

inline def idKeyUsage: /* "2.5.29.15" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_KeyUsage").asInstanceOf[/* "2.5.29.15" */ String]

inline def idMicrosoftAppPolicies: /* "1.3.6.1.4.1.311.21.10" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_MicrosoftAppPolicies").asInstanceOf[/* "1.3.6.1.4.1.311.21.10" */ String]

inline def idMicrosoftCaVersion: /* "1.3.6.1.4.1.311.21.1" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_MicrosoftCaVersion").asInstanceOf[/* "1.3.6.1.4.1.311.21.1" */ String]

inline def idMicrosoftCertTemplateV1: /* "1.3.6.1.4.1.311.20.2" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_MicrosoftCertTemplateV1").asInstanceOf[/* "1.3.6.1.4.1.311.20.2" */ String]

inline def idMicrosoftCertTemplateV2: /* "1.3.6.1.4.1.311.21.7" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_MicrosoftCertTemplateV2").asInstanceOf[/* "1.3.6.1.4.1.311.21.7" */ String]

inline def idMicrosoftPrevCaCertHash: /* "1.3.6.1.4.1.311.21.2" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_MicrosoftPrevCaCertHash").asInstanceOf[/* "1.3.6.1.4.1.311.21.2" */ String]

inline def idNameConstraints: /* "2.5.29.30" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_NameConstraints").asInstanceOf[/* "2.5.29.30" */ String]

inline def idPKIXOCSPBasic: String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_PKIX_OCSP_Basic").asInstanceOf[String]

inline def idPkix: /* "1.3.6.1.5.5.7" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_pkix").asInstanceOf[/* "1.3.6.1.5.5.7" */ String]

inline def idPolicyConstraints: /* "2.5.29.36" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_PolicyConstraints").asInstanceOf[/* "2.5.29.36" */ String]

inline def idPolicyMappings: /* "2.5.29.33" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_PolicyMappings").asInstanceOf[/* "2.5.29.33" */ String]

inline def idPrivateKeyUsagePeriod: /* "2.5.29.16" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_PrivateKeyUsagePeriod").asInstanceOf[/* "2.5.29.16" */ String]

inline def idQCStatements: /* "1.3.6.1.5.5.7.1.3" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_QCStatements").asInstanceOf[/* "1.3.6.1.5.5.7.1.3" */ String]

inline def idSha1: /* "1.3.14.3.2.26" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_sha1").asInstanceOf[/* "1.3.14.3.2.26" */ String]

inline def idSha256: /* "2.16.840.1.101.3.4.2.1" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_sha256").asInstanceOf[/* "2.16.840.1.101.3.4.2.1" */ String]

inline def idSha384: /* "2.16.840.1.101.3.4.2.2" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_sha384").asInstanceOf[/* "2.16.840.1.101.3.4.2.2" */ String]

inline def idSha512: /* "2.16.840.1.101.3.4.2.3" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_sha512").asInstanceOf[/* "2.16.840.1.101.3.4.2.3" */ String]

inline def idSignedCertificateTimestampList: /* "1.3.6.1.4.1.11129.2.4.2" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_SignedCertificateTimestampList").asInstanceOf[/* "1.3.6.1.4.1.11129.2.4.2" */ String]

inline def idSubjectAltName: /* "2.5.29.17" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_SubjectAltName").asInstanceOf[/* "2.5.29.17" */ String]

inline def idSubjectDirectoryAttributes: /* "2.5.29.9" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_SubjectDirectoryAttributes").asInstanceOf[/* "2.5.29.9" */ String]

inline def idSubjectInfoAccess: /* "1.3.6.1.5.5.7.1.11" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_SubjectInfoAccess").asInstanceOf[/* "1.3.6.1.5.5.7.1.11" */ String]

inline def idSubjectKeyIdentifier: /* "2.5.29.14" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("id_SubjectKeyIdentifier").asInstanceOf[/* "2.5.29.14" */ String]

/**
  * ANS X9.63 Key Derivation Function
  * @param hashFunction Used hash function
  * @param Zbuffer ArrayBuffer containing ECDH shared secret to derive from
  * @param keydatalen Length (!!! in BITS !!!) of used kew derivation function
  * @param SharedInfo Usually DER encoded "ECC_CMS_SharedInfo" structure
  * @param crypto Crypto engine
  */
inline def kdf(
  hashFunction: String,
  Zbuffer: js.typedarray.ArrayBuffer,
  keydatalen: Double,
  SharedInfo: js.typedarray.ArrayBuffer
): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("kdf")(hashFunction.asInstanceOf[js.Any], Zbuffer.asInstanceOf[js.Any], keydatalen.asInstanceOf[js.Any], SharedInfo.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
inline def kdf(
  hashFunction: String,
  Zbuffer: js.typedarray.ArrayBuffer,
  keydatalen: Double,
  SharedInfo: js.typedarray.ArrayBuffer,
  crypto: ICryptoEngine
): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("kdf")(hashFunction.asInstanceOf[js.Any], Zbuffer.asInstanceOf[js.Any], keydatalen.asInstanceOf[js.Any], SharedInfo.asInstanceOf[js.Any], crypto.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]

/**
  * Sets global crypto engine
  * @param name Name of the crypto engine
  * @param crypto Crypto engine
  * @since 3.0.0
  */
inline def setEngine(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEngine")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def setEngine(name: String, crypto: ICryptoEngine): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setEngine")(name.asInstanceOf[js.Any], crypto.asInstanceOf[js.Any])).asInstanceOf[Unit]
/**
  * Sets global crypto engine
  * @param name Name of the crypto engine
  * @param crypto
  * @param subtle
  * @deprecated Since version 3.0.0
  */
inline def setEngine(name: String, crypto: ICryptoEngine, subtle: ICryptoEngine): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setEngine")(name.asInstanceOf[js.Any], crypto.asInstanceOf[js.Any], subtle.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def setEngine(name: String, crypto: ICryptoEngine, subtle: SubtleCrypto): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setEngine")(name.asInstanceOf[js.Any], crypto.asInstanceOf[js.Any], subtle.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def setEngine(name: String, crypto: Crypto, subtle: ICryptoEngine): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setEngine")(name.asInstanceOf[js.Any], crypto.asInstanceOf[js.Any], subtle.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def setEngine(name: String, crypto: Crypto, subtle: SubtleCrypto): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setEngine")(name.asInstanceOf[js.Any], crypto.asInstanceOf[js.Any], subtle.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * String preparation function. In a future here will be realization of algorithm from RFC4518
  * @param inputString JavaScript string. As soon as for each ASN.1 string type we have a specific
  *                    transformation function here we will work with pure JavaScript string
  * @returns Formatted string
  */
inline def stringPrep(inputString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringPrep")(inputString.asInstanceOf[js.Any]).asInstanceOf[String]

/**
  * Verify SignedCertificateTimestamp for specific certificate content
  * @param certificate Certificate for which verification would be performed
  * @param issuerCertificate Certificate of the issuer of target certificate
  * @param logs Array of objects with information about each CT Log (like here: https://ct.grahamedgecombe.com/logs.json)
  * @param index Index of SignedCertificateTimestamp inside SignedCertificateTimestampList (for -1 would verify all)
  * @param crypto Crypto engine
  * @return Array of verification results
  */
inline def verifySCTsForCertificate(certificate: Certificate, issuerCertificate: Certificate, logs: js.Array[Log]): js.Promise[js.Array[Boolean]] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySCTsForCertificate")(certificate.asInstanceOf[js.Any], issuerCertificate.asInstanceOf[js.Any], logs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Boolean]]]
inline def verifySCTsForCertificate(certificate: Certificate, issuerCertificate: Certificate, logs: js.Array[Log], index: Double): js.Promise[js.Array[Boolean]] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySCTsForCertificate")(certificate.asInstanceOf[js.Any], issuerCertificate.asInstanceOf[js.Any], logs.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Boolean]]]
inline def verifySCTsForCertificate(
  certificate: Certificate,
  issuerCertificate: Certificate,
  logs: js.Array[Log],
  index: Double,
  crypto: ICryptoEngine
): js.Promise[js.Array[Boolean]] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySCTsForCertificate")(certificate.asInstanceOf[js.Any], issuerCertificate.asInstanceOf[js.Any], logs.asInstanceOf[js.Any], index.asInstanceOf[js.Any], crypto.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Boolean]]]
inline def verifySCTsForCertificate(
  certificate: Certificate,
  issuerCertificate: Certificate,
  logs: js.Array[Log],
  index: Unit,
  crypto: ICryptoEngine
): js.Promise[js.Array[Boolean]] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySCTsForCertificate")(certificate.asInstanceOf[js.Any], issuerCertificate.asInstanceOf[js.Any], logs.asInstanceOf[js.Any], index.asInstanceOf[js.Any], crypto.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Boolean]]]

type AccuracySchema = SchemaParameters[Micros]

type AlgorithmIdentifierSchema = SchemaParameters[typings.pkijs.anon.AlgorithmIdentifier]

type AttCertValidityPeriodSchema = SchemaParameters[NotAfterTime]

type AttributeCertificateInfoV1Schema = SchemaParameters[AttrCertValidityPeriod]

type AttributeCertificateInfoV2Schema = SchemaParameters[Attributes]

type AttributeSchema = SchemaParameters[SetName]

type AttributeValueType = Utf8String | BmpString | UniversalString | NumericString | PrintableString | TeletexString | VideotexString | IA5String | GraphicString | VisibleString | GeneralString | CharacterString

/* Rewritten from type alias, can be one of: 
  - typings.pkijs.mod.PrivateKeyInfoJson
  - typings.std.JsonWebKey
  - typings.pkijs.mod.PKCS8ShroudedKeyBagJson
  - typings.pkijs.mod.CertBagJson
  - typings.pkijs.mod.CRLBagJson
  - typings.pkijs.mod.SecretBagJson
  - typings.pkijs.mod.SafeContentsJson
*/
type BagTypeJson = _BagTypeJson | JsonWebKey

type CertIDSchema = SchemaParameters[HashAlgorithm]

/**
  * Parameters for {@link Certificate} schema generation
  */
type CertificateSchema = SchemaParameters[SignatureValue]

type ContentInfoSchema = SchemaParameters[Content]

type DigestInfoSchema = SchemaParameters[Digest]

type DistributionPointName = js.Array[GeneralName] | RelativeDistinguishedNames

type DistributionPointNameJson = js.Array[GeneralNameJson] | RelativeDistinguishedNamesJson

type EncapsulatedContentInfoSchema = SchemaParameters[EContent]

type EncryptedContentInfoSchema = SchemaParameters[typings.pkijs.anon.ContentEncryptionAlgorithm]

type ExtensionParsedValue = SchemaCompatibleparsingEr | SchemaType

type ExtensionSchema = SchemaParameters[Critical]

type ExtensionsSchema = SchemaParameters[typings.pkijs.anon.Extension]

type FindIssuerCallback = js.Function3[
/* certificate */ Certificate, 
/* validationEngine */ CertificateChainValidationEngine, 
/* crypto */ js.UndefOr[ICryptoEngine], 
js.Promise[js.Array[Certificate]]]

type FindOriginCallback = js.Function2[
/* certificate */ Certificate, 
/* validationEngine */ CertificateChainValidationEngine, 
String]

type GeneralNameParameters = PkiObjectParameters & (Partial[Value | TypeValue])

type GeneralNamesSchema = SchemaParameters[typings.pkijs.anon.GeneralNames]

type HolderSchema = SchemaParameters[BaseCertificateID]

type IssuerAndSerialNumberSchema = SchemaParameters[Issuer]

type KEKIdentifierSchema = SchemaParameters[Date]

type KeyAgreeRecipientIdentifierSchema = SchemaParameters[typings.pkijs.anon.IssuerAndSerialNumber]

type MacDataSchema = SchemaParameters[Iterations]

/* Rewritten from type alias, can be one of: 
  - js.Object
  - typings.pkijs.anon.Pbkdf2HashAlgorithm
  - typings.pkijs.anon.PrivateKey
*/
type MakeInternalValuesParams = _MakeInternalValuesParams | js.Object

type MessageImprintSchema = SchemaParameters[HashedMessage]

type OriginatorIdentifierOrKeySchema = SchemaParameters[js.Object]

type OtherKeyAttributeSchema = SchemaType

type OtherPrimeInfoSchema = SchemaParameters[Coefficient]

type PKIStatusInfoSchema = SchemaParameters[FailInfo]

type PublicKeyInfoSchema = SchemaParameters[SubjectPublicKey]

type QCStatementSchema = SchemaParameters[IdType]

type RecipientEncryptedKeysSchema = SchemaParameters[typings.pkijs.anon.RecipientEncryptedKeys]

type RecipientIdentifierMixedJson = IssuerAndSerialNumberJson | OctetStringJson

type RecipientIdentifierSchema = SchemaParameters[js.Object]

type RecipientIdentifierType = IssuerAndSerialNumber | OctetString

type RecipientKeyIdentifierSchema = SchemaParameters[Other]

type RelativeDistinguishedNamesSchema = SchemaParameters[RepeatedSequence]

type RequestSchema = SchemaParameters[typings.pkijs.anon.Extensions]

type ResponseBytesSchema = SchemaParameters[Response]

type ResponseDataSchema = SchemaParameters[ProducedAt]

type RevocationInfoChoicesSchema = SchemaParameters[`0`]

/* Rewritten from type alias, can be one of: 
  - typings.pkijs.mod.ContentInfo
  - typings.pkijs.mod.EncryptedData
  - typings.pkijs.mod.EnvelopedData
  - js.Object
*/
type SafeContent = _SafeContent | js.Object

type SchemaType = Any

type SignatureSchema = SchemaParameters[typings.pkijs.anon.Signature]

type SignedAndUnsignedAttributesSchema = SchemaParameters[TagNumber]

type SingleResponseSchema = SchemaParameters[typings.pkijs.anon.CertID]

type TBSCertListSchema = SchemaParameters[TbsCertListNextUpdate]

type TBSCertificateSchema = SchemaParameters[NotBefore]

type TBSRequestSchema = SchemaParameters[RequestExtensions]

type TimeSchema = SchemaParameters[GeneralTimeName]
