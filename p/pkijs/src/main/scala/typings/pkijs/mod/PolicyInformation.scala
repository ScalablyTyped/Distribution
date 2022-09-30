package typings.pkijs.mod

import typings.pkijs.anon.PolicyIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the PolicyInformation structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  */
@JSImport("pkijs", "PolicyInformation")
@js.native
/**
  * Initializes a new instance of the {@link PolicyInformation} class
  * @param parameters Initialization parameters
  */
open class PolicyInformation ()
  extends PkiObject
     with IPolicyInformation {
  def this(parameters: PolicyInformationParameters) = this()
  
  /* CompleteClass */
  var policyIdentifier: String = js.native
}
object PolicyInformation {
  
  @JSImport("pkijs", "PolicyInformation")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "PolicyInformation.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "policyIdentifier" */ String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  inline def defaultValues_Array(memberName: /* "policyQualifiers" */ String): js.Array[PolicyQualifierInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[PolicyQualifierInfo]]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * PolicyInformation ::= SEQUENCE {
    *    policyIdentifier   CertPolicyId,
    *    policyQualifiers   SEQUENCE SIZE (1..MAX) OF
    *    PolicyQualifierInfo OPTIONAL }
    *
    * CertPolicyId ::= OBJECT IDENTIFIER
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[PolicyIdentifier]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
