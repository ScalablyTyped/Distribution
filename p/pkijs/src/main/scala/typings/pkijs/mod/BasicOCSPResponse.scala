package typings.pkijs.mod

import typings.asn1js.mod.BitString
import typings.pkijs.anon.Certs
import typings.std.CryptoKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the BasicOCSPResponse structure described in [RFC6960](https://datatracker.ietf.org/doc/html/rfc6960)
  */
@JSImport("pkijs", "BasicOCSPResponse")
@js.native
/**
  * Initializes a new instance of the {@link BasicOCSPResponse} class
  * @param parameters Initialization parameters
  */
open class BasicOCSPResponse ()
  extends PkiObject
     with IBasicOCSPResponse {
  def this(parameters: BasicOCSPResponseParameters) = this()
  
  /**
    * Get OCSP response status for specific certificate
    * @param certificate Certificate to be checked
    * @param issuerCertificate Certificate of issuer for certificate to be checked
    * @param crypto Crypto engine
    */
  def getCertificateStatus(certificate: Certificate, issuerCertificate: Certificate): js.Promise[CertificateStatus] = js.native
  def getCertificateStatus(certificate: Certificate, issuerCertificate: Certificate, crypto: ICryptoEngine): js.Promise[CertificateStatus] = js.native
  
  /**
    * Make signature for current OCSP Basic Response
    * @param privateKey Private key for "subjectPublicKeyInfo" structure
    * @param hashAlgorithm Hashing algorithm. Default SHA-1
    * @param crypto Crypto engine
    */
  def sign(privateKey: CryptoKey): js.Promise[Unit] = js.native
  def sign(privateKey: CryptoKey, hashAlgorithm: String): js.Promise[Unit] = js.native
  def sign(privateKey: CryptoKey, hashAlgorithm: String, crypto: ICryptoEngine): js.Promise[Unit] = js.native
  def sign(privateKey: CryptoKey, hashAlgorithm: Unit, crypto: ICryptoEngine): js.Promise[Unit] = js.native
  
  /* CompleteClass */
  var signature: BitString = js.native
  
  /* CompleteClass */
  var signatureAlgorithm: AlgorithmIdentifier = js.native
  
  /* CompleteClass */
  var tbsResponseData: ResponseData = js.native
  
  /**
    * Verify existing OCSP Basic Response
    * @param params Additional parameters
    * @param crypto Crypto engine
    */
  def verify(): js.Promise[Boolean] = js.native
  def verify(params: Unit, crypto: ICryptoEngine): js.Promise[Boolean] = js.native
  def verify(params: BasicOCSPResponseVerifyParams): js.Promise[Boolean] = js.native
  def verify(params: BasicOCSPResponseVerifyParams, crypto: ICryptoEngine): js.Promise[Boolean] = js.native
}
object BasicOCSPResponse {
  
  @JSImport("pkijs", "BasicOCSPResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "BasicOCSPResponse.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Compare values with default values for all class members
    * @param memberName String name for a class member
    * @param memberValue Value to compare with default value
    */
  /* static member */
  inline def compareWithDefault(memberName: String, memberValue: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareWithDefault")(memberName.asInstanceOf[js.Any], memberValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def defaultValues(memberName: /* "signature" */ String): BitString = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[BitString]
  
  /* static member */
  inline def defaultValues_AlgorithmIdentifier(memberName: /* "signatureAlgorithm" */ String): AlgorithmIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[AlgorithmIdentifier]
  
  /* static member */
  inline def defaultValues_Array(memberName: /* "certs" */ String): js.Array[Certificate] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[Certificate]]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_ResponseData(memberName: /* "tbsResponseData" */ String): ResponseData = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[ResponseData]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * BasicOCSPResponse ::= SEQUENCE {
    *    tbsResponseData      ResponseData,
    *    signatureAlgorithm   AlgorithmIdentifier,
    *    signature            BIT STRING,
    *    certs            [0] EXPLICIT SEQUENCE OF Certificate OPTIONAL }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[Certs]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
