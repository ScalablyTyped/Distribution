package typings.pkijs.mod

import typings.asn1js.mod.BitString
import typings.asn1js.mod.Sequence
import typings.pkijs.anon.CrlExtensions
import typings.std.CryptoKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the CertificateRevocationList structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  */
@JSImport("pkijs", "CertificateRevocationList")
@js.native
/**
  * Initializes a new instance of the {@link CertificateRevocationList} class
  * @param parameters Initialization parameters
  */
open class CertificateRevocationList ()
  extends PkiObject
     with ICertificateRevocationList
     with SignedDataCRL {
  def this(parameters: CertificateRevocationListParameters) = this()
  
  /* protected */ def encodeTBS(): Sequence = js.native
  
  /**
    * Returns `true` if supplied certificate is revoked, otherwise `false`
    * @param certificate
    */
  def isCertificateRevoked(certificate: Certificate): Boolean = js.native
  
  /* CompleteClass */
  var issuer: RelativeDistinguishedNames = js.native
  
  /**
    * Make a signature for existing CRL data
    * @param privateKey Private key for "subjectPublicKeyInfo" structure
    * @param hashAlgorithm Hashing algorithm. Default SHA-1
    * @param crypto Crypto engine
    */
  def sign(privateKey: CryptoKey): js.Promise[Unit] = js.native
  def sign(privateKey: CryptoKey, hashAlgorithm: String): js.Promise[Unit] = js.native
  def sign(privateKey: CryptoKey, hashAlgorithm: String, crypto: ICryptoEngine): js.Promise[Unit] = js.native
  def sign(privateKey: CryptoKey, hashAlgorithm: Unit, crypto: ICryptoEngine): js.Promise[Unit] = js.native
  
  /* CompleteClass */
  var signature: AlgorithmIdentifier = js.native
  
  /* CompleteClass */
  var signatureAlgorithm: AlgorithmIdentifier = js.native
  
  /* CompleteClass */
  var signatureValue: BitString = js.native
  
  /* CompleteClass */
  var tbs: js.typedarray.ArrayBuffer = js.native
  
  var tbsView: js.typedarray.Uint8Array = js.native
  
  /**
    * @deprecated Since version 3.0.0
    */
  @JSName("tbs")
  def tbs_MCertificateRevocationList: js.typedarray.ArrayBuffer = js.native
  
  /* CompleteClass */
  var thisUpdate: Time = js.native
  
  /**
    * Verify existing signature
    * @param parameters
    * @param crypto Crypto engine
    */
  def verify(): js.Promise[Boolean] = js.native
  def verify(parameters: Unit, crypto: ICryptoEngine): js.Promise[Boolean] = js.native
  def verify(parameters: CertificateRevocationListVerifyParams): js.Promise[Boolean] = js.native
  def verify(parameters: CertificateRevocationListVerifyParams, crypto: ICryptoEngine): js.Promise[Boolean] = js.native
  
  /* CompleteClass */
  var version: Double = js.native
}
object CertificateRevocationList {
  
  @JSImport("pkijs", "CertificateRevocationList")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "CertificateRevocationList.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def defaultValues(memberName: /* "version" */ String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def defaultValues_AlgorithmIdentifier(memberName: /* "signature" */ String): AlgorithmIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[AlgorithmIdentifier]
  
  /* static member */
  inline def defaultValues_Array(memberName: /* "revokedCertificates" */ String): js.Array[RevokedCertificate] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[RevokedCertificate]]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_ArrayBuffer(memberName: /* "tbs" */ String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  
  /* static member */
  inline def defaultValues_BitString(memberName: /* "signatureValue" */ String): BitString = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[BitString]
  
  /* static member */
  inline def defaultValues_Extensions(memberName: /* "crlExtensions" */ String): Extensions = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Extensions]
  
  /* static member */
  inline def defaultValues_RelativeDistinguishedNames(memberName: /* "issuer" */ String): RelativeDistinguishedNames = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[RelativeDistinguishedNames]
  
  /* static member */
  inline def defaultValues_Time(memberName: /* "thisUpdate" */ String): Time = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Time]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * CertificateList ::= SEQUENCE  {
    *    tbsCertList          TBSCertList,
    *    signatureAlgorithm   AlgorithmIdentifier,
    *    signatureValue       BIT STRING  }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[CrlExtensions]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
