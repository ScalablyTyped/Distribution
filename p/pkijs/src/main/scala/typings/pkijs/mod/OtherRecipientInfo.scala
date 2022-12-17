package typings.pkijs.mod

import typings.asn1js.mod.Sequence
import typings.pkijs.anon.OriType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the OtherRecipientInfo structure described in [RFC5652](https://datatracker.ietf.org/doc/html/rfc5652)
  */
@JSImport("pkijs", "OtherRecipientInfo")
@js.native
/**
  * Initializes a new instance of the {@link OtherRecipientInfo} class
  * @param parameters Initialization parameters
  */
open class OtherRecipientInfo ()
  extends PkiObject
     with IOtherRecipientInfo
     with RecipientInfoValue {
  def this(parameters: OtherRecipientInfoParameters) = this()
  
  /* CompleteClass */
  var oriType: String = js.native
  
  /* CompleteClass */
  var oriValue: Any = js.native
}
object OtherRecipientInfo {
  
  @JSImport("pkijs", "OtherRecipientInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "OtherRecipientInfo.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Compare values with default values for all class members
    * @param memberName String name for a class member
    * @param memberValue Value to compare with default value
    */
  /* static member */
  inline def compareWithDefault(memberName: String, memberValue: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareWithDefault")(memberName.asInstanceOf[js.Any], memberValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def defaultValues(memberName: /* "oriValue" */ String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_String(memberName: /* "oriType" */ String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * OtherRecipientInfo ::= SEQUENCE {
    *    oriType OBJECT IDENTIFIER,
    *    oriValue ANY DEFINED BY oriType }
    *```
    */
  /* static member */
  inline def schema(): Sequence = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[Sequence]
  inline def schema(parameters: SchemaParameters[OriType]): Sequence = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[Sequence]
}
