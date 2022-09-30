package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the SignedAndUnsignedAttributes structure described in [RFC5652](https://datatracker.ietf.org/doc/html/rfc5652)
  */
@JSImport("pkijs", "SignedAndUnsignedAttributes")
@js.native
/**
  * Initializes a new instance of the {@link SignedAndUnsignedAttributes} class
  * @param parameters Initialization parameters
  */
open class SignedAndUnsignedAttributes ()
  extends PkiObject
     with ISignedAndUnsignedAttributes {
  def this(parameters: SignedAndUnsignedAttributesParameters) = this()
  
  /* CompleteClass */
  var attributes: js.Array[Attribute] = js.native
  
  /**
    * Need to have it in order to successfully process with signature verification
    */
  /* CompleteClass */
  var encodedValue: js.typedarray.ArrayBuffer = js.native
  
  /* CompleteClass */
  var `type`: Double = js.native
}
object SignedAndUnsignedAttributes {
  
  @JSImport("pkijs", "SignedAndUnsignedAttributes")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "SignedAndUnsignedAttributes.CLASS_NAME")
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
  inline def defaultValues(memberName: /* "type" */ String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def defaultValues_Array(memberName: /* "attributes" */ String): js.Array[Attribute] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[Attribute]]
  
  /* static member */
  inline def defaultValues_ArrayBuffer(memberName: /* "encodedValue" */ String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * SignedAttributes ::= SET SIZE (1..MAX) OF Attribute
    *
    * UnsignedAttributes ::= SET SIZE (1..MAX) OF Attribute
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SignedAndUnsignedAttributesSchema): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
