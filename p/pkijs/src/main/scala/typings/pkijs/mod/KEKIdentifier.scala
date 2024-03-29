package typings.pkijs.mod

import typings.asn1js.mod.GeneralizedTime
import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the KEKIdentifier structure described in [RFC5652](https://datatracker.ietf.org/doc/html/rfc5652)
  */
@JSImport("pkijs", "KEKIdentifier")
@js.native
/**
  * Initializes a new instance of the {@link KEKIdentifier} class
  * @param parameters Initialization parameters
  */
open class KEKIdentifier ()
  extends PkiObject
     with IKEKIdentifier {
  def this(parameters: KEKIdentifierParameters) = this()
  
  /* CompleteClass */
  var keyIdentifier: OctetString = js.native
}
object KEKIdentifier {
  
  @JSImport("pkijs", "KEKIdentifier")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "KEKIdentifier.CLASS_NAME")
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
  inline def defaultValues(memberName: /* "other" */ String): OtherKeyAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[OtherKeyAttribute]
  
  /* static member */
  inline def defaultValues_GeneralizedTime(memberName: /* "date" */ String): GeneralizedTime = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[GeneralizedTime]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_OctetString(memberName: /* "keyIdentifier" */ String): OctetString = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[OctetString]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * KEKIdentifier ::= SEQUENCE {
    *    keyIdentifier OCTET STRING,
    *    date GeneralizedTime OPTIONAL,
    *    other OtherKeyAttribute OPTIONAL }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: KEKIdentifierSchema): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
