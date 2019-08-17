package typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactMod

import typings.atUifabricUtilities.libCustomizationsCustomizationsMod.ICustomizations
import typings.atUifabricUtilities.libCustomizationsCustomizationsMod.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react", "Customizations")
@js.native
class Customizations ()
  extends typings.officeDashUiDashFabricDashReact.libUtilitiesMod.Customizations

/* static members */
@JSImport("office-ui-fabric-react", "Customizations")
@js.native
object Customizations extends js.Object {
  var _raiseChange: js.Any = js.native
  def applyScopedSettings(scopeName: String, settings: ISettings): Unit = js.native
  def applySettings(settings: ISettings): Unit = js.native
  def getSettings(properties: js.Array[String]): js.Any = js.native
  def getSettings(properties: js.Array[String], scopeName: String): js.Any = js.native
  def getSettings(properties: js.Array[String], scopeName: String, localSettings: ICustomizations): js.Any = js.native
  def observe(onChange: js.Function0[Unit]): Unit = js.native
  def reset(): Unit = js.native
  def unobserve(onChange: js.Function0[Unit]): Unit = js.native
}

