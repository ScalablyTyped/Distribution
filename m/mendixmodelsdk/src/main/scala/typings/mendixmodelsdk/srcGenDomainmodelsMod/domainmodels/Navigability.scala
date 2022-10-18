package typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.Navigability")
@js.native
open class Navigability protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object Navigability {
  
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.Navigability")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.Navigability.BothDirections")
  @js.native
  def BothDirections: Navigability = js.native
  inline def BothDirections_=(x: Navigability): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BothDirections")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.Navigability.ParentToChild")
  @js.native
  def ParentToChild: Navigability = js.native
  inline def ParentToChild_=(x: Navigability): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ParentToChild")(x.asInstanceOf[js.Any])
}
