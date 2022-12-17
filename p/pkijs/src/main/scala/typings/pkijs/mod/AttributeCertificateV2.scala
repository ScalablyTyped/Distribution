package typings.pkijs.mod

import typings.asn1js.mod.BitString
import typings.pkijs.anon.SignatureAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the AttributeCertificateV2 structure described in [RFC5755](https://datatracker.ietf.org/doc/html/rfc5755)
  */
@JSImport("pkijs", "AttributeCertificateV2")
@js.native
/**
  * Initializes a new instance of the {@link AttributeCertificateV2} class
  * @param parameters Initialization parameters
  */
open class AttributeCertificateV2 ()
  extends PkiObject
     with IAttributeCertificateV2
     with CertificateSetItem {
  def this(parameters: AttributeCertificateV2Parameters) = this()
  
  /**
    * Attribute certificate information
    */
  /* CompleteClass */
  var acinfo: AttributeCertificateInfoV2 = js.native
  
  /**
    * Signature algorithm
    */
  /* CompleteClass */
  var signatureAlgorithm: AlgorithmIdentifier = js.native
  
  /**
    * Signature value
    */
  /* CompleteClass */
  var signatureValue: BitString = js.native
}
object AttributeCertificateV2 {
  
  @JSImport("pkijs", "AttributeCertificateV2")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "AttributeCertificateV2.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def defaultValues(memberName: /* "signatureValue" */ String): BitString = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[BitString]
  
  /* static member */
  inline def defaultValues_AlgorithmIdentifier(memberName: /* "signatureAlgorithm" */ String): AlgorithmIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[AlgorithmIdentifier]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_AttributeCertificateInfoV2(memberName: /* "acinfo" */ String): AttributeCertificateInfoV2 = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[AttributeCertificateInfoV2]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * AttributeCertificate ::= SEQUENCE {
    *   acinfo               AttributeCertificateInfoV2,
    *   signatureAlgorithm   AlgorithmIdentifier,
    *   signatureValue       BIT STRING
    * }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[SignatureAlgorithm]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
