package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the RevocationInfoChoices structure described in [RFC5652](https://datatracker.ietf.org/doc/html/rfc5652)
  */
@JSImport("pkijs", "RevocationInfoChoices")
@js.native
/**
  * Initializes a new instance of the {@link RevocationInfoChoices} class
  * @param parameters Initialization parameters
  */
open class RevocationInfoChoices ()
  extends PkiObject
     with IRevocationInfoChoices {
  def this(parameters: RevocationInfoChoicesParameters) = this()
  
  /* CompleteClass */
  var crls: js.Array[CertificateRevocationList] = js.native
  
  /* CompleteClass */
  var otherRevocationInfos: js.Array[OtherRevocationInfoFormat] = js.native
}
object RevocationInfoChoices {
  
  @JSImport("pkijs", "RevocationInfoChoices")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "RevocationInfoChoices.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "crls" */ /* "otherRevocationInfos" */ String): js.Array[CertificateRevocationList] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[CertificateRevocationList]]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * RevocationInfoChoices ::= SET OF RevocationInfoChoice
    *
    * RevocationInfoChoice ::= CHOICE {
    *    crl CertificateList,
    *    other [1] IMPLICIT OtherRevocationInfoFormat }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: RevocationInfoChoicesSchema): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
