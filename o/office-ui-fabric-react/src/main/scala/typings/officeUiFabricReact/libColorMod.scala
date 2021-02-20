package typings.officeUiFabricReact

import typings.officeUiFabricReact.interfacesMod.IColor
import typings.officeUiFabricReact.interfacesMod.IHSL
import typings.officeUiFabricReact.interfacesMod.IHSV
import typings.officeUiFabricReact.interfacesMod.IRGB
import typings.officeUiFabricReact.officeUiFabricReactStrings.a
import typings.officeUiFabricReact.officeUiFabricReactStrings.b
import typings.officeUiFabricReact.officeUiFabricReactStrings.g
import typings.officeUiFabricReact.officeUiFabricReactStrings.r
import typings.officeUiFabricReact.shadesMod.Shade
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libColorMod {
  
  @JSImport("office-ui-fabric-react/lib/Color", "HEX_REGEX")
  @js.native
  val HEX_REGEX: RegExp = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "MAX_COLOR_ALPHA")
  @js.native
  val MAX_COLOR_ALPHA: /* 100 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "MAX_COLOR_HUE")
  @js.native
  val MAX_COLOR_HUE: /* 359 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "MAX_COLOR_RGB")
  @js.native
  val MAX_COLOR_RGB: /* 255 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "MAX_COLOR_RGBA")
  @js.native
  val MAX_COLOR_RGBA: /* 255 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "MAX_COLOR_SATURATION")
  @js.native
  val MAX_COLOR_SATURATION: /* 100 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "MAX_COLOR_VALUE")
  @js.native
  val MAX_COLOR_VALUE: /* 100 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "MAX_HEX_LENGTH")
  @js.native
  val MAX_HEX_LENGTH: /* 6 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "MAX_RGBA_LENGTH")
  @js.native
  val MAX_RGBA_LENGTH: /* 3 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "MIN_HEX_LENGTH")
  @js.native
  val MIN_HEX_LENGTH: /* 3 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "MIN_RGBA_LENGTH")
  @js.native
  val MIN_RGBA_LENGTH: /* 1 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "RGBA_REGEX")
  @js.native
  val RGBA_REGEX: RegExp = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "Shade")
  @js.native
  object Shade extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.shadesMod.Shade with Double] = js.native
    
    /* 1 */ val Shade1: typings.officeUiFabricReact.shadesMod.Shade.Shade1 with Double = js.native
    
    /* 2 */ val Shade2: typings.officeUiFabricReact.shadesMod.Shade.Shade2 with Double = js.native
    
    /* 3 */ val Shade3: typings.officeUiFabricReact.shadesMod.Shade.Shade3 with Double = js.native
    
    /* 4 */ val Shade4: typings.officeUiFabricReact.shadesMod.Shade.Shade4 with Double = js.native
    
    /* 5 */ val Shade5: typings.officeUiFabricReact.shadesMod.Shade.Shade5 with Double = js.native
    
    /* 6 */ val Shade6: typings.officeUiFabricReact.shadesMod.Shade.Shade6 with Double = js.native
    
    /* 7 */ val Shade7: typings.officeUiFabricReact.shadesMod.Shade.Shade7 with Double = js.native
    
    /* 8 */ val Shade8: typings.officeUiFabricReact.shadesMod.Shade.Shade8 with Double = js.native
    
    /* 0 */ val Unshaded: typings.officeUiFabricReact.shadesMod.Shade.Unshaded with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/Color", "clamp")
  @js.native
  def clamp(value: Double, max: Double): Double = js.native
  @JSImport("office-ui-fabric-react/lib/Color", "clamp")
  @js.native
  def clamp(value: Double, max: Double, min: Double): Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "correctHSV")
  @js.native
  def correctHSV(color: IHSV): IHSV = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "correctHex")
  @js.native
  def correctHex(hex: String): String = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "correctRGB")
  @js.native
  def correctRGB(color: IRGB): IRGB = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "cssColor")
  @js.native
  def cssColor(): js.UndefOr[IRGB] = js.native
  @JSImport("office-ui-fabric-react/lib/Color", "cssColor")
  @js.native
  def cssColor(color: String): js.UndefOr[IRGB] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "getBackgroundShade")
  @js.native
  def getBackgroundShade(color: IColor, shade: Shade): IColor | Null = js.native
  @JSImport("office-ui-fabric-react/lib/Color", "getBackgroundShade")
  @js.native
  def getBackgroundShade(color: IColor, shade: Shade, isInverted: Boolean): IColor | Null = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "getColorFromHSV")
  @js.native
  def getColorFromHSV(hsv: IHSV): IColor = js.native
  @JSImport("office-ui-fabric-react/lib/Color", "getColorFromHSV")
  @js.native
  def getColorFromHSV(hsv: IHSV, a: Double): IColor = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "getColorFromRGBA")
  @js.native
  def getColorFromRGBA(rgba: IRGB): IColor = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "getColorFromString")
  @js.native
  def getColorFromString(inputColor: String): js.UndefOr[IColor] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "getContrastRatio")
  @js.native
  def getContrastRatio(color1: IColor, color2: IColor): Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "getFullColorString")
  @js.native
  def getFullColorString(color: IColor): String = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "getShade")
  @js.native
  def getShade(color: IColor, shade: Shade): IColor | Null = js.native
  @JSImport("office-ui-fabric-react/lib/Color", "getShade")
  @js.native
  def getShade(color: IColor, shade: Shade, isInverted: Boolean): IColor | Null = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "hsl2hsv")
  @js.native
  def hsl2hsv(h: Double, s: Double, l: Double): IHSV = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "hsl2rgb")
  @js.native
  def hsl2rgb(h: Double, s: Double, l: Double): IRGB = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "hsv2hex")
  @js.native
  def hsv2hex(h: Double, s: Double, v: Double): String = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "hsv2hsl")
  @js.native
  def hsv2hsl(h: Double, s: Double, v: Double): IHSL = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "hsv2rgb")
  @js.native
  def hsv2rgb(h: Double, s: Double, v: Double): IRGB = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "isDark")
  @js.native
  def isDark(color: IColor): Boolean = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "isValidShade")
  @js.native
  def isValidShade(): Boolean = js.native
  @JSImport("office-ui-fabric-react/lib/Color", "isValidShade")
  @js.native
  def isValidShade(shade: Shade): Boolean = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "rgb2hex")
  @js.native
  def rgb2hex(r: Double, g: Double, b: Double): String = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "rgb2hsv")
  @js.native
  def rgb2hsv(r: Double, g: Double, b: Double): IHSV = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "updateA")
  @js.native
  def updateA(color: IColor, a: Double): IColor = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "updateH")
  @js.native
  def updateH(color: IColor, h: Double): IColor = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "updateRGB")
  @js.native
  def updateRGB_a(color: IColor, component: a, value: Double): IColor = js.native
  @JSImport("office-ui-fabric-react/lib/Color", "updateRGB")
  @js.native
  def updateRGB_b(color: IColor, component: b, value: Double): IColor = js.native
  @JSImport("office-ui-fabric-react/lib/Color", "updateRGB")
  @js.native
  def updateRGB_g(color: IColor, component: g, value: Double): IColor = js.native
  @JSImport("office-ui-fabric-react/lib/Color", "updateRGB")
  @js.native
  def updateRGB_r(color: IColor, component: r, value: Double): IColor = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "updateSV")
  @js.native
  def updateSV(color: IColor, s: Double, v: Double): IColor = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "updateT")
  @js.native
  def updateT(color: IColor, t: Double): IColor = js.native
}
