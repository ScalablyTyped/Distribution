package typings.pkijs.mod

import typings.pkijs.anon.CA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the BasicConstraints structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  */
@JSImport("pkijs", "BasicConstraints")
@js.native
/**
  * Initializes a new instance of the {@link AuthorityKeyIdentifier} class
  * @param parameters Initialization parameters
  */
open class BasicConstraints ()
  extends PkiObject
     with IBasicConstraints {
  def this(parameters: BasicConstraintsParameters) = this()
  
  /* CompleteClass */
  var cA: Boolean = js.native
}
object BasicConstraints {
  
  @JSImport("pkijs", "BasicConstraints")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "BasicConstraints.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "cA" */ String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * BasicConstraints ::= SEQUENCE {
    *    cA                      BOOLEAN DEFAULT FALSE,
    *    pathLenConstraint       INTEGER (0..MAX) OPTIONAL }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[CA]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
