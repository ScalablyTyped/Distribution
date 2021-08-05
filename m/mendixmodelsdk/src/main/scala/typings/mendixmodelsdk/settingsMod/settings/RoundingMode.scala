package typings.mendixmodelsdk.settingsMod.settings

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/settings", "settings.RoundingMode")
@js.native
class RoundingMode protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object RoundingMode {
  
  @JSImport("mendixmodelsdk/dist/gen/settings", "settings.RoundingMode")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/settings", "settings.RoundingMode.HalfEven")
  @js.native
  def HalfEven: RoundingMode = js.native
  inline def HalfEven_=(x: RoundingMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HalfEven")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/settings", "settings.RoundingMode.HalfUp")
  @js.native
  def HalfUp: RoundingMode = js.native
  inline def HalfUp_=(x: RoundingMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HalfUp")(x.asInstanceOf[js.Any])
}
