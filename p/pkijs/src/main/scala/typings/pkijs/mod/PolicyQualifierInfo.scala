package typings.pkijs.mod

import typings.asn1js.mod.Any
import typings.asn1js.mod.Sequence
import typings.pkijs.anon.PolicyQualifierId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the PolicyQualifierInfo structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  */
@JSImport("pkijs", "PolicyQualifierInfo")
@js.native
/**
  * Initializes a new instance of the {@link PolicyQualifierInfo} class
  * @param parameters Initialization parameters
  */
open class PolicyQualifierInfo ()
  extends PkiObject
     with IPolicyQualifierInfo {
  def this(parameters: PolicyQualifierInfoParameters) = this()
  
  /* CompleteClass */
  var policyQualifierId: String = js.native
  
  /* CompleteClass */
  var qualifier: SchemaType = js.native
}
object PolicyQualifierInfo {
  
  @JSImport("pkijs", "PolicyQualifierInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "PolicyQualifierInfo.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "policyQualifierId" */ String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  inline def defaultValues_Any(memberName: /* "qualifier" */ String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * PolicyQualifierInfo ::= SEQUENCE {
    *    policyQualifierId  PolicyQualifierId,
    *    qualifier          ANY DEFINED BY policyQualifierId }
    *
    * id-qt          OBJECT IDENTIFIER ::= { id-pkix 2 }
    * id-qt-cps      OBJECT IDENTIFIER ::= { id-qt 1 }
    * id-qt-unotice  OBJECT IDENTIFIER ::= { id-qt 2 }
    *
    * PolicyQualifierId ::= OBJECT IDENTIFIER ( id-qt-cps | id-qt-unotice )
    *```
    */
  /* static member */
  inline def schema(): Sequence = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[Sequence]
  inline def schema(parameters: SchemaParameters[PolicyQualifierId]): Sequence = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[Sequence]
}
