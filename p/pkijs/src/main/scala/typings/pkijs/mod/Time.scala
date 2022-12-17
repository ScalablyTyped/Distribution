package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the Time structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  */
@JSImport("pkijs", "Time")
@js.native
/**
  * Initializes a new instance of the {@link Time} class
  * @param parameters Initialization parameters
  */
open class Time ()
  extends PkiObject
     with ITime {
  def this(parameters: TimeParameters) = this()
  
  /**
    * 0 - UTCTime; 1 - GeneralizedTime; 2 - empty value
    */
  /* CompleteClass */
  var `type`: TimeType = js.native
  
  /**
    * Value of the TIME class
    */
  /* CompleteClass */
  var value: js.Date = js.native
}
object Time {
  
  @JSImport("pkijs", "Time")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "Time.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "type" */ String): TimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[TimeType]
  
  /* static member */
  inline def defaultValues_Date(memberName: /* "value" */ String): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * Time ::= CHOICE {
    *   utcTime        UTCTime,
    *   generalTime    GeneralizedTime }
    * ```
    *
    * @param parameters Input parameters for the schema
    * @param optional Flag that current schema should be optional
    * @returns ASN.1 schema object
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: Unit, optional: Boolean): SchemaType = (^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[SchemaType]
  inline def schema(parameters: TimeSchema): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
  inline def schema(parameters: TimeSchema, optional: Boolean): SchemaType = (^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[SchemaType]
}
