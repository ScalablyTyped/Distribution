package typings.pkijs.mod

import typings.asn1js.mod.Sequence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the Attribute structure described in [RFC2986](https://datatracker.ietf.org/doc/html/rfc2986)
  */
@JSImport("pkijs", "Attribute")
@js.native
/**
  * Initializes a new instance of the {@link Attribute} class
  * @param parameters Initialization parameters
  */
open class Attribute ()
  extends PkiObject
     with IAttribute {
  def this(parameters: AttributeParameters) = this()
  
  /**
    * Specifies type of attribute value
    */
  /* CompleteClass */
  var `type`: String = js.native
  
  /**
    * List of attribute values
    */
  /* CompleteClass */
  var values: js.Array[Any] = js.native
}
object Attribute {
  
  @JSImport("pkijs", "Attribute")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "Attribute.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Compares values with default values for all class members
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
  inline def defaultValues(memberName: /* "type" */ String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  inline def defaultValues_Array(memberName: /* "values" */ String): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * Attribute { ATTRIBUTE:IOSet } ::= SEQUENCE {
    *    type   ATTRIBUTE.&id({IOSet}),
    *    values SET SIZE(1..MAX) OF ATTRIBUTE.&Type({IOSet}{@type})
    * }
    *```
    */
  /* static member */
  inline def schema(): Sequence = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[Sequence]
  inline def schema(parameters: AttributeSchema): Sequence = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[Sequence]
}
