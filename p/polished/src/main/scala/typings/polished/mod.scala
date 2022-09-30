package typings.polished

import typings.polished.anon.FnCall
import typings.polished.colorMod.ContrastScores
import typings.polished.colorMod.HslColor
import typings.polished.colorMod.HslaColor
import typings.polished.colorMod.RgbColor
import typings.polished.colorMod.RgbaColor
import typings.polished.fluidRangeConfigurationMod.FluidRangeConfiguration
import typings.polished.fontFaceConfigurationMod.FontFaceConfiguration
import typings.polished.interactionStateMod.InteractionState
import typings.polished.linearGradientConfigurationMod.LinearGradientConfiguration
import typings.polished.modularScaleRatioMod.ModularScaleRatio
import typings.polished.radialGradientConfigurationMod.RadialGradientConfiguration
import typings.polished.sideKeywordMod.SideKeyword
import typings.polished.styleMod.Styles
import typings.polished.timingFunctionMod.TimingFunction
import typings.polished.triangleConfigurationMod.TriangleConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("polished", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adjustHue(degree: String): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("adjustHue")(degree.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  inline def adjustHue(degree: String, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("adjustHue")(degree.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def adjustHue(degree: Double): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("adjustHue")(degree.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  inline def adjustHue(degree: Double, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("adjustHue")(degree.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def animation(args: ((js.Array[String | Double]) | String | Double)*): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("animation")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Styles]
  
  inline def backgroundImages(properties: String*): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("backgroundImages")(properties.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Styles]
  
  inline def backgrounds(properties: String*): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("backgrounds")(properties.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Styles]
  
  inline def between(fromSize: String, toSize: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(fromSize.asInstanceOf[js.Any], toSize.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def between(fromSize: String, toSize: String, minScreen: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(fromSize.asInstanceOf[js.Any], toSize.asInstanceOf[js.Any], minScreen.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def between(fromSize: String, toSize: String, minScreen: String, maxScreen: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(fromSize.asInstanceOf[js.Any], toSize.asInstanceOf[js.Any], minScreen.asInstanceOf[js.Any], maxScreen.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def between(fromSize: String, toSize: String, minScreen: Unit, maxScreen: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(fromSize.asInstanceOf[js.Any], toSize.asInstanceOf[js.Any], minScreen.asInstanceOf[js.Any], maxScreen.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def between(fromSize: String, toSize: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(fromSize.asInstanceOf[js.Any], toSize.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def between(fromSize: String, toSize: Double, minScreen: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(fromSize.asInstanceOf[js.Any], toSize.asInstanceOf[js.Any], minScreen.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def between(fromSize: String, toSize: Double, minScreen: String, maxScreen: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(fromSize.asInstanceOf[js.Any], toSize.asInstanceOf[js.Any], minScreen.asInstanceOf[js.Any], maxScreen.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def between(fromSize: String, toSize: Double, minScreen: Unit, maxScreen: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(fromSize.asInstanceOf[js.Any], toSize.asInstanceOf[js.Any], minScreen.asInstanceOf[js.Any], maxScreen.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def between(fromSize: Double, toSize: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(fromSize.asInstanceOf[js.Any], toSize.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def between(fromSize: Double, toSize: String, minScreen: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(fromSize.asInstanceOf[js.Any], toSize.asInstanceOf[js.Any], minScreen.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def between(fromSize: Double, toSize: String, minScreen: String, maxScreen: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(fromSize.asInstanceOf[js.Any], toSize.asInstanceOf[js.Any], minScreen.asInstanceOf[js.Any], maxScreen.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def between(fromSize: Double, toSize: String, minScreen: Unit, maxScreen: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(fromSize.asInstanceOf[js.Any], toSize.asInstanceOf[js.Any], minScreen.asInstanceOf[js.Any], maxScreen.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def between(fromSize: Double, toSize: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(fromSize.asInstanceOf[js.Any], toSize.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def between(fromSize: Double, toSize: Double, minScreen: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(fromSize.asInstanceOf[js.Any], toSize.asInstanceOf[js.Any], minScreen.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def between(fromSize: Double, toSize: Double, minScreen: String, maxScreen: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(fromSize.asInstanceOf[js.Any], toSize.asInstanceOf[js.Any], minScreen.asInstanceOf[js.Any], maxScreen.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def between(fromSize: Double, toSize: Double, minScreen: Unit, maxScreen: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(fromSize.asInstanceOf[js.Any], toSize.asInstanceOf[js.Any], minScreen.asInstanceOf[js.Any], maxScreen.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def border(sideKeyword: String, values: (String | Double)*): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("border")(scala.List(sideKeyword.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Styles]
  inline def border(sideKeyword: Double, values: (String | Double)*): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("border")(scala.List(sideKeyword.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Styles]
  inline def border(sideKeyword: SideKeyword, values: (String | Double)*): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("border")(scala.List(sideKeyword.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Styles]
  
  inline def borderColor(values: (Null | Unit | String)*): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("borderColor")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Styles]
  
  inline def borderRadius(side: String, radius: String): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("borderRadius")(side.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Styles]
  inline def borderRadius(side: String, radius: Double): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("borderRadius")(side.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Styles]
  
  inline def borderStyle(values: (Null | Unit | String)*): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("borderStyle")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Styles]
  
  inline def borderWidth(values: (Null | Unit | String | Double)*): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("borderWidth")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Styles]
  
  inline def buttons(states: InteractionState*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buttons")(states.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def clearFix(): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("clearFix")().asInstanceOf[Styles]
  inline def clearFix(parent: String): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("clearFix")(parent.asInstanceOf[js.Any]).asInstanceOf[Styles]
  
  inline def complement(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("complement")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def cover(): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("cover")().asInstanceOf[Styles]
  inline def cover(offset: String): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("cover")(offset.asInstanceOf[js.Any]).asInstanceOf[Styles]
  inline def cover(offset: Double): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("cover")(offset.asInstanceOf[js.Any]).asInstanceOf[Styles]
  
  inline def cssVar(cssVariable: String): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cssVar")(cssVariable.asInstanceOf[js.Any]).asInstanceOf[String | Double]
  inline def cssVar(cssVariable: String, defaultValue: String): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cssVar")(cssVariable.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[String | Double]
  inline def cssVar(cssVariable: String, defaultValue: Double): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cssVar")(cssVariable.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[String | Double]
  
  inline def darken(amount: String): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("darken")(amount.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  inline def darken(amount: String, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("darken")(amount.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def darken(amount: Double): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("darken")(amount.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  inline def darken(amount: Double, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("darken")(amount.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def desaturate(amount: String): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("desaturate")(amount.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  inline def desaturate(amount: String, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("desaturate")(amount.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def desaturate(amount: Double): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("desaturate")(amount.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  inline def desaturate(amount: Double, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("desaturate")(amount.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def directionalProperty(property: String, values: (Null | Unit | String | Double)*): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("directionalProperty")(scala.List(property.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Styles]
  
  inline def easeIn(functionName: String): TimingFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("easeIn")(functionName.asInstanceOf[js.Any]).asInstanceOf[TimingFunction]
  
  inline def easeInOut(functionName: String): TimingFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOut")(functionName.asInstanceOf[js.Any]).asInstanceOf[TimingFunction]
  
  inline def easeOut(functionName: String): TimingFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOut")(functionName.asInstanceOf[js.Any]).asInstanceOf[TimingFunction]
  
  inline def ellipsis(): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")().asInstanceOf[Styles]
  inline def ellipsis(width: String): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")(width.asInstanceOf[js.Any]).asInstanceOf[Styles]
  inline def ellipsis(width: String, lines: Double): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")(width.asInstanceOf[js.Any], lines.asInstanceOf[js.Any])).asInstanceOf[Styles]
  inline def ellipsis(width: Double): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")(width.asInstanceOf[js.Any]).asInstanceOf[Styles]
  inline def ellipsis(width: Double, lines: Double): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")(width.asInstanceOf[js.Any], lines.asInstanceOf[js.Any])).asInstanceOf[Styles]
  inline def ellipsis(width: Null, lines: Double): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")(width.asInstanceOf[js.Any], lines.asInstanceOf[js.Any])).asInstanceOf[Styles]
  inline def ellipsis(width: Unit): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")(width.asInstanceOf[js.Any]).asInstanceOf[Styles]
  inline def ellipsis(width: Unit, lines: Double): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")(width.asInstanceOf[js.Any], lines.asInstanceOf[js.Any])).asInstanceOf[Styles]
  
  inline def em(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("em")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def em(value: String, base: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("em")(value.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def em(value: String, base: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("em")(value.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def em(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("em")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def em(value: Double, base: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("em")(value.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def em(value: Double, base: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("em")(value.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def fluidRange(cssProp: js.Array[FluidRangeConfiguration]): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("fluidRange")(cssProp.asInstanceOf[js.Any]).asInstanceOf[Styles]
  inline def fluidRange(cssProp: js.Array[FluidRangeConfiguration], minScreen: String): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("fluidRange")(cssProp.asInstanceOf[js.Any], minScreen.asInstanceOf[js.Any])).asInstanceOf[Styles]
  inline def fluidRange(cssProp: js.Array[FluidRangeConfiguration], minScreen: String, maxScreen: String): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("fluidRange")(cssProp.asInstanceOf[js.Any], minScreen.asInstanceOf[js.Any], maxScreen.asInstanceOf[js.Any])).asInstanceOf[Styles]
  inline def fluidRange(cssProp: js.Array[FluidRangeConfiguration], minScreen: Unit, maxScreen: String): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("fluidRange")(cssProp.asInstanceOf[js.Any], minScreen.asInstanceOf[js.Any], maxScreen.asInstanceOf[js.Any])).asInstanceOf[Styles]
  inline def fluidRange(cssProp: FluidRangeConfiguration): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("fluidRange")(cssProp.asInstanceOf[js.Any]).asInstanceOf[Styles]
  inline def fluidRange(cssProp: FluidRangeConfiguration, minScreen: String): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("fluidRange")(cssProp.asInstanceOf[js.Any], minScreen.asInstanceOf[js.Any])).asInstanceOf[Styles]
  inline def fluidRange(cssProp: FluidRangeConfiguration, minScreen: String, maxScreen: String): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("fluidRange")(cssProp.asInstanceOf[js.Any], minScreen.asInstanceOf[js.Any], maxScreen.asInstanceOf[js.Any])).asInstanceOf[Styles]
  inline def fluidRange(cssProp: FluidRangeConfiguration, minScreen: Unit, maxScreen: String): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("fluidRange")(cssProp.asInstanceOf[js.Any], minScreen.asInstanceOf[js.Any], maxScreen.asInstanceOf[js.Any])).asInstanceOf[Styles]
  
  inline def fontFace(
    hasFontFamilyFontFilePathFontStretchFontStyleFontVariantFontWeightFileFormatsFormatHintLocalFontsUnicodeRangeFontDisplayFontVariationSettingsFontFeatureSettings: FontFaceConfiguration
  ): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("fontFace")(hasFontFamilyFontFilePathFontStretchFontStyleFontVariantFontWeightFileFormatsFormatHintLocalFontsUnicodeRangeFontDisplayFontVariationSettingsFontFeatureSettings.asInstanceOf[js.Any]).asInstanceOf[Styles]
  
  inline def getContrast(color1: String, color2: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getContrast")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getLuminance(color: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLuminance")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getValueAndUnit(value: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getValueAndUnit")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def getValueAndUnit(value: Double): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getValueAndUnit")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def grayscale(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("grayscale")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hiDPI(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hiDPI")().asInstanceOf[String]
  inline def hiDPI(ratio: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hiDPI")(ratio.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hideText(): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("hideText")().asInstanceOf[Styles]
  
  inline def hideVisually(): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("hideVisually")().asInstanceOf[Styles]
  
  inline def hsl(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hsl")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hsl(value: Double, saturation: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hsl")(value.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hsl(value: Double, saturation: Double, lightness: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hsl")(value.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hsl(value: Double, saturation: Unit, lightness: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hsl")(value.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hsl(value: HslColor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hsl")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hsl(value: HslColor, saturation: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hsl")(value.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hsl(value: HslColor, saturation: Double, lightness: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hsl")(value.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hsl(value: HslColor, saturation: Unit, lightness: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hsl")(value.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hslToColorString(color: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hslToColorString")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hslToColorString(color: HslColor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hslToColorString")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hslToColorString(color: HslaColor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hslToColorString")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hsla(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hsla")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hsla(value: Double, saturation: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hsla")(value.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hsla(value: Double, saturation: Double, lightness: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hsla")(value.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hsla(value: Double, saturation: Double, lightness: Double, alpha: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hsla")(value.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hsla(value: Double, saturation: Double, lightness: Unit, alpha: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hsla")(value.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hsla(value: Double, saturation: Unit, lightness: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hsla")(value.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hsla(value: Double, saturation: Unit, lightness: Double, alpha: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hsla")(value.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hsla(value: Double, saturation: Unit, lightness: Unit, alpha: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hsla")(value.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hsla(value: HslaColor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hsla")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hsla(value: HslaColor, saturation: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hsla")(value.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hsla(value: HslaColor, saturation: Double, lightness: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hsla")(value.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hsla(value: HslaColor, saturation: Double, lightness: Double, alpha: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hsla")(value.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hsla(value: HslaColor, saturation: Double, lightness: Unit, alpha: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hsla")(value.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hsla(value: HslaColor, saturation: Unit, lightness: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hsla")(value.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hsla(value: HslaColor, saturation: Unit, lightness: Double, alpha: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hsla")(value.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hsla(value: HslaColor, saturation: Unit, lightness: Unit, alpha: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hsla")(value.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def important(styleBlock: Styles): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("important")(styleBlock.asInstanceOf[js.Any]).asInstanceOf[Styles]
  inline def important(styleBlock: Styles, rules: String): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("important")(styleBlock.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[Styles]
  inline def important(styleBlock: Styles, rules: js.Array[String]): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("important")(styleBlock.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[Styles]
  
  inline def invert(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("invert")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def lighten(amount: String): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("lighten")(amount.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  inline def lighten(amount: String, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lighten")(amount.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def lighten(amount: Double): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("lighten")(amount.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  inline def lighten(amount: Double, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lighten")(amount.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def linearGradient(hasColorStopsFallbackToDirection: LinearGradientConfiguration): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("linearGradient")(hasColorStopsFallbackToDirection.asInstanceOf[js.Any]).asInstanceOf[Styles]
  
  inline def margin(values: (Null | Unit | String | Double)*): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("margin")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Styles]
  
  inline def math(formula: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("math")(formula.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def math(formula: String, additionalSymbols: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("math")(formula.asInstanceOf[js.Any], additionalSymbols.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def meetsContrastGuidelines(color1: String, color2: String): ContrastScores = (^.asInstanceOf[js.Dynamic].applyDynamic("meetsContrastGuidelines")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[ContrastScores]
  
  inline def mix(weight: String): FnCall = ^.asInstanceOf[js.Dynamic].applyDynamic("mix")(weight.asInstanceOf[js.Any]).asInstanceOf[FnCall]
  inline def mix(weight: String, color: String): js.Function1[/* otherColor */ String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(weight.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* otherColor */ String, String]]
  inline def mix(weight: String, color: String, otherColor: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(weight.asInstanceOf[js.Any], color.asInstanceOf[js.Any], otherColor.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mix(weight: Double): FnCall = ^.asInstanceOf[js.Dynamic].applyDynamic("mix")(weight.asInstanceOf[js.Any]).asInstanceOf[FnCall]
  inline def mix(weight: Double, color: String): js.Function1[/* otherColor */ String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(weight.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* otherColor */ String, String]]
  inline def mix(weight: Double, color: String, otherColor: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(weight.asInstanceOf[js.Any], color.asInstanceOf[js.Any], otherColor.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def modularScale(steps: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("modularScale")(steps.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def modularScale(steps: Double, base: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("modularScale")(steps.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def modularScale(steps: Double, base: String, ratio: ModularScaleRatio): String = (^.asInstanceOf[js.Dynamic].applyDynamic("modularScale")(steps.asInstanceOf[js.Any], base.asInstanceOf[js.Any], ratio.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def modularScale(steps: Double, base: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("modularScale")(steps.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def modularScale(steps: Double, base: Double, ratio: ModularScaleRatio): String = (^.asInstanceOf[js.Dynamic].applyDynamic("modularScale")(steps.asInstanceOf[js.Any], base.asInstanceOf[js.Any], ratio.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def modularScale(steps: Double, base: Unit, ratio: ModularScaleRatio): String = (^.asInstanceOf[js.Dynamic].applyDynamic("modularScale")(steps.asInstanceOf[js.Any], base.asInstanceOf[js.Any], ratio.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def normalize(): js.Array[Styles] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")().asInstanceOf[js.Array[Styles]]
  
  inline def opacify(amount: String): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("opacify")(amount.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  inline def opacify(amount: String, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("opacify")(amount.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def opacify(amount: Double): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("opacify")(amount.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  inline def opacify(amount: Double, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("opacify")(amount.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def padding(values: (Null | Unit | String | Double)*): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("padding")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Styles]
  
  inline def parseToHsl(color: String): HslColor | HslaColor = ^.asInstanceOf[js.Dynamic].applyDynamic("parseToHsl")(color.asInstanceOf[js.Any]).asInstanceOf[HslColor | HslaColor]
  
  inline def parseToRgb(color: String): RgbColor | RgbaColor = ^.asInstanceOf[js.Dynamic].applyDynamic("parseToRgb")(color.asInstanceOf[js.Any]).asInstanceOf[RgbColor | RgbaColor]
  
  inline def position(firstValue: String, values: (Null | Unit | String | Double)*): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("position")(scala.List(firstValue.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Styles]
  inline def position(firstValue: Double, values: (Null | Unit | String | Double)*): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("position")(scala.List(firstValue.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Styles]
  inline def position(firstValue: Null, values: (Null | Unit | String | Double)*): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("position")(scala.List(firstValue.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Styles]
  
  inline def radialGradient(hasColorStopsExtentFallbackPositionShape: RadialGradientConfiguration): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("radialGradient")(hasColorStopsExtentFallbackPositionShape.asInstanceOf[js.Any]).asInstanceOf[Styles]
  
  inline def readableColor(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readableColor")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def readableColor(color: String, returnIfLightColor: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readableColor")(color.asInstanceOf[js.Any], returnIfLightColor.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def readableColor(color: String, returnIfLightColor: String, returnIfDarkColor: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readableColor")(color.asInstanceOf[js.Any], returnIfLightColor.asInstanceOf[js.Any], returnIfDarkColor.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def readableColor(color: String, returnIfLightColor: String, returnIfDarkColor: String, strict: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readableColor")(color.asInstanceOf[js.Any], returnIfLightColor.asInstanceOf[js.Any], returnIfDarkColor.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def readableColor(color: String, returnIfLightColor: String, returnIfDarkColor: Unit, strict: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readableColor")(color.asInstanceOf[js.Any], returnIfLightColor.asInstanceOf[js.Any], returnIfDarkColor.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def readableColor(color: String, returnIfLightColor: Unit, returnIfDarkColor: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readableColor")(color.asInstanceOf[js.Any], returnIfLightColor.asInstanceOf[js.Any], returnIfDarkColor.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def readableColor(color: String, returnIfLightColor: Unit, returnIfDarkColor: String, strict: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readableColor")(color.asInstanceOf[js.Any], returnIfLightColor.asInstanceOf[js.Any], returnIfDarkColor.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def readableColor(color: String, returnIfLightColor: Unit, returnIfDarkColor: Unit, strict: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readableColor")(color.asInstanceOf[js.Any], returnIfLightColor.asInstanceOf[js.Any], returnIfDarkColor.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def rem(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rem")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def rem(value: String, base: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rem")(value.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def rem(value: String, base: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rem")(value.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def rem(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rem")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def rem(value: Double, base: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rem")(value.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def rem(value: Double, base: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rem")(value.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def remToPx(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("remToPx")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def remToPx(value: String, base: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("remToPx")(value.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def remToPx(value: String, base: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("remToPx")(value.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def remToPx(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("remToPx")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def remToPx(value: Double, base: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("remToPx")(value.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def remToPx(value: Double, base: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("remToPx")(value.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def retinaImage(filename: String): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("retinaImage")(filename.asInstanceOf[js.Any]).asInstanceOf[Styles]
  inline def retinaImage(filename: String, backgroundSize: String): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("retinaImage")(filename.asInstanceOf[js.Any], backgroundSize.asInstanceOf[js.Any])).asInstanceOf[Styles]
  inline def retinaImage(filename: String, backgroundSize: String, `extension`: String): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("retinaImage")(filename.asInstanceOf[js.Any], backgroundSize.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[Styles]
  inline def retinaImage(filename: String, backgroundSize: String, `extension`: String, retinaFilename: String): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("retinaImage")(filename.asInstanceOf[js.Any], backgroundSize.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any], retinaFilename.asInstanceOf[js.Any])).asInstanceOf[Styles]
  inline def retinaImage(
    filename: String,
    backgroundSize: String,
    `extension`: String,
    retinaFilename: String,
    retinaSuffix: String
  ): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("retinaImage")(filename.asInstanceOf[js.Any], backgroundSize.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any], retinaFilename.asInstanceOf[js.Any], retinaSuffix.asInstanceOf[js.Any])).asInstanceOf[Styles]
  inline def retinaImage(
    filename: String,
    backgroundSize: String,
    `extension`: String,
    retinaFilename: Unit,
    retinaSuffix: String
  ): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("retinaImage")(filename.asInstanceOf[js.Any], backgroundSize.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any], retinaFilename.asInstanceOf[js.Any], retinaSuffix.asInstanceOf[js.Any])).asInstanceOf[Styles]
  inline def retinaImage(filename: String, backgroundSize: String, `extension`: Unit, retinaFilename: String): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("retinaImage")(filename.asInstanceOf[js.Any], backgroundSize.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any], retinaFilename.asInstanceOf[js.Any])).asInstanceOf[Styles]
  inline def retinaImage(
    filename: String,
    backgroundSize: String,
    `extension`: Unit,
    retinaFilename: String,
    retinaSuffix: String
  ): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("retinaImage")(filename.asInstanceOf[js.Any], backgroundSize.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any], retinaFilename.asInstanceOf[js.Any], retinaSuffix.asInstanceOf[js.Any])).asInstanceOf[Styles]
  inline def retinaImage(
    filename: String,
    backgroundSize: String,
    `extension`: Unit,
    retinaFilename: Unit,
    retinaSuffix: String
  ): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("retinaImage")(filename.asInstanceOf[js.Any], backgroundSize.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any], retinaFilename.asInstanceOf[js.Any], retinaSuffix.asInstanceOf[js.Any])).asInstanceOf[Styles]
  inline def retinaImage(filename: String, backgroundSize: Unit, `extension`: String): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("retinaImage")(filename.asInstanceOf[js.Any], backgroundSize.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[Styles]
  inline def retinaImage(filename: String, backgroundSize: Unit, `extension`: String, retinaFilename: String): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("retinaImage")(filename.asInstanceOf[js.Any], backgroundSize.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any], retinaFilename.asInstanceOf[js.Any])).asInstanceOf[Styles]
  inline def retinaImage(
    filename: String,
    backgroundSize: Unit,
    `extension`: String,
    retinaFilename: String,
    retinaSuffix: String
  ): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("retinaImage")(filename.asInstanceOf[js.Any], backgroundSize.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any], retinaFilename.asInstanceOf[js.Any], retinaSuffix.asInstanceOf[js.Any])).asInstanceOf[Styles]
  inline def retinaImage(
    filename: String,
    backgroundSize: Unit,
    `extension`: String,
    retinaFilename: Unit,
    retinaSuffix: String
  ): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("retinaImage")(filename.asInstanceOf[js.Any], backgroundSize.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any], retinaFilename.asInstanceOf[js.Any], retinaSuffix.asInstanceOf[js.Any])).asInstanceOf[Styles]
  inline def retinaImage(filename: String, backgroundSize: Unit, `extension`: Unit, retinaFilename: String): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("retinaImage")(filename.asInstanceOf[js.Any], backgroundSize.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any], retinaFilename.asInstanceOf[js.Any])).asInstanceOf[Styles]
  inline def retinaImage(
    filename: String,
    backgroundSize: Unit,
    `extension`: Unit,
    retinaFilename: String,
    retinaSuffix: String
  ): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("retinaImage")(filename.asInstanceOf[js.Any], backgroundSize.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any], retinaFilename.asInstanceOf[js.Any], retinaSuffix.asInstanceOf[js.Any])).asInstanceOf[Styles]
  inline def retinaImage(
    filename: String,
    backgroundSize: Unit,
    `extension`: Unit,
    retinaFilename: Unit,
    retinaSuffix: String
  ): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("retinaImage")(filename.asInstanceOf[js.Any], backgroundSize.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any], retinaFilename.asInstanceOf[js.Any], retinaSuffix.asInstanceOf[js.Any])).asInstanceOf[Styles]
  
  inline def rgb(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def rgb(value: Double, green: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(value.asInstanceOf[js.Any], green.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def rgb(value: Double, green: Double, blue: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(value.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def rgb(value: Double, green: Unit, blue: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(value.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def rgb(value: RgbColor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def rgb(value: RgbColor, green: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(value.asInstanceOf[js.Any], green.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def rgb(value: RgbColor, green: Double, blue: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(value.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def rgb(value: RgbColor, green: Unit, blue: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(value.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def rgbToColorString(color: RgbColor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rgbToColorString")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def rgbToColorString(color: RgbaColor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rgbToColorString")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def rgba(firstValue: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rgba")(firstValue.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def rgba(firstValue: String, secondValue: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgba")(firstValue.asInstanceOf[js.Any], secondValue.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def rgba(firstValue: String, secondValue: Double, thirdValue: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgba")(firstValue.asInstanceOf[js.Any], secondValue.asInstanceOf[js.Any], thirdValue.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def rgba(firstValue: String, secondValue: Double, thirdValue: Double, fourthValue: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgba")(firstValue.asInstanceOf[js.Any], secondValue.asInstanceOf[js.Any], thirdValue.asInstanceOf[js.Any], fourthValue.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def rgba(firstValue: String, secondValue: Double, thirdValue: Unit, fourthValue: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgba")(firstValue.asInstanceOf[js.Any], secondValue.asInstanceOf[js.Any], thirdValue.asInstanceOf[js.Any], fourthValue.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def rgba(firstValue: String, secondValue: Unit, thirdValue: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgba")(firstValue.asInstanceOf[js.Any], secondValue.asInstanceOf[js.Any], thirdValue.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def rgba(firstValue: String, secondValue: Unit, thirdValue: Double, fourthValue: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgba")(firstValue.asInstanceOf[js.Any], secondValue.asInstanceOf[js.Any], thirdValue.asInstanceOf[js.Any], fourthValue.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def rgba(firstValue: String, secondValue: Unit, thirdValue: Unit, fourthValue: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgba")(firstValue.asInstanceOf[js.Any], secondValue.asInstanceOf[js.Any], thirdValue.asInstanceOf[js.Any], fourthValue.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def rgba(firstValue: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rgba")(firstValue.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def rgba(firstValue: Double, secondValue: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgba")(firstValue.asInstanceOf[js.Any], secondValue.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def rgba(firstValue: Double, secondValue: Double, thirdValue: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgba")(firstValue.asInstanceOf[js.Any], secondValue.asInstanceOf[js.Any], thirdValue.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def rgba(firstValue: Double, secondValue: Double, thirdValue: Double, fourthValue: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgba")(firstValue.asInstanceOf[js.Any], secondValue.asInstanceOf[js.Any], thirdValue.asInstanceOf[js.Any], fourthValue.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def rgba(firstValue: Double, secondValue: Double, thirdValue: Unit, fourthValue: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgba")(firstValue.asInstanceOf[js.Any], secondValue.asInstanceOf[js.Any], thirdValue.asInstanceOf[js.Any], fourthValue.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def rgba(firstValue: Double, secondValue: Unit, thirdValue: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgba")(firstValue.asInstanceOf[js.Any], secondValue.asInstanceOf[js.Any], thirdValue.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def rgba(firstValue: Double, secondValue: Unit, thirdValue: Double, fourthValue: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgba")(firstValue.asInstanceOf[js.Any], secondValue.asInstanceOf[js.Any], thirdValue.asInstanceOf[js.Any], fourthValue.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def rgba(firstValue: Double, secondValue: Unit, thirdValue: Unit, fourthValue: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgba")(firstValue.asInstanceOf[js.Any], secondValue.asInstanceOf[js.Any], thirdValue.asInstanceOf[js.Any], fourthValue.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def rgba(firstValue: RgbaColor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rgba")(firstValue.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def rgba(firstValue: RgbaColor, secondValue: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgba")(firstValue.asInstanceOf[js.Any], secondValue.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def rgba(firstValue: RgbaColor, secondValue: Double, thirdValue: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgba")(firstValue.asInstanceOf[js.Any], secondValue.asInstanceOf[js.Any], thirdValue.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def rgba(firstValue: RgbaColor, secondValue: Double, thirdValue: Double, fourthValue: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgba")(firstValue.asInstanceOf[js.Any], secondValue.asInstanceOf[js.Any], thirdValue.asInstanceOf[js.Any], fourthValue.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def rgba(firstValue: RgbaColor, secondValue: Double, thirdValue: Unit, fourthValue: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgba")(firstValue.asInstanceOf[js.Any], secondValue.asInstanceOf[js.Any], thirdValue.asInstanceOf[js.Any], fourthValue.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def rgba(firstValue: RgbaColor, secondValue: Unit, thirdValue: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgba")(firstValue.asInstanceOf[js.Any], secondValue.asInstanceOf[js.Any], thirdValue.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def rgba(firstValue: RgbaColor, secondValue: Unit, thirdValue: Double, fourthValue: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgba")(firstValue.asInstanceOf[js.Any], secondValue.asInstanceOf[js.Any], thirdValue.asInstanceOf[js.Any], fourthValue.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def rgba(firstValue: RgbaColor, secondValue: Unit, thirdValue: Unit, fourthValue: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgba")(firstValue.asInstanceOf[js.Any], secondValue.asInstanceOf[js.Any], thirdValue.asInstanceOf[js.Any], fourthValue.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def saturate(amount: String): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("saturate")(amount.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  inline def saturate(amount: String, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("saturate")(amount.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def saturate(amount: Double): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("saturate")(amount.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  inline def saturate(amount: Double, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("saturate")(amount.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def setHue(hue: String): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("setHue")(hue.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  inline def setHue(hue: String, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("setHue")(hue.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def setHue(hue: Double): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("setHue")(hue.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  inline def setHue(hue: Double, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("setHue")(hue.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def setLightness(lightness: String): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("setLightness")(lightness.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  inline def setLightness(lightness: String, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("setLightness")(lightness.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def setLightness(lightness: Double): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("setLightness")(lightness.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  inline def setLightness(lightness: Double, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("setLightness")(lightness.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def setSaturation(saturation: String): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("setSaturation")(saturation.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  inline def setSaturation(saturation: String, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("setSaturation")(saturation.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def setSaturation(saturation: Double): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("setSaturation")(saturation.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  inline def setSaturation(saturation: Double, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("setSaturation")(saturation.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def shade(percentage: String): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("shade")(percentage.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  inline def shade(percentage: String, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("shade")(percentage.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def shade(percentage: Double): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("shade")(percentage.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  inline def shade(percentage: Double, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("shade")(percentage.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def size(height: String): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("size")(height.asInstanceOf[js.Any]).asInstanceOf[Styles]
  inline def size(height: String, width: String): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("size")(height.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Styles]
  inline def size(height: String, width: Double): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("size")(height.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Styles]
  inline def size(height: Double): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("size")(height.asInstanceOf[js.Any]).asInstanceOf[Styles]
  inline def size(height: Double, width: String): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("size")(height.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Styles]
  inline def size(height: Double, width: Double): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("size")(height.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Styles]
  
  inline def stripUnit(value: String): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("stripUnit")(value.asInstanceOf[js.Any]).asInstanceOf[String | Double]
  inline def stripUnit(value: Double): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("stripUnit")(value.asInstanceOf[js.Any]).asInstanceOf[String | Double]
  
  inline def textInputs(states: InteractionState*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("textInputs")(states.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def timingFunctions(timingFunction: TimingFunction): String = ^.asInstanceOf[js.Dynamic].applyDynamic("timingFunctions")(timingFunction.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def tint(percentage: String): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("tint")(percentage.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  inline def tint(percentage: String, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("tint")(percentage.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def tint(percentage: Double): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("tint")(percentage.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  inline def tint(percentage: Double, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("tint")(percentage.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toColorString(color: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toColorString")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def transitions(properties: (String | js.Array[String])*): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("transitions")(properties.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Styles]
  
  inline def transparentize(amount: String): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transparentize")(amount.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  inline def transparentize(amount: String, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("transparentize")(amount.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def transparentize(amount: Double): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transparentize")(amount.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  inline def transparentize(amount: Double, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("transparentize")(amount.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def triangle(hasPointingDirectionHeightWidthForegroundColorBackgroundColor: TriangleConfiguration): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("triangle")(hasPointingDirectionHeightWidthForegroundColorBackgroundColor.asInstanceOf[js.Any]).asInstanceOf[Styles]
  
  inline def wordWrap(): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("wordWrap")().asInstanceOf[Styles]
  inline def wordWrap(wrap: String): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("wordWrap")(wrap.asInstanceOf[js.Any]).asInstanceOf[Styles]
}
