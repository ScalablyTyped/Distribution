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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("polished", "adjustHue")
  @js.native
  def adjustHue(degree: String): js.Function1[/* color */ String, String] = js.native
  @JSImport("polished", "adjustHue")
  @js.native
  def adjustHue(degree: String, color: String): String = js.native
  @JSImport("polished", "adjustHue")
  @js.native
  def adjustHue(degree: Double): js.Function1[/* color */ String, String] = js.native
  @JSImport("polished", "adjustHue")
  @js.native
  def adjustHue(degree: Double, color: String): String = js.native
  
  @JSImport("polished", "animation")
  @js.native
  def animation(args: ((js.Array[String | Double]) | String | Double)*): Styles = js.native
  
  @JSImport("polished", "backgroundImages")
  @js.native
  def backgroundImages(properties: String*): Styles = js.native
  
  @JSImport("polished", "backgrounds")
  @js.native
  def backgrounds(properties: String*): Styles = js.native
  
  @JSImport("polished", "between")
  @js.native
  def between(fromSize: String, toSize: String): String = js.native
  @JSImport("polished", "between")
  @js.native
  def between(fromSize: String, toSize: String, minScreen: js.UndefOr[scala.Nothing], maxScreen: String): String = js.native
  @JSImport("polished", "between")
  @js.native
  def between(fromSize: String, toSize: String, minScreen: String): String = js.native
  @JSImport("polished", "between")
  @js.native
  def between(fromSize: String, toSize: String, minScreen: String, maxScreen: String): String = js.native
  @JSImport("polished", "between")
  @js.native
  def between(fromSize: String, toSize: Double): String = js.native
  @JSImport("polished", "between")
  @js.native
  def between(fromSize: String, toSize: Double, minScreen: js.UndefOr[scala.Nothing], maxScreen: String): String = js.native
  @JSImport("polished", "between")
  @js.native
  def between(fromSize: String, toSize: Double, minScreen: String): String = js.native
  @JSImport("polished", "between")
  @js.native
  def between(fromSize: String, toSize: Double, minScreen: String, maxScreen: String): String = js.native
  @JSImport("polished", "between")
  @js.native
  def between(fromSize: Double, toSize: String): String = js.native
  @JSImport("polished", "between")
  @js.native
  def between(fromSize: Double, toSize: String, minScreen: js.UndefOr[scala.Nothing], maxScreen: String): String = js.native
  @JSImport("polished", "between")
  @js.native
  def between(fromSize: Double, toSize: String, minScreen: String): String = js.native
  @JSImport("polished", "between")
  @js.native
  def between(fromSize: Double, toSize: String, minScreen: String, maxScreen: String): String = js.native
  @JSImport("polished", "between")
  @js.native
  def between(fromSize: Double, toSize: Double): String = js.native
  @JSImport("polished", "between")
  @js.native
  def between(fromSize: Double, toSize: Double, minScreen: js.UndefOr[scala.Nothing], maxScreen: String): String = js.native
  @JSImport("polished", "between")
  @js.native
  def between(fromSize: Double, toSize: Double, minScreen: String): String = js.native
  @JSImport("polished", "between")
  @js.native
  def between(fromSize: Double, toSize: Double, minScreen: String, maxScreen: String): String = js.native
  
  @JSImport("polished", "border")
  @js.native
  def border(sideKeyword: String, values: (String | Double)*): Styles = js.native
  @JSImport("polished", "border")
  @js.native
  def border(sideKeyword: Double, values: (String | Double)*): Styles = js.native
  @JSImport("polished", "border")
  @js.native
  def border(sideKeyword: SideKeyword, values: (String | Double)*): Styles = js.native
  
  @JSImport("polished", "borderColor")
  @js.native
  def borderColor(values: (Null | Unit | String)*): Styles = js.native
  
  @JSImport("polished", "borderRadius")
  @js.native
  def borderRadius(side: String, radius: String): Styles = js.native
  @JSImport("polished", "borderRadius")
  @js.native
  def borderRadius(side: String, radius: Double): Styles = js.native
  
  @JSImport("polished", "borderStyle")
  @js.native
  def borderStyle(values: (Null | Unit | String)*): Styles = js.native
  
  @JSImport("polished", "borderWidth")
  @js.native
  def borderWidth(values: (Null | Unit | String | Double)*): Styles = js.native
  
  @JSImport("polished", "buttons")
  @js.native
  def buttons(states: InteractionState*): String = js.native
  
  @JSImport("polished", "clearFix")
  @js.native
  def clearFix(): Styles = js.native
  @JSImport("polished", "clearFix")
  @js.native
  def clearFix(parent: String): Styles = js.native
  
  @JSImport("polished", "complement")
  @js.native
  def complement(color: String): String = js.native
  
  @JSImport("polished", "cover")
  @js.native
  def cover(): Styles = js.native
  @JSImport("polished", "cover")
  @js.native
  def cover(offset: String): Styles = js.native
  @JSImport("polished", "cover")
  @js.native
  def cover(offset: Double): Styles = js.native
  
  @JSImport("polished", "cssVar")
  @js.native
  def cssVar(cssVariable: String): String | Double = js.native
  @JSImport("polished", "cssVar")
  @js.native
  def cssVar(cssVariable: String, passThrough: Boolean): String | Double = js.native
  
  @JSImport("polished", "darken")
  @js.native
  def darken(amount: String): js.Function1[/* color */ String, String] = js.native
  @JSImport("polished", "darken")
  @js.native
  def darken(amount: String, color: String): String = js.native
  @JSImport("polished", "darken")
  @js.native
  def darken(amount: Double): js.Function1[/* color */ String, String] = js.native
  @JSImport("polished", "darken")
  @js.native
  def darken(amount: Double, color: String): String = js.native
  
  @JSImport("polished", "desaturate")
  @js.native
  def desaturate(amount: String): js.Function1[/* color */ String, String] = js.native
  @JSImport("polished", "desaturate")
  @js.native
  def desaturate(amount: String, color: String): String = js.native
  @JSImport("polished", "desaturate")
  @js.native
  def desaturate(amount: Double): js.Function1[/* color */ String, String] = js.native
  @JSImport("polished", "desaturate")
  @js.native
  def desaturate(amount: Double, color: String): String = js.native
  
  @JSImport("polished", "directionalProperty")
  @js.native
  def directionalProperty(property: String, values: (Null | Unit | String | Double)*): Styles = js.native
  
  @JSImport("polished", "ellipsis")
  @js.native
  def ellipsis(): Styles = js.native
  @JSImport("polished", "ellipsis")
  @js.native
  def ellipsis(width: String): Styles = js.native
  @JSImport("polished", "ellipsis")
  @js.native
  def ellipsis(width: Double): Styles = js.native
  
  @JSImport("polished", "em")
  @js.native
  def em(value: String): String = js.native
  @JSImport("polished", "em")
  @js.native
  def em(value: String, base: String): String = js.native
  @JSImport("polished", "em")
  @js.native
  def em(value: String, base: Double): String = js.native
  @JSImport("polished", "em")
  @js.native
  def em(value: Double): String = js.native
  @JSImport("polished", "em")
  @js.native
  def em(value: Double, base: String): String = js.native
  @JSImport("polished", "em")
  @js.native
  def em(value: Double, base: Double): String = js.native
  
  @JSImport("polished", "fluidRange")
  @js.native
  def fluidRange(cssProp: js.Array[FluidRangeConfiguration]): Styles = js.native
  @JSImport("polished", "fluidRange")
  @js.native
  def fluidRange(
    cssProp: js.Array[FluidRangeConfiguration],
    minScreen: js.UndefOr[scala.Nothing],
    maxScreen: String
  ): Styles = js.native
  @JSImport("polished", "fluidRange")
  @js.native
  def fluidRange(cssProp: js.Array[FluidRangeConfiguration], minScreen: String): Styles = js.native
  @JSImport("polished", "fluidRange")
  @js.native
  def fluidRange(cssProp: js.Array[FluidRangeConfiguration], minScreen: String, maxScreen: String): Styles = js.native
  @JSImport("polished", "fluidRange")
  @js.native
  def fluidRange(cssProp: FluidRangeConfiguration): Styles = js.native
  @JSImport("polished", "fluidRange")
  @js.native
  def fluidRange(cssProp: FluidRangeConfiguration, minScreen: js.UndefOr[scala.Nothing], maxScreen: String): Styles = js.native
  @JSImport("polished", "fluidRange")
  @js.native
  def fluidRange(cssProp: FluidRangeConfiguration, minScreen: String): Styles = js.native
  @JSImport("polished", "fluidRange")
  @js.native
  def fluidRange(cssProp: FluidRangeConfiguration, minScreen: String, maxScreen: String): Styles = js.native
  
  @JSImport("polished", "fontFace")
  @js.native
  def fontFace(
    hasFontFamilyFontFilePathFontStretchFontStyleFontVariantFontWeightFileFormatsFormatHintLocalFontsUnicodeRangeFontDisplayFontVariationSettingsFontFeatureSettings: FontFaceConfiguration
  ): Styles = js.native
  
  @JSImport("polished", "getContrast")
  @js.native
  def getContrast(color1: String, color2: String): Double = js.native
  
  @JSImport("polished", "getLuminance")
  @js.native
  def getLuminance(color: String): Double = js.native
  
  @JSImport("polished", "getValueAndUnit")
  @js.native
  def getValueAndUnit(value: String): js.Any = js.native
  @JSImport("polished", "getValueAndUnit")
  @js.native
  def getValueAndUnit(value: Double): js.Any = js.native
  
  @JSImport("polished", "grayscale")
  @js.native
  def grayscale(color: String): String = js.native
  
  @JSImport("polished", "hiDPI")
  @js.native
  def hiDPI(): String = js.native
  @JSImport("polished", "hiDPI")
  @js.native
  def hiDPI(ratio: Double): String = js.native
  
  @JSImport("polished", "hideText")
  @js.native
  def hideText(): Styles = js.native
  
  @JSImport("polished", "hideVisually")
  @js.native
  def hideVisually(): Styles = js.native
  
  @JSImport("polished", "hsl")
  @js.native
  def hsl(value: Double): String = js.native
  @JSImport("polished", "hsl")
  @js.native
  def hsl(value: Double, saturation: js.UndefOr[scala.Nothing], lightness: Double): String = js.native
  @JSImport("polished", "hsl")
  @js.native
  def hsl(value: Double, saturation: Double): String = js.native
  @JSImport("polished", "hsl")
  @js.native
  def hsl(value: Double, saturation: Double, lightness: Double): String = js.native
  @JSImport("polished", "hsl")
  @js.native
  def hsl(value: HslColor): String = js.native
  @JSImport("polished", "hsl")
  @js.native
  def hsl(value: HslColor, saturation: js.UndefOr[scala.Nothing], lightness: Double): String = js.native
  @JSImport("polished", "hsl")
  @js.native
  def hsl(value: HslColor, saturation: Double): String = js.native
  @JSImport("polished", "hsl")
  @js.native
  def hsl(value: HslColor, saturation: Double, lightness: Double): String = js.native
  
  @JSImport("polished", "hslToColorString")
  @js.native
  def hslToColorString(color: Double): String = js.native
  @JSImport("polished", "hslToColorString")
  @js.native
  def hslToColorString(color: HslColor): String = js.native
  @JSImport("polished", "hslToColorString")
  @js.native
  def hslToColorString(color: HslaColor): String = js.native
  
  @JSImport("polished", "hsla")
  @js.native
  def hsla(value: Double): String = js.native
  @JSImport("polished", "hsla")
  @js.native
  def hsla(
    value: Double,
    saturation: js.UndefOr[scala.Nothing],
    lightness: js.UndefOr[scala.Nothing],
    alpha: Double
  ): String = js.native
  @JSImport("polished", "hsla")
  @js.native
  def hsla(value: Double, saturation: js.UndefOr[scala.Nothing], lightness: Double): String = js.native
  @JSImport("polished", "hsla")
  @js.native
  def hsla(value: Double, saturation: js.UndefOr[scala.Nothing], lightness: Double, alpha: Double): String = js.native
  @JSImport("polished", "hsla")
  @js.native
  def hsla(value: Double, saturation: Double): String = js.native
  @JSImport("polished", "hsla")
  @js.native
  def hsla(value: Double, saturation: Double, lightness: js.UndefOr[scala.Nothing], alpha: Double): String = js.native
  @JSImport("polished", "hsla")
  @js.native
  def hsla(value: Double, saturation: Double, lightness: Double): String = js.native
  @JSImport("polished", "hsla")
  @js.native
  def hsla(value: Double, saturation: Double, lightness: Double, alpha: Double): String = js.native
  @JSImport("polished", "hsla")
  @js.native
  def hsla(value: HslaColor): String = js.native
  @JSImport("polished", "hsla")
  @js.native
  def hsla(
    value: HslaColor,
    saturation: js.UndefOr[scala.Nothing],
    lightness: js.UndefOr[scala.Nothing],
    alpha: Double
  ): String = js.native
  @JSImport("polished", "hsla")
  @js.native
  def hsla(value: HslaColor, saturation: js.UndefOr[scala.Nothing], lightness: Double): String = js.native
  @JSImport("polished", "hsla")
  @js.native
  def hsla(value: HslaColor, saturation: js.UndefOr[scala.Nothing], lightness: Double, alpha: Double): String = js.native
  @JSImport("polished", "hsla")
  @js.native
  def hsla(value: HslaColor, saturation: Double): String = js.native
  @JSImport("polished", "hsla")
  @js.native
  def hsla(value: HslaColor, saturation: Double, lightness: js.UndefOr[scala.Nothing], alpha: Double): String = js.native
  @JSImport("polished", "hsla")
  @js.native
  def hsla(value: HslaColor, saturation: Double, lightness: Double): String = js.native
  @JSImport("polished", "hsla")
  @js.native
  def hsla(value: HslaColor, saturation: Double, lightness: Double, alpha: Double): String = js.native
  
  @JSImport("polished", "invert")
  @js.native
  def invert(color: String): String = js.native
  
  @JSImport("polished", "lighten")
  @js.native
  def lighten(amount: String): js.Function1[/* color */ String, String] = js.native
  @JSImport("polished", "lighten")
  @js.native
  def lighten(amount: String, color: String): String = js.native
  @JSImport("polished", "lighten")
  @js.native
  def lighten(amount: Double): js.Function1[/* color */ String, String] = js.native
  @JSImport("polished", "lighten")
  @js.native
  def lighten(amount: Double, color: String): String = js.native
  
  @JSImport("polished", "linearGradient")
  @js.native
  def linearGradient(hasColorStopsFallbackToDirection: LinearGradientConfiguration): Styles = js.native
  
  @JSImport("polished", "margin")
  @js.native
  def margin(values: (Null | Unit | String | Double)*): Styles = js.native
  
  @JSImport("polished", "math")
  @js.native
  def math(formula: String): String = js.native
  @JSImport("polished", "math")
  @js.native
  def math(formula: String, additionalSymbols: js.Object): String = js.native
  
  @JSImport("polished", "meetsContrastGuidelines")
  @js.native
  def meetsContrastGuidelines(color1: String, color2: String): ContrastScores = js.native
  
  @JSImport("polished", "mix")
  @js.native
  def mix(weight: String): FnCall = js.native
  @JSImport("polished", "mix")
  @js.native
  def mix(weight: String, color: String): js.Function1[/* otherColor */ String, String] = js.native
  @JSImport("polished", "mix")
  @js.native
  def mix(weight: String, color: String, otherColor: String): String = js.native
  @JSImport("polished", "mix")
  @js.native
  def mix(weight: Double): FnCall = js.native
  @JSImport("polished", "mix")
  @js.native
  def mix(weight: Double, color: String): js.Function1[/* otherColor */ String, String] = js.native
  @JSImport("polished", "mix")
  @js.native
  def mix(weight: Double, color: String, otherColor: String): String = js.native
  
  @JSImport("polished", "modularScale")
  @js.native
  def modularScale(steps: Double): String = js.native
  @JSImport("polished", "modularScale")
  @js.native
  def modularScale(steps: Double, base: js.UndefOr[scala.Nothing], ratio: ModularScaleRatio): String = js.native
  @JSImport("polished", "modularScale")
  @js.native
  def modularScale(steps: Double, base: String): String = js.native
  @JSImport("polished", "modularScale")
  @js.native
  def modularScale(steps: Double, base: String, ratio: ModularScaleRatio): String = js.native
  @JSImport("polished", "modularScale")
  @js.native
  def modularScale(steps: Double, base: Double): String = js.native
  @JSImport("polished", "modularScale")
  @js.native
  def modularScale(steps: Double, base: Double, ratio: ModularScaleRatio): String = js.native
  
  @JSImport("polished", "normalize")
  @js.native
  def normalize(): js.Array[Styles] = js.native
  
  @JSImport("polished", "opacify")
  @js.native
  def opacify(amount: String): js.Function1[/* color */ String, String] = js.native
  @JSImport("polished", "opacify")
  @js.native
  def opacify(amount: String, color: String): String = js.native
  @JSImport("polished", "opacify")
  @js.native
  def opacify(amount: Double): js.Function1[/* color */ String, String] = js.native
  @JSImport("polished", "opacify")
  @js.native
  def opacify(amount: Double, color: String): String = js.native
  
  @JSImport("polished", "padding")
  @js.native
  def padding(values: (Null | Unit | String | Double)*): Styles = js.native
  
  @JSImport("polished", "parseToHsl")
  @js.native
  def parseToHsl(color: String): HslColor | HslaColor = js.native
  
  @JSImport("polished", "parseToRgb")
  @js.native
  def parseToRgb(color: String): RgbColor | RgbaColor = js.native
  
  @JSImport("polished", "position")
  @js.native
  def position(firstValue: String, values: (Null | Unit | String | Double)*): Styles = js.native
  @JSImport("polished", "position")
  @js.native
  def position(firstValue: Double, values: (Null | Unit | String | Double)*): Styles = js.native
  @JSImport("polished", "position")
  @js.native
  def position(firstValue: Null, values: (Null | Unit | String | Double)*): Styles = js.native
  
  @JSImport("polished", "radialGradient")
  @js.native
  def radialGradient(hasColorStopsExtentFallbackPositionShape: RadialGradientConfiguration): Styles = js.native
  
  @JSImport("polished", "readableColor")
  @js.native
  def readableColor(color: String): String = js.native
  @JSImport("polished", "readableColor")
  @js.native
  def readableColor(
    color: String,
    lightReturnColor: js.UndefOr[scala.Nothing],
    darkReturnColor: js.UndefOr[scala.Nothing],
    strict: Boolean
  ): String = js.native
  @JSImport("polished", "readableColor")
  @js.native
  def readableColor(color: String, lightReturnColor: js.UndefOr[scala.Nothing], darkReturnColor: String): String = js.native
  @JSImport("polished", "readableColor")
  @js.native
  def readableColor(
    color: String,
    lightReturnColor: js.UndefOr[scala.Nothing],
    darkReturnColor: String,
    strict: Boolean
  ): String = js.native
  @JSImport("polished", "readableColor")
  @js.native
  def readableColor(color: String, lightReturnColor: String): String = js.native
  @JSImport("polished", "readableColor")
  @js.native
  def readableColor(
    color: String,
    lightReturnColor: String,
    darkReturnColor: js.UndefOr[scala.Nothing],
    strict: Boolean
  ): String = js.native
  @JSImport("polished", "readableColor")
  @js.native
  def readableColor(color: String, lightReturnColor: String, darkReturnColor: String): String = js.native
  @JSImport("polished", "readableColor")
  @js.native
  def readableColor(color: String, lightReturnColor: String, darkReturnColor: String, strict: Boolean): String = js.native
  
  @JSImport("polished", "rem")
  @js.native
  def rem(value: String): String = js.native
  @JSImport("polished", "rem")
  @js.native
  def rem(value: String, base: String): String = js.native
  @JSImport("polished", "rem")
  @js.native
  def rem(value: String, base: Double): String = js.native
  @JSImport("polished", "rem")
  @js.native
  def rem(value: Double): String = js.native
  @JSImport("polished", "rem")
  @js.native
  def rem(value: Double, base: String): String = js.native
  @JSImport("polished", "rem")
  @js.native
  def rem(value: Double, base: Double): String = js.native
  
  @JSImport("polished", "retinaImage")
  @js.native
  def retinaImage(filename: String): Styles = js.native
  @JSImport("polished", "retinaImage")
  @js.native
  def retinaImage(
    filename: String,
    backgroundSize: js.UndefOr[scala.Nothing],
    extension: js.UndefOr[scala.Nothing],
    retinaFilename: js.UndefOr[scala.Nothing],
    retinaSuffix: String
  ): Styles = js.native
  @JSImport("polished", "retinaImage")
  @js.native
  def retinaImage(
    filename: String,
    backgroundSize: js.UndefOr[scala.Nothing],
    extension: js.UndefOr[scala.Nothing],
    retinaFilename: String
  ): Styles = js.native
  @JSImport("polished", "retinaImage")
  @js.native
  def retinaImage(
    filename: String,
    backgroundSize: js.UndefOr[scala.Nothing],
    extension: js.UndefOr[scala.Nothing],
    retinaFilename: String,
    retinaSuffix: String
  ): Styles = js.native
  @JSImport("polished", "retinaImage")
  @js.native
  def retinaImage(filename: String, backgroundSize: js.UndefOr[scala.Nothing], extension: String): Styles = js.native
  @JSImport("polished", "retinaImage")
  @js.native
  def retinaImage(
    filename: String,
    backgroundSize: js.UndefOr[scala.Nothing],
    extension: String,
    retinaFilename: js.UndefOr[scala.Nothing],
    retinaSuffix: String
  ): Styles = js.native
  @JSImport("polished", "retinaImage")
  @js.native
  def retinaImage(
    filename: String,
    backgroundSize: js.UndefOr[scala.Nothing],
    extension: String,
    retinaFilename: String
  ): Styles = js.native
  @JSImport("polished", "retinaImage")
  @js.native
  def retinaImage(
    filename: String,
    backgroundSize: js.UndefOr[scala.Nothing],
    extension: String,
    retinaFilename: String,
    retinaSuffix: String
  ): Styles = js.native
  @JSImport("polished", "retinaImage")
  @js.native
  def retinaImage(filename: String, backgroundSize: String): Styles = js.native
  @JSImport("polished", "retinaImage")
  @js.native
  def retinaImage(
    filename: String,
    backgroundSize: String,
    extension: js.UndefOr[scala.Nothing],
    retinaFilename: js.UndefOr[scala.Nothing],
    retinaSuffix: String
  ): Styles = js.native
  @JSImport("polished", "retinaImage")
  @js.native
  def retinaImage(
    filename: String,
    backgroundSize: String,
    extension: js.UndefOr[scala.Nothing],
    retinaFilename: String
  ): Styles = js.native
  @JSImport("polished", "retinaImage")
  @js.native
  def retinaImage(
    filename: String,
    backgroundSize: String,
    extension: js.UndefOr[scala.Nothing],
    retinaFilename: String,
    retinaSuffix: String
  ): Styles = js.native
  @JSImport("polished", "retinaImage")
  @js.native
  def retinaImage(filename: String, backgroundSize: String, extension: String): Styles = js.native
  @JSImport("polished", "retinaImage")
  @js.native
  def retinaImage(
    filename: String,
    backgroundSize: String,
    extension: String,
    retinaFilename: js.UndefOr[scala.Nothing],
    retinaSuffix: String
  ): Styles = js.native
  @JSImport("polished", "retinaImage")
  @js.native
  def retinaImage(filename: String, backgroundSize: String, extension: String, retinaFilename: String): Styles = js.native
  @JSImport("polished", "retinaImage")
  @js.native
  def retinaImage(
    filename: String,
    backgroundSize: String,
    extension: String,
    retinaFilename: String,
    retinaSuffix: String
  ): Styles = js.native
  
  @JSImport("polished", "rgb")
  @js.native
  def rgb(value: Double): String = js.native
  @JSImport("polished", "rgb")
  @js.native
  def rgb(value: Double, green: js.UndefOr[scala.Nothing], blue: Double): String = js.native
  @JSImport("polished", "rgb")
  @js.native
  def rgb(value: Double, green: Double): String = js.native
  @JSImport("polished", "rgb")
  @js.native
  def rgb(value: Double, green: Double, blue: Double): String = js.native
  @JSImport("polished", "rgb")
  @js.native
  def rgb(value: RgbColor): String = js.native
  @JSImport("polished", "rgb")
  @js.native
  def rgb(value: RgbColor, green: js.UndefOr[scala.Nothing], blue: Double): String = js.native
  @JSImport("polished", "rgb")
  @js.native
  def rgb(value: RgbColor, green: Double): String = js.native
  @JSImport("polished", "rgb")
  @js.native
  def rgb(value: RgbColor, green: Double, blue: Double): String = js.native
  
  @JSImport("polished", "rgbToColorString")
  @js.native
  def rgbToColorString(color: RgbColor): String = js.native
  @JSImport("polished", "rgbToColorString")
  @js.native
  def rgbToColorString(color: RgbaColor): String = js.native
  
  @JSImport("polished", "rgba")
  @js.native
  def rgba(firstValue: String): String = js.native
  @JSImport("polished", "rgba")
  @js.native
  def rgba(
    firstValue: String,
    secondValue: js.UndefOr[scala.Nothing],
    thirdValue: js.UndefOr[scala.Nothing],
    fourthValue: Double
  ): String = js.native
  @JSImport("polished", "rgba")
  @js.native
  def rgba(firstValue: String, secondValue: js.UndefOr[scala.Nothing], thirdValue: Double): String = js.native
  @JSImport("polished", "rgba")
  @js.native
  def rgba(
    firstValue: String,
    secondValue: js.UndefOr[scala.Nothing],
    thirdValue: Double,
    fourthValue: Double
  ): String = js.native
  @JSImport("polished", "rgba")
  @js.native
  def rgba(firstValue: String, secondValue: Double): String = js.native
  @JSImport("polished", "rgba")
  @js.native
  def rgba(
    firstValue: String,
    secondValue: Double,
    thirdValue: js.UndefOr[scala.Nothing],
    fourthValue: Double
  ): String = js.native
  @JSImport("polished", "rgba")
  @js.native
  def rgba(firstValue: String, secondValue: Double, thirdValue: Double): String = js.native
  @JSImport("polished", "rgba")
  @js.native
  def rgba(firstValue: String, secondValue: Double, thirdValue: Double, fourthValue: Double): String = js.native
  @JSImport("polished", "rgba")
  @js.native
  def rgba(firstValue: Double): String = js.native
  @JSImport("polished", "rgba")
  @js.native
  def rgba(
    firstValue: Double,
    secondValue: js.UndefOr[scala.Nothing],
    thirdValue: js.UndefOr[scala.Nothing],
    fourthValue: Double
  ): String = js.native
  @JSImport("polished", "rgba")
  @js.native
  def rgba(firstValue: Double, secondValue: js.UndefOr[scala.Nothing], thirdValue: Double): String = js.native
  @JSImport("polished", "rgba")
  @js.native
  def rgba(
    firstValue: Double,
    secondValue: js.UndefOr[scala.Nothing],
    thirdValue: Double,
    fourthValue: Double
  ): String = js.native
  @JSImport("polished", "rgba")
  @js.native
  def rgba(firstValue: Double, secondValue: Double): String = js.native
  @JSImport("polished", "rgba")
  @js.native
  def rgba(
    firstValue: Double,
    secondValue: Double,
    thirdValue: js.UndefOr[scala.Nothing],
    fourthValue: Double
  ): String = js.native
  @JSImport("polished", "rgba")
  @js.native
  def rgba(firstValue: Double, secondValue: Double, thirdValue: Double): String = js.native
  @JSImport("polished", "rgba")
  @js.native
  def rgba(firstValue: Double, secondValue: Double, thirdValue: Double, fourthValue: Double): String = js.native
  @JSImport("polished", "rgba")
  @js.native
  def rgba(firstValue: RgbaColor): String = js.native
  @JSImport("polished", "rgba")
  @js.native
  def rgba(
    firstValue: RgbaColor,
    secondValue: js.UndefOr[scala.Nothing],
    thirdValue: js.UndefOr[scala.Nothing],
    fourthValue: Double
  ): String = js.native
  @JSImport("polished", "rgba")
  @js.native
  def rgba(firstValue: RgbaColor, secondValue: js.UndefOr[scala.Nothing], thirdValue: Double): String = js.native
  @JSImport("polished", "rgba")
  @js.native
  def rgba(
    firstValue: RgbaColor,
    secondValue: js.UndefOr[scala.Nothing],
    thirdValue: Double,
    fourthValue: Double
  ): String = js.native
  @JSImport("polished", "rgba")
  @js.native
  def rgba(firstValue: RgbaColor, secondValue: Double): String = js.native
  @JSImport("polished", "rgba")
  @js.native
  def rgba(
    firstValue: RgbaColor,
    secondValue: Double,
    thirdValue: js.UndefOr[scala.Nothing],
    fourthValue: Double
  ): String = js.native
  @JSImport("polished", "rgba")
  @js.native
  def rgba(firstValue: RgbaColor, secondValue: Double, thirdValue: Double): String = js.native
  @JSImport("polished", "rgba")
  @js.native
  def rgba(firstValue: RgbaColor, secondValue: Double, thirdValue: Double, fourthValue: Double): String = js.native
  
  @JSImport("polished", "saturate")
  @js.native
  def saturate(amount: String): js.Function1[/* color */ String, String] = js.native
  @JSImport("polished", "saturate")
  @js.native
  def saturate(amount: String, color: String): String = js.native
  @JSImport("polished", "saturate")
  @js.native
  def saturate(amount: Double): js.Function1[/* color */ String, String] = js.native
  @JSImport("polished", "saturate")
  @js.native
  def saturate(amount: Double, color: String): String = js.native
  
  @JSImport("polished", "setHue")
  @js.native
  def setHue(hue: String): js.Function1[/* color */ String, String] = js.native
  @JSImport("polished", "setHue")
  @js.native
  def setHue(hue: String, color: String): String = js.native
  @JSImport("polished", "setHue")
  @js.native
  def setHue(hue: Double): js.Function1[/* color */ String, String] = js.native
  @JSImport("polished", "setHue")
  @js.native
  def setHue(hue: Double, color: String): String = js.native
  
  @JSImport("polished", "setLightness")
  @js.native
  def setLightness(lightness: String): js.Function1[/* color */ String, String] = js.native
  @JSImport("polished", "setLightness")
  @js.native
  def setLightness(lightness: String, color: String): String = js.native
  @JSImport("polished", "setLightness")
  @js.native
  def setLightness(lightness: Double): js.Function1[/* color */ String, String] = js.native
  @JSImport("polished", "setLightness")
  @js.native
  def setLightness(lightness: Double, color: String): String = js.native
  
  @JSImport("polished", "setSaturation")
  @js.native
  def setSaturation(saturation: String): js.Function1[/* color */ String, String] = js.native
  @JSImport("polished", "setSaturation")
  @js.native
  def setSaturation(saturation: String, color: String): String = js.native
  @JSImport("polished", "setSaturation")
  @js.native
  def setSaturation(saturation: Double): js.Function1[/* color */ String, String] = js.native
  @JSImport("polished", "setSaturation")
  @js.native
  def setSaturation(saturation: Double, color: String): String = js.native
  
  @JSImport("polished", "shade")
  @js.native
  def shade(percentage: String): js.Function1[/* color */ String, String] = js.native
  @JSImport("polished", "shade")
  @js.native
  def shade(percentage: String, color: String): String = js.native
  @JSImport("polished", "shade")
  @js.native
  def shade(percentage: Double): js.Function1[/* color */ String, String] = js.native
  @JSImport("polished", "shade")
  @js.native
  def shade(percentage: Double, color: String): String = js.native
  
  @JSImport("polished", "size")
  @js.native
  def size(height: String): Styles = js.native
  @JSImport("polished", "size")
  @js.native
  def size(height: String, width: String): Styles = js.native
  @JSImport("polished", "size")
  @js.native
  def size(height: String, width: Double): Styles = js.native
  @JSImport("polished", "size")
  @js.native
  def size(height: Double): Styles = js.native
  @JSImport("polished", "size")
  @js.native
  def size(height: Double, width: String): Styles = js.native
  @JSImport("polished", "size")
  @js.native
  def size(height: Double, width: Double): Styles = js.native
  
  @JSImport("polished", "stripUnit")
  @js.native
  def stripUnit(value: String): js.Any = js.native
  @JSImport("polished", "stripUnit")
  @js.native
  def stripUnit(value: String, unitReturn: Boolean): js.Any = js.native
  @JSImport("polished", "stripUnit")
  @js.native
  def stripUnit(value: Double): js.Any = js.native
  @JSImport("polished", "stripUnit")
  @js.native
  def stripUnit(value: Double, unitReturn: Boolean): js.Any = js.native
  
  @JSImport("polished", "textInputs")
  @js.native
  def textInputs(states: InteractionState*): String = js.native
  
  @JSImport("polished", "timingFunctions")
  @js.native
  def timingFunctions(timingFunction: TimingFunction): String = js.native
  
  @JSImport("polished", "tint")
  @js.native
  def tint(percentage: String): js.Function1[/* color */ String, String] = js.native
  @JSImport("polished", "tint")
  @js.native
  def tint(percentage: String, color: String): String = js.native
  @JSImport("polished", "tint")
  @js.native
  def tint(percentage: Double): js.Function1[/* color */ String, String] = js.native
  @JSImport("polished", "tint")
  @js.native
  def tint(percentage: Double, color: String): String = js.native
  
  @JSImport("polished", "toColorString")
  @js.native
  def toColorString(color: js.Object): String = js.native
  
  @JSImport("polished", "transitions")
  @js.native
  def transitions(properties: (String | js.Array[String])*): Styles = js.native
  
  @JSImport("polished", "transparentize")
  @js.native
  def transparentize(amount: String): js.Function1[/* color */ String, String] = js.native
  @JSImport("polished", "transparentize")
  @js.native
  def transparentize(amount: String, color: String): String = js.native
  @JSImport("polished", "transparentize")
  @js.native
  def transparentize(amount: Double): js.Function1[/* color */ String, String] = js.native
  @JSImport("polished", "transparentize")
  @js.native
  def transparentize(amount: Double, color: String): String = js.native
  
  @JSImport("polished", "triangle")
  @js.native
  def triangle(hasPointingDirectionHeightWidthForegroundColorBackgroundColor: TriangleConfiguration): Styles = js.native
  
  @JSImport("polished", "wordWrap")
  @js.native
  def wordWrap(): Styles = js.native
  @JSImport("polished", "wordWrap")
  @js.native
  def wordWrap(wrap: String): Styles = js.native
}
