package typings.pkijs.mod

import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the OtherPrimeInfo structure described in [RFC3447](https://datatracker.ietf.org/doc/html/rfc3447)
  */
@JSImport("pkijs", "OtherPrimeInfo")
@js.native
/**
  * Initializes a new instance of the {@link OtherPrimeInfo} class
  * @param parameters Initialization parameters
  */
open class OtherPrimeInfo ()
  extends PkiObject
     with IOtherPrimeInfo {
  def this(parameters: OtherPrimeInfoParameters) = this()
  
  /* CompleteClass */
  var coefficient: Integer = js.native
  
  /* CompleteClass */
  var exponent: Integer = js.native
  
  /**
    * Converts JSON value into current object
    * @param json JSON object
    */
  def fromJSON(json: OtherPrimeInfoJson): Unit = js.native
  
  /* CompleteClass */
  var prime: Integer = js.native
}
object OtherPrimeInfo {
  
  @JSImport("pkijs", "OtherPrimeInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "OtherPrimeInfo.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "prime" */ /* "exponent" */ /* "coefficient" */ String): Integer = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Integer]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * OtherPrimeInfo ::= Sequence {
    *    prime             Integer,  -- ri
    *    exponent          Integer,  -- di
    *    coefficient       Integer   -- ti
    * }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: OtherPrimeInfoSchema): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
