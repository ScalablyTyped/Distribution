package typings
package polishedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("polished", JSImport.Namespace)
@js.native
object polishedMod extends js.Object {
  def adjustHue(degree: java.lang.String): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def adjustHue(degree: java.lang.String, color: java.lang.String): java.lang.String = js.native
  def adjustHue(degree: scala.Double): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def adjustHue(degree: scala.Double, color: java.lang.String): java.lang.String = js.native
  def animation(args: ((js.Array[java.lang.String | scala.Double]) | java.lang.String | scala.Double)*): polishedLib.libTypesStyleMod.Styles = js.native
  def backgroundImages(properties: java.lang.String*): polishedLib.libTypesStyleMod.Styles = js.native
  def backgrounds(properties: java.lang.String*): polishedLib.libTypesStyleMod.Styles = js.native
  def between(fromSize: java.lang.String, toSize: java.lang.String): java.lang.String = js.native
  def between(fromSize: java.lang.String, toSize: java.lang.String, minScreen: java.lang.String): java.lang.String = js.native
  def between(
    fromSize: java.lang.String,
    toSize: java.lang.String,
    minScreen: java.lang.String,
    maxScreen: java.lang.String
  ): java.lang.String = js.native
  def between(fromSize: java.lang.String, toSize: scala.Double): java.lang.String = js.native
  def between(fromSize: java.lang.String, toSize: scala.Double, minScreen: java.lang.String): java.lang.String = js.native
  def between(
    fromSize: java.lang.String,
    toSize: scala.Double,
    minScreen: java.lang.String,
    maxScreen: java.lang.String
  ): java.lang.String = js.native
  def between(fromSize: scala.Double, toSize: java.lang.String): java.lang.String = js.native
  def between(fromSize: scala.Double, toSize: java.lang.String, minScreen: java.lang.String): java.lang.String = js.native
  def between(
    fromSize: scala.Double,
    toSize: java.lang.String,
    minScreen: java.lang.String,
    maxScreen: java.lang.String
  ): java.lang.String = js.native
  def between(fromSize: scala.Double, toSize: scala.Double): java.lang.String = js.native
  def between(fromSize: scala.Double, toSize: scala.Double, minScreen: java.lang.String): java.lang.String = js.native
  def between(
    fromSize: scala.Double,
    toSize: scala.Double,
    minScreen: java.lang.String,
    maxScreen: java.lang.String
  ): java.lang.String = js.native
  def border(sideKeyword: java.lang.String, values: (java.lang.String | scala.Double)*): polishedLib.libTypesStyleMod.Styles = js.native
  def border(
    sideKeyword: polishedLib.libTypesSideKeywordMod.SideKeyword,
    values: (java.lang.String | scala.Double)*
  ): polishedLib.libTypesStyleMod.Styles = js.native
  def border(sideKeyword: scala.Double, values: (java.lang.String | scala.Double)*): polishedLib.libTypesStyleMod.Styles = js.native
  def borderColor(values: (scala.Null | scala.Unit | java.lang.String)*): polishedLib.libTypesStyleMod.Styles = js.native
  def borderRadius(side: java.lang.String, radius: java.lang.String): polishedLib.libTypesStyleMod.Styles = js.native
  def borderRadius(side: java.lang.String, radius: scala.Double): polishedLib.libTypesStyleMod.Styles = js.native
  def borderStyle(values: (scala.Null | scala.Unit | java.lang.String)*): polishedLib.libTypesStyleMod.Styles = js.native
  def borderWidth(values: (scala.Null | scala.Unit | java.lang.String | scala.Double)*): polishedLib.libTypesStyleMod.Styles = js.native
  def buttons(states: polishedLib.libTypesInteractionStateMod.InteractionState*): java.lang.String = js.native
  def clearFix(): polishedLib.libTypesStyleMod.Styles = js.native
  def clearFix(parent: java.lang.String): polishedLib.libTypesStyleMod.Styles = js.native
  def complement(color: java.lang.String): java.lang.String = js.native
  def cover(): polishedLib.libTypesStyleMod.Styles = js.native
  def cover(offset: java.lang.String): polishedLib.libTypesStyleMod.Styles = js.native
  def cover(offset: scala.Double): polishedLib.libTypesStyleMod.Styles = js.native
  def darken(amount: java.lang.String): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def darken(amount: java.lang.String, color: java.lang.String): java.lang.String = js.native
  def darken(amount: scala.Double): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def darken(amount: scala.Double, color: java.lang.String): java.lang.String = js.native
  def desaturate(amount: java.lang.String): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def desaturate(amount: java.lang.String, color: java.lang.String): java.lang.String = js.native
  def desaturate(amount: scala.Double): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def desaturate(amount: scala.Double, color: java.lang.String): java.lang.String = js.native
  def directionalProperty(property: java.lang.String, values: (scala.Null | scala.Unit | java.lang.String | scala.Double)*): polishedLib.libTypesStyleMod.Styles = js.native
  def ellipsis(): polishedLib.libTypesStyleMod.Styles = js.native
  def ellipsis(width: java.lang.String): polishedLib.libTypesStyleMod.Styles = js.native
  def ellipsis(width: scala.Double): polishedLib.libTypesStyleMod.Styles = js.native
  def em(value: java.lang.String): java.lang.String = js.native
  def em(value: java.lang.String, base: java.lang.String): java.lang.String = js.native
  def em(value: java.lang.String, base: scala.Double): java.lang.String = js.native
  def em(value: scala.Double): java.lang.String = js.native
  def em(value: scala.Double, base: java.lang.String): java.lang.String = js.native
  def em(value: scala.Double, base: scala.Double): java.lang.String = js.native
  def fluidRange(cssProp: js.Array[polishedLib.libTypesFluidRangeConfigurationMod.FluidRangeConfiguration]): polishedLib.libTypesStyleMod.Styles = js.native
  def fluidRange(
    cssProp: js.Array[polishedLib.libTypesFluidRangeConfigurationMod.FluidRangeConfiguration],
    minScreen: java.lang.String
  ): polishedLib.libTypesStyleMod.Styles = js.native
  def fluidRange(
    cssProp: js.Array[polishedLib.libTypesFluidRangeConfigurationMod.FluidRangeConfiguration],
    minScreen: java.lang.String,
    maxScreen: java.lang.String
  ): polishedLib.libTypesStyleMod.Styles = js.native
  def fluidRange(cssProp: polishedLib.libTypesFluidRangeConfigurationMod.FluidRangeConfiguration): polishedLib.libTypesStyleMod.Styles = js.native
  def fluidRange(
    cssProp: polishedLib.libTypesFluidRangeConfigurationMod.FluidRangeConfiguration,
    minScreen: java.lang.String
  ): polishedLib.libTypesStyleMod.Styles = js.native
  def fluidRange(
    cssProp: polishedLib.libTypesFluidRangeConfigurationMod.FluidRangeConfiguration,
    minScreen: java.lang.String,
    maxScreen: java.lang.String
  ): polishedLib.libTypesStyleMod.Styles = js.native
  def fontFace(
    hasFontFamilyFontFilePathFontStretchFontStyleFontVariantFontWeightFileFormatsFormatHintLocalFontsUnicodeRangeFontDisplayFontVariationSettingsFontFeatureSettings: polishedLib.libTypesFontFaceConfigurationMod.FontFaceConfiguration
  ): polishedLib.libTypesStyleMod.Styles = js.native
  def getContrast(color1: java.lang.String, color2: java.lang.String): scala.Double = js.native
  def getLuminance(color: java.lang.String): scala.Double = js.native
  def getValueAndUnit(value: java.lang.String): js.Tuple2[scala.Double | java.lang.String, java.lang.String | scala.Unit] = js.native
  def grayscale(color: java.lang.String): java.lang.String = js.native
  def hiDPI(): java.lang.String = js.native
  def hiDPI(ratio: scala.Double): java.lang.String = js.native
  def hideText(): polishedLib.libTypesStyleMod.Styles = js.native
  def hideVisually(): polishedLib.libTypesStyleMod.Styles = js.native
  def hsl(value: polishedLib.libTypesColorMod.HslColor): java.lang.String = js.native
  def hsl(value: polishedLib.libTypesColorMod.HslColor, saturation: scala.Double): java.lang.String = js.native
  def hsl(value: polishedLib.libTypesColorMod.HslColor, saturation: scala.Double, lightness: scala.Double): java.lang.String = js.native
  def hsl(value: scala.Double): java.lang.String = js.native
  def hsl(value: scala.Double, saturation: scala.Double): java.lang.String = js.native
  def hsl(value: scala.Double, saturation: scala.Double, lightness: scala.Double): java.lang.String = js.native
  def hslToColorString(color: polishedLib.libTypesColorMod.HslColor): java.lang.String = js.native
  def hslToColorString(color: polishedLib.libTypesColorMod.HslaColor): java.lang.String = js.native
  def hslToColorString(color: scala.Double): java.lang.String = js.native
  def hsla(value: polishedLib.libTypesColorMod.HslaColor): java.lang.String = js.native
  def hsla(value: polishedLib.libTypesColorMod.HslaColor, saturation: scala.Double): java.lang.String = js.native
  def hsla(value: polishedLib.libTypesColorMod.HslaColor, saturation: scala.Double, lightness: scala.Double): java.lang.String = js.native
  def hsla(
    value: polishedLib.libTypesColorMod.HslaColor,
    saturation: scala.Double,
    lightness: scala.Double,
    alpha: scala.Double
  ): java.lang.String = js.native
  def hsla(value: scala.Double): java.lang.String = js.native
  def hsla(value: scala.Double, saturation: scala.Double): java.lang.String = js.native
  def hsla(value: scala.Double, saturation: scala.Double, lightness: scala.Double): java.lang.String = js.native
  def hsla(value: scala.Double, saturation: scala.Double, lightness: scala.Double, alpha: scala.Double): java.lang.String = js.native
  def invert(color: java.lang.String): java.lang.String = js.native
  def lighten(amount: java.lang.String): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def lighten(amount: java.lang.String, color: java.lang.String): java.lang.String = js.native
  def lighten(amount: scala.Double): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def lighten(amount: scala.Double, color: java.lang.String): java.lang.String = js.native
  def linearGradient(
    hasColorStopsFallbackToDirection: polishedLib.libTypesLinearGradientConfigurationMod.LinearGradientConfiguration
  ): polishedLib.libTypesStyleMod.Styles = js.native
  def margin(values: (scala.Null | scala.Unit | java.lang.String | scala.Double)*): polishedLib.libTypesStyleMod.Styles = js.native
  def math(formula: java.lang.String): java.lang.String = js.native
  def math(formula: java.lang.String, additionalSymbols: js.Object): java.lang.String = js.native
  def meetsContrastGuidelines(color1: java.lang.String, color2: java.lang.String): polishedLib.libTypesColorMod.ContrastScores = js.native
  def mix(weight: java.lang.String): polishedLib.Fn_Color = js.native
  def mix(weight: java.lang.String, color: java.lang.String): js.Function1[/* otherColor */ java.lang.String, java.lang.String] = js.native
  def mix(weight: java.lang.String, color: java.lang.String, otherColor: java.lang.String): java.lang.String = js.native
  def mix(weight: scala.Double): polishedLib.Fn_Color = js.native
  def mix(weight: scala.Double, color: java.lang.String): js.Function1[/* otherColor */ java.lang.String, java.lang.String] = js.native
  def mix(weight: scala.Double, color: java.lang.String, otherColor: java.lang.String): java.lang.String = js.native
  def modularScale(steps: scala.Double): java.lang.String = js.native
  def modularScale(steps: scala.Double, base: java.lang.String): java.lang.String = js.native
  def modularScale(
    steps: scala.Double,
    base: java.lang.String,
    ratio: polishedLib.libTypesModularScaleRatioMod.ModularScaleRatio
  ): java.lang.String = js.native
  def modularScale(steps: scala.Double, base: scala.Double): java.lang.String = js.native
  def modularScale(
    steps: scala.Double,
    base: scala.Double,
    ratio: polishedLib.libTypesModularScaleRatioMod.ModularScaleRatio
  ): java.lang.String = js.native
  def normalize(): js.Array[polishedLib.libTypesStyleMod.Styles] = js.native
  def opacify(amount: java.lang.String): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def opacify(amount: java.lang.String, color: java.lang.String): java.lang.String = js.native
  def opacify(amount: scala.Double): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def opacify(amount: scala.Double, color: java.lang.String): java.lang.String = js.native
  def padding(values: (scala.Null | scala.Unit | java.lang.String | scala.Double)*): polishedLib.libTypesStyleMod.Styles = js.native
  def parseToHsl(color: java.lang.String): polishedLib.libTypesColorMod.HslColor | polishedLib.libTypesColorMod.HslaColor = js.native
  def parseToRgb(color: java.lang.String): polishedLib.libTypesColorMod.RgbColor | polishedLib.libTypesColorMod.RgbaColor = js.native
  def position(
    positionKeyword: java.lang.String,
    values: (scala.Null | scala.Unit | java.lang.String | scala.Double)*
  ): polishedLib.libTypesStyleMod.Styles = js.native
  def position(values: (scala.Null | scala.Unit | java.lang.String | scala.Double)*): polishedLib.libTypesStyleMod.Styles = js.native
  def radialGradient(
    hasColorStopsExtentFallbackPositionShape: polishedLib.libTypesRadialGradientConfigurationMod.RadialGradientConfiguration
  ): polishedLib.libTypesStyleMod.Styles = js.native
  def readableColor(color: java.lang.String): java.lang.String = js.native
  def readableColor(color: java.lang.String, lightReturnColor: java.lang.String): java.lang.String = js.native
  def readableColor(color: java.lang.String, lightReturnColor: java.lang.String, darkReturnColor: java.lang.String): java.lang.String = js.native
  def rem(value: java.lang.String): java.lang.String = js.native
  def rem(value: java.lang.String, base: java.lang.String): java.lang.String = js.native
  def rem(value: java.lang.String, base: scala.Double): java.lang.String = js.native
  def rem(value: scala.Double): java.lang.String = js.native
  def rem(value: scala.Double, base: java.lang.String): java.lang.String = js.native
  def rem(value: scala.Double, base: scala.Double): java.lang.String = js.native
  def retinaImage(filename: java.lang.String): polishedLib.libTypesStyleMod.Styles = js.native
  def retinaImage(filename: java.lang.String, backgroundSize: java.lang.String): polishedLib.libTypesStyleMod.Styles = js.native
  def retinaImage(filename: java.lang.String, backgroundSize: java.lang.String, extension: java.lang.String): polishedLib.libTypesStyleMod.Styles = js.native
  def retinaImage(
    filename: java.lang.String,
    backgroundSize: java.lang.String,
    extension: java.lang.String,
    retinaFilename: java.lang.String
  ): polishedLib.libTypesStyleMod.Styles = js.native
  def retinaImage(
    filename: java.lang.String,
    backgroundSize: java.lang.String,
    extension: java.lang.String,
    retinaFilename: java.lang.String,
    retinaSuffix: java.lang.String
  ): polishedLib.libTypesStyleMod.Styles = js.native
  def rgb(value: polishedLib.libTypesColorMod.RgbColor): java.lang.String = js.native
  def rgb(value: polishedLib.libTypesColorMod.RgbColor, green: scala.Double): java.lang.String = js.native
  def rgb(value: polishedLib.libTypesColorMod.RgbColor, green: scala.Double, blue: scala.Double): java.lang.String = js.native
  def rgb(value: scala.Double): java.lang.String = js.native
  def rgb(value: scala.Double, green: scala.Double): java.lang.String = js.native
  def rgb(value: scala.Double, green: scala.Double, blue: scala.Double): java.lang.String = js.native
  def rgbToColorString(color: polishedLib.libTypesColorMod.RgbColor): java.lang.String = js.native
  def rgbToColorString(color: polishedLib.libTypesColorMod.RgbaColor): java.lang.String = js.native
  def rgba(firstValue: java.lang.String): java.lang.String = js.native
  def rgba(firstValue: java.lang.String, secondValue: scala.Double): java.lang.String = js.native
  def rgba(firstValue: java.lang.String, secondValue: scala.Double, thirdValue: scala.Double): java.lang.String = js.native
  def rgba(
    firstValue: java.lang.String,
    secondValue: scala.Double,
    thirdValue: scala.Double,
    fourthValue: scala.Double
  ): java.lang.String = js.native
  def rgba(firstValue: polishedLib.libTypesColorMod.RgbaColor): java.lang.String = js.native
  def rgba(firstValue: polishedLib.libTypesColorMod.RgbaColor, secondValue: scala.Double): java.lang.String = js.native
  def rgba(
    firstValue: polishedLib.libTypesColorMod.RgbaColor,
    secondValue: scala.Double,
    thirdValue: scala.Double
  ): java.lang.String = js.native
  def rgba(
    firstValue: polishedLib.libTypesColorMod.RgbaColor,
    secondValue: scala.Double,
    thirdValue: scala.Double,
    fourthValue: scala.Double
  ): java.lang.String = js.native
  def rgba(firstValue: scala.Double): java.lang.String = js.native
  def rgba(firstValue: scala.Double, secondValue: scala.Double): java.lang.String = js.native
  def rgba(firstValue: scala.Double, secondValue: scala.Double, thirdValue: scala.Double): java.lang.String = js.native
  def rgba(
    firstValue: scala.Double,
    secondValue: scala.Double,
    thirdValue: scala.Double,
    fourthValue: scala.Double
  ): java.lang.String = js.native
  def saturate(amount: java.lang.String): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def saturate(amount: java.lang.String, color: java.lang.String): java.lang.String = js.native
  def saturate(amount: scala.Double): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def saturate(amount: scala.Double, color: java.lang.String): java.lang.String = js.native
  def setHue(hue: java.lang.String): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def setHue(hue: java.lang.String, color: java.lang.String): java.lang.String = js.native
  def setHue(hue: scala.Double): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def setHue(hue: scala.Double, color: java.lang.String): java.lang.String = js.native
  def setLightness(lightness: java.lang.String): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def setLightness(lightness: java.lang.String, color: java.lang.String): java.lang.String = js.native
  def setLightness(lightness: scala.Double): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def setLightness(lightness: scala.Double, color: java.lang.String): java.lang.String = js.native
  def setSaturation(saturation: java.lang.String): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def setSaturation(saturation: java.lang.String, color: java.lang.String): java.lang.String = js.native
  def setSaturation(saturation: scala.Double): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def setSaturation(saturation: scala.Double, color: java.lang.String): java.lang.String = js.native
  def shade(percentage: java.lang.String): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def shade(percentage: java.lang.String, color: java.lang.String): java.lang.String = js.native
  def shade(percentage: scala.Double): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def shade(percentage: scala.Double, color: java.lang.String): java.lang.String = js.native
  def size(height: java.lang.String): polishedLib.libTypesStyleMod.Styles = js.native
  def size(height: java.lang.String, width: java.lang.String): polishedLib.libTypesStyleMod.Styles = js.native
  def size(height: java.lang.String, width: scala.Double): polishedLib.libTypesStyleMod.Styles = js.native
  def size(height: scala.Double): polishedLib.libTypesStyleMod.Styles = js.native
  def size(height: scala.Double, width: java.lang.String): polishedLib.libTypesStyleMod.Styles = js.native
  def size(height: scala.Double, width: scala.Double): polishedLib.libTypesStyleMod.Styles = js.native
  def stripUnit(value: java.lang.String): js.Any = js.native
  def stripUnit(value: java.lang.String, unitReturn: scala.Boolean): js.Any = js.native
  def stripUnit(value: scala.Double): js.Any = js.native
  def stripUnit(value: scala.Double, unitReturn: scala.Boolean): js.Any = js.native
  def textInputs(states: polishedLib.libTypesInteractionStateMod.InteractionState*): java.lang.String = js.native
  def timingFunctions(timingFunction: polishedLib.libTypesTimingFunctionMod.TimingFunction): java.lang.String = js.native
  def tint(percentage: java.lang.String): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def tint(percentage: java.lang.String, color: java.lang.String): java.lang.String = js.native
  def tint(percentage: scala.Double): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def tint(percentage: scala.Double, color: java.lang.String): java.lang.String = js.native
  def toColorString(color: js.Object): java.lang.String = js.native
  def transitions(properties: (java.lang.String | js.Array[java.lang.String])*): polishedLib.libTypesStyleMod.Styles = js.native
  def transparentize(amount: java.lang.String): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def transparentize(amount: java.lang.String, color: java.lang.String): java.lang.String = js.native
  def transparentize(amount: scala.Double): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def transparentize(amount: scala.Double, color: java.lang.String): java.lang.String = js.native
  def triangle(
    hasPointingDirectionHeightWidthForegroundColorBackgroundColor: polishedLib.libTypesTriangleConfigurationMod.TriangleConfiguration
  ): polishedLib.libTypesStyleMod.Styles = js.native
  def wordWrap(): polishedLib.libTypesStyleMod.Styles = js.native
  def wordWrap(wrap: java.lang.String): polishedLib.libTypesStyleMod.Styles = js.native
}

