package typings.pkijs.mod

import typings.pkijs.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the SubjectDirectoryAttributes structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  */
@JSImport("pkijs", "SubjectDirectoryAttributes")
@js.native
/**
  * Initializes a new instance of the {@link SubjectDirectoryAttributes} class
  * @param parameters Initialization parameters
  */
open class SubjectDirectoryAttributes ()
  extends PkiObject
     with ISubjectDirectoryAttributes {
  def this(parameters: SubjectDirectoryAttributesParameters) = this()
  
  /* CompleteClass */
  var attributes: js.Array[Attribute] = js.native
}
object SubjectDirectoryAttributes {
  
  @JSImport("pkijs", "SubjectDirectoryAttributes")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "SubjectDirectoryAttributes.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "attributes" */ String): js.Array[Attribute] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[Attribute]]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * SubjectDirectoryAttributes ::= SEQUENCE SIZE (1..MAX) OF Attribute
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[`1`]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
