package typings.pkijs.mod

import typings.pkijs.anon.NotAfter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the PrivateKeyUsagePeriod structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  */
@JSImport("pkijs", "PrivateKeyUsagePeriod")
@js.native
/**
  * Initializes a new instance of the {@link PrivateKeyUsagePeriod} class
  * @param parameters Initialization parameters
  */
open class PrivateKeyUsagePeriod ()
  extends PkiObject
     with IPrivateKeyUsagePeriod {
  def this(parameters: PrivateKeyUsagePeriodParameters) = this()
}
object PrivateKeyUsagePeriod {
  
  @JSImport("pkijs", "PrivateKeyUsagePeriod")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "PrivateKeyUsagePeriod.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "notBefore" */ String): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * PrivateKeyUsagePeriod OID ::= 2.5.29.16
    *
    * PrivateKeyUsagePeriod ::= SEQUENCE {
    *    notBefore       [0]     GeneralizedTime OPTIONAL,
    *    notAfter        [1]     GeneralizedTime OPTIONAL }
    * -- either notBefore or notAfter MUST be present
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[NotAfter]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
