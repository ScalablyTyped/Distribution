package typings.pkijs.mod

import typings.asn1js.mod.Choice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the GeneralName structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  */
@JSImport("pkijs", "GeneralName")
@js.native
/**
  * Initializes a new instance of the {@link GeneralName} class
  * @param parameters Initialization parameters
  */
open class GeneralName ()
  extends PkiObject
     with IGeneralName {
  def this(parameters: GeneralNameParameters) = this()
  
  /**
    * value type - from a tagged value (0 for "otherName", 1 for "rfc822Name" etc.)
    */
  /* CompleteClass */
  var `type`: Double = js.native
  
  /**
    * ASN.1 object having GeneralName value (type depends on TYPE value)
    */
  /* CompleteClass */
  var value: Any = js.native
}
object GeneralName {
  
  @JSImport("pkijs", "GeneralName")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "GeneralName.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Compares values with default values for all class members
    * @param memberName String name for a class member
    * @param memberValue Value to compare with default value
    */
  /* static member */
  inline def compareWithDefault(memberName: String, memberValue: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareWithDefault")(memberName.asInstanceOf[js.Any], memberValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def defaultValues(memberName: /* "value" */ String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_Double(memberName: /* "type" */ String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * GeneralName ::= Choice {
    *    otherName                       [0]     OtherName,
    *    rfc822Name                      [1]     IA5String,
    *    dNSName                         [2]     IA5String,
    *    x400Address                     [3]     ORAddress,
    *    directoryName                   [4]     value,
    *    ediPartyName                    [5]     EDIPartyName,
    *    uniformResourceIdentifier       [6]     IA5String,
    *    iPAddress                       [7]     OCTET STRING,
    *    registeredID                    [8]     OBJECT IDENTIFIER }
    *```
    */
  /* static member */
  inline def schema(): Choice = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[Choice]
  inline def schema(parameters: GeneralNameSchema): Choice = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[Choice]
}
