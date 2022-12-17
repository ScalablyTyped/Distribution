package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Class from RFC6960
  */
@JSImport("pkijs", "ResponseBytes")
@js.native
/**
  * Initializes a new instance of the {@link Request} class
  * @param parameters Initialization parameters
  */
open class ResponseBytes ()
  extends PkiObject
     with IResponseBytes {
  def this(parameters: ResponseBytesParameters) = this()
  
  /* CompleteClass */
  var response: OctetString = js.native
  
  /* CompleteClass */
  var responseType: String = js.native
}
object ResponseBytes {
  
  @JSImport("pkijs", "ResponseBytes")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "ResponseBytes.CLASS_NAME")
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
  inline def defaultValues(memberName: /* "responseType" */ String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  inline def defaultValues_OctetString(memberName: /* "response" */ String): OctetString = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[OctetString]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * ResponseBytes ::= SEQUENCE {
    *    responseType   OBJECT IDENTIFIER,
    *    response       OCTET STRING }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: ResponseBytesSchema): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
