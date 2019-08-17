package typings.officeDashUiDashFabricDashReact.libComponentsThemeGeneratorMod

import typings.officeDashUiDashFabricDashReact.libComponentsThemeGeneratorIThemeRulesMod.IThemeRules
import typings.officeDashUiDashFabricDashReact.libComponentsThemeGeneratorIThemeSlotRuleMod.IThemeSlotRule
import typings.officeDashUiDashFabricDashReact.libUtilitiesColorInterfacesMod.IColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ThemeGenerator", "ThemeGenerator")
@js.native
class ThemeGenerator ()
  extends typings.officeDashUiDashFabricDashReact.libComponentsThemeGeneratorThemeGeneratorMod.ThemeGenerator

/* static members */
@JSImport("office-ui-fabric-react/lib/components/ThemeGenerator", "ThemeGenerator")
@js.native
object ThemeGenerator extends js.Object {
  var _setSlot: js.Any = js.native
  def getThemeAsCode(slotRules: IThemeRules): js.Any = js.native
  def getThemeAsJson(slotRules: IThemeRules): js.Any = js.native
  def getThemeAsSass(slotRules: IThemeRules): js.Any = js.native
  def getThemeForPowerShell(slotRules: IThemeRules): js.Any = js.native
  def insureSlots(slotRules: IThemeRules, isInverted: Boolean): Unit = js.native
  def setSlot(rule: IThemeSlotRule, color: String): Unit = js.native
  def setSlot(rule: IThemeSlotRule, color: String, isInverted: Boolean): Unit = js.native
  def setSlot(rule: IThemeSlotRule, color: String, isInverted: Boolean, isCustomization: Boolean): Unit = js.native
  def setSlot(
    rule: IThemeSlotRule,
    color: String,
    isInverted: Boolean,
    isCustomization: Boolean,
    overwriteCustomColor: Boolean
  ): Unit = js.native
  def setSlot(rule: IThemeSlotRule, color: IColor): Unit = js.native
  def setSlot(rule: IThemeSlotRule, color: IColor, isInverted: Boolean): Unit = js.native
  def setSlot(rule: IThemeSlotRule, color: IColor, isInverted: Boolean, isCustomization: Boolean): Unit = js.native
  def setSlot(
    rule: IThemeSlotRule,
    color: IColor,
    isInverted: Boolean,
    isCustomization: Boolean,
    overwriteCustomColor: Boolean
  ): Unit = js.native
}

