package typings
package polishedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("polished", JSImport.Namespace)
@js.native
object polishedMod extends js.Object {
  val em: js.Function2[
    /* value */ java.lang.String | scala.Double, 
    /* base */ js.UndefOr[java.lang.String | scala.Double], 
    java.lang.String
  ] = js.native
  val rem: js.Function2[
    /* value */ java.lang.String | scala.Double, 
    /* base */ js.UndefOr[java.lang.String | scala.Double], 
    java.lang.String
  ] = js.native
  def adjustHue(degree: scala.Double): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def adjustHue(degree: scala.Double, color: java.lang.String): java.lang.String = js.native
  def animation(
    args: (js.Array[polishedLib.libShorthandsAnimationMod.AnimationProperty] | polishedLib.libShorthandsAnimationMod.AnimationProperty)*
  ): js.Object = js.native
  def backgroundImages(properties: java.lang.String*): js.Object = js.native
  def backgrounds(properties: java.lang.String*): js.Object = js.native
  def borderColor(values: (scala.Null | scala.Unit | java.lang.String)*): js.Object = js.native
  def borderRadius(side: java.lang.String, radius: java.lang.String): js.Object = js.native
  def borderRadius(side: java.lang.String, radius: scala.Double): js.Object = js.native
  def borderStyle(values: (scala.Null | scala.Unit | java.lang.String)*): js.Object = js.native
  def borderWidth(values: (scala.Null | scala.Unit | java.lang.String | scala.Double)*): js.Object = js.native
  def buttons(states: polishedLib.libTypesInteractionStateMod.InteractionState*): java.lang.String = js.native
  def clearFix(): js.Object = js.native
  def clearFix(parent: java.lang.String): js.Object = js.native
  def complement(color: java.lang.String): java.lang.String = js.native
  def darken(amount: scala.Double): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def darken(amount: scala.Double, color: java.lang.String): java.lang.String = js.native
  def desaturate(amount: scala.Double): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def desaturate(amount: scala.Double, color: java.lang.String): java.lang.String = js.native
  def directionalProperty(property: java.lang.String, values: (scala.Null | scala.Unit | java.lang.String | scala.Double)*): js.Object = js.native
  def ellipsis(): js.Object = js.native
  def ellipsis(width: java.lang.String): js.Object = js.native
  def ellipsis(width: scala.Double): js.Object = js.native
  def fontFace(
    hasFontFamilyFontFilePathFontStretchFontStyleFontVariantFontWeightFileFormatsLocalFontsUnicodeRange: polishedLib.libMixinsFontFaceMod.FontFaceConfiguration
  ): js.Object = js.native
  def getLuminance(color: java.lang.String): scala.Double = js.native
  def grayscale(color: java.lang.String): java.lang.String = js.native
  def hiDPI(): java.lang.String = js.native
  def hiDPI(ratio: scala.Double): java.lang.String = js.native
  def hideText(): js.Object = js.native
  def hideVisually(): js.Object = js.native
  def hsl(value: polishedLib.libTypesColorMod.HslColor): java.lang.String = js.native
  def hsl(value: polishedLib.libTypesColorMod.HslColor, saturation: scala.Double): java.lang.String = js.native
  def hsl(value: polishedLib.libTypesColorMod.HslColor, saturation: scala.Double, lightness: scala.Double): java.lang.String = js.native
  def hsl(value: scala.Double): java.lang.String = js.native
  def hsl(value: scala.Double, saturation: scala.Double): java.lang.String = js.native
  def hsl(value: scala.Double, saturation: scala.Double, lightness: scala.Double): java.lang.String = js.native
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
  def lighten(amount: scala.Double): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def lighten(amount: scala.Double, color: java.lang.String): java.lang.String = js.native
  def margin(values: (scala.Null | scala.Unit | java.lang.String | scala.Double)*): js.Object = js.native
  def mix(): js.Function2[/* color */ java.lang.String, /* otherColor */ java.lang.String, java.lang.String] = js.native
  def mix(weight: scala.Double): js.Function2[/* color */ java.lang.String, /* otherColor */ java.lang.String, java.lang.String] = js.native
  def mix(weight: scala.Double, color: java.lang.String): js.Function1[/* otherColor */ java.lang.String, java.lang.String] = js.native
  def mix(weight: scala.Double, color: java.lang.String, otherColor: java.lang.String): java.lang.String = js.native
  def modularScale(steps: scala.Double): java.lang.String = js.native
  def modularScale(steps: scala.Double, base: java.lang.String): java.lang.String = js.native
  def modularScale(steps: scala.Double, base: java.lang.String, ratio: polishedLib.libHelpersModularScaleMod.Ratio): java.lang.String = js.native
  def modularScale(steps: scala.Double, base: scala.Double): java.lang.String = js.native
  def modularScale(steps: scala.Double, base: scala.Double, ratio: polishedLib.libHelpersModularScaleMod.Ratio): java.lang.String = js.native
  def normalize(): js.Object = js.native
  def normalize(excludeOpinionated: scala.Boolean): js.Object = js.native
  def opacify(amount: scala.Double): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def opacify(amount: scala.Double, color: java.lang.String): java.lang.String = js.native
  def padding(values: (scala.Null | scala.Unit | java.lang.String | scala.Double)*): js.Object = js.native
  def parseToHsl(color: java.lang.String): polishedLib.libTypesColorMod.HslColor | polishedLib.libTypesColorMod.HslaColor = js.native
  def parseToRgb(color: java.lang.String): polishedLib.libTypesColorMod.RgbColor | polishedLib.libTypesColorMod.RgbaColor = js.native
  def placeholder(styles: js.Object): js.Object = js.native
  def placeholder(styles: js.Object, parent: java.lang.String): js.Object = js.native
  def position(
    positionKeyword: java.lang.String,
    values: (scala.Null | scala.Unit | java.lang.String | scala.Double)*
  ): js.Object = js.native
  def position(values: (scala.Null | scala.Unit | java.lang.String | scala.Double)*): js.Object = js.native
  def radialGradient(
    hasColorStopsExtentFallbackPositionShape: polishedLib.libMixinsRadialGradientMod.RadialGradientConfiguration
  ): js.Object = js.native
  def readableColor(color: java.lang.String): java.lang.String = js.native
  def retinaImage(filename: java.lang.String): js.Object = js.native
  def retinaImage(filename: java.lang.String, backgroundSize: java.lang.String): js.Object = js.native
  def retinaImage(filename: java.lang.String, backgroundSize: java.lang.String, extension: java.lang.String): js.Object = js.native
  def retinaImage(
    filename: java.lang.String,
    backgroundSize: java.lang.String,
    extension: java.lang.String,
    retinaFilename: java.lang.String
  ): js.Object = js.native
  def retinaImage(
    filename: java.lang.String,
    backgroundSize: java.lang.String,
    extension: java.lang.String,
    retinaFilename: java.lang.String,
    retinaSuffix: java.lang.String
  ): js.Object = js.native
  def rgb(value: polishedLib.libTypesColorMod.RgbColor): java.lang.String = js.native
  def rgb(value: polishedLib.libTypesColorMod.RgbColor, green: scala.Double): java.lang.String = js.native
  def rgb(value: polishedLib.libTypesColorMod.RgbColor, green: scala.Double, blue: scala.Double): java.lang.String = js.native
  def rgb(value: scala.Double): java.lang.String = js.native
  def rgb(value: scala.Double, green: scala.Double): java.lang.String = js.native
  def rgb(value: scala.Double, green: scala.Double, blue: scala.Double): java.lang.String = js.native
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
  def saturate(amount: scala.Double): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def saturate(amount: scala.Double, color: java.lang.String): java.lang.String = js.native
  def selection(styles: js.Object): js.Object = js.native
  def selection(styles: js.Object, parent: java.lang.String): js.Object = js.native
  def setHue(hue: scala.Double): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def setHue(hue: scala.Double, color: java.lang.String): java.lang.String = js.native
  def setLightness(lightness: scala.Double): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def setLightness(lightness: scala.Double, color: java.lang.String): java.lang.String = js.native
  def setSaturation(saturation: scala.Double): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def setSaturation(saturation: scala.Double, color: java.lang.String): java.lang.String = js.native
  def shade(percentage: scala.Double): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def shade(percentage: scala.Double, color: java.lang.String): java.lang.String = js.native
  def size(height: java.lang.String): js.Object = js.native
  def size(height: java.lang.String, width: java.lang.String): js.Object = js.native
  def size(height: java.lang.String, width: scala.Double): js.Object = js.native
  def size(height: scala.Double): js.Object = js.native
  def size(height: scala.Double, width: java.lang.String): js.Object = js.native
  def size(height: scala.Double, width: scala.Double): js.Object = js.native
  def stripUnit(value: java.lang.String): scala.Double | java.lang.String = js.native
  def textInputs(states: polishedLib.libTypesInteractionStateMod.InteractionState*): java.lang.String = js.native
  def timingFunctions(timingFunction: polishedLib.libMixinsTimingFunctionsMod.TimingFunction): java.lang.String = js.native
  def tint(percentage: scala.Double): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def tint(percentage: scala.Double, color: java.lang.String): java.lang.String = js.native
  def toColorString(color: js.Object): java.lang.String = js.native
  def transitions(properties: java.lang.String*): js.Object = js.native
  def transparentize(amount: scala.Double): js.Function1[/* color */ java.lang.String, java.lang.String] = js.native
  def transparentize(amount: scala.Double, color: java.lang.String): java.lang.String = js.native
  def triangle(
    hasPointingDirectionHeightWidthForegroundColorBackgroundColor: polishedLib.libMixinsTriangleMod.TriangleArgs
  ): js.Object = js.native
  def wordWrap(): js.Object = js.native
  def wordWrap(wrap: java.lang.String): js.Object = js.native
}

