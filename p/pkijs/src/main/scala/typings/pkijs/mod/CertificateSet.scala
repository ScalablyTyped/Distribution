package typings.pkijs.mod

import typings.pkijs.anon.Certificates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the CertificateSet structure described in [RFC5652](https://datatracker.ietf.org/doc/html/rfc5652)
  */
@JSImport("pkijs", "CertificateSet")
@js.native
/**
  * Initializes a new instance of the {@link CertificateSet} class
  * @param parameters Initialization parameters
  */
open class CertificateSet ()
  extends PkiObject
     with ICertificateSet {
  def this(parameters: CertificateSetParameters) = this()
  
  /* CompleteClass */
  var certificates: js.Array[CertificateSetItem] = js.native
}
object CertificateSet {
  
  @JSImport("pkijs", "CertificateSet")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "CertificateSet.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "certificates" */ String): js.Array[CertificateSetItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[CertificateSetItem]]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * CertificateSet ::= SET OF CertificateChoices
    *
    * CertificateChoices ::= CHOICE {
    *    certificate Certificate,
    *    extendedCertificate [0] IMPLICIT ExtendedCertificate,  -- Obsolete
    *    v1AttrCert [1] IMPLICIT AttributeCertificateV1,        -- Obsolete
    *    v2AttrCert [2] IMPLICIT AttributeCertificateV2,
    *    other [3] IMPLICIT OtherCertificateFormat }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[Certificates]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
