package typings.pkijs.mod

import typings.pkijs.anon.DistributionPoints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the CRLDistributionPoints structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  */
@JSImport("pkijs", "CRLDistributionPoints")
@js.native
/**
  * Initializes a new instance of the {@link CRLDistributionPoints} class
  * @param parameters Initialization parameters
  */
open class CRLDistributionPoints ()
  extends PkiObject
     with ICRLDistributionPoints {
  def this(parameters: CRLDistributionPointsParameters) = this()
  
  /* CompleteClass */
  var distributionPoints: js.Array[DistributionPoint] = js.native
}
object CRLDistributionPoints {
  
  @JSImport("pkijs", "CRLDistributionPoints")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "CRLDistributionPoints.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: String): js.Array[DistributionPoint] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[DistributionPoint]]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * CRLDistributionPoints ::= SEQUENCE SIZE (1..MAX) OF DistributionPoint
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[DistributionPoints]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
