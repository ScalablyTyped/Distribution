package typings.pkijs.mod

import typings.pkijs.anon.AltNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the AltName structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  */
@JSImport("pkijs", "AltName")
@js.native
/**
  * Initializes a new instance of the {@link AltName} class
  * @param parameters Initialization parameters
  */
open class AltName ()
  extends PkiObject
     with IAltName {
  def this(parameters: AltNameParameters) = this()
  
  /**
    * Array of alternative names in GeneralName type
    */
  /* CompleteClass */
  var altNames: js.Array[GeneralName] = js.native
}
object AltName {
  
  @JSImport("pkijs", "AltName")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "AltName.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "altNames" */ String): js.Array[GeneralName] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[GeneralName]]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * AltName ::= GeneralNames
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[AltNames]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
