package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the EncryptedContentInfo structure described in [RFC5652](https://datatracker.ietf.org/doc/html/rfc5652)
  */
@JSImport("pkijs", "EncryptedContentInfo")
@js.native
/**
  * Initializes a new instance of the {@link EncryptedContent} class
  * @param parameters Initialization parameters
  */
open class EncryptedContentInfo ()
  extends PkiObject
     with IEncryptedContentInfo {
  def this(parameters: EncryptedContentParameters) = this()
  
  /* CompleteClass */
  var contentEncryptionAlgorithm: AlgorithmIdentifier = js.native
  
  /* CompleteClass */
  var contentType: String = js.native
  
  /**
    * Returns concatenated buffer from `encryptedContent` field.
    * @returns Array buffer
    * @since 3.0.0
    * @throws Throws Error if `encryptedContent` is undefined
    */
  def getEncryptedContent(): js.typedarray.ArrayBuffer = js.native
}
object EncryptedContentInfo {
  
  @JSImport("pkijs", "EncryptedContentInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "EncryptedContentInfo.CLASS_NAME")
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
  inline def defaultValues(memberName: /* "contentType" */ String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  inline def defaultValues_AlgorithmIdentifier(memberName: /* "contentEncryptionAlgorithm" */ String): AlgorithmIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[AlgorithmIdentifier]
  
  /* static member */
  inline def defaultValues_OctetString(memberName: /* "encryptedContent" */ String): OctetString = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[OctetString]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * EncryptedContentInfo ::= SEQUENCE {
    *    contentType ContentType,
    *    contentEncryptionAlgorithm ContentEncryptionAlgorithmIdentifier,
    *    encryptedContent [0] IMPLICIT EncryptedContent OPTIONAL }
    *
    * Comment: Strange, but modern crypto engines create ENCRYPTED_CONTENT as "[0] EXPLICIT EncryptedContent"
    *
    * EncryptedContent ::= OCTET STRING
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: EncryptedContentInfoSchema): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
