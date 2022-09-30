package typings.pkijs.mod

import typings.asn1js.mod.BitString
import typings.asn1js.mod.Integer
import typings.pkijs.anon.IssuerUID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the IssuerSerial structure described in [RFC5755](https://datatracker.ietf.org/doc/html/rfc5755)
  */
@JSImport("pkijs", "IssuerSerial")
@js.native
/**
  * Initializes a new instance of the {@link IssuerSerial} class
  * @param parameters Initialization parameters
  */
open class IssuerSerial ()
  extends PkiObject
     with IIssuerSerial {
  def this(parameters: IssuerSerialParameters) = this()
  
  /**
    * Issuer name
    */
  /* CompleteClass */
  var issuer: GeneralNames = js.native
  
  /**
    * Serial number
    */
  /* CompleteClass */
  var serialNumber: Integer = js.native
}
object IssuerSerial {
  
  @JSImport("pkijs", "IssuerSerial")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "IssuerSerial.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def defaultValues(memberName: /* "issuerUID" */ String): BitString = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[BitString]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_GeneralNames(memberName: /* "issuer" */ String): GeneralNames = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[GeneralNames]
  
  /* static member */
  inline def defaultValues_Integer(memberName: /* "serialNumber" */ String): Integer = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Integer]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * IssuerSerial ::= SEQUENCE {
    *     issuer         GeneralNames,
    *     serial         CertificateSerialNumber,
    *     issuerUID      UniqueIdentifier OPTIONAL
    * }
    *
    * CertificateSerialNumber ::= INTEGER
    * UniqueIdentifier ::= BIT STRING
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[IssuerUID]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
