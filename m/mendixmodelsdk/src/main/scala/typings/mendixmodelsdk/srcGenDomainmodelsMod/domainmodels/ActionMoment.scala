package typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.ActionMoment")
@js.native
open class ActionMoment protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object ActionMoment {
  
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.ActionMoment")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.ActionMoment.After")
  @js.native
  def After: ActionMoment = js.native
  inline def After_=(x: ActionMoment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("After")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.ActionMoment.Before")
  @js.native
  def Before: ActionMoment = js.native
  inline def Before_=(x: ActionMoment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Before")(x.asInstanceOf[js.Any])
}
