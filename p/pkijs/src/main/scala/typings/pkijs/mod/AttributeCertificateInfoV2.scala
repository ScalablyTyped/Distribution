package typings.pkijs.mod

import typings.asn1js.mod.BitString
import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the AttributeCertificateInfoV2 structure described in [RFC5755](https://datatracker.ietf.org/doc/html/rfc5755)
  */
@JSImport("pkijs", "AttributeCertificateInfoV2")
@js.native
/**
  * Initializes a new instance of the {@link AttributeCertificateInfoV2} class
  * @param parameters Initialization parameters
  */
open class AttributeCertificateInfoV2 ()
  extends PkiObject
     with IAttributeCertificateInfoV2 {
  def this(parameters: AttributeCertificateInfoV2Parameters) = this()
  
  /* CompleteClass */
  var attrCertValidityPeriod: AttCertValidityPeriod = js.native
  
  /* CompleteClass */
  var attributes: js.Array[Attribute] = js.native
  
  /* CompleteClass */
  var holder: Holder = js.native
  
  /* CompleteClass */
  var issuer: GeneralNames | V2Form = js.native
  
  /* CompleteClass */
  var serialNumber: Integer = js.native
  
  /* CompleteClass */
  var signature: AlgorithmIdentifier = js.native
  
  /* CompleteClass */
  var version: Double = js.native
}
object AttributeCertificateInfoV2 {
  
  @JSImport("pkijs", "AttributeCertificateInfoV2")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "AttributeCertificateInfoV2.CLASS_NAME")
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
  inline def defaultValues_Holder(memberName: /* "holder" */ String): Holder = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Holder]
  
  /* static member */
  inline def defaultValues_Union(memberName: /* "issuer" */ String): GeneralNames | V2Form = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[GeneralNames | V2Form]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * AttributeCertificateInfoV2 ::= SEQUENCE {
    *   version                 AttCertVersion, -- version is v2
    *   holder                  Holder,
    *   issuer                  AttCertIssuer,
    *   signature               AlgorithmIdentifier,
    *   serialNumber            CertificateSerialNumber,
    *   attrCertValidityPeriod  AttCertValidityPeriod,
    *   attributes              SEQUENCE OF Attribute,
    *   issuerUniqueID          UniqueIdentifier OPTIONAL,
    *   extensions              Extensions OPTIONAL
    * }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: AttributeCertificateInfoV2Schema): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
