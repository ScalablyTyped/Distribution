package typings.pkijs.mod

import typings.std.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the PrivateKeyInfo structure described in [RFC5480](https://datatracker.ietf.org/doc/html/rfc5480)
  */
@JSImport("pkijs", "ECPublicKey")
@js.native
/**
  * Initializes a new instance of the {@link ECPublicKey} class
  * @param parameters Initialization parameters
  */
open class ECPublicKey ()
  extends PkiObject
     with IECPublicKey {
  def this(parameters: ECPublicKeyParameters) = this()
  
  /**
    * Converts JSON value into current object
    * @param json JSON object
    */
  def fromJSON(json: Any): Unit = js.native
  
  def fromSchema(schema1: BufferSource): Any = js.native
  
  /* CompleteClass */
  var namedCurve: String = js.native
  
  /* CompleteClass */
  var x: js.typedarray.ArrayBuffer = js.native
  
  /* CompleteClass */
  var y: js.typedarray.ArrayBuffer = js.native
}
object ECPublicKey {
  
  @JSImport("pkijs", "ECPublicKey")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "ECPublicKey.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Compare values with default values for all class members
    * @param memberName String name for a class member
    * @param memberValue Value to compare with default value
    */
  /* static member */
  inline def compareWithDefault[T](memberName: String, memberValue: T): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareWithDefault")(memberName.asInstanceOf[js.Any], memberValue.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "namedCurve" */ String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  inline def defaultValues_ArrayBuffer(memberName: /* "x" */ /* "y" */ String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  
  /**
    * Returns value of pre-defined ASN.1 schema for current class
    * @param parameters Input parameters for the schema
    * @returns ASN.1 schema object
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
}
