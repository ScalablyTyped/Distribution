package typings.pkijs.mod

import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the IssuerAndSerialNumber structure described in [RFC5652](https://datatracker.ietf.org/doc/html/rfc5652)
  */
@JSImport("pkijs", "IssuerAndSerialNumber")
@js.native
/**
  * Initializes a new instance of the {@link IssuerAndSerialNumber} class
  * @param parameters Initialization parameters
  */
open class IssuerAndSerialNumber ()
  extends PkiObject
     with IIssuerAndSerialNumber {
  def this(parameters: IssuerAndSerialNumberParameters) = this()
  
  /**
    * Certificate issuer name
    */
  /* CompleteClass */
  var issuer: RelativeDistinguishedNames = js.native
  
  /**
    * Certificate serial number
    */
  /* CompleteClass */
  var serialNumber: Integer = js.native
}
object IssuerAndSerialNumber {
  
  @JSImport("pkijs", "IssuerAndSerialNumber")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "IssuerAndSerialNumber.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "issuer" */ String): RelativeDistinguishedNames = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[RelativeDistinguishedNames]
  
  /* static member */
  inline def defaultValues_Integer(memberName: /* "serialNumber" */ String): Integer = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Integer]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * IssuerAndSerialNumber ::= SEQUENCE {
    *    issuer Name,
    *    serialNumber CertificateSerialNumber }
    *
    * CertificateSerialNumber ::= INTEGER
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: IssuerAndSerialNumberSchema): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
