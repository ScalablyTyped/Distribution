package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EnvironmentType")
@js.native
class EnvironmentType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object EnvironmentType {
  
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EnvironmentType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EnvironmentType.NonProduction")
  @js.native
  def NonProduction: EnvironmentType = js.native
  inline def NonProduction_=(x: EnvironmentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NonProduction")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EnvironmentType.Production")
  @js.native
  def Production: EnvironmentType = js.native
  inline def Production_=(x: EnvironmentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Production")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EnvironmentType.Sandbox")
  @js.native
  def Sandbox: EnvironmentType = js.native
  inline def Sandbox_=(x: EnvironmentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sandbox")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EnvironmentType.Unknown")
  @js.native
  def Unknown: EnvironmentType = js.native
  inline def Unknown_=(x: EnvironmentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Unknown")(x.asInstanceOf[js.Any])
}
