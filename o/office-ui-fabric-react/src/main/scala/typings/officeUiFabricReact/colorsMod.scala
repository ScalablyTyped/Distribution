package typings.officeUiFabricReact

import typings.officeUiFabricReact.interfacesMod.IColor
import typings.officeUiFabricReact.interfacesMod.IHSL
import typings.officeUiFabricReact.interfacesMod.IHSV
import typings.officeUiFabricReact.interfacesMod.IRGB
import typings.officeUiFabricReact.officeUiFabricReactStrings.a
import typings.officeUiFabricReact.officeUiFabricReactStrings.b
import typings.officeUiFabricReact.officeUiFabricReactStrings.g
import typings.officeUiFabricReact.officeUiFabricReactStrings.r
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorsMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "HEX_REGEX")
  @js.native
  val HEX_REGEX: RegExp = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "MAX_COLOR_ALPHA")
  @js.native
  val MAX_COLOR_ALPHA: /* 100 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "MAX_COLOR_HUE")
  @js.native
  val MAX_COLOR_HUE: /* 359 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "MAX_COLOR_RGB")
  @js.native
  val MAX_COLOR_RGB: /* 255 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "MAX_COLOR_RGBA")
  @js.native
  val MAX_COLOR_RGBA: /* 255 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "MAX_COLOR_SATURATION")
  @js.native
  val MAX_COLOR_SATURATION: /* 100 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "MAX_COLOR_VALUE")
  @js.native
  val MAX_COLOR_VALUE: /* 100 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "MAX_HEX_LENGTH")
  @js.native
  val MAX_HEX_LENGTH: /* 6 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "MAX_RGBA_LENGTH")
  @js.native
  val MAX_RGBA_LENGTH: /* 3 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "MIN_HEX_LENGTH")
  @js.native
  val MIN_HEX_LENGTH: /* 3 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "MIN_RGBA_LENGTH")
  @js.native
  val MIN_RGBA_LENGTH: /* 1 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "RGBA_REGEX")
  @js.native
  val RGBA_REGEX: RegExp = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "clamp")
  @js.native
  def clamp(value: Double, max: Double): Double = js.native
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "clamp")
  @js.native
  def clamp(value: Double, max: Double, min: Double): Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "correctHSV")
  @js.native
  def correctHSV(color: IHSV): IHSV = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "correctHex")
  @js.native
  def correctHex(hex: String): String = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "correctRGB")
  @js.native
  def correctRGB(color: IRGB): IRGB = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "cssColor")
  @js.native
  def cssColor(): js.UndefOr[IRGB] = js.native
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "cssColor")
  @js.native
  def cssColor(color: String): js.UndefOr[IRGB] = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "getColorFromHSV")
  @js.native
  def getColorFromHSV(hsv: IHSV): IColor = js.native
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "getColorFromHSV")
  @js.native
  def getColorFromHSV(hsv: IHSV, a: Double): IColor = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "getColorFromRGBA")
  @js.native
  def getColorFromRGBA(rgba: IRGB): IColor = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "getColorFromString")
  @js.native
  def getColorFromString(inputColor: String): js.UndefOr[IColor] = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "getFullColorString")
  @js.native
  def getFullColorString(color: IColor): String = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "hsl2hsv")
  @js.native
  def hsl2hsv(h: Double, s: Double, l: Double): IHSV = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "hsl2rgb")
  @js.native
  def hsl2rgb(h: Double, s: Double, l: Double): IRGB = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "hsv2hex")
  @js.native
  def hsv2hex(h: Double, s: Double, v: Double): String = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "hsv2hsl")
  @js.native
  def hsv2hsl(h: Double, s: Double, v: Double): IHSL = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "hsv2rgb")
  @js.native
  def hsv2rgb(h: Double, s: Double, v: Double): IRGB = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "rgb2hex")
  @js.native
  def rgb2hex(r: Double, g: Double, b: Double): String = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "rgb2hsv")
  @js.native
  def rgb2hsv(r: Double, g: Double, b: Double): IHSV = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "updateA")
  @js.native
  def updateA(color: IColor, a: Double): IColor = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "updateH")
  @js.native
  def updateH(color: IColor, h: Double): IColor = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "updateRGB")
  @js.native
  def updateRGB_a(color: IColor, component: a, value: Double): IColor = js.native
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "updateRGB")
  @js.native
  def updateRGB_b(color: IColor, component: b, value: Double): IColor = js.native
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "updateRGB")
  @js.native
  def updateRGB_g(color: IColor, component: g, value: Double): IColor = js.native
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "updateRGB")
  @js.native
  def updateRGB_r(color: IColor, component: r, value: Double): IColor = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/colors", "updateSV")
  @js.native
  def updateSV(color: IColor, s: Double, v: Double): IColor = js.native
}
