package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the Extension structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  */
@JSImport("pkijs", "Extension")
@js.native
/**
  * Initializes a new instance of the {@link Extension} class
  * @param parameters Initialization parameters
  */
open class Extension ()
  extends PkiObject
     with IExtension {
  def this(parameters: ExtensionParameters) = this()
  
  /* private */ var _parsedValue: Any = js.native
  
  /* CompleteClass */
  var critical: Boolean = js.native
  
  /* CompleteClass */
  var extnID: String = js.native
  
  /* CompleteClass */
  var extnValue: OctetString = js.native
  
  @JSName("parsedValue")
  def parsedValue_MExtension: js.UndefOr[ExtensionParsedValue] = js.native
}
object Extension {
  
  @JSImport("pkijs", "Extension")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "Extension.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def defaultValues(memberName: /* "parsedValue" */ String): ExtensionParsedValue = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[ExtensionParsedValue]
  
  /* static member */
  inline def defaultValues_Boolean(memberName: /* "critical" */ String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def defaultValues_OctetString(memberName: /* "extnValue" */ String): OctetString = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[OctetString]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_String(memberName: /* "extnID" */ String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * Extension ::= SEQUENCE  {
    *    extnID      OBJECT IDENTIFIER,
    *    critical    BOOLEAN DEFAULT FALSE,
    *    extnValue   OCTET STRING
    * }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: ExtensionSchema): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
