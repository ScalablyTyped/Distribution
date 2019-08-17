package typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactMod

import typings.atUifabricUtilities.libGlobalSettingsMod.IChangeEventCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react", "GlobalSettings")
@js.native
class GlobalSettings ()
  extends typings.officeDashUiDashFabricDashReact.libUtilitiesMod.GlobalSettings

/* static members */
@JSImport("office-ui-fabric-react", "GlobalSettings")
@js.native
object GlobalSettings extends js.Object {
  def addChangeListener(cb: IChangeEventCallback): Unit = js.native
  def getValue[T](key: String): T = js.native
  def getValue[T](key: String, defaultValue: T): T = js.native
  def getValue[T](key: String, defaultValue: js.Function0[T]): T = js.native
  def removeChangeListener(cb: IChangeEventCallback): Unit = js.native
  def setValue[T](key: String, value: T): T = js.native
}

