package typings.pkijs.mod

import typings.asn1js.mod.BitString
import typings.pkijs.anon.CRLIssuer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the DistributionPoint structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  */
@JSImport("pkijs", "DistributionPoint")
@js.native
/**
  * Initializes a new instance of the {@link DistributionPoint} class
  * @param parameters Initialization parameters
  */
open class DistributionPoint ()
  extends PkiObject
     with IDistributionPoint {
  def this(parameters: DistributionPointParameters) = this()
}
object DistributionPoint {
  
  @JSImport("pkijs", "DistributionPoint")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "DistributionPoint.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def defaultValues(memberName: /* "reasons" */ String): BitString = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[BitString]
  
  /* static member */
  inline def defaultValues_Array(memberName: /* "cRLIssuer" */ String): js.Array[GeneralName] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[GeneralName]]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_DistributionPointName(memberName: /* "distributionPoint" */ String): DistributionPointName = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[DistributionPointName]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * DistributionPoint ::= SEQUENCE {
    *    distributionPoint       [0]     DistributionPointName OPTIONAL,
    *    reasons                 [1]     ReasonFlags OPTIONAL,
    *    cRLIssuer               [2]     GeneralNames OPTIONAL }
    *
    * DistributionPointName ::= CHOICE {
    *    fullName                [0]     GeneralNames,
    *    nameRelativeToCRLIssuer [1]     RelativeDistinguishedName }
    *
    * ReasonFlags ::= BIT STRING {
    *    unused                  (0),
    *    keyCompromise           (1),
    *    cACompromise            (2),
    *    affiliationChanged      (3),
    *    superseded              (4),
    *    cessationOfOperation    (5),
    *    certificateHold         (6),
    *    privilegeWithdrawn      (7),
    *    aACompromise            (8) }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[CRLIssuer]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
