package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.RangeType")
@js.native
class RangeType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object RangeType {
  
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.RangeType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.RangeType.Between")
  @js.native
  def Between: RangeType = js.native
  inline def Between_=(x: RangeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Between")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.RangeType.GreaterThanOrEqualTo")
  @js.native
  def GreaterThanOrEqualTo: RangeType = js.native
  inline def GreaterThanOrEqualTo_=(x: RangeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GreaterThanOrEqualTo")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.RangeType.SmallerThanOrEqualTo")
  @js.native
  def SmallerThanOrEqualTo: RangeType = js.native
  inline def SmallerThanOrEqualTo_=(x: RangeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SmallerThanOrEqualTo")(x.asInstanceOf[js.Any])
}
