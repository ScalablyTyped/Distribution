package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the IssuingDistributionPoint structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  */
@JSImport("pkijs", "IssuingDistributionPoint")
@js.native
/**
  * Initializes a new instance of the {@link IssuingDistributionPoint} class
  * @param parameters Initialization parameters
  */
open class IssuingDistributionPoint ()
  extends PkiObject
     with IIssuingDistributionPoint {
  def this(parameters: IssuingDistributionPointParameters) = this()
  
  /* CompleteClass */
  var indirectCRL: Boolean = js.native
  
  /* CompleteClass */
  var onlyContainsAttributeCerts: Boolean = js.native
  
  /* CompleteClass */
  var onlyContainsCACerts: Boolean = js.native
  
  /* CompleteClass */
  var onlyContainsUserCerts: Boolean = js.native
}
object IssuingDistributionPoint {
  
  @JSImport("pkijs", "IssuingDistributionPoint")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "IssuingDistributionPoint.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def defaultValues(memberName: /* "onlySomeReasons" */ String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def defaultValues_Boolean(memberName: /* "onlyContainsUserCerts" */ String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
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
    * IssuingDistributionPoint ::= SEQUENCE {
    *    distributionPoint          [0] DistributionPointName OPTIONAL,
    *    onlyContainsUserCerts      [1] BOOLEAN DEFAULT FALSE,
    *    onlyContainsCACerts        [2] BOOLEAN DEFAULT FALSE,
    *    onlySomeReasons            [3] ReasonFlags OPTIONAL,
    *    indirectCRL                [4] BOOLEAN DEFAULT FALSE,
    *    onlyContainsAttributeCerts [5] BOOLEAN DEFAULT FALSE }
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
  inline def schema(parameters: SchemaParameters[typings.pkijs.anon.DistributionPoint]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
