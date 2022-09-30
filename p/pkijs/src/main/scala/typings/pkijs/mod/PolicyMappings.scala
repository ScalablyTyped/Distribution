package typings.pkijs.mod

import typings.pkijs.anon.Mappings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the PolicyMappings structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  */
@JSImport("pkijs", "PolicyMappings")
@js.native
/**
  * Initializes a new instance of the {@link PolicyMappings} class
  * @param parameters Initialization parameters
  */
open class PolicyMappings ()
  extends PkiObject
     with IPolicyMappings {
  def this(parameters: PolicyMappingsParameters) = this()
  
  /* CompleteClass */
  var mappings: js.Array[PolicyMapping] = js.native
}
object PolicyMappings {
  
  @JSImport("pkijs", "PolicyMappings")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "PolicyMappings.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: String): js.Array[PolicyMapping] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[PolicyMapping]]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * PolicyMappings ::= SEQUENCE SIZE (1..MAX) OF PolicyMapping
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[Mappings]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
