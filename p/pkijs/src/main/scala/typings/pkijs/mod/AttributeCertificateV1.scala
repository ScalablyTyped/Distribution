package typings.pkijs.mod

import typings.asn1js.mod.BitString
import typings.pkijs.anon.Acinfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Class from X.509:1997
  */
@JSImport("pkijs", "AttributeCertificateV1")
@js.native
/**
  * Initializes a new instance of the {@link AttributeCertificateV1} class
  * @param parameters Initialization parameters
  */
open class AttributeCertificateV1 ()
  extends PkiObject
     with IAttributeCertificateV1
     with CertificateSetItem {
  def this(parameters: AttributeCertificateV1Parameters) = this()
  
  /**
    * Attribute certificate information
    */
  /* CompleteClass */
  var acinfo: AttributeCertificateInfoV1 = js.native
  
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
object AttributeCertificateV1 {
  
  @JSImport("pkijs", "AttributeCertificateV1")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "AttributeCertificateV1.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "acinfo" */ String): AttributeCertificateInfoV1 = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[AttributeCertificateInfoV1]
  
  /* static member */
  inline def defaultValues_AlgorithmIdentifier(memberName: /* "signatureAlgorithm" */ String): AlgorithmIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[AlgorithmIdentifier]
  
  /* static member */
  inline def defaultValues_BitString(memberName: /* "signatureValue" */ String): BitString = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[BitString]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * AttributeCertificate ::= SEQUENCE {
    *   acinfo               AttributeCertificateInfoV1,
    *   signatureAlgorithm   AlgorithmIdentifier,
    *   signatureValue       BIT STRING
    * }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[Acinfo]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
