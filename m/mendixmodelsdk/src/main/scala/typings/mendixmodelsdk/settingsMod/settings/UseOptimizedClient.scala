package typings.mendixmodelsdk.settingsMod.settings

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/settings", "settings.UseOptimizedClient")
@js.native
open class UseOptimizedClient protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object UseOptimizedClient {
  
  @JSImport("mendixmodelsdk/src/gen/settings", "settings.UseOptimizedClient")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/settings", "settings.UseOptimizedClient.MigrationMode")
  @js.native
  def MigrationMode: UseOptimizedClient = js.native
  inline def MigrationMode_=(x: UseOptimizedClient): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MigrationMode")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/settings", "settings.UseOptimizedClient.No")
  @js.native
  def No: UseOptimizedClient = js.native
  inline def No_=(x: UseOptimizedClient): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("No")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/settings", "settings.UseOptimizedClient.Yes")
  @js.native
  def Yes: UseOptimizedClient = js.native
  inline def Yes_=(x: UseOptimizedClient): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Yes")(x.asInstanceOf[js.Any])
}
