package typings.pkijs.mod

import typings.asn1js.mod.Integer
import typings.pkijs.anon.Base
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the GeneralSubtree structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  */
@JSImport("pkijs", "GeneralSubtree")
@js.native
/**
  * Initializes a new instance of the {@link GeneralSubtree} class
  * @param parameters Initialization parameters
  */
open class GeneralSubtree ()
  extends PkiObject
     with IGeneralSubtree {
  def this(parameters: GeneralSubtreeParameters) = this()
  
  /* CompleteClass */
  var base: GeneralName = js.native
  
  /* CompleteClass */
  var minimum: Double | Integer = js.native
}
object GeneralSubtree {
  
  @JSImport("pkijs", "GeneralSubtree")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "GeneralSubtree.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def defaultValues(memberName: /* "minimum" */ String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_GeneralName(memberName: /* "base" */ String): GeneralName = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[GeneralName]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * GeneralSubtree ::= SEQUENCE {
    *    base                    GeneralName,
    *    minimum         [0]     BaseDistance DEFAULT 0,
    *    maximum         [1]     BaseDistance OPTIONAL }
    *
    * BaseDistance ::= INTEGER (0..MAX)
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[Base]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
