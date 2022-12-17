package typings.pkijs.mod

import typings.asn1js.mod.BitString
import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the AttributeCertificateInfoV1 structure described in [RFC5755](https://datatracker.ietf.org/doc/html/rfc5755)
  */
@JSImport("pkijs", "AttributeCertificateInfoV1")
@js.native
/**
  * Initializes a new instance of the {@link AttributeCertificateInfoV1} class
  * @param parameters Initialization parameters
  */
open class AttributeCertificateInfoV1 ()
  extends PkiObject
     with IAttributeCertificateInfoV1 {
  def this(parameters: AttributeCertificateInfoV1Parameters) = this()
  
  /**
    * Specifies the period for which the AC issuer certifies that the binding between
    * the holder and the attributes fields will be valid
    */
  /* CompleteClass */
  var attrCertValidityPeriod: AttCertValidityPeriod = js.native
  
  /**
    * The attributes field gives information about the AC holder
    */
  /* CompleteClass */
  var attributes: js.Array[Attribute] = js.native
  
  /* CompleteClass */
  var issuer: GeneralNames = js.native
  
  /* CompleteClass */
  var serialNumber: Integer = js.native
  
  /**
    * Contains the algorithm identifier used to validate the AC signature
    */
  /* CompleteClass */
  var signature: AlgorithmIdentifier = js.native
  
  /**
    * The version field MUST have the value of v2
    */
  /* CompleteClass */
  var version: Double = js.native
}
object AttributeCertificateInfoV1 {
  
  @JSImport("pkijs", "AttributeCertificateInfoV1")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "AttributeCertificateInfoV1.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def defaultValues(memberName: /* "serialNumber" */ String): Integer = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Integer]
  
  /* static member */
  inline def defaultValues_AlgorithmIdentifier(memberName: /* "signature" */ String): AlgorithmIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[AlgorithmIdentifier]
  
  /* static member */
  inline def defaultValues_Array(memberName: /* "attributes" */ String): js.Array[Attribute] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[Attribute]]
  
  /* static member */
  inline def defaultValues_AttCertValidityPeriod(memberName: /* "attrCertValidityPeriod" */ String): AttCertValidityPeriod = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[AttCertValidityPeriod]
  
  /* static member */
  inline def defaultValues_BitString(memberName: /* "issuerUniqueID" */ String): BitString = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[BitString]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_Double(memberName: /* "version" */ String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def defaultValues_Extensions(memberName: /* "extensions" */ String): Extensions = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Extensions]
  
  /* static member */
  inline def defaultValues_GeneralNames(memberName: /* "subjectName" */ String): GeneralNames = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[GeneralNames]
  
  /* static member */
  inline def defaultValues_IssuerSerial(memberName: /* "baseCertificateID" */ String): IssuerSerial = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[IssuerSerial]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * AttributeCertificateInfo ::= SEQUENCE {
    *   version Version DEFAULT v1,
    *   subject CHOICE {
    *     baseCertificateID [0] IssuerSerial, -- associated with a Public Key Certificate
    *     subjectName [1] GeneralNames }, -- associated with a name
    *   issuer GeneralNames, -- CA issuing the attribute certificate
    *   signature AlgorithmIdentifier,
    *   serialNumber CertificateSerialNumber,
    *   attrCertValidityPeriod AttCertValidityPeriod,
    *   attributes SEQUENCE OF Attribute,
    *   issuerUniqueID UniqueIdentifier OPTIONAL,
    *   extensions Extensions OPTIONAL
    * }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: AttributeCertificateInfoV1Schema): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
