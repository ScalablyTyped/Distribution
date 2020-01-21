package typings.officeUiFabricReact

import typings.officeUiFabricReact.interfacesMod.IColor
import typings.officeUiFabricReact.ithemerulesMod.IThemeRules
import typings.officeUiFabricReact.ithemeslotruleMod.IThemeSlotRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ThemeGenerator", JSImport.Namespace)
@js.native
object themeGeneratorMod extends js.Object {
  @js.native
  class ThemeGenerator ()
    extends typings.officeUiFabricReact.themeGeneratorThemeGeneratorMod.ThemeGenerator
  
  def themeRulesStandardCreator(): IThemeRules = js.native
  @js.native
  object BaseSlots extends js.Object {
    /* 1 */ val backgroundColor: typings.officeUiFabricReact.themeRulesStandardMod.BaseSlots.backgroundColor with Double = js.native
    /* 2 */ val foregroundColor: typings.officeUiFabricReact.themeRulesStandardMod.BaseSlots.foregroundColor with Double = js.native
    /* 0 */ val primaryColor: typings.officeUiFabricReact.themeRulesStandardMod.BaseSlots.primaryColor with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.themeRulesStandardMod.BaseSlots with Double] = js.native
  }
  
  @js.native
  object FabricSlots extends js.Object {
    /* 20 */ val black: typings.officeUiFabricReact.themeRulesStandardMod.FabricSlots.black with Double = js.native
    /* 19 */ val neutralDark: typings.officeUiFabricReact.themeRulesStandardMod.FabricSlots.neutralDark with Double = js.native
    /* 11 */ val neutralLight: typings.officeUiFabricReact.themeRulesStandardMod.FabricSlots.neutralLight with Double = js.native
    /* 10 */ val neutralLighter: typings.officeUiFabricReact.themeRulesStandardMod.FabricSlots.neutralLighter with Double = js.native
    /* 9 */ val neutralLighterAlt: typings.officeUiFabricReact.themeRulesStandardMod.FabricSlots.neutralLighterAlt with Double = js.native
    /* 18 */ val neutralPrimary: typings.officeUiFabricReact.themeRulesStandardMod.FabricSlots.neutralPrimary with Double = js.native
    /* 17 */ val neutralPrimaryAlt: typings.officeUiFabricReact.themeRulesStandardMod.FabricSlots.neutralPrimaryAlt with Double = js.native
    /* 13 */ val neutralQuaternary: typings.officeUiFabricReact.themeRulesStandardMod.FabricSlots.neutralQuaternary with Double = js.native
    /* 12 */ val neutralQuaternaryAlt: typings.officeUiFabricReact.themeRulesStandardMod.FabricSlots.neutralQuaternaryAlt with Double = js.native
    /* 16 */ val neutralSecondary: typings.officeUiFabricReact.themeRulesStandardMod.FabricSlots.neutralSecondary with Double = js.native
    /* 15 */ val neutralTertiary: typings.officeUiFabricReact.themeRulesStandardMod.FabricSlots.neutralTertiary with Double = js.native
    /* 14 */ val neutralTertiaryAlt: typings.officeUiFabricReact.themeRulesStandardMod.FabricSlots.neutralTertiaryAlt with Double = js.native
    /* 7 */ val themeDark: typings.officeUiFabricReact.themeRulesStandardMod.FabricSlots.themeDark with Double = js.native
    /* 6 */ val themeDarkAlt: typings.officeUiFabricReact.themeRulesStandardMod.FabricSlots.themeDarkAlt with Double = js.native
    /* 8 */ val themeDarker: typings.officeUiFabricReact.themeRulesStandardMod.FabricSlots.themeDarker with Double = js.native
    /* 3 */ val themeLight: typings.officeUiFabricReact.themeRulesStandardMod.FabricSlots.themeLight with Double = js.native
    /* 2 */ val themeLighter: typings.officeUiFabricReact.themeRulesStandardMod.FabricSlots.themeLighter with Double = js.native
    /* 1 */ val themeLighterAlt: typings.officeUiFabricReact.themeRulesStandardMod.FabricSlots.themeLighterAlt with Double = js.native
    /* 0 */ val themePrimary: typings.officeUiFabricReact.themeRulesStandardMod.FabricSlots.themePrimary with Double = js.native
    /* 5 */ val themeSecondary: typings.officeUiFabricReact.themeRulesStandardMod.FabricSlots.themeSecondary with Double = js.native
    /* 4 */ val themeTertiary: typings.officeUiFabricReact.themeRulesStandardMod.FabricSlots.themeTertiary with Double = js.native
    /* 21 */ val white: typings.officeUiFabricReact.themeRulesStandardMod.FabricSlots.white with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.themeRulesStandardMod.FabricSlots with Double] = js.native
  }
  
  @js.native
  object SemanticColorSlots extends js.Object {
    /* 0 */ val bodyBackground: typings.officeUiFabricReact.themeRulesStandardMod.SemanticColorSlots.bodyBackground with Double = js.native
    /* 1 */ val bodyText: typings.officeUiFabricReact.themeRulesStandardMod.SemanticColorSlots.bodyText with Double = js.native
    /* 2 */ val disabledBackground: typings.officeUiFabricReact.themeRulesStandardMod.SemanticColorSlots.disabledBackground with Double = js.native
    /* 3 */ val disabledText: typings.officeUiFabricReact.themeRulesStandardMod.SemanticColorSlots.disabledText with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.themeRulesStandardMod.SemanticColorSlots with Double] = js.native
  }
  
  /* static members */
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
  
}

