package typings.pkijs.mod

import typings.pkijs.anon.InhibitPolicyMapping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the PolicyConstraints structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  */
@JSImport("pkijs", "PolicyConstraints")
@js.native
/**
  * Initializes a new instance of the {@link PolicyConstraints} class
  * @param parameters Initialization parameters
  */
open class PolicyConstraints ()
  extends PkiObject
     with IPolicyConstraints {
  def this(parameters: PolicyConstraintsParameters) = this()
}
object PolicyConstraints {
  
  @JSImport("pkijs", "PolicyConstraints")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "PolicyConstraints.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "requireExplicitPolicy" */ String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * PolicyConstraints ::= SEQUENCE {
    *    requireExplicitPolicy           [0] SkipCerts OPTIONAL,
    *    inhibitPolicyMapping            [1] SkipCerts OPTIONAL }
    *
    * SkipCerts ::= INTEGER (0..MAX)
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[InhibitPolicyMapping]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
