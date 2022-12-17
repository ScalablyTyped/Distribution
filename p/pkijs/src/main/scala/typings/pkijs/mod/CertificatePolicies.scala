package typings.pkijs.mod

import typings.asn1js.mod.Sequence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the CertificatePolicies structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  */
@JSImport("pkijs", "CertificatePolicies")
@js.native
/**
  * Initializes a new instance of the {@link CertificatePolicies} class
  * @param parameters Initialization parameters
  */
open class CertificatePolicies ()
  extends PkiObject
     with ICertificatePolicies {
  def this(parameters: CertificatePoliciesParameters) = this()
  
  /* CompleteClass */
  var certificatePolicies: js.Array[PolicyInformation] = js.native
}
object CertificatePolicies {
  
  @JSImport("pkijs", "CertificatePolicies")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "CertificatePolicies.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "certificatePolicies" */ String): js.Array[PolicyInformation] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[PolicyInformation]]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * certificatePolicies ::= SEQUENCE SIZE (1..MAX) OF PolicyInformation
    *```
    */
  /* static member */
  inline def schema(): Sequence = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[Sequence]
  inline def schema(parameters: SchemaParameters[typings.pkijs.anon.CertificatePolicies]): Sequence = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[Sequence]
}
