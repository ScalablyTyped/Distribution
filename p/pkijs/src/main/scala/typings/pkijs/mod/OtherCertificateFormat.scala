package typings.pkijs.mod

import typings.pkijs.anon.OtherCert
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the OtherCertificateFormat structure described in [RFC5652](https://datatracker.ietf.org/doc/html/rfc5652)
  */
@JSImport("pkijs", "OtherCertificateFormat")
@js.native
/**
  * Initializes a new instance of the {@link OtherCertificateFormat} class
  * @param parameters Initialization parameters
  */
open class OtherCertificateFormat ()
  extends PkiObject
     with IOtherCertificateFormat
     with CertificateSetItem {
  def this(parameters: OtherCertificateFormatParameters) = this()
  
  /* CompleteClass */
  var otherCert: Any = js.native
  
  /* CompleteClass */
  var otherCertFormat: String = js.native
}
object OtherCertificateFormat {
  
  @JSImport("pkijs", "OtherCertificateFormat")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "otherCertFormat" */ String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  inline def defaultValues_Any(memberName: /* "otherCert" */ String): typings.asn1js.mod.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[typings.asn1js.mod.Any]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * OtherCertificateFormat ::= SEQUENCE {
    *    otherCertFormat OBJECT IDENTIFIER,
    *    otherCert ANY DEFINED BY otherCertFormat }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[OtherCert]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
