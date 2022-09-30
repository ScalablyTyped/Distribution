package typings.pkijs.mod

import typings.asn1js.mod.BitString
import typings.asn1js.mod.Enumerated
import typings.asn1js.mod.ObjectIdentifier
import typings.pkijs.anon.DigestAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the ObjectDigestInfo structure described in [RFC5755](https://datatracker.ietf.org/doc/html/rfc5755)
  */
@JSImport("pkijs", "ObjectDigestInfo")
@js.native
/**
  * Initializes a new instance of the {@link ObjectDigestInfo} class
  * @param parameters Initialization parameters
  */
open class ObjectDigestInfo ()
  extends PkiObject
     with IObjectDigestInfo {
  def this(parameters: ObjectDigestInfoParameters) = this()
  
  /* CompleteClass */
  var digestAlgorithm: AlgorithmIdentifier = js.native
  
  /* CompleteClass */
  var digestedObjectType: Enumerated = js.native
  
  /* CompleteClass */
  var objectDigest: BitString = js.native
}
object ObjectDigestInfo {
  
  @JSImport("pkijs", "ObjectDigestInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "ObjectDigestInfo.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def defaultValues(memberName: /* "objectDigest" */ String): BitString = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[BitString]
  
  /* static member */
  inline def defaultValues_AlgorithmIdentifier(memberName: /* "digestAlgorithm" */ String): AlgorithmIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[AlgorithmIdentifier]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_Enumerated(memberName: /* "digestedObjectType" */ String): Enumerated = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Enumerated]
  
  /* static member */
  inline def defaultValues_ObjectIdentifier(memberName: /* "otherObjectTypeID" */ String): ObjectIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[ObjectIdentifier]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * ObjectDigestInfo ::= SEQUENCE {
    *   digestedObjectType  ENUMERATED {
    *     publicKey            (0),
    *     publicKeyCert        (1),
    *     otherObjectTypes     (2) },
    *   -- otherObjectTypes MUST NOT
    *   -- be used in this profile
    *   otherObjectTypeID   OBJECT IDENTIFIER OPTIONAL,
    *   digestAlgorithm     AlgorithmIdentifier,
    *   objectDigest        BIT STRING
    * }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[DigestAlgorithm]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
