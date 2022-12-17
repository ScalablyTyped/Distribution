package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the GeneralNames structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  */
@JSImport("pkijs", "GeneralNames")
@js.native
/**
  * Initializes a new instance of the {@link GeneralNames} class
  * @param parameters Initialization parameters
  */
open class GeneralNames ()
  extends PkiObject
     with IGeneralNames {
  def this(parameters: GeneralNamesParameters) = this()
  
  /* CompleteClass */
  var names: js.Array[GeneralName] = js.native
}
object GeneralNames {
  
  @JSImport("pkijs", "GeneralNames")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "GeneralNames.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "names" */ String): js.Array[GeneralName] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[GeneralName]]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * GeneralNames ::= SEQUENCE SIZE (1..MAX) OF GeneralName
    * ```
    *
    * @param parameters Input parameters for the schema
    * @param optional Flag would be element optional or not
    * @returns ASN.1 schema object
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: Unit, optional: Boolean): SchemaType = (^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[SchemaType]
  inline def schema(parameters: GeneralNamesSchema): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
  inline def schema(parameters: GeneralNamesSchema, optional: Boolean): SchemaType = (^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[SchemaType]
}
