package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the ContentInfo structure described in [RFC5652](https://datatracker.ietf.org/doc/html/rfc5652)
  */
@JSImport("pkijs", "ContentInfo")
@js.native
/**
  * Initializes a new instance of the {@link ContentInfo} class
  * @param parameters Initialization parameters
  */
open class ContentInfo ()
  extends PkiObject
     with IContentInfo
     with _SafeContent {
  def this(parameters: ContentInfoParameters) = this()
  
  /* CompleteClass */
  var content: Any = js.native
  
  /* CompleteClass */
  var contentType: String = js.native
}
object ContentInfo {
  
  @JSImport("pkijs", "ContentInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "ContentInfo.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("pkijs", "ContentInfo.DATA")
  @js.native
  val DATA: /* "1.2.840.113549.1.7.1" */ String = js.native
  
  /* static member */
  @JSImport("pkijs", "ContentInfo.ENCRYPTED_DATA")
  @js.native
  val ENCRYPTED_DATA: /* "1.2.840.113549.1.7.6" */ String = js.native
  
  /* static member */
  @JSImport("pkijs", "ContentInfo.ENVELOPED_DATA")
  @js.native
  val ENVELOPED_DATA: /* "1.2.840.113549.1.7.3" */ String = js.native
  
  /* static member */
  @JSImport("pkijs", "ContentInfo.SIGNED_DATA")
  @js.native
  val SIGNED_DATA: /* "1.2.840.113549.1.7.2" */ String = js.native
  
  /**
    * Compare values with default values for all class members
    * @param memberName String name for a class member
    * @param memberValue Value to compare with default value
    */
  /* static member */
  inline def compareWithDefault[T](memberName: String, memberValue: T): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareWithDefault")(memberName.asInstanceOf[js.Any], memberValue.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
  
  /* static member */
  inline def defaultValues(memberName: /* "content" */ String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_String(memberName: /* "contentType" */ String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * ContentInfo ::= SEQUENCE {
    *    contentType ContentType,
    *    content [0] EXPLICIT ANY DEFINED BY contentType }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: ContentInfoSchema): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
