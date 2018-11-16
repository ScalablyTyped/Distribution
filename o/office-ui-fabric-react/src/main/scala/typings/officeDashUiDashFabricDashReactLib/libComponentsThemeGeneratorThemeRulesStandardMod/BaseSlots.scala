package typings
package officeDashUiDashFabricDashReactLib.libComponentsThemeGeneratorThemeRulesStandardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BaseSlots extends js.Object

@JSImport("office-ui-fabric-react/lib/components/ThemeGenerator/ThemeRulesStandard", "BaseSlots")
@js.native
object BaseSlots extends js.Object {
  @js.native
  sealed trait backgroundColor
    extends officeDashUiDashFabricDashReactLib.libComponentsThemeGeneratorThemeRulesStandardMod.BaseSlots
  
  @js.native
  sealed trait foregroundColor
    extends officeDashUiDashFabricDashReactLib.libComponentsThemeGeneratorThemeRulesStandardMod.BaseSlots
  
  @js.native
  sealed trait primaryColor
    extends officeDashUiDashFabricDashReactLib.libComponentsThemeGeneratorThemeRulesStandardMod.BaseSlots
  
  /* 1 */ val backgroundColor: backgroundColor with scala.Double = js.native
  /* 2 */ val foregroundColor: foregroundColor with scala.Double = js.native
  /* 0 */ val primaryColor: primaryColor with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsThemeGeneratorThemeRulesStandardMod.BaseSlots with scala.Double
  ] = js.native
}

