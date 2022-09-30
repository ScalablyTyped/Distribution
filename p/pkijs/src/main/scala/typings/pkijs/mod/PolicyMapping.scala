package typings.pkijs.mod

import typings.pkijs.anon.IssuerDomainPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the PolicyMapping structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  */
@JSImport("pkijs", "PolicyMapping")
@js.native
/**
  * Initializes a new instance of the {@link PolicyMapping} class
  * @param parameters Initialization parameters
  */
open class PolicyMapping ()
  extends PkiObject
     with IPolicyMapping {
  def this(parameters: PolicyMappingParameters) = this()
  
  /* CompleteClass */
  var issuerDomainPolicy: String = js.native
  
  /* CompleteClass */
  var subjectDomainPolicy: String = js.native
}
object PolicyMapping {
  
  @JSImport("pkijs", "PolicyMapping")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "PolicyMapping.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "issuerDomainPolicy" */ String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * PolicyMapping ::= SEQUENCE {
    *    issuerDomainPolicy      CertPolicyId,
    *    subjectDomainPolicy     CertPolicyId }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[IssuerDomainPolicy]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
