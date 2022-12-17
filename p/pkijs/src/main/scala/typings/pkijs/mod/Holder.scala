package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the Holder structure described in [RFC5755](https://datatracker.ietf.org/doc/html/rfc5755)
  */
@JSImport("pkijs", "Holder")
@js.native
/**
  * Initializes a new instance of the {@link AttributeCertificateInfoV1} class
  * @param parameters Initialization parameters
  */
open class Holder ()
  extends PkiObject
     with IHolder {
  def this(parameters: HolderParameters) = this()
}
object Holder {
  
  @JSImport("pkijs", "Holder")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "Holder.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def defaultValues(memberName: /* "objectDigestInfo" */ String): ObjectDigestInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[ObjectDigestInfo]
  
  /* static member */
  inline def defaultValues_GeneralNames(memberName: /* "entityName" */ String): GeneralNames = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[GeneralNames]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_IssuerSerial(memberName: /* "baseCertificateID" */ String): IssuerSerial = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[IssuerSerial]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * Holder ::= SEQUENCE {
    *   baseCertificateID   [0] IssuerSerial OPTIONAL,
    *       -- the issuer and serial number of
    *       -- the holder's Public Key Certificate
    *   entityName          [1] GeneralNames OPTIONAL,
    *       -- the name of the claimant or role
    *   objectDigestInfo    [2] ObjectDigestInfo OPTIONAL
    *       -- used to directly authenticate the holder,
    *       -- for example, an executable
    * }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: HolderSchema): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
