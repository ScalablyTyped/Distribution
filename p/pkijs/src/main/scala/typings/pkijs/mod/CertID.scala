package typings.pkijs.mod

import typings.asn1js.mod.Integer
import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an CertID described in [RFC6960](https://datatracker.ietf.org/doc/html/rfc6960)
  */
@JSImport("pkijs", "CertID")
@js.native
/**
  * Initializes a new instance of the {@link CertID} class
  * @param parameters Initialization parameters
  */
open class CertID ()
  extends PkiObject
     with ICertID {
  def this(parameters: CertIDParameters) = this()
  
  /**
    * Making OCSP certificate identifier for specific certificate
    * @param certificate Certificate making OCSP Request for
    * @param parameters Additional parameters
    * @param crypto Crypto engine
    */
  def createForCertificate(certificate: Certificate, parameters: CertIDCreateParams): js.Promise[Unit] = js.native
  def createForCertificate(certificate: Certificate, parameters: CertIDCreateParams, crypto: ICryptoEngine): js.Promise[Unit] = js.native
  
  /**
    * Hash algorithm used to generate the `issuerNameHash` and `issuerKeyHash` values
    */
  /* CompleteClass */
  var hashAlgorithm: AlgorithmIdentifier = js.native
  
  /**
    * Checks that two "CertIDs" are equal
    * @param certificateID Identifier of the certificate to be checked
    */
  def isEqual(certificateID: CertID): Boolean = js.native
  
  /**
    * Hash of the issuer's public key. The hash shall be calculated over the value (excluding tag and length)
    * of the subject public key field in the issuer's certificate.
    */
  /* CompleteClass */
  var issuerKeyHash: OctetString = js.native
  
  /**
    * Hash of the issuer's distinguished name (DN). The hash shall be calculated over the DER encoding
    * of the issuer's name field in the certificate being checked.
    */
  /* CompleteClass */
  var issuerNameHash: OctetString = js.native
  
  /**
    * Serial number of the certificate for which status is being requested
    */
  /* CompleteClass */
  var serialNumber: Integer = js.native
}
object CertID {
  
  @JSImport("pkijs", "CertID")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "CertID.CLASS_NAME")
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
  
  /**
    * Making OCSP certificate identifier for specific certificate
    * @param certificate Certificate making OCSP Request for
    * @param parameters Additional parameters
    * @param crypto Crypto engine
    * @returns Returns created CertID object
    */
  /* static member */
  inline def create(certificate: Certificate, parameters: CertIDCreateParams): js.Promise[CertID] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(certificate.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CertID]]
  inline def create(certificate: Certificate, parameters: CertIDCreateParams, crypto: ICryptoEngine): js.Promise[CertID] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(certificate.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], crypto.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CertID]]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "hashAlgorithm" */ String): AlgorithmIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[AlgorithmIdentifier]
  
  /* static member */
  inline def defaultValues_Integer(memberName: /* "serialNumber" */ String): Integer = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Integer]
  
  /* static member */
  inline def defaultValues_OctetString(memberName: /* "issuerNameHash" */ String): OctetString = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[OctetString]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * CertID ::= SEQUENCE {
    *    hashAlgorithm       AlgorithmIdentifier,
    *    issuerNameHash      OCTET STRING, -- Hash of issuer's DN
    *    issuerKeyHash       OCTET STRING, -- Hash of issuer's public key
    *    serialNumber        CertificateSerialNumber }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: CertIDSchema): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
