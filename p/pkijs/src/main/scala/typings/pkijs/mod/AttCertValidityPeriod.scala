package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the AttCertValidityPeriod structure described in [RFC5755 Section 4.1](https://datatracker.ietf.org/doc/html/rfc5755#section-4.1)
  */
@JSImport("pkijs", "AttCertValidityPeriod")
@js.native
/**
  * Initializes a new instance of the {@link AttCertValidityPeriod} class
  * @param parameters Initialization parameters
  */
open class AttCertValidityPeriod ()
  extends PkiObject
     with IAttCertValidityPeriod {
  def this(parameters: AttCertValidityPeriodParameters) = this()
  
  /* CompleteClass */
  var notAfterTime: js.Date = js.native
  
  /* CompleteClass */
  var notBeforeTime: js.Date = js.native
}
object AttCertValidityPeriod {
  
  @JSImport("pkijs", "AttCertValidityPeriod")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "AttCertValidityPeriod.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "notBeforeTime" */ String): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * AttCertValidityPeriod ::= SEQUENCE {
    *   notBeforeTime  GeneralizedTime,
    *   notAfterTime   GeneralizedTime
    * }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: AttCertValidityPeriodSchema): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
