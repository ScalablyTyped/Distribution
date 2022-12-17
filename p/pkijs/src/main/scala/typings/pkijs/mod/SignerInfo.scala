package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import typings.pkijs.anon.Sid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the SignerInfo structure described in [RFC5652](https://datatracker.ietf.org/doc/html/rfc5652)
  */
@JSImport("pkijs", "SignerInfo")
@js.native
/**
  * Initializes a new instance of the {@link SignerInfo} class
  * @param parameters Initialization parameters
  */
open class SignerInfo ()
  extends PkiObject
     with ISignerInfo {
  def this(parameters: SignerInfoParameters) = this()
  
  /* CompleteClass */
  var digestAlgorithm: AlgorithmIdentifier = js.native
  
  /* CompleteClass */
  var sid: SchemaType = js.native
  
  /* CompleteClass */
  var signature: OctetString = js.native
  
  /* CompleteClass */
  var signatureAlgorithm: AlgorithmIdentifier = js.native
  
  /* CompleteClass */
  var version: Double = js.native
}
object SignerInfo {
  
  @JSImport("pkijs", "SignerInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "SignerInfo.CLASS_NAME")
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
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "version" */ String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def defaultValues_AlgorithmIdentifier(memberName: /* "digestAlgorithm" */ String): AlgorithmIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[AlgorithmIdentifier]
  
  /* static member */
  inline def defaultValues_OctetString(memberName: /* "signature" */ String): OctetString = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[OctetString]
  
  /* static member */
  inline def defaultValues_SchemaType(memberName: /* "sid" */ String): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
  
  /* static member */
  inline def defaultValues_SignedAndUnsignedAttributes(memberName: /* "signedAttrs" */ String): SignedAndUnsignedAttributes = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[SignedAndUnsignedAttributes]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * SignerInfo ::= SEQUENCE {
    *    version CMSVersion,
    *    sid SignerIdentifier,
    *    digestAlgorithm DigestAlgorithmIdentifier,
    *    signedAttrs [0] IMPLICIT SignedAttributes OPTIONAL,
    *    signatureAlgorithm SignatureAlgorithmIdentifier,
    *    signature SignatureValue,
    *    unsignedAttrs [1] IMPLICIT UnsignedAttributes OPTIONAL }
    *
    * SignerIdentifier ::= CHOICE {
    *    issuerAndSerialNumber IssuerAndSerialNumber,
    *    subjectKeyIdentifier [0] SubjectKeyIdentifier }
    *
    * SubjectKeyIdentifier ::= OCTET STRING
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[Sid]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
