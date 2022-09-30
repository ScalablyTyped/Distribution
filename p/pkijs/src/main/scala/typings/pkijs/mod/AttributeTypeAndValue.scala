package typings.pkijs.mod

import typings.pkijs.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the AttributeTypeAndValue structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  */
@JSImport("pkijs", "AttributeTypeAndValue")
@js.native
/**
  * Initializes a new instance of the {@link AttributeTypeAndValue} class
  * @param parameters Initialization parameters
  */
open class AttributeTypeAndValue ()
  extends PkiObject
     with IAttributeTypeAndValue {
  def this(parameters: AttributeTypeAndValueParameters) = this()
  
  def isEqual(compareTo: js.typedarray.ArrayBuffer): Boolean = js.native
  /**
    * Compares two AttributeTypeAndValue values, or AttributeTypeAndValue with ArrayBuffer value
    * @param compareTo The value compare to current
    */
  def isEqual(compareTo: AttributeTypeAndValue): Boolean = js.native
  
  /* CompleteClass */
  var `type`: String = js.native
  
  /* CompleteClass */
  var value: AttributeValueType = js.native
}
object AttributeTypeAndValue {
  
  @JSImport("pkijs", "AttributeTypeAndValue")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "AttributeTypeAndValue.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "type" */ String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  inline def defaultValues_AttributeValueType(memberName: /* "value" */ String): AttributeValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[AttributeValueType]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * AttributeTypeAndValue ::= Sequence {
    *    type     AttributeType,
    *    value    AttributeValue }
    *
    * AttributeType ::= OBJECT IDENTIFIER
    *
    * AttributeValue ::= ANY -- DEFINED BY AttributeType
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[Type]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
