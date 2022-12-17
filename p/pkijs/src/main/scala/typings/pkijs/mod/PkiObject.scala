package typings.pkijs.mod

import typings.pkijs.pkijsStrings.base64
import typings.pkijs.pkijsStrings.base64url
import typings.pkijs.pkijsStrings.hex
import typings.std.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("pkijs", "PkiObject")
@js.native
open class PkiObject () extends StObject {
  
  def className: String = js.native
  
  /**
    * Converts parsed ASN.1 object into current class
    * @param schema ASN.1 schema
    */
  def fromSchema(schema: SchemaType): Unit = js.native
  
  /**
    * Converts the class to JSON object
    * @returns JSON object
    */
  def toJSON(): Any = js.native
  
  /**
    * Converts current object to ASN.1 object and sets correct values
    * @param encodeFlag If param equal to `false` then creates schema via decoding stored value. In other case creates schema via assembling from cached parts
    * @returns ASN.1 object
    */
  def toSchema(): SchemaType = js.native
  def toSchema(encodeFlag: Boolean): SchemaType = js.native
  
  def toString(encoding: hex | base64 | base64url): String = js.native
}
object PkiObject {
  
  @JSImport("pkijs", "PkiObject")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Name of the class
    */
  /* static member */
  @JSImport("pkijs", "PkiObject.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Returns block name
    * @returns Returns string block name
    */
  /* static member */
  inline def blockName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("blockName")().asInstanceOf[String]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * Creates PKI object from the raw data
    * @param raw ASN.1 encoded raw data
    * @returns Initialized and filled current class object
    */
  /* static member */
  inline def fromBER[T /* <: PkiObject */](raw: BufferSource): T = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBER")(raw.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /**
    * Returns value of pre-defined ASN.1 schema for current class
    * @param parameters Input parameters for the schema
    * @returns ASN.1 schema object
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[js.Object]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
