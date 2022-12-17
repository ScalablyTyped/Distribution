package typings.pkijs.mod

import typings.pkijs.anon.AccessDescriptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the InfoAccess structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  */
@JSImport("pkijs", "InfoAccess")
@js.native
/**
  * Initializes a new instance of the {@link InfoAccess} class
  * @param parameters Initialization parameters
  */
open class InfoAccess ()
  extends PkiObject
     with IInfoAccess {
  def this(parameters: InfoAccessParameters) = this()
  
  /* CompleteClass */
  var accessDescriptions: js.Array[AccessDescription] = js.native
}
object InfoAccess {
  
  @JSImport("pkijs", "InfoAccess")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "InfoAccess.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "accessDescriptions" */ String): js.Array[AccessDescription] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[AccessDescription]]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * AuthorityInfoAccessSyntax  ::=
    * SEQUENCE SIZE (1..MAX) OF AccessDescription
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[AccessDescriptions]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
