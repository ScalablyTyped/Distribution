package typings
package officeDashUiDashFabricDashReactLib.libComponentsThemeGeneratorThemeRulesStandardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SemanticColorSlots extends js.Object

@JSImport("office-ui-fabric-react/lib/components/ThemeGenerator/ThemeRulesStandard", "SemanticColorSlots")
@js.native
object SemanticColorSlots extends js.Object {
  @js.native
  sealed trait bodyBackground
    extends officeDashUiDashFabricDashReactLib.libComponentsThemeGeneratorThemeRulesStandardMod.SemanticColorSlots
  
  @js.native
  sealed trait bodyText
    extends officeDashUiDashFabricDashReactLib.libComponentsThemeGeneratorThemeRulesStandardMod.SemanticColorSlots
  
  @js.native
  sealed trait disabledBackground
    extends officeDashUiDashFabricDashReactLib.libComponentsThemeGeneratorThemeRulesStandardMod.SemanticColorSlots
  
  @js.native
  sealed trait disabledText
    extends officeDashUiDashFabricDashReactLib.libComponentsThemeGeneratorThemeRulesStandardMod.SemanticColorSlots
  
  /* 0 */ val bodyBackground: bodyBackground with scala.Double = js.native
  /* 1 */ val bodyText: bodyText with scala.Double = js.native
  /* 2 */ val disabledBackground: disabledBackground with scala.Double = js.native
  /* 3 */ val disabledText: disabledText with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsThemeGeneratorThemeRulesStandardMod.SemanticColorSlots with scala.Double
  ] = js.native
}

