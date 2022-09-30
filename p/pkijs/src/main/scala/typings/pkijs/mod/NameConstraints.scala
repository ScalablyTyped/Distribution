package typings.pkijs.mod

import typings.pkijs.anon.ExcludedSubtrees
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the NameConstraints structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  */
@JSImport("pkijs", "NameConstraints")
@js.native
/**
  * Initializes a new instance of the {@link NameConstraints} class
  * @param parameters Initialization parameters
  */
open class NameConstraints ()
  extends PkiObject
     with INameConstraints {
  def this(parameters: NameConstraintsParameters) = this()
}
object NameConstraints {
  
  @JSImport("pkijs", "NameConstraints")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "NameConstraints.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "permittedSubtrees" */ String): js.Array[GeneralSubtree] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[GeneralSubtree]]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * NameConstraints ::= SEQUENCE {
    *    permittedSubtrees       [0]     GeneralSubtrees OPTIONAL,
    *    excludedSubtrees        [1]     GeneralSubtrees OPTIONAL }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[ExcludedSubtrees]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
