package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the RelativeDistinguishedNames structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  */
@JSImport("pkijs", "RelativeDistinguishedNames")
@js.native
/**
  * Initializes a new instance of the {@link RelativeDistinguishedNames} class
  * @param parameters Initialization parameters
  */
open class RelativeDistinguishedNames ()
  extends PkiObject
     with IRelativeDistinguishedNames {
  def this(parameters: RelativeDistinguishedNamesParameters) = this()
  
  /**
    * Compares two RDN values, or RDN with ArrayBuffer value
    * @param compareTo The value compare to current
    */
  def isEqual(compareTo: Any): Boolean = js.native
  
  /**
    * Array of "type and value" objects
    */
  /* CompleteClass */
  var typesAndValues: js.Array[AttributeTypeAndValue] = js.native
  
  /**
    * Value of the RDN before decoding from schema
    */
  /* CompleteClass */
  var valueBeforeDecode: js.typedarray.ArrayBuffer = js.native
}
object RelativeDistinguishedNames {
  
  @JSImport("pkijs", "RelativeDistinguishedNames")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "RelativeDistinguishedNames.CLASS_NAME")
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
  inline def defaultValues(memberName: /* "typesAndValues" */ String): js.Array[AttributeTypeAndValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[AttributeTypeAndValue]]
  
  /* static member */
  inline def defaultValues_ArrayBuffer(memberName: /* "valueBeforeDecode" */ String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * RDNSequence ::= Sequence OF RelativeDistinguishedName
    *
    * RelativeDistinguishedName ::=
    * SET SIZE (1..MAX) OF AttributeTypeAndValue
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: RelativeDistinguishedNamesSchema): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
