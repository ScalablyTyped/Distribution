package typings.mendixmodelsdk.mod.settings

import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "settings.RoundingMode")
@js.native
class RoundingMode protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.settings.RoundingMode {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object RoundingMode {
  
  @JSImport("mendixmodelsdk", "settings.RoundingMode")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "settings.RoundingMode.HalfEven")
  @js.native
  def HalfEven: typings.mendixmodelsdk.settingsMod.settings.RoundingMode = js.native
  @scala.inline
  def HalfEven_=(x: typings.mendixmodelsdk.settingsMod.settings.RoundingMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HalfEven")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "settings.RoundingMode.HalfUp")
  @js.native
  def HalfUp: typings.mendixmodelsdk.settingsMod.settings.RoundingMode = js.native
  @scala.inline
  def HalfUp_=(x: typings.mendixmodelsdk.settingsMod.settings.RoundingMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HalfUp")(x.asInstanceOf[js.Any])
}
