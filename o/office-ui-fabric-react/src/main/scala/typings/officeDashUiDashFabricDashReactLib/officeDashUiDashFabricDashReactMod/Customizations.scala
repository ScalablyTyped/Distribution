package typings
package officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react", "Customizations")
@js.native
class Customizations ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.Customizations

@JSImport("office-ui-fabric-react", "Customizations")
@js.native
object Customizations extends js.Object {
  /* private */ def _raiseChange(): js.Any = js.native
  def applyScopedSettings(scopeName: java.lang.String, settings: atUifabricUtilitiesLib.libCustomizationsMod.Settings): scala.Unit = js.native
  def applySettings(settings: atUifabricUtilitiesLib.libCustomizationsMod.Settings): scala.Unit = js.native
  def getSettings(properties: js.Array[java.lang.String]): js.Any = js.native
  def getSettings(properties: js.Array[java.lang.String], scopeName: java.lang.String): js.Any = js.native
  def getSettings(
    properties: js.Array[java.lang.String],
    scopeName: java.lang.String,
    localSettings: atUifabricUtilitiesLib.libCustomizationsMod.ICustomizations
  ): js.Any = js.native
  def observe(onChange: js.Function0[scala.Unit]): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def unobserve(onChange: js.Function0[scala.Unit]): scala.Unit = js.native
}

