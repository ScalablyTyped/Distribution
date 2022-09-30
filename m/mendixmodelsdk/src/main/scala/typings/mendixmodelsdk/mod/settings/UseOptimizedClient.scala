package typings.mendixmodelsdk.mod.settings

import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "settings.UseOptimizedClient")
@js.native
open class UseOptimizedClient protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.settings.UseOptimizedClient {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object UseOptimizedClient {
  
  @JSImport("mendixmodelsdk", "settings.UseOptimizedClient")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "settings.UseOptimizedClient.MigrationMode")
  @js.native
  def MigrationMode: typings.mendixmodelsdk.settingsMod.settings.UseOptimizedClient = js.native
  inline def MigrationMode_=(x: typings.mendixmodelsdk.settingsMod.settings.UseOptimizedClient): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MigrationMode")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "settings.UseOptimizedClient.No")
  @js.native
  def No: typings.mendixmodelsdk.settingsMod.settings.UseOptimizedClient = js.native
  inline def No_=(x: typings.mendixmodelsdk.settingsMod.settings.UseOptimizedClient): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("No")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "settings.UseOptimizedClient.Yes")
  @js.native
  def Yes: typings.mendixmodelsdk.settingsMod.settings.UseOptimizedClient = js.native
  inline def Yes_=(x: typings.mendixmodelsdk.settingsMod.settings.UseOptimizedClient): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Yes")(x.asInstanceOf[js.Any])
}
