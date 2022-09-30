package typings.pkijs.mod

import typings.asn1js.mod.Integer
import typings.pkijs.anon.CrlEntryExtensions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the RevokedCertificate structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  */
@JSImport("pkijs", "RevokedCertificate")
@js.native
/**
  * Initializes a new instance of the {@link RevokedCertificate} class
  * @param parameters Initialization parameters
  */
open class RevokedCertificate ()
  extends PkiObject
     with IRevokedCertificate {
  def this(parameters: RevokedCertificateParameters) = this()
  
  /* CompleteClass */
  var revocationDate: Time = js.native
  
  /* CompleteClass */
  var userCertificate: Integer = js.native
}
object RevokedCertificate {
  
  @JSImport("pkijs", "RevokedCertificate")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "RevokedCertificate.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def defaultValues(memberName: /* "crlEntryExtensions" */ String): Extensions = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Extensions]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_Integer(memberName: /* "userCertificate" */ String): Integer = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Integer]
  
  /* static member */
  inline def defaultValues_Time(memberName: /* "revocationDate" */ String): Time = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Time]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * revokedCertificates     SEQUENCE OF SEQUENCE  {
    *        userCertificate         CertificateSerialNumber,
    *        revocationDate          Time,
    *        crlEntryExtensions      Extensions OPTIONAL
    *                                 -- if present, version MUST be v2
    *                             }  OPTIONAL,
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[CrlEntryExtensions]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
