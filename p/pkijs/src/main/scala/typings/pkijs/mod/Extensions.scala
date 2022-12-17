package typings.pkijs.mod

import typings.asn1js.mod.Sequence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the Extensions structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  */
@JSImport("pkijs", "Extensions")
@js.native
/**
  * Initializes a new instance of the {@link Extensions} class
  * @param parameters Initialization parameters
  */
open class Extensions ()
  extends PkiObject
     with IExtensions {
  def this(parameters: ExtensionsParameters) = this()
  
  /**
    * List of extensions
    */
  /* CompleteClass */
  var extensions: js.Array[Extension] = js.native
}
object Extensions {
  
  @JSImport("pkijs", "Extensions")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "Extensions.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "extensions" */ String): js.Array[Extension] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[Extension]]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * Extensions ::= SEQUENCE SIZE (1..MAX) OF Extension
    * ```
    *
    * @param parameters Input parameters for the schema
    * @param optional Flag that current schema should be optional
    * @returns ASN.1 schema object
    */
  /* static member */
  inline def schema(): Sequence = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[Sequence]
  inline def schema(parameters: Unit, optional: Boolean): Sequence = (^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Sequence]
  inline def schema(parameters: ExtensionsSchema): Sequence = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[Sequence]
  inline def schema(parameters: ExtensionsSchema, optional: Boolean): Sequence = (^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Sequence]
}
