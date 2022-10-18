package typings.mendixmodelsdk.mod.domainmodels

import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "domainmodels.EnvironmentType")
@js.native
open class EnvironmentType protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.domainmodels.EnvironmentType {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object EnvironmentType {
  
  @JSImport("mendixmodelsdk", "domainmodels.EnvironmentType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.EnvironmentType.NonProduction")
  @js.native
  def NonProduction: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.EnvironmentType = js.native
  inline def NonProduction_=(x: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.EnvironmentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NonProduction")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.EnvironmentType.Production")
  @js.native
  def Production: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.EnvironmentType = js.native
  inline def Production_=(x: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.EnvironmentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Production")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.EnvironmentType.Sandbox")
  @js.native
  def Sandbox: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.EnvironmentType = js.native
  inline def Sandbox_=(x: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.EnvironmentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sandbox")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.EnvironmentType.Unknown")
  @js.native
  def Unknown: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.EnvironmentType = js.native
  inline def Unknown_=(x: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.EnvironmentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Unknown")(x.asInstanceOf[js.Any])
}
