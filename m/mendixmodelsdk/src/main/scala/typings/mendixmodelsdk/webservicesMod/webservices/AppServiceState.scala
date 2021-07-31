package typings.mendixmodelsdk.webservicesMod.webservices

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.AppServiceState")
@js.native
class AppServiceState protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object AppServiceState {
  
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.AppServiceState")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.AppServiceState.Consumable")
  @js.native
  def Consumable: AppServiceState = js.native
  @scala.inline
  def Consumable_=(x: AppServiceState): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Consumable")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.AppServiceState.Deprecated")
  @js.native
  def Deprecated: AppServiceState = js.native
  @scala.inline
  def Deprecated_=(x: AppServiceState): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Deprecated")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.AppServiceState.Draft")
  @js.native
  def Draft: AppServiceState = js.native
  @scala.inline
  def Draft_=(x: AppServiceState): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Draft")(x.asInstanceOf[js.Any])
}
