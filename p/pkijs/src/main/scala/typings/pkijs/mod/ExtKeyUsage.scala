package typings.pkijs.mod

import typings.pkijs.anon.KeyPurposes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the ExtKeyUsage structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  */
@JSImport("pkijs", "ExtKeyUsage")
@js.native
/**
  * Initializes a new instance of the {@link ExtKeyUsage} class
  * @param parameters Initialization parameters
  */
open class ExtKeyUsage ()
  extends PkiObject
     with IExtKeyUsage {
  def this(parameters: ExtKeyUsageParameters) = this()
  
  /* CompleteClass */
  var keyPurposes: js.Array[String] = js.native
}
object ExtKeyUsage {
  
  @JSImport("pkijs", "ExtKeyUsage")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "ExtKeyUsage.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "keyPurposes" */ String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * ExtKeyUsage ::= SEQUENCE SIZE (1..MAX) OF KeyPurposeId
    *
    * KeyPurposeId ::= OBJECT IDENTIFIER
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[KeyPurposes]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
