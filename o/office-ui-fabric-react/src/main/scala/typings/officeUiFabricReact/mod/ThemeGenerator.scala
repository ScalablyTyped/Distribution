package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.interfacesMod.IColor
import typings.officeUiFabricReact.ithemerulesMod.IThemeRules
import typings.officeUiFabricReact.ithemeslotruleMod.IThemeSlotRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react", "ThemeGenerator")
@js.native
class ThemeGenerator ()
  extends typings.officeUiFabricReact.libThemeGeneratorMod.ThemeGenerator

/* static members */
@JSImport("office-ui-fabric-react", "ThemeGenerator")
@js.native
object ThemeGenerator extends js.Object {
  var _makeRemainingCode: js.Any = js.native
  var _setSlot: js.Any = js.native
  def getThemeAsCode(slotRules: IThemeRules): js.Any = js.native
  /**
    * Gets code-formatted load theme blob, specifically for the new theme designer,
    * aka.ms/themedesigner. Shouldn't use loadTheme like the old theme designer since it's deprecated.
    * We want to use the theme object from createTheme and use the Customizations.applySettings API instead.
    */
  def getThemeAsCodeWithCreateTheme(slotRules: IThemeRules): js.Any = js.native
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

