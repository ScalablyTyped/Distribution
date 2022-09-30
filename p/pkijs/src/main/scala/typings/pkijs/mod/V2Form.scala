package typings.pkijs.mod

import typings.pkijs.anon.IssuerName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the V2Form structure described in [RFC5755](https://datatracker.ietf.org/doc/html/rfc5755)
  */
@JSImport("pkijs", "V2Form")
@js.native
/**
  * Initializes a new instance of the {@link V2Form} class
  * @param parameters Initialization parameters
  */
open class V2Form ()
  extends PkiObject
     with IV2Form {
  def this(parameters: V2FormParameters) = this()
}
object V2Form {
  
  @JSImport("pkijs", "V2Form")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "V2Form.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def defaultValues(memberName: /* "objectDigestInfo" */ String): ObjectDigestInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[ObjectDigestInfo]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_GeneralNames(memberName: /* "issuerName" */ String): GeneralNames = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[GeneralNames]
  
  /* static member */
  inline def defaultValues_IssuerSerial(memberName: /* "baseCertificateID" */ String): IssuerSerial = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[IssuerSerial]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * V2Form ::= SEQUENCE {
    *   issuerName            GeneralNames  OPTIONAL,
    *   baseCertificateID     [0] IssuerSerial  OPTIONAL,
    *   objectDigestInfo      [1] ObjectDigestInfo  OPTIONAL
    *     -- issuerName MUST be present in this profile
    *     -- baseCertificateID and objectDigestInfo MUST NOT
    *     -- be present in this profile
    * }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[IssuerName]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
