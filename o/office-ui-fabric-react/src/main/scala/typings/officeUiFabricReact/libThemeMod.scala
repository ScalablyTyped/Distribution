package typings.officeUiFabricReact

import org.scalablytyped.runtime.StringDictionary
import typings.fluentuiReactThemeProvider.anon.Children
import typings.fluentuiReactThemeProvider.anon.Render
import typings.fluentuiReactThemeProvider.anon.Style
import typings.fluentuiReactThemeProvider.libMakeStylesMod.UseStylesOptions
import typings.fluentuiReactThemeProvider.libMakeVariantClassesMod.MakeVariantClassesOptions
import typings.fluentuiReactThemeProvider.libStyleRenderersTypesMod.StyleRenderer
import typings.fluentuiReactThemeProvider.libThemeProviderDottypesMod.ThemeProviderProps
import typings.fluentuiReactThemeProvider.libThemeProviderDottypesMod.ThemeProviderState
import typings.fluentuiReactThemeProvider.libTypesMod.StyleOptions
import typings.fluentuiReactThemeProvider.libTypesMod.StyleProps
import typings.fluentuiTheme.libTypesIanimationstylesMod.IAnimationStyles
import typings.fluentuiTheme.libTypesIanimationstylesMod.IAnimationVariables
import typings.fluentuiTheme.libTypesIeffectsMod.IEffects
import typings.fluentuiTheme.libTypesIfontstylesMod.IFontStyles
import typings.fluentuiTheme.libTypesIpaletteMod.IPalette
import typings.fluentuiTheme.libTypesIspacingMod.ISpacing
import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.fluentuiTheme.libTypesThemeMod.PartialTheme
import typings.fluentuiTheme.libTypesThemeMod.Theme
import typings.react.mod.CSSProperties
import typings.react.mod.Context
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.Ref
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLButtonElement
import typings.std.HTMLElement
import typings.std.Record
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libThemeMod {
  
  @JSImport("office-ui-fabric-react/lib/Theme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/Theme", "AnimationStyles")
  @js.native
  val AnimationStyles: IAnimationStyles = js.native
  
  @JSImport("office-ui-fabric-react/lib/Theme", "AnimationVariables")
  @js.native
  val AnimationVariables: IAnimationVariables = js.native
  
  object CommunicationColors {
    
    @JSImport("office-ui-fabric-react/lib/Theme", "CommunicationColors.primary")
    @js.native
    val primary: /* "#0078d4" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "CommunicationColors.shade10")
    @js.native
    val shade10: /* "#106ebe" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "CommunicationColors.shade20")
    @js.native
    val shade20: /* "#005a9e" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "CommunicationColors.shade30")
    @js.native
    val shade30: /* "#004578" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "CommunicationColors.tint10")
    @js.native
    val tint10: /* "#2b88d8" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "CommunicationColors.tint20")
    @js.native
    val tint20: /* "#c7e0f4" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "CommunicationColors.tint30")
    @js.native
    val tint30: /* "#deecf9" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "CommunicationColors.tint40")
    @js.native
    val tint40: /* "#eff6fc" */ String = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/Theme", "DefaultEffects")
  @js.native
  val DefaultEffects: IEffects = js.native
  
  @JSImport("office-ui-fabric-react/lib/Theme", "DefaultFontStyles")
  @js.native
  val DefaultFontStyles: IFontStyles = js.native
  
  @JSImport("office-ui-fabric-react/lib/Theme", "DefaultPalette")
  @js.native
  val DefaultPalette: IPalette = js.native
  
  @JSImport("office-ui-fabric-react/lib/Theme", "DefaultSpacing")
  @js.native
  val DefaultSpacing: ISpacing = js.native
  
  object Depths {
    
    @JSImport("office-ui-fabric-react/lib/Theme", "Depths.depth0")
    @js.native
    val depth0: /* "0 0 0 0 transparent" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "Depths.depth16")
    @js.native
    val depth16: /* "0 6.4px 14.4px 0 rgba(0, 0, 0, 0.132), 0 1.2px 3.6px 0 rgba(0, 0, 0, 0.108)" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "Depths.depth4")
    @js.native
    val depth4: /* "0 1.6px 3.6px 0 rgba(0, 0, 0, 0.132), 0 0.3px 0.9px 0 rgba(0, 0, 0, 0.108)" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "Depths.depth64")
    @js.native
    val depth64: /* "0 25.6px 57.6px 0 rgba(0, 0, 0, 0.22), 0 4.8px 14.4px 0 rgba(0, 0, 0, 0.18)" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "Depths.depth8")
    @js.native
    val depth8: /* "0 3.2px 7.2px 0 rgba(0, 0, 0, 0.132), 0 0.6px 1.8px 0 rgba(0, 0, 0, 0.108)" */ String = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/Theme", "FluentTheme")
  @js.native
  val FluentTheme: ITheme = js.native
  
  object LocalizedFontFamilies {
    
    @JSImport("office-ui-fabric-react/lib/Theme", "LocalizedFontFamilies.Arabic")
    @js.native
    val Arabic: String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "LocalizedFontFamilies.Armenian")
    @js.native
    val Armenian: String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "LocalizedFontFamilies.ChineseSimplified")
    @js.native
    val ChineseSimplified: /* "'Microsoft Yahei UI', Verdana, Simsun" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "LocalizedFontFamilies.ChineseTraditional")
    @js.native
    val ChineseTraditional: /* "'Microsoft Jhenghei UI', Pmingliu" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "LocalizedFontFamilies.Cyrillic")
    @js.native
    val Cyrillic: String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "LocalizedFontFamilies.EastEuropean")
    @js.native
    val EastEuropean: String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "LocalizedFontFamilies.Georgian")
    @js.native
    val Georgian: String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "LocalizedFontFamilies.Greek")
    @js.native
    val Greek: String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "LocalizedFontFamilies.Hebrew")
    @js.native
    val Hebrew: String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "LocalizedFontFamilies.Hindi")
    @js.native
    val Hindi: /* "'Nirmala UI'" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "LocalizedFontFamilies.Japanese")
    @js.native
    val Japanese: /* "'Yu Gothic UI', 'Meiryo UI', Meiryo, 'MS Pgothic', Osaka" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "LocalizedFontFamilies.Korean")
    @js.native
    val Korean: /* "'Malgun Gothic', Gulim" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "LocalizedFontFamilies.Selawik")
    @js.native
    val Selawik: String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "LocalizedFontFamilies.Thai")
    @js.native
    val Thai: /* "'Leelawadee UI Web', 'Kmer UI'" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "LocalizedFontFamilies.Vietnamese")
    @js.native
    val Vietnamese: String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "LocalizedFontFamilies.WestEuropean")
    @js.native
    val WestEuropean: String = js.native
  }
  
  object LocalizedFontNames {
    
    @JSImport("office-ui-fabric-react/lib/Theme", "LocalizedFontNames.Arabic")
    @js.native
    val Arabic: /* "Segoe UI Web (Arabic)" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "LocalizedFontNames.Armenian")
    @js.native
    val Armenian: /* "Segoe UI Web (Armenian)" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "LocalizedFontNames.Cyrillic")
    @js.native
    val Cyrillic: /* "Segoe UI Web (Cyrillic)" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "LocalizedFontNames.EastEuropean")
    @js.native
    val EastEuropean: /* "Segoe UI Web (East European)" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "LocalizedFontNames.Georgian")
    @js.native
    val Georgian: /* "Segoe UI Web (Georgian)" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "LocalizedFontNames.Greek")
    @js.native
    val Greek: /* "Segoe UI Web (Greek)" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "LocalizedFontNames.Hebrew")
    @js.native
    val Hebrew: /* "Segoe UI Web (Hebrew)" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "LocalizedFontNames.Selawik")
    @js.native
    val Selawik: /* "Selawik Web" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "LocalizedFontNames.Thai")
    @js.native
    val Thai: /* "Leelawadee UI Web" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "LocalizedFontNames.Vietnamese")
    @js.native
    val Vietnamese: /* "Segoe UI Web (Vietnamese)" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "LocalizedFontNames.WestEuropean")
    @js.native
    val WestEuropean: /* "Segoe UI Web (West European)" */ String = js.native
  }
  
  inline def MergeStylesProvider(param0: Children): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MergeStylesProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object MotionAnimations {
    
    @JSImport("office-ui-fabric-react/lib/Theme", "MotionAnimations.fadeIn")
    @js.native
    val fadeIn: String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "MotionAnimations.fadeOut")
    @js.native
    val fadeOut: String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "MotionAnimations.scaleDownIn")
    @js.native
    val scaleDownIn: String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "MotionAnimations.scaleDownOut")
    @js.native
    val scaleDownOut: String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "MotionAnimations.slideDownIn")
    @js.native
    val slideDownIn: String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "MotionAnimations.slideDownOut")
    @js.native
    val slideDownOut: String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "MotionAnimations.slideLeftIn")
    @js.native
    val slideLeftIn: String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "MotionAnimations.slideLeftOut")
    @js.native
    val slideLeftOut: String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "MotionAnimations.slideRightIn")
    @js.native
    val slideRightIn: String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "MotionAnimations.slideRightOut")
    @js.native
    val slideRightOut: String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "MotionAnimations.slideUpIn")
    @js.native
    val slideUpIn: String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "MotionAnimations.slideUpOut")
    @js.native
    val slideUpOut: String = js.native
  }
  
  object MotionDurations {
    
    @JSImport("office-ui-fabric-react/lib/Theme", "MotionDurations.duration1")
    @js.native
    val duration1: /* "100ms" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "MotionDurations.duration2")
    @js.native
    val duration2: /* "200ms" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "MotionDurations.duration3")
    @js.native
    val duration3: /* "300ms" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "MotionDurations.duration4")
    @js.native
    val duration4: /* "400ms" */ String = js.native
  }
  
  object MotionTimings {
    
    @JSImport("office-ui-fabric-react/lib/Theme", "MotionTimings.accelerate")
    @js.native
    val accelerate: /* "cubic-bezier(0.9, 0.1, 1, 0.2)" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "MotionTimings.decelerate")
    @js.native
    val decelerate: /* "cubic-bezier(0.1, 0.9, 0.2, 1)" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "MotionTimings.linear")
    @js.native
    val linear: /* "cubic-bezier(0, 0, 1, 1)" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "MotionTimings.standard")
    @js.native
    val standard: /* "cubic-bezier(0.8, 0, 0.2, 1)" */ String = js.native
  }
  
  object NeutralColors {
    
    @JSImport("office-ui-fabric-react/lib/Theme", "NeutralColors.black")
    @js.native
    val black: /* "#000000" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "NeutralColors.gray10")
    @js.native
    val gray10: /* "#faf9f8" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "NeutralColors.gray100")
    @js.native
    val gray100: /* "#979593" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "NeutralColors.gray110")
    @js.native
    val gray110: /* "#8a8886" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "NeutralColors.gray120")
    @js.native
    val gray120: /* "#797775" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "NeutralColors.gray130")
    @js.native
    val gray130: /* "#605e5c" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "NeutralColors.gray140")
    @js.native
    val gray140: /* "#484644" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "NeutralColors.gray150")
    @js.native
    val gray150: /* "#3b3a39" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "NeutralColors.gray160")
    @js.native
    val gray160: /* "#323130" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "NeutralColors.gray170")
    @js.native
    val gray170: /* "#292827" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "NeutralColors.gray180")
    @js.native
    val gray180: /* "#252423" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "NeutralColors.gray190")
    @js.native
    val gray190: /* "#201f1e" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "NeutralColors.gray20")
    @js.native
    val gray20: /* "#f3f2f1" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "NeutralColors.gray200")
    @js.native
    val gray200: /* "#1b1a19" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "NeutralColors.gray210")
    @js.native
    val gray210: /* "#161514" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "NeutralColors.gray220")
    @js.native
    val gray220: /* "#11100f" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "NeutralColors.gray30")
    @js.native
    val gray30: /* "#edebe9" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "NeutralColors.gray40")
    @js.native
    val gray40: /* "#e1dfdd" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "NeutralColors.gray50")
    @js.native
    val gray50: /* "#d2d0ce" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "NeutralColors.gray60")
    @js.native
    val gray60: /* "#c8c6c4" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "NeutralColors.gray70")
    @js.native
    val gray70: /* "#bebbb8" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "NeutralColors.gray80")
    @js.native
    val gray80: /* "#b3b0ad" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "NeutralColors.gray90")
    @js.native
    val gray90: /* "#a19f9d" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "NeutralColors.white")
    @js.native
    val white: /* "#ffffff" */ String = js.native
  }
  
  object SharedColors {
    
    @JSImport("office-ui-fabric-react/lib/Theme", "SharedColors.blue10")
    @js.native
    val blue10: /* "#4f6bed" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "SharedColors.blueMagenta10")
    @js.native
    val blueMagenta10: /* "#8378de" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "SharedColors.blueMagenta20")
    @js.native
    val blueMagenta20: /* "#8764b8" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "SharedColors.blueMagenta30")
    @js.native
    val blueMagenta30: /* "#5c2e91" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "SharedColors.blueMagenta40")
    @js.native
    val blueMagenta40: /* "#373277" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "SharedColors.cyan10")
    @js.native
    val cyan10: /* "#00b7c3" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "SharedColors.cyan20")
    @js.native
    val cyan20: /* "#038387" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "SharedColors.cyan30")
    @js.native
    val cyan30: /* "#005b70" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "SharedColors.cyan40")
    @js.native
    val cyan40: /* "#005e50" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "SharedColors.cyanBlue10")
    @js.native
    val cyanBlue10: /* "#0078d4" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "SharedColors.cyanBlue20")
    @js.native
    val cyanBlue20: /* "#004e8c" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "SharedColors.gray10")
    @js.native
    val gray10: /* "#a0aeb2" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "SharedColors.gray20")
    @js.native
    val gray20: /* "#69797e" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "SharedColors.gray30")
    @js.native
    val gray30: /* "#7a7574" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "SharedColors.gray40")
    @js.native
    val gray40: /* "#393939" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "SharedColors.green10")
    @js.native
    val green10: /* "#498205" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "SharedColors.green20")
    @js.native
    val green20: /* "#0b6a0b" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "SharedColors.greenCyan10")
    @js.native
    val greenCyan10: /* "#00ad56" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "SharedColors.magenta10")
    @js.native
    val magenta10: /* "#c239b3" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "SharedColors.magenta20")
    @js.native
    val magenta20: /* "#881798" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "SharedColors.magentaPink10")
    @js.native
    val magentaPink10: /* "#e3008c" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "SharedColors.magentaPink20")
    @js.native
    val magentaPink20: /* "#9b0062" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "SharedColors.orange10")
    @js.native
    val orange10: /* "#ffaa44" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "SharedColors.orange20")
    @js.native
    val orange20: /* "#ca5010" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "SharedColors.orange30")
    @js.native
    val orange30: /* "#8e562e" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "SharedColors.orangeYellow10")
    @js.native
    val orangeYellow10: /* "#c19c00" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "SharedColors.orangeYellow20")
    @js.native
    val orangeYellow20: /* "#986f0b" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "SharedColors.pinkRed10")
    @js.native
    val pinkRed10: /* "#750b1c" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "SharedColors.red10")
    @js.native
    val red10: /* "#d13438" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "SharedColors.red20")
    @js.native
    val red20: /* "#a4262c" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "SharedColors.redOrange10")
    @js.native
    val redOrange10: /* "#da3b01" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "SharedColors.redOrange20")
    @js.native
    val redOrange20: /* "#603d30" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "SharedColors.yellow10")
    @js.native
    val yellow10: /* "#fce100" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Theme", "SharedColors.yellowGreen10")
    @js.native
    val yellowGreen10: /* "#8cbd18" */ String = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/Theme", "StyleRendererContext")
  @js.native
  val StyleRendererContext: Context[StyleRenderer] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Theme", "ThemeContext")
  @js.native
  val ThemeContext: Context[js.UndefOr[Theme]] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Theme", "ThemeProvider")
  @js.native
  val ThemeProvider: FunctionComponent[ThemeProviderProps] = js.native
  
  inline def applyClasses[TState /* <: js.Object */](state: TState, classMap: Record[String, String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyClasses")(state.asInstanceOf[js.Any], classMap.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createFontStyles(): IFontStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("createFontStyles")().asInstanceOf[IFontStyles]
  inline def createFontStyles(localeCode: String): IFontStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("createFontStyles")(localeCode.asInstanceOf[js.Any]).asInstanceOf[IFontStyles]
  
  inline def createTheme(): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")().asInstanceOf[Theme]
  inline def createTheme(theme: Unit, depComments: Boolean): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(theme.asInstanceOf[js.Any], depComments.asInstanceOf[js.Any])).asInstanceOf[Theme]
  inline def createTheme(theme: PartialTheme): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(theme.asInstanceOf[js.Any]).asInstanceOf[Theme]
  inline def createTheme(theme: PartialTheme, depComments: Boolean): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(theme.asInstanceOf[js.Any], depComments.asInstanceOf[js.Any])).asInstanceOf[Theme]
  
  inline def getStyleFromPropsAndOptions[TProps /* <: StyleProps[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_theme.ColorTokenSet */ Any
  ] */, TOptions /* <: StyleOptions[TProps] */](props: TProps, options: TOptions): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyleFromPropsAndOptions")(props.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  inline def getStyleFromPropsAndOptions[TProps /* <: StyleProps[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_theme.ColorTokenSet */ Any
  ] */, TOptions /* <: StyleOptions[TProps] */](props: TProps, options: TOptions, prefix: String): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyleFromPropsAndOptions")(props.asInstanceOf[js.Any], options.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  
  inline def makeClasses[TState /* <: js.Object */](styleOrFunction: js.Function1[/* theme */ Theme, Record[String, IStyle]]): js.Function2[/* state */ TState, /* options */ js.UndefOr[UseStylesOptions], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeClasses")(styleOrFunction.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* state */ TState, /* options */ js.UndefOr[UseStylesOptions], Unit]]
  inline def makeClasses[TState /* <: js.Object */](styleOrFunction: Record[String, IStyle]): js.Function2[/* state */ TState, /* options */ js.UndefOr[UseStylesOptions], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeClasses")(styleOrFunction.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* state */ TState, /* options */ js.UndefOr[UseStylesOptions], Unit]]
  
  inline def makeStyles[TStyleSet /* <: StringDictionary[IStyle] */](styleOrFunction: TStyleSet): js.Function1[
    /* options */ js.UndefOr[UseStylesOptions], 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof TStyleSet ]: string} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeStyles")(styleOrFunction.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* options */ js.UndefOr[UseStylesOptions], 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof TStyleSet ]: string} */ js.Any
  ]]
  inline def makeStyles[TStyleSet /* <: StringDictionary[IStyle] */](styleOrFunction: js.Function1[/* theme */ Theme, TStyleSet]): js.Function1[
    /* options */ js.UndefOr[UseStylesOptions], 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof TStyleSet ]: string} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeStyles")(styleOrFunction.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* options */ js.UndefOr[UseStylesOptions], 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof TStyleSet ]: string} */ js.Any
  ]]
  
  inline def makeVariantClasses[TState, TVariants](options: MakeVariantClassesOptions[TVariants]): js.Function2[/* state */ TState, /* options */ js.UndefOr[UseStylesOptions], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeVariantClasses")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* state */ TState, /* options */ js.UndefOr[UseStylesOptions], Unit]]
  
  @JSImport("office-ui-fabric-react/lib/Theme", "mergeStylesRenderer")
  @js.native
  val mergeStylesRenderer: StyleRenderer = js.native
  
  inline def mergeThemes(theme: Theme): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeThemes")(theme.asInstanceOf[js.Any]).asInstanceOf[Theme]
  inline def mergeThemes(theme: Theme, partialTheme: PartialTheme): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeThemes")(theme.asInstanceOf[js.Any], partialTheme.asInstanceOf[js.Any])).asInstanceOf[Theme]
  
  inline def registerDefaultFontFaces(baseUrl: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerDefaultFontFaces")(baseUrl.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def tokensToStyleObject(): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("tokensToStyleObject")().asInstanceOf[CSSProperties]
  inline def tokensToStyleObject(
    tokens: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TokenSetType */ Any
  ): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("tokensToStyleObject")(tokens.asInstanceOf[js.Any]).asInstanceOf[CSSProperties]
  inline def tokensToStyleObject(
    tokens: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TokenSetType */ Any,
    prefix: String
  ): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("tokensToStyleObject")(tokens.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  inline def tokensToStyleObject(
    tokens: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TokenSetType */ Any,
    prefix: String,
    style: CSSProperties
  ): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("tokensToStyleObject")(tokens.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  inline def tokensToStyleObject(
    tokens: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TokenSetType */ Any,
    prefix: Unit,
    style: CSSProperties
  ): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("tokensToStyleObject")(tokens.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  inline def tokensToStyleObject(tokens: Unit, prefix: String): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("tokensToStyleObject")(tokens.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  inline def tokensToStyleObject(tokens: Unit, prefix: String, style: CSSProperties): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("tokensToStyleObject")(tokens.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  inline def tokensToStyleObject(tokens: Unit, prefix: Unit, style: CSSProperties): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("tokensToStyleObject")(tokens.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  inline def tokensToStyleObject(tokens: CSSProperties): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("tokensToStyleObject")(tokens.asInstanceOf[js.Any]).asInstanceOf[CSSProperties]
  inline def tokensToStyleObject(tokens: CSSProperties, prefix: String): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("tokensToStyleObject")(tokens.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  inline def tokensToStyleObject(tokens: CSSProperties, prefix: String, style: CSSProperties): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("tokensToStyleObject")(tokens.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  inline def tokensToStyleObject(tokens: CSSProperties, prefix: Unit, style: CSSProperties): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("tokensToStyleObject")(tokens.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  
  inline def useInlineTokens(draftState: Style, prefix: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useInlineTokens")(draftState.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useStyleRenderer(): StyleRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("useStyleRenderer")().asInstanceOf[StyleRenderer]
  
  inline def useTheme(): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[Theme]
  
  inline def useThemeProvider(props: ThemeProviderProps, ref: Ref[HTMLElement], defaultProps: ThemeProviderProps): Render = (^.asInstanceOf[js.Dynamic].applyDynamic("useThemeProvider")(props.asInstanceOf[js.Any], ref.asInstanceOf[js.Any], defaultProps.asInstanceOf[js.Any])).asInstanceOf[Render]
  
  inline def useThemeProviderClasses(state: ThemeProviderState): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useThemeProviderClasses")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useThemeProviderState(draftState: ThemeProviderState): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useThemeProviderState")(draftState.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def withThemeProvider[TProps](Component: FunctionComponent[TProps]): ForwardRefExoticComponent[PropsWithoutRef[TProps] & RefAttributes[HTMLButtonElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withThemeProvider")(Component.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TProps] & RefAttributes[HTMLButtonElement]]]
}
